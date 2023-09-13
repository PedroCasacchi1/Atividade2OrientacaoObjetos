package Atividade2;

class Peixe extends Animal {
    public Peixe() {

    }

    @Override
    public void exibirDetalhes() {

        System.out.println(" ");
        System.out.println("Tipo de animal: Peixe");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }
}