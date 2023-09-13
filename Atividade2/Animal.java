package Atividade2;

class Animal {
    private String especie;
    private float peso;
    private int idade;
    private String sexo;

    public Animal() {

    }

    public void exibirDetalhes() {

        System.out.println(" ");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}