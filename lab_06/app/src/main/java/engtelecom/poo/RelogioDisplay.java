package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.time.LocalTime;
import java.util.ArrayList;

public class RelogioDisplay extends Cronometro {
    public static final int TAM_PEQUENO = 1;
    public static final int TAM_MEDIO = 2;
    public static final int TAM_GRANDE = 3;

    private ArrayList<Display> displays;
    private int modo;
    private int tamanho;
    private Color cor;

    public RelogioDisplay(double x, double y, int tamanho, int modo, int h, int m, int s) {
        super(h, m, s, x, y, modo);

        this.displays = new ArrayList<>();
        this.cor = Color.GREEN;
        this.modo = modo;

        //validacao de tamanho
        if (tamanho < TAM_PEQUENO || tamanho > TAM_GRANDE) {
            this.tamanho = TAM_MEDIO;
        } else {
            this.tamanho = tamanho;
        }

        double f = this.tamanho * 50;
        this.displays.add(new Display(x, y, this.tamanho));
        this.displays.add(new Display(x + (1.5 * f), y, this.tamanho));
        this.displays.add(new Display(x + (3.5 * f), y, this.tamanho));
        this.displays.add(new Display(x + (5.0 * f), y, this.tamanho));
        this.displays.add(new Display(x + (7.0 * f), y, this.tamanho));
        this.displays.add(new Display(x + (8.5 * f), y, this.tamanho));

        if (this.modo == 0) {
            this.hora = LocalTime.now().getHour();
            this.minuto = LocalTime.now().getMinute();
            this.segundo = LocalTime.now().getSecond();
        } else if (this.modo == 1) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        }
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
    public void atualizarTempo() {
        super.atualizarTempo();
        ligarDisplay();
    }

    @Override
    public void desenhar(Draw desenho) {
        displays.forEach(display -> {
            display.desenhar(desenho, this.cor);
        });
    }
}