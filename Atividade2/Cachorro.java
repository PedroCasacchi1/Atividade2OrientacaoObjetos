package Atividade2;

class Cachorro extends Mamifero {
    public Cachorro(){

    }
    @Override
    public void exibirDetalhes() {

        System.out.println(" ");
        System.out.println("Tipo de Mamífero: Cachorro");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }

}