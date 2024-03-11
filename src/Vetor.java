public class Vetor {
    private Aluno[] alunos = new Aluno[100];

    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        this.garantaEspaco();
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno){
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        for (int i = this.totalDeAlunos - 1; i >= posicao ; i -= 1) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
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
        //return posicao >= 0 && posicao < this.totalDeAlunos;
        return posicao < this.alunos.length && posicao >= 0;

    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeAlunos;
    }

    public void remove(int posicao){
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalDeAlunos--;
    }

    public  boolean contem(String aluno){
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno.toLowerCase().equals(this.alunos[i].getNome().toLowerCase())) {
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

    private void garantaEspaco() {
        if (this.totalDeAlunos == this.alunos.length) {
            Aluno[] novaArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novaArray[i] = this.alunos[i];
            }
            this.alunos = novaArray;
        }
    }

}
