package engtelecom.poo;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String email;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
