package Atividade2;

class Gerente extends Pessoa {
    private String departamento;
    private double salario;
    public Gerente() {

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() { // Adicione o método getSalario
        return salario;
    }

    public void setSalario(double salario) { // Adicione o método setSalario
        this.salario = salario;
    }

    @Override
    public void exibirDetalhesPessoa() {

        System.out.println(" ");
        System.out.println("Tipo de pessoa: Gerente");
        System.out.println("Nome: " + getNomePessoa());
        System.out.println("Idade: " + getIdadePessoa());
        System.out.println("Sexo: " + getSexoPessoa());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: " + getSalario());

    }
}