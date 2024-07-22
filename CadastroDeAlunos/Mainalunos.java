package atividadecadastro;

import java.util.Scanner;

import Alunos;

import java.util.InputMismatchException;

public class Mainalunos {

    public static void main(String[] args) {

        int[] notas = { 0, 0, 0 };
        int totalfaltas = 15;
        Alunos alunos = new Alunos(12345, "aluno", "aluno@email.com", "Engenharia", 12345690, "Rua ABC, 123", 0, notas);
        Scanner leia = new Scanner(System.in);

        int escolha = 0;
        int opcao = 0;

        while (opcao == 0) {
            System.out.println("1 - Cadastrar novo aluno");
            System.out.println("2 - Cadastrar nova nota");
            System.out.println("3 - Cadastrar nova falta");
            System.out.println("4 - Exibir informações");
            System.out.println("0 - Sair");

            escolha = leia.nextInt();

            switch (escolha) {
                case 1:
                    alunos = cadastro(leia, alunos.getnotas());

                    break;
                case 2:
                    System.out.println("Digite as notas de " + alunos.getnome());
                    for (int i = 0; i < notas.length; i++) {
                        while (true) {
                            System.out.println("nota" + (i + 1));
                            if (leia.hasNextInt()) {
                                int novanota = leia.nextInt();

                                if (novanota >= 0 && novanota <= 100) {
                                    alunos.getnotas()[i] = novanota;
                                    break;
                                } else {
                                    System.out.println("Nota invalida digite de 0 a 100");
                                }
                            } else {
                                System.out.println("Digite uma nota valida");
                                leia.nextLine();
                            }

                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite as faltas de " + alunos.getnome());
                    while (true) {
                        try {
                            int novafalta = leia.nextInt();

                            if (novafalta >= 0) {
                                alunos.setfaltas(novafalta);
                                break;
                            } else {
                                System.out.println("Número de faltas inválido. Digite novamente.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Digite um número inteiro.");
                            leia.nextLine();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Nome: " + alunos.getnome());
                    System.out.println("Faltas: " + alunos.getfaltas());
                    System.out.println("Email: " + alunos.getemail());
                    System.out.println("Curso: " + alunos.getcurso());
                    System.out.println("Telefone: " + alunos.gettelefone());
                    System.out.println("Endereco: " + alunos.getendereco());
                    System.out.println("Matricula: " + alunos.getmatricula());
                    double media = alunos.calculamedia();
                    System.out.println("Média das notas: " + media);
                    double percentualfaltas = alunos.porcentagemdefalta(totalfaltas);
                    System.out.println("Percentual de faltas: " + percentualfaltas + "%");

                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("Notas: " + notas[i]);
                    }
                    break;

                case 0:
                    opcao = 1;
                    break;

                default:
                    break;
            }
        }

        leia.close();

    }

    private static Alunos cadastro(Scanner leia, int notas[]) {
        System.out.println("Digite Os dados do aluno: ");

        System.out.print("Matrícula: ");
        int matricula = leia.nextInt();

        leia.nextLine();

        System.out.print("Nome: ");
        String nome = leia.nextLine();

        System.out.print("Email: ");
        String email = leia.next();

        System.out.print("Curso: ");
        String curso = leia.next();

        System.out.print("Telefone: ");
        int telefone = leia.nextInt();

        leia.nextLine();

        System.out.print("Endereço: ");
        String endereco = leia.nextLine();

        System.out.print("Número de faltas: ");
        int faltas = leia.nextInt();

        System.out.println("Novo aluno cadastrado com sucesso!");

        return new Alunos(matricula, nome, email, curso, telefone, endereco, faltas, notas);
    }

}
