package Atividade2;

class Gato extends Mamifero {

    public Gato() {

    }
    @Override
    public void exibirDetalhes() {

        System.out.println(" ");
        System.out.println("Tipo de Mamífero: Gato");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }

}