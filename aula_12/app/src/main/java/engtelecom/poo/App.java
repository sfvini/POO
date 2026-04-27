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

            
                
             

        } while (opcao != 0);
    }

    public static void main(String[] args) {
        new App().menu();
    }
}