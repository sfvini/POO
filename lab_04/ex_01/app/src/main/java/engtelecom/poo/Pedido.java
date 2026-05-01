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

    public boolean addProduto(Produto produto, int quantidade) {
        if (produto.getQuantidadeEst() >= quantidade) {
            produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public boolean removeProduto(int idProduto, int quantidade) {
        Produto produtoParaRemover = null;

        for (Produto p : produtos.keySet()) {
            if (p.getId() == idProduto) {
                int qtdAtual = produtos.get(p);
                if (quantidade >= qtdAtual) {
                    produtoParaRemover = p;
                } else {
                    produtos.put(p, qtdAtual - quantidade);
                    return true;
                }
                break;
            }
        }

        if (produtoParaRemover != null) {
            produtos.remove(produtoParaRemover);
            return true;
        }
        return false;
    }
}