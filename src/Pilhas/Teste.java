package Pilhas;

public class Teste {
    public static void main(String[] args) {
        Pilha<Peca> pilha = new Pilha<Peca>();

        Peca peca = new Peca();
        pilha.inserir(peca);

        if (pilha.vazia()) {
            System.out.println("Pilha vazia");
        }

        Pilha<String> pilha2 = new Pilha<String>();
        pilha2.inserir("adalberto");
        pilha2.inserir("aaaaa");

        pilha2.toString();
    }
}
