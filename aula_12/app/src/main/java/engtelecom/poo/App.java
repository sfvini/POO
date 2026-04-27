package engtelecom.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    private final Agenda agenda;

    public App() {
        agenda = new Agenda();
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

            opcao = Integer.parseInt(IO.readln());

            switch (opcao) {

                case 1:
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate d = LocalDate.parse(IO.readln("Digite a data de nascimento (dd/mm/yyy): "), formato);
                    String nome1 = IO.readln("Digite o nome: ");
                    String sobrenome1 = IO.readln("Digite o sobrenome:");
                    agenda.addContato(new Contato(nome1, sobrenome1, d));
                    break;

                case 2:
                    System.out.println(agenda);
                    break;

                case 3:
                    String nome2 = IO.readln("Digite o nome:");
                    String sobrenome2 = IO.readln("Digite o sobrenome:");
                    System.out.println(agenda.findContato(nome2, sobrenome2));
                    break;

                case 4:
                    System.out.println("Digite o índice: ");
                    agenda.removeContato(Integer.parseInt(IO.readln()));
                    break;

                case 5:
                    String rot1 = IO.readln("Digite o rótulo: ");
                    String dado1 = IO.readln("Digite o telefone/email: ");
                    String indice1 = IO.readln("Digite o índice do contato: ");
                    agenda.addTelefone(rot1, dado1, Integer.parseInt(indice1));
                    break;

                case 6:
                    String rot2 = IO.readln("Digite o rótulo: ");
                    String dado2 = IO.readln("Digite o telefone/email: ");
                    String indice2 = IO.readln("Digite o índice do contato: ");
                    agenda.addEmail(rot2, dado2, Integer.parseInt(indice2));
                    break;

                case 7:
                    String rot3 = IO.readln("Digite o rótulo: ");
                    String dado3 = IO.readln("Digite o telefone/email: ");
                    String indice3 = IO.readln("Digite o índice do contato: ");
                    agenda.updateTelefone(rot3, dado3, Integer.parseInt(indice3));
                    break;

                case 8:
                    String rot4 = IO.readln("Digite o rótulo: ");
                    String dado4 = IO.readln("Digite o telefone/email: ");
                    String indice4 = IO.readln("Digite o índice do contato: ");
                    agenda.updateEmail(rot4, dado4, Integer.parseInt(indice4));
                    break;

                case 9:
                    String rot5 = IO.readln("Digite o rótulo: ");
                    String indice5 = IO.readln("Digite o índice do contato: ");
                    agenda.removeTelefone(rot5, Integer.parseInt(indice5));
                    break;

                case 10:
                    String rot6 = IO.readln("Digite o rótulo: ");
                    String indice6 = IO.readln("Digite o índice do contato: ");
                    agenda.removeEmail(rot6, Integer.parseInt(indice6));
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

            }
        } while (opcao != 0);
    }

     static void main() {
        new App().menu();
    }
}