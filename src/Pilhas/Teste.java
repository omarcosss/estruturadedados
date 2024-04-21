package Pilhas;

public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        Peca pecaInserir = new Peca();
        pecaInserir.setNome("teste");

        Peca peca2 = new Peca();
        peca2.setNome("teste2");

        pilha.inserir(pecaInserir);
        pilha.inserir(peca2);

        pilha.imprimirPilha();

        if (pilha.vazia()) {
            System.out.println("Pilha vazia");
        }

    }
}
