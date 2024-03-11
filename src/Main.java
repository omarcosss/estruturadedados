import java.util.Scanner;

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
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("fjhsid");
        a5.setNome("ndsaku");

        System.out.println("Alunos: "+ a2.getNome());
        System.out.println("Alunos: "+ a1.getNome());
        System.out.println("Alunos: "+ a3.getNome());

        //adicionando alunos à lista
        lista.adiciona(0, a1);
        lista.adiciona(1, a2);
        lista.adiciona(2,a3);

        //imprimindo tamanho da lista
        System.out.println("Total de alunos: " + lista.tamanho());

        //imprimindo lista inicial
        System.out.println(lista);

        //verificando se lista contem aluno por nome
        System.out.println("Contém aluno: " + lista.contem("glevson"));

        //Buscando aluno por posição na lista
        System.out.println(lista.pega(2));

        //Adicionando novo aluno na posição 3
        lista.adiciona(3, a4);

        //Conferindo
        System.out.println(lista);

        //Adicionando novo aluno em posição já ocupada
        lista.adiciona(1, a5);

        //Conferindo novo aluno em posição de substituição
        System.out.println(lista);

        //Removendo aluno da lista
        lista.remove(0);

        //Conferindo
        System.out.println(lista);







//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Buscar aluno: ");
//        String busca = scanner.nextLine();
//
//
//
//        if (lista.contem(busca)) {
//            System.out.println("ALUNO ENCONTRADO: " + busca.toUpperCase() + "POSIÇÃO: " + );
//        } else {
//            System.out.println("Aluno não encontrado!");
//        }

    }
}