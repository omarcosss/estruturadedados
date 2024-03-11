public class Vetor {
    private Aluno[] alunos = new Aluno[100];

    private int totalDeAlunos = 0;

    public void Adiciona(Aluno aluno){
        this.alunos[this.totalDeAlunos]= aluno;
        this.totalDeAlunos++;
    }

    public int getTotalDeAlunos(){
        return totalDeAlunos;
    }

    public void adicionaPosicao(int posicao, Aluno aluno){


    }

    public Aluno pega(int posicao){
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.alunos[posicao];
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }

    public void remove(int posicao){
        //implementar
    }

    public  boolean contem(Aluno aluno){
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.totalDeAlunos;
    }

    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i <= totalDeAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            if (i < totalDeAlunos - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

}
