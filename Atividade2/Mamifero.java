package Atividade2;

class Mamifero extends Animal {
    public Mamifero() {

    }

    @Override
    public void exibirDetalhes() {

        System.out.println(" ");
        System.out.println("Tipo de animal: Mamífero");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }
}