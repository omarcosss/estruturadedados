package ListaLigada;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Main {
    public static void main(String[] args) {
        AlunoLista aluno1 = new AlunoLista();
        aluno1.setNome("Joana");

        AlunoLista aluno2 = new AlunoLista();
        aluno2.setNome("Pedro");

        AlunoLista aluno3 = new AlunoLista();
        aluno3.setNome("João");

        ListaLigada lista = new ListaLigada();

        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        lista.adicionaNoComeco(aluno3);

        System.out.println(lista.toString());

        lista.removeNComeco(2);
    }
}
