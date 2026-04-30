package engtelecom.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Pedido {
    private static int contador = 1;
    private int id;
    private LocalDate data;
    private String situacao;
    private HashMap<Produto, Integer> produtos;

    public Pedido(LocalDate data, String situacao) {
        this.id = contador++;
        this.data = data;
        this.situacao = situacao;
        this.produtos = new HashMap<>();
    }

    public boolean addProduto(Produto produto, int quantidade){
        produtos.put(produto, quantidade);
        return true;
    }

    public boolean removeProduto(Produto produto, int quantidade){
        int quantidadeAtual = produtos.get(produto);
        produtos.put(produto, quantidadeAtual - quantidade);
        return true;
    }
}
