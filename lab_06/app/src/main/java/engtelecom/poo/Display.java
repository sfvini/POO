package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.*;
import java.util.ArrayList;

public class Display {
    private ArrayList<Segmento> segmentos;
    private int numero;

    // Constroi os segmentos
    public Display(double x, double y, double tamanho) {
        this.segmentos = new ArrayList<>();
        this.numero = 0;

        if (tamanho < 1 || tamanho > 3) {
            tamanho = 2;
        }

        // Cada unidade de tamanho equivale a 50 pixels como está no PDF
        double f = tamanho * 50;

        // Criando os segmentos com base no tamanho dado, como está no PDF
        // A
        double[] xA = {0.1 * f + x, 0.2 * f + x, 1.0 * f + x, 1.1 * f + x, 1.0 * f + x, 0.2 * f + x};
        double[] yA = {2.2 * f + y, 2.3 * f + y, 2.3 * f + y, 2.2 * f + y, 2.1 * f + y, 2.1 * f + y};
        this.segmentos.add(new Segmento(xA, yA));

        // B
        double[] xB = {1.1 * f + x, 1.2 * f + x, 1.2 * f + x, 1.1 * f + x, 1.0 * f + x, 1.0 * f + x};
        double[] yB = {1.2 * f + y, 1.3 * f + y, 2.0 * f + y, 2.1 * f + y, 2.0 * f + y, 1.2 * f + y};
        this.segmentos.add(new Segmento(xB, yB));

        // C
        double[] xC = {1.1 * f + x, 1.2 * f + x, 1.2 * f + x, 1.1 * f + x, 1.0 * f + x, 1.0 * f + x};
        double[] yC = {0.2 * f + y, 0.3 * f + y, 1.0 * f + y, 1.1 * f + y, 1.0 * f + y, 0.2 * f + y};
        this.segmentos.add(new Segmento(xC, yC));

        // D
        double[] xD = {0.1 * f + x, 0.2 * f + x, 1.0 * f + x, 1.1 * f + x, 1.0 * f + x, 0.2 * f + x};
        double[] yD = {0.2 * f + y, 0.3 * f + y, 0.3 * f + y, 0.2 * f + y, 0.1 * f + y, 0.1 * f + y};
        this.segmentos.add(new Segmento(xD, yD));

        // E
        double[] xE = {0.1 * f + x, 0.2 * f + x, 0.2 * f + x, 0.1 * f + x, 0.0 * f + x, 0.0 * f + x};
        double[] yE = {0.2 * f + y, 0.3 * f + y, 1.0 * f + y, 1.1 * f + y, 1.0 * f + y, 0.2 * f + y};
        this.segmentos.add(new Segmento(xE, yE));

        // F
        double[] xF = {0.1 * f + x, 0.2 * f + x, 0.2 * f + x, 0.1 * f + x, 0.0 * f + x, 0.0 * f + x};
        double[] yF = {1.2 * f + y, 1.3 * f + y, 2.0 * f + y, 2.1 * f + y, 2.0 * f + y, 1.2 * f + y};
        this.segmentos.add(new Segmento(xF, yF));

        // G
        double[] xG = {0.1 * f + x, 0.2 * f + x, 1.0 * f + x, 1.1 * f + x, 1.0 * f + x, 0.2 * f + x};
        double[] yG = {1.2 * f + y, 1.3 * f + y, 1.3 * f + y, 1.2 * f + y, 1.1 * f + y, 1.1 * f + y};
        this.segmentos.add(new Segmento(xG, yG));

        setValor(0);
    }

    // Lógica para "converter" o número em segmentos
    public void setValor(int numero) {
        if (numero >= 0 && numero <= 9) {
            this.numero = numero;

            // Desliga todos os segmentos
            for (int i = 0; i < 7; i++) {
                segmentos.get(i).setLigado(false);
            }

            // Liga os segmentos que representam o número

            if (numero == 0) {
                segmentos.get(0).setLigado(true);
                segmentos.get(1).setLigado(true);
                segmentos.get(2).setLigado(true);
                segmentos.get(3).setLigado(true);
                segmentos.get(4).setLigado(true);
                segmentos.get(5).setLigado(true);
            } else if (numero == 1) {
                segmentos.get(1).setLigado(true);
                segmentos.get(2).setLigado(true);
            } else if (numero == 2) {
                segmentos.get(0).setLigado(true);
                segmentos.get(1).setLigado(true);
                segmentos.get(6).setLigado(true);
                segmentos.get(4).setLigado(true);
                segmentos.get(3).setLigado(true);
            } else if (numero == 3) {
                segmentos.get(0).setLigado(true);
                segmentos.get(1).setLigado(true);
                segmentos.get(6).setLigado(true);
                segmentos.get(2).setLigado(true);
                segmentos.get(3).setLigado(true);
            } else if (numero == 4) {
                segmentos.get(5).setLigado(true);
                segmentos.get(6).setLigado(true);
                segmentos.get(1).setLigado(true);
                segmentos.get(2).setLigado(true);
            } else if (numero == 5) {
                segmentos.get(0).setLigado(true);
                segmentos.get(5).setLigado(true);
                segmentos.get(6).setLigado(true);
                segmentos.get(2).setLigado(true);
                segmentos.get(3).setLigado(true);
            } else if (numero == 6) {
                segmentos.get(0).setLigado(true);
                segmentos.get(5).setLigado(true);
                segmentos.get(4).setLigado(true);
                segmentos.get(3).setLigado(true);
                segmentos.get(2).setLigado(true);
                segmentos.get(6).setLigado(true);
            } else if (numero == 7) {
                segmentos.get(0).setLigado(true);
                segmentos.get(1).setLigado(true);
                segmentos.get(2).setLigado(true);
            } else if (numero == 8) {
                segmentos.get(0).setLigado(true);
                segmentos.get(1).setLigado(true);
                segmentos.get(2).setLigado(true);
                segmentos.get(3).setLigado(true);
                segmentos.get(4).setLigado(true);
                segmentos.get(5).setLigado(true);
                segmentos.get(6).setLigado(true);
            } else {
                segmentos.get(0).setLigado(true);
                segmentos.get(1).setLigado(true);
                segmentos.get(2).setLigado(true);
                segmentos.get(3).setLigado(true);
                segmentos.get(5).setLigado(true);
                segmentos.get(6).setLigado(true);
            }
        }
    }

    // A função que pinta o segmento
    public void desenhar(Draw desenho, Color cor) {
        segmentos.forEach(segmento -> {
            segmento.desenhar(desenho, cor);
        });
    }
}