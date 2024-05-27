package TabelaDeEspalhamento;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
        conjunto.adiciona("palavra");
        conjunto.adiciona("computador");
        conjunto.adiciona("apostila");
        conjunto.adiciona("instrutuor");
        conjunto.adiciona("mesa");

        System.out.println(conjunto.pegaTodas());

//        conjunto.imprimeTabela();
//
//        List<String> palavras = conjunto.pegaTodas();
//
//        for (String palavra : palavras){
//            System.out.println(palavra);
//        }
//        System.out.println("Tamanho: " + conjunto.tamanho() + "\n");
//        conjunto.remover("apostila");
//        palavras = conjunto.pegaTodas();
//        for (String palavra : palavras){
//            System.out.println(palavra);
//        }
//        System.out.println("Tamanho: " + conjunto.tamanho() + "\n");
    }
}
