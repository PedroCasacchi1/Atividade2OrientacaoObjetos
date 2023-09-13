package Atividade2;

class Reptil extends Animal {
    public Reptil() {

    }

    @Override
    public void exibirDetalhes() {

        System.out.println(" ");
        System.out.println("Tipo de animal: Réptil");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }
}