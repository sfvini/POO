package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String email;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.enderecos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public boolean addPedido(LocalDate data, String situacao) {
        Pedido p = new Pedido(data, situacao);
        return pedidos.add(p);
    }

    public boolean addProduto(int idPedido, int idProduto, int quantidade, ArrayList<Produto> catalogo) {
        for (Pedido p : this.pedidos) {
            if (p.getId() == idPedido) {

                for (Produto prod : catalogo) {
                    if (prod.getId() == idProduto) {
                        return p.addProduto(prod, quantidade);
                    }
                }
            }
        }
        return false;
    }

    public boolean removeProduto(int idPedido, int idProduto, int quantidade) {
        for (Pedido p : pedidos) {
            if (p.getId() == idPedido) {
                return p.removeProduto(idProduto, quantidade);
            }
        }
        return false;
    }

    public boolean addEndereco(String cep, String rua, int numero, String complemento) {
        Endereco e = new Endereco(cep, rua, numero, complemento);
        return enderecos.add(e);
    }
}
