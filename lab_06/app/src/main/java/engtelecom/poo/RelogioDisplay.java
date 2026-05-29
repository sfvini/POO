package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.time.LocalTime;
import java.util.ArrayList;

public class RelogioDisplay extends Relogio implements Cronometro {
    public static final int TAM_PEQUENO = 1;
    public static final int TAM_MEDIO = 2;
    public static final int TAM_GRANDE = 3;

    private ArrayList<Display> displays;
    private int modo;
    private int tamanho;
    private Color cor;

    public RelogioDisplay(double x, double y, int tamanho, int modo) {
        super(x, y);

        this.displays = new ArrayList<>();
        this.cor = Color.GREEN;
        this.modo = modo;

        if (tamanho < TAM_PEQUENO || tamanho > TAM_GRANDE) {
            this.tamanho = TAM_MEDIO;
        } else {
            this.tamanho = tamanho;
        }

        if (this.modo == 0) {
            this.hora = LocalTime.now().getHour();
            this.minuto = LocalTime.now().getMinute();
            this.segundo = LocalTime.now().getSecond();
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }

        double f = this.tamanho * 50;

        this.displays.add(new Display(x, y, this.tamanho));
        this.displays.add(new Display(x + (1.5 * f), y, this.tamanho));

        this.displays.add(new Display(x + (3.5 * f), y, this.tamanho));
        this.displays.add(new Display(x + (5.0 * f), y, this.tamanho));

        this.displays.add(new Display(x + (7.0 * f), y, this.tamanho));
        this.displays.add(new Display(x + (8.5 * f), y, this.tamanho));

        ligarDisplay();
    }

    public void ligarDisplay() {
        displays.get(0).setValor(this.hora / 10);
        displays.get(1).setValor(this.hora % 10);

        displays.get(2).setValor(this.minuto / 10);
        displays.get(3).setValor(this.minuto % 10);

        displays.get(4).setValor(this.segundo / 10);
        displays.get(5).setValor(this.segundo % 10);
    }


    @Override
    public void setModoProgressivo() {
        this.modo = 1;
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
        ligarDisplay();
    }

    @Override
    public void setModoRegressivo(int h, int m, int s) {
        this.modo = 2;
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
        ligarDisplay();
    }

    @Override
    public void setModoRelogioComum() {
        this.modo = 0;
        this.hora = LocalTime.now().getHour();
        this.minuto = LocalTime.now().getMinute();
        this.segundo = LocalTime.now().getSecond();
        ligarDisplay();
    }


    @Override
    public void atualizarTempo() {
        if (this.modo == 0 || this.modo == 1) {
            this.segundo++;

            if (this.segundo == 60) {
                this.segundo = 0;
                this.minuto++;

                if (this.minuto == 60) {
                    this.minuto = 0;
                    this.hora++;

                    if (this.hora == 24) {
                        this.hora = 0;
                    }
                }
            }
        } else if (this.modo == 2) {
            if (this.hora == 0 && this.minuto == 0 && this.segundo == 0) {
                return;
            }

            this.segundo--;
            if (this.segundo < 0) {
                this.segundo = 59;
                this.minuto--;

                if (this.minuto < 0) {
                    this.minuto = 59;
                    this.hora--;
                }
            }
        }
        ligarDisplay();
    }

    @Override
    public void desenhar(Draw desenho) {
        displays.forEach(display -> {
            display.desenhar(desenho, this.cor);
        });
    }
}