package engtelecom.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook Dell", 4500.00, 10);
        Produto p2 = new Produto("Mouse sem fio", 120.00, 50);

        Cliente cliente = new Cliente("João da Silva", "joao@email.com");
        cliente.addEndereco("88000-000", "Rua das Flores", 123, "Apto 42");

        cliente.addPedido(LocalDate.now(), "Pendente");
        cliente.addPedido(LocalDate.now().plusDays(1), "Aguardando Pagamento");

        if (cliente.addProduto(1, p1, 1)) {
            System.out.println("Produto '" + p1.getDescricao() + "' adicionado ao Pedido 1");
        } else {
            System.out.println("Erro: Pedido 1 não encontrado ou estoque insuficiente.");
        }

        if (cliente.addProduto(2, p2, 5)) {
            System.out.println("Produto '" + p2.getDescricao() + "' adicionado ao Pedido 2");
        }

        if (cliente.removeProduto(1, p1.getId(), 1)) {
            System.out.println("Produto removido com sucesso do Pedido 1.");
        }
    }
}