package engtelecom.poo;

public class Retangulo {
    private int largura;
    private int altura;
    private String codificacao;

    private static final int LARGURA_PADRAO = 4;
    private static final int ALTURA_PADRAO = 3;
    private static final String COD_PADRAO = "ASCII";

    public Retangulo(int largura, int altura, String codificacao) {
        if (largura > 0 && altura > 0) {
            this.largura = largura;
            this.altura = altura;
        } else {
            this.largura = LARGURA_PADRAO;
            this.altura = ALTURA_PADRAO;
        }

        if (codificacao != null && (codificacao.equalsIgnoreCase("ASCII") || codificacao.equalsIgnoreCase("UTF8"))) {
            this.codificacao = codificacao.toUpperCase();
        } else {
            this.codificacao = COD_PADRAO;
        }
    }

    public Retangulo() {
        this.altura = ALTURA_PADRAO;
        this.largura = LARGURA_PADRAO;
        this.codificacao = COD_PADRAO;
    }

    public boolean setLargura(int largura) {
        if (largura > 0) {
            this.largura = largura;
            return true;
        }
        return false;
    }

    public boolean setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        }
        return false;
    }

    public boolean setCodificacao(String codificacao) {
        if (codificacao != null && (codificacao.equalsIgnoreCase("ASCII") || codificacao.equalsIgnoreCase("UTF8"))) {
            this.codificacao = codificacao.toUpperCase();
            return true;
        }
        return false;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public String getCodificacao() {
        return codificacao;
    }


    public int area() {
        return largura * altura;
    }

    public int perimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        String resultado = "";

        resultado += (this.codificacao.equals("UTF8") ? "┌" : "+");
        for (int i = 0; i < largura - 2; i++) {
            resultado += (this.codificacao.equals("UTF8") ? "─" : "-");
        }
        if (largura > 1) {
            resultado += (this.codificacao.equals("UTF8") ? "┐" : "+");
        }
        resultado += "\n";

        for (int i = 0; i < altura - 2; i++) {
            resultado += (this.codificacao.equals("UTF8") ? "│" : "|");
            for (int j = 0; j < largura - 2; j++) {
                resultado += " ";
            }
            if (largura > 1) {
                resultado += (this.codificacao.equals("UTF8") ? "│" : "|");
            }
            resultado += "\n";
        }

        if (altura > 1) {
            resultado += (this.codificacao.equals("UTF8") ? "└" : "+");
            for (int i = 0; i < largura - 2; i++) {
                resultado += (this.codificacao.equals("UTF8") ? "─" : "-");
            }
            if (largura > 1) {
                resultado += (this.codificacao.equals("UTF8") ? "┘" : "+");
            }
        }

        return resultado;
    }
}