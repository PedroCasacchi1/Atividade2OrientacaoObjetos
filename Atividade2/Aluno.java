package Atividade2;

class Aluno extends Pessoa {
    private String matriculaAluno;
    private String cursoAluno;

    public Aluno() {

    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    @Override
    public void exibirDetalhesPessoa() {

        System.out.println(" ");
        System.out.println("Tipo de pessoa: Aluno");
        System.out.println("Nome: " + getNomePessoa());
        System.out.println("Idade: " + getIdadePessoa());
        System.out.println("Sexo: " + getSexoPessoa());
        System.out.println("Matrícula: " + getMatriculaAluno());
        System.out.println("Curso: " + getCursoAluno());

    }
}