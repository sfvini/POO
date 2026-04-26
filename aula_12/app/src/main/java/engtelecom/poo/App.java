package engtelecom.poo;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    private Agenda agenda;
    private Scanner scanner;

    public App() {
        agenda = new Agenda();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcao;

        do {
            System.out.println("\nAGENDA TELEFÔNICA");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Adicionar telefone");
            System.out.println("6 - Adicionar email");
            System.out.println("7 - Atualizar telefone");
            System.out.println("8 - Atualizar email");
            System.out.println("9 - Remover telefone");
            System.out.println("10 - Remover email");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Sobrenome: ");
                    String sobrenome = scanner.nextLine();

                    System.out.print("Ano nascimento: ");
                    int ano = scanner.nextInt();
                    System.out.print("Mes: ");
                    int mes = scanner.nextInt();
                    System.out.print("Dia: ");
                    int dia = scanner.nextInt();
                    scanner.nextLine();

                    Contato c = new Contato(nome, sobrenome, LocalDate.of(ano, mes, dia));
                    agenda.addContato(c);
                    break;

                case 2:
                    System.out.println(agenda);
                    break;

                case 3:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Sobrenome: ");
                    sobrenome = scanner.nextLine();
                    System.out.println(agenda.findContato(nome, sobrenome));
                    break;

                case 4:
                    System.out.print("Indice: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    agenda.removeContato(indice);
                    break;

                case 5:
                    System.out.print("Indice contato: ");
                    indice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Rotulo: ");
                    String rotulo = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String tel = scanner.nextLine();
                    agenda.addTelefone(rotulo, tel, indice);
                    break;

                case 6:
                    System.out.print("Indice contato: ");
                    indice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Rotulo: ");
                    rotulo = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    agenda.addEmail(rotulo, email, indice);
                    break;

                case 7:
                    System.out.print("Indice contato: ");
                    indice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Rotulo: ");
                    rotulo = scanner.nextLine();
                    System.out.print("Novo telefone: ");
                    tel = scanner.nextLine();
                    agenda.updateTelefone(rotulo, tel, indice);
                    break;

                case 8:
                    System.out.print("Indice contato: ");
                    indice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Rotulo: ");
                    rotulo = scanner.nextLine();
                    System.out.print("Novo email: ");
                    email = scanner.nextLine();
                    agenda.updateEmail(rotulo, email, indice);
                    break;

                case 9:
                    System.out.print("Indice contato: ");
                    indice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Rotulo: ");
                    rotulo = scanner.nextLine();
                    agenda.removeTelefone(rotulo, indice);
                    break;

                case 10:
                    System.out.print("Indice contato: ");
                    indice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Rotulo: ");
                    rotulo = scanner.nextLine();
                    agenda.removeEmail(rotulo, indice);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }

    public static void main(String[] args) {
        new App().menu();
    }
}