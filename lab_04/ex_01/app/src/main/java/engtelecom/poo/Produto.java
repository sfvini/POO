package engtelecom.poo;

public class Produto {
    private static int contador = 1;
    private int id;
    private String descricao;
    private double preco;
    private int quantidadeEst;

    public Produto(String descricao, double preco, int quantidadeEst) {
        this.id = contador++;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEst = quantidadeEst;
    }
}
