package Atividade2;

class Ave extends Animal {
    public Ave() {

    }

    @Override
    public void exibirDetalhes() {

        System.out.println(" ");
        System.out.println("Tipo de animal: Ave");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Peso: " + getPeso());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());

    }
}