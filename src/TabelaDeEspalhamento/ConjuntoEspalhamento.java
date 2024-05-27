package TabelaDeEspalhamento;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class ConjuntoEspalhamento {
    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    private int tamanho = 0;

    private int calculaIndiceDaTabela(String palavra) {
        int codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(palavra);
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % this.tabela.size();
    }

    private int calculaCodigoDeEspalhamento(String palavra){
        int codigo = 1;
        for (int i = 0; i < palavra.length(); i++) {
            codigo = 31 * codigo + palavra.charAt(i);
        }
        return codigo;
    }

    public ConjuntoEspalhamento(){
        for (int i = 0; i < 26; i++) {
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }
    }

    public void adiciona(String palavra){
        if(!this.contem(palavra)){
            this.verificaCarga();
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
            this.tamanho++;
        } else {
            System.out.println("Palavra já está na tabela");
        }
    }
    public void remover(String palavra) {
        if (this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            if (lista.remove(palavra)) {
                this.tamanho--;
            } else {
                System.out.println("Palavra não encontrada na tabela.");
            }
            this.verificaCarga();
        } else {
            System.out.println("Palavra não encontrada na lista.");
        }
    }
    public boolean contem(String palavra){
        int indice = this.calculaIndiceDaTabela(palavra);
        List<String> lista = this.tabela.get(indice);

        return lista.contains(palavra);
    }
    public List<String> pegaTodas(){
        List<String> palavras = new ArrayList<String>();

        for (int i = 0; i < this.tabela.size(); i++) {
            palavras.addAll(this.tabela.get(i));
        }

        return palavras;
    }
    public int tamanho(){
        return this.tamanho;
    }
    public void imprimeTabela(){
        for (List<String> lista : this.tabela) {
            System.out.print("[");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print("*");
            }
            System.out.println("]");
        }
    }
    private void redimensionaTabela(int novaCapacidade){
        List<String> palavras = this.pegaTodas();
        this.tabela.clear();

        for (int i = 0; i < novaCapacidade; i++) {
            this.tabela.add(new LinkedList<String>());
        }

        for (String palavra : palavras){
            this.adiciona(palavra);
        }
    }
    private void verificaCarga(){
        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;

        if (carga > 0.75) {
            this.redimensionaTabela(capacidade * 2);
        } else if (carga > 0.25) {
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }
    }
}
