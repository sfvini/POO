package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.util.ArrayList;

public class RelogioAnalogico extends Relogio {
    private ArrayList<Draw> ponteiros;
    private Draw moldura;

    public RelogioAnalogico(double x, double y) {
        super(x, y);
        this.tamanho = 0.2;
        this.ponteiros = new ArrayList<>();
    }

    @Override
    public void atualizarTempo() {
        this.segundo++;
        if (this.segundo >= 60) {
            this.segundo = 0;
            this.minuto++;
            if (this.minuto >= 60) {
                this.minuto = 0;
                this.hora = (this.hora + 1) % 24;
            }
        }
    }

    @Override
    public void desenhar(Draw desenho, java.awt.Color cor) {
        double comprimentoPonteiroSegundo = this.tamanho;
        double comprimentoPonteiroHora = this.tamanho * 0.5;
        double raioInicioTraco = this.tamanho * 0.85;
        double raioFimTraco = this.tamanho * 0.95;
        double espessuraTraco = this.tamanho * 0.05;
        double espessuraSegundo = this.tamanho * 0.025;

        desenho.setPenColor(Draw.WHITE);
        desenho.filledCircle(this.x, this.y, this.tamanho);

        desenho.setPenColor(Draw.BLACK);
        desenho.setPenRadius(espessuraTraco);
        int tracosDasHoras = 12;
        double anguloEntreTracos = 30.0;

        for (int traco = 0; traco < tracosDasHoras; traco++) {
            double angulo = Math.toRadians(anguloEntreTracos * traco);
            desenho.line(
                    this.x + raioFimTraco * Math.sin(angulo),
                    this.y + raioFimTraco * Math.cos(angulo),
                    this.x + raioInicioTraco * Math.sin(angulo),
                    this.y + raioInicioTraco * Math.cos(angulo)
            );
        }

        double anguloHora = Math.toRadians(30.0 * this.hora + 0.5 * this.minuto);
        double anguloMinuto = Math.toRadians(6.0 * this.minuto);
        double anguloSegundo = Math.toRadians(6.0 * this.segundo);

        desenho.setPenColor(Draw.BLACK);
        desenho.setPenRadius(espessuraTraco * 0.8);
        desenho.line(this.x, this.y,
                this.x + comprimentoPonteiroHora * Math.sin(anguloHora),
                this.y + comprimentoPonteiroHora * Math.cos(anguloHora));

        desenho.setPenRadius(espessuraTraco * 0.4);
        desenho.line(this.x, this.y,
                this.x + comprimentoPonteiroSegundo * 0.8 * Math.sin(anguloMinuto),
                this.y + comprimentoPonteiroSegundo * 0.8 * Math.cos(anguloMinuto));

        desenho.setPenColor(Draw.RED);
        desenho.setPenRadius(espessuraSegundo);
        desenho.line(this.x, this.y,
                this.x + comprimentoPonteiroSegundo * Math.sin(anguloSegundo),
                this.y + comprimentoPonteiroSegundo * Math.cos(anguloSegundo));
    }
}