package Pilhas;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<Peca> pecas = new LinkedList<Peca>();

    public void inserir(Peca peca) {
        this.pecas.add(peca);
    }

    public Peca remove() {
        return this.pecas.remove(this.pecas.size() - 1);
    }

    public boolean vazia() {
        return this.pecas.isEmpty();
    }

    public void imprimirPilha() {
        for (int i = 0; i < pecas.size(); i++) {
            System.out.println(pecas.get(i).getNome());
        }
    }

    public void imprimirPeca(int i){
        System.out.println(pecas.get(i).getNome());
    }

}
