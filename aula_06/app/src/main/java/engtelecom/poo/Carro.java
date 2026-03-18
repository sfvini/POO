package engtelecom.poo;

public class Carro {
    private String modelo;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    private static final int VELOCIDADE_MAXIMA = 300;
    private static final int VELOCIDADE_MINIMA = 0;

    public Carro(String modelo, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeMaxima = VELOCIDADE_MAXIMA;
    }

    public void acelerar(int v) {
        if (velocidadeAtual + v < velocidadeMaxima) {
            velocidadeAtual += v;
        } else {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    public void freiar(int v) {
        if (velocidadeAtual - v > VELOCIDADE_MINIMA) {
            velocidadeAtual -= v;
        } else {
            velocidadeAtual = VELOCIDADE_MINIMA;
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidadeAtual=" + velocidadeAtual +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", VELOCIDADE_MAXIMA=" + VELOCIDADE_MAXIMA +
                ", VELOCIDADE_MINIMA=" + VELOCIDADE_MINIMA +
                '}';
    }
}
