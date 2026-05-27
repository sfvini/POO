package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.awt.Font;

public class RelogioTextual extends Cronometro {
    private Draw texto;
    private int tamanhoFonte;

    public RelogioTextual(double x, double y, int tamanhoFonte) {
        super(x, y);
        if (tamanhoFonte >= 10 && tamanhoFonte <= 40) {
            this.tamanhoFonte = tamanhoFonte;
        } else {
            this.tamanhoFonte = 16;
        }
    }

    @Override
    public void desenhar(Draw desenho, Color cor) {
        desenho.setPenColor(cor);

        Font fonte = new Font("Monospaced", Font.BOLD, this.tamanhoFonte);
        desenho.setFont(fonte);

        String formatoHora;
        if (this.progressivo || this.regressivo) {
            formatoHora = String.format("%02d:%02d:%02d", this.h_cont, this.m_cont, this.s_cont);
        } else {
            formatoHora = String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
        }

        desenho.text(this.x, this.y, formatoHora);
    }

    @Override
    public boolean desenhar(Draw canvas) {
        desenhar(canvas, this.cor);
        return true;
    }
}