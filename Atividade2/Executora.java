package Atividade2;
import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Criação de Animais");

        int maxAnimais = 100;
        Animal[] animais = new Animal[maxAnimais];
        int numAnimais = 0;

        int maxAlunos = 100;
        Aluno[] alunos = new Aluno[maxAlunos];
        int numAlunos = 0;

        int maxProfessor = 100;
        Professora[] professoras = new Professora[maxProfessor];
        int numProfessoras = 0;

        int maxGerentes = 100;
        Gerente[] gerentes = new Gerente[maxGerentes];
        int numGerentes = 0;

        int maxDiretores = 100;
        Diretor[] diretores = new Diretor[maxDiretores];
        int numDiretores = 0;

        int maxSecretarias = 100;
        Secretaria[] secretarias = new Secretaria[maxSecretarias];
        int numSecretarias = 0;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar animal");
            System.out.println("2. Criar pessoa");
            System.out.println("3. Mostrar animais criados");
            System.out.println("4. Mostrar pessoas criadas");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 5) {
                System.out.println("Saindo do programa.");
                break;
            }

            switch (escolha) {
                case 1:
                    if (numAnimais < maxAnimais) {
                        System.out.println("\nEscolha o tipo de animal que deseja criar:");
                        System.out.println("1. Mamífero");
                        System.out.println("2. Réptil");
                        System.out.println("3. Ave");
                        System.out.println("4. Peixe");

                        int tipoAnimal = scanner.nextInt();
                        String tipoAni = "";
                        scanner.nextLine();

                        Animal animal = null;

                        if (tipoAnimal == 1) {
                            System.out.println("\nEscolha o tipo de mamífero que deseja criar:");
                            System.out.println("1. Cachorro");
                            System.out.println("2. Gato");
                            System.out.println("3. Outro Mamífero");

                            int tipoMamifero = scanner.nextInt();
                            scanner.nextLine();

                            if (tipoMamifero == 1) {
                                animal = new Cachorro();
                                tipoAni = "Cachorro";
                            } else if (tipoMamifero == 2) {
                                animal = new Gato();
                                tipoAni = "Gato";
                            } else if (tipoMamifero == 3) {
                                animal = new Mamifero();
                                tipoAni = "Mamifero";
                            } else {
                                System.out.println("Escolha entre 1 e 3.");
                            }
                        } else if (tipoAnimal == 2) {
                            animal = new Reptil();
                            tipoAni = "Reptil";
                        } else if (tipoAnimal == 3) {
                            animal = new Ave();
                            tipoAni = "Ave";
                        } else if (tipoAnimal == 4) {
                            animal = new Peixe();
                            tipoAni = "Peixe";
                        } else {
                            System.out.println("Escolha entre 1 e 4.");
                        }

                        if (animal != null) {
                            System.out.print("Espécie: ");
                            String especie = scanner.nextLine();
                            System.out.print("Peso: ");
                            float peso = scanner.nextFloat();
                            System.out.print("Idade: ");
                            int idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Sexo: ");
                            String sexo = scanner.nextLine();

                            animal.setEspecie(especie);
                            animal.setPeso(peso);
                            animal.setIdade(idade);
                            animal.setSexo(sexo);
                            animais[numAnimais] = animal;
                            numAnimais++;

                            System.out.println(" ");
                            System.out.println("Animal Criado");
                            System.out.println("Tipo de animal: " + tipoAni);
                            System.out.println("Espécie: " + animal.getEspecie());
                            System.out.println("Peso: " + animal.getPeso());
                            System.out.println("Idade: " + animal.getIdade());
                            System.out.println("Sexo: " + animal.getSexo());
                        }
                    } else {
                        System.out.println("Não Não Não, faz menos ai.");
                    }
                    break;
                case 2:
                    System.out.println("\nEscolha o tipo de pessoa que deseja criar:");
                    System.out.println("1. Aluno");
                    System.out.println("2. Professora");
                    System.out.println("3. Diretor");
                    System.out.println("4. Gerente");
                    System.out.println("5. Secretária");

                    int tipoPessoa = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoPessoa == 1) {
                        Aluno aluno = new Aluno();

                        System.out.print("Nome: ");
                        String nomeAluno = scanner.nextLine();
                        aluno.setNomePessoa(nomeAluno);

                        System.out.print("Idade: ");
                        int idadeAluno = scanner.nextInt();
                        scanner.nextLine();
                        aluno.setIdadePessoa(idadeAluno);

                        System.out.print("Sexo: ");
                        String sexoAluno = scanner.nextLine();
                        aluno.setSexoPessoa(sexoAluno);

                        System.out.print("Matrícula: ");
                        String matriculaAluno = scanner.nextLine();
                        aluno.setMatriculaAluno(matriculaAluno);

                        System.out.print("Curso: ");
                        String cursoAluno = scanner.nextLine();
                        aluno.setCursoAluno(cursoAluno);

                        alunos[numAlunos] = aluno;
                        numAlunos++;

                        System.out.println(" ");
                        System.out.println("Aluno Criado");
                        System.out.println("Nome: " + aluno.getNomePessoa());
                        System.out.println("Idade: " + aluno.getIdadePessoa());
                        System.out.println("Sexo: " + aluno.getSexoPessoa());
                        System.out.println("Matrícula: " + aluno.getMatriculaAluno());
                        System.out.println("Curso: " + aluno.getCursoAluno());

                    } else if (tipoPessoa == 2) {
                        Professora professora = new Professora();

                        System.out.print("Nome: ");
                        String nomeProfessora = scanner.nextLine();
                        professora.setNomePessoa(nomeProfessora);

                        System.out.print("Idade: ");
                        int idadeProfessora = scanner.nextInt();
                        scanner.nextLine();
                        professora.setIdadePessoa(idadeProfessora);

                        System.out.print("Sexo: ");
                        String sexoProfessora = scanner.nextLine();
                        professora.setSexoPessoa(sexoProfessora);

                        System.out.print("Disciplina: ");
                        String disciplinaProfessora = scanner.nextLine();
                        professora.setDisciplinaProfessora(disciplinaProfessora);

                        System.out.print("Salário: ");
                        double salarioProfessora = scanner.nextDouble();
                        professora.setSalario(salarioProfessora);

                        professoras[numProfessoras] = professora;
                        numProfessoras++;

                        System.out.println(" ");
                        System.out.println("Professora Criada");
                        System.out.println("Nome: " + professora.getNomePessoa());
                        System.out.println("Idade: " + professora.getIdadePessoa());
                        System.out.println("Sexo: " + professora.getSexoPessoa());
                        System.out.println("Disciplina: " + professora.getDisciplinaProfessora());
                        System.out.println("Salário: " + professora.getSalario());

                    } else if (tipoPessoa == 3) {
                        Diretor diretor = new Diretor();

                        System.out.print("Nome: ");
                        String nomeDiretor = scanner.nextLine();
                        diretor.setNomePessoa(nomeDiretor);

                        System.out.print("Idade: ");
                        int idadeDiretor = scanner.nextInt();
                        scanner.nextLine();
                        diretor.setIdadePessoa(idadeDiretor);

                        System.out.print("Sexo: ");
                        String sexoDiretor = scanner.nextLine();
                        diretor.setSexoPessoa(sexoDiretor);

                        System.out.print("Departamento: ");
                        String departamentoDiretor = scanner.nextLine();
                        diretor.setDepartamento(departamentoDiretor);

                        System.out.print("Salário: ");
                        double salarioDiretor = scanner.nextDouble();
                        diretor.setSalario(salarioDiretor);

                        diretores[numDiretores] = diretor;
                        numDiretores++;

                        System.out.println(" ");
                        System.out.println("Diretor Criado");
                        System.out.println("Nome: " + diretor.getNomePessoa());
                        System.out.println("Idade: " + diretor.getIdadePessoa());
                        System.out.println("Sexo: " + diretor.getSexoPessoa());
                        System.out.println("Departamento: " + diretor.getDepartamento());
                        System.out.println("Salário: " + diretor.getSalario());

                    } else if (tipoPessoa == 4) {

                        Gerente gerente = new Gerente();

                        System.out.print("Nome: ");
                        String nomeGerente = scanner.nextLine();
                        gerente.setNomePessoa(nomeGerente);

                        System.out.print("Idade: ");
                        int idadeGerente = scanner.nextInt();
                        scanner.nextLine();
                        gerente.setIdadePessoa(idadeGerente);

                        System.out.print("Sexo: ");
                        String sexoGerente = scanner.nextLine();
                        gerente.setSexoPessoa(sexoGerente);

                        System.out.print("Departamento: ");
                        String departamentoGerente = scanner.nextLine();
                        gerente.setDepartamento(departamentoGerente);

                        System.out.print("Salário: ");
                        double salarioGerente = scanner.nextDouble();
                        gerente.setSalario(salarioGerente);

                        gerentes[numGerentes] = gerente;
                        numGerentes++;

                        System.out.println(" ");
                        System.out.println("Gerente Criado");
                        System.out.println("Nome: " + gerente.getNomePessoa());
                        System.out.println("Idade: " + gerente.getIdadePessoa());
                        System.out.println("Sexo: " + gerente.getSexoPessoa());
                        System.out.println("Departamento: " + gerente.getDepartamento());
                        System.out.println("Salário: " + gerente.getSalario());

                    } else if (tipoPessoa == 5) {
                        Secretaria secretaria = new Secretaria();

                        System.out.print("Nome: ");
                        String nomeSecretaria = scanner.nextLine();
                        secretaria.setNomePessoa(nomeSecretaria);

                        System.out.print("Idade: ");
                        int idadeSecretaria = scanner.nextInt();
                        scanner.nextLine();
                        secretaria.setIdadePessoa(idadeSecretaria);

                        System.out.print("Sexo: ");
                        String sexoSecretaria = scanner.nextLine();
                        secretaria.setSexoPessoa(sexoSecretaria);

                        System.out.print("Departamento: ");
                        String departamentoSecretaria = scanner.nextLine();
                        secretaria.setDepartamento(departamentoSecretaria);

                        System.out.print("Salário: ");
                        double salarioSecretaria = scanner.nextDouble();
                        secretaria.setSalario(salarioSecretaria);

                        secretarias[numSecretarias] = secretaria;
                        numSecretarias++;

                        System.out.println(" ");
                        System.out.println("Secretária Criada");
                        System.out.println("Nome: " + secretaria.getNomePessoa());
                        System.out.println("Idade: " + secretaria.getIdadePessoa());
                        System.out.println("Sexo: " + secretaria.getSexoPessoa());
                        System.out.println("Departamento: " + secretaria.getDepartamento());
                        System.out.println("Salário: " + secretaria.getSalario());

                    } else {
                        System.out.println("Escolha entre 1 e 5.");
                    }
                    break;
                case 3:
                    if (numAnimais == 0) {
                        System.out.println("\nNenhum animal foi criado ainda.");
                    } else {
                        System.out.println("\nAnimais Criados:");
                        for (int i = 0; i < numAnimais; i++) {
                            Animal a = animais[i];
                            a.exibirDetalhes();
                        }
                    }
                    break;
                case 4:
                    if (numAlunos == 0 && numProfessoras == 0 && numGerentes == 0 && numDiretores == 0 && numSecretarias == 0) {
                        System.out.println("\nNenhuma pessoa foi criada ainda.");
                    } else {
                        System.out.println("\nPessoas Criadas:");
                        for (int i = 0; i < numAlunos; i++) {
                            Aluno aluno = alunos[i];
                            aluno.exibirDetalhesPessoa();
                        }
                        for (int i = 0; i < numProfessoras; i++) {
                            Professora professora = professoras[i];
                            professora.exibirDetalhesPessoa();
                        }
                        for (int i = 0; i < numGerentes; i++) {
                            Gerente gerente = gerentes[i];
                            gerente.exibirDetalhesPessoa();
                        }
                        for (int i = 0; i < numDiretores; i++) {
                            Diretor diretor = diretores[i];
                            diretor.exibirDetalhesPessoa();
                        }
                        for (int i = 0; i < numSecretarias; i++) {
                            Secretaria secretaria = secretarias[i];
                            secretaria.exibirDetalhesPessoa();
                        }
                        break;
                    }
                default:
                    System.out.println("Escolha entre 1 e 4.");
            }
        }
        scanner.close();
    }
}


