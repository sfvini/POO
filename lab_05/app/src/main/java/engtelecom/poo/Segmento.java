package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.*;

public class Segmento {
    private boolean ligado;
    private double[] x;
    private double[] y;

    // Cria o segmento com base nas coordenadas
    public Segmento(double[] x, double[] y) {
        this.x = x;
        this.y = y;
        this.ligado = false;
    }

    // Liga e desliga
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Desenha o segmento ligado ou desligado
    public void desenhar(Draw desenho, Color cor) {
        if (this.ligado) {
            desenho.setPenColor(cor);
        } else {
            // Como está no PDF, estou criando uma cor mais escura (sem brilho) usando RGB
            int r = (int) (cor.getRed() * 0.2);
            int g = (int) (cor.getGreen() * 0.2);
            int b = (int) (cor.getBlue() * 0.2);
            Color cc = new Color(r, g, b);
            desenho.setPenColor(cc);
        }
        desenho.filledPolygon(this.x, this.y);
    }
}