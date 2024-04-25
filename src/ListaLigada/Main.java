package ListaLigada;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        AlunoLista aluno1 = new AlunoLista();
//        aluno1.setNome("Joana");
//
//        AlunoLista aluno2 = new AlunoLista();
//        aluno2.setNome("Pedro");
//
//        AlunoLista aluno3 = new AlunoLista();
//        aluno3.setNome("João");
//
//        ListaLigada lista = new ListaLigada();
//
//        lista.adiciona(aluno1);
//        lista.adiciona(aluno2);
//        lista.adicionaNoComeco(aluno3);
//
//        System.out.println(lista.toString());
//
//        lista.removeNComeco(2);

        ArrayList<String> vetor = new ArrayList<String>();
        ListaLigada lista = new ListaLigada();
        int numeroDeElementos = 40000;

        // ADICIONADO NO COMEÇO
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < numeroDeElementos; i++) {
            vetor.add(0, "" + i);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Vetor adiciona no começo: " + (fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for (int i = 0; i < numeroDeElementos; i++) {
            lista.adiciona(0, "" + i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Lista Ligada adiciona no começo: " + (fim - inicio) / 1000.0);

        // PERCORRENDO
        inicio = System.currentTimeMillis();

        for (int i = 0; i < numeroDeElementos; i++) {
            vetor.get(i);
        }

        fim = System.currentTimeMillis();
        System.out.println("Vetor percorrendo: " + (fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for (int i = 0; i < numeroDeElementos; i++) {
            lista.pega(i);
        }

        fim = System.currentTimeMillis();

        System.out.println("Lista Ligada percorrendo: " + (fim - inicio) / 1000.0);

        // REMOVENDO DO COMEÇO

        inicio = System.currentTimeMillis();

        for (int i = 0; i < numeroDeElementos; i++) {
            vetor.remove(0);
        }

        fim = System.currentTimeMillis();

        System.out.println("Vetor remove do começo: " + (fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for (int i = 0; i < numeroDeElementos; i++) {
            lista.remove(0);
        }

        fim = System.currentTimeMillis();

        System.out.println("Lista Ligada remove do começo: " + (fim - inicio) / 1000.0);
    }
}
