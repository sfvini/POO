package engtelecom.poo;

public class Retangulo {
    private int altura;
    private int largura;
    private String cod;

    public Retangulo() {
            this.altura = 3;
            this.largura = 4;
            this.cod = "ascii";
    }

    public Retangulo(int altura, int largura, String cod) {
        if (altura <= 0 || largura <= 0 || !cod.equalsIgnoreCase("utf8")) {
            this.altura = 3;
            this.largura = 4;
            this.cod = "ascii";
        } else {
            this.altura = altura;
            this.largura = largura;
            this.cod = cod.toLowerCase();
        }
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if (altura <= 0) return false;
        this.altura = altura;
        return true;
    }

    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if (largura <= 0) return false;
        this.largura = largura;
        return true;
    }

    public String getCod() {
        return cod;
    }

    public boolean setCod(String cod) {
        if (!cod.equals("ascii") && !cod.equals("UTF8")) return false;
        this.cod = cod;
        return true;
    }

    public int perimetro(int largura, int altura) {
        return 2 * (largura + altura);
    }

    public int area(int largura, int altura) {
        return largura * altura;
    }

    @Override
    public String toString() {
        StringBuilder mensagem = new StringBuilder();
        String pontaES = (cod.equals("ascii")) ? "+" : "\u250c";
        String pontaDS = (cod.equals("ascii")) ? "+" : "\u2510";
        String pontaEI = (cod.equals("ascii")) ? "+" : "\u2514";
        String pontaDI = (cod.equals("ascii")) ? "+" : "\u2518";
        String linha = (cod.equals("ascii")) ? "-" : "\u2500";
        String coluna = (cod.equals("ascii")) ? "|" : "\u2502";
        String espaco = " ";

        String teto = pontaES + linha.repeat(this.largura - 2) + pontaDS + "\n";
        String meio = coluna + espaco.repeat(this.largura - 2) + coluna + "\n";
        String chao = pontaEI + linha.repeat(this.largura - 2) + pontaDI + "\n";

        mensagem.append(teto);
        mensagem.append(meio.repeat(this.altura - 2));
        mensagem.append(chao);

        return mensagem.toString();
    }
}
