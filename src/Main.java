//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vetor lista = new Vetor();

        System.out.println("Hello and welcome!");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");

        System.out.println("Alunos: "+ a2.getNome());
        System.out.println("Alunos: "+ a1.getNome());
        System.out.println("Alunos: "+ a3.getNome());

        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);

        System.out.println("Total de alunos: " + lista.tamanho());

        System.out.println(lista);

        System.out.println("Contém a1: " + lista.contem(a1));

        System.out.println(lista.pega(3));
    }
}