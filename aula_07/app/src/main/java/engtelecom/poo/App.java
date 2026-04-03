package engtelecom.poo;

import java.util.ArrayList;

public class App {

    private final static ArrayList<Conta> contas = new ArrayList<>();

    private void menu() {
        System.out.println("BANCO");
        System.out.println("1. Criar conta");
        System.out.println("2. Listar contas");
        System.out.println("3. Sacar");
        System.out.println("4. Depositar");
        System.out.println("5. Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    private boolean isConta(int num) {
        for (Conta c : contas) {
            if (c.getNumConta() == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        App app = new App();
        int opcao;

        do {
            app.menu();
            opcao = Integer.parseInt(IO.readln());

            switch (opcao) {
                case 1:
                    String titular = IO.readln("Nome do titular: ");
                    double saldo = Double.parseDouble(IO.readln("Saldo inicial: "));
                    contas.add(new Conta(titular, saldo));
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2:
                    if (contas.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada.");
                    } else {
                        contas.forEach(IO::println);
                    }
                    break;

                case 3:
                    int nSacar = Integer.parseInt(IO.readln("Número da conta: "));
                    double vSacar = Double.parseDouble(IO.readln("Valor: "));

                    if (!app.isConta(nSacar)) {
                        System.out.println("Conta não encontrada!");
                        break;
                    }

                    for (Conta c : contas) {
                        if (c.getNumConta() == nSacar) {
                            c.sacar(vSacar);
                            break;
                        }
                    }
                    break;

                case 4:
                    int nDepositar = Integer.parseInt(IO.readln("Número da conta: "));
                    double vDepositar = Double.parseDouble(IO.readln("Valor: "));

                    if (!app.isConta(nDepositar)) {
                        System.out.println("Conta não encontrada!");
                        break;
                    }

                    for (Conta c : contas) {
                        if (c.getNumConta() == nDepositar) {
                            c.depositar(vDepositar);
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 5);
    }
}