package Atividade2;

class Secretaria extends Pessoa {
    private String departamento;
    private double salario;
    public Secretaria() {

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDetalhesPessoa() {

        System.out.println(" ");
        System.out.println("Tipo de pessoa: Secretaria");
        System.out.println("Nome: " + getNomePessoa());
        System.out.println("Idade: " + getIdadePessoa());
        System.out.println("Sexo: " + getSexoPessoa());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: " + getSalario());
    }
}