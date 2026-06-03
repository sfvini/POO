package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Font;
import java.time.LocalTime;

public class RelogioTextual extends Cronometro {
    private int tFonte;
    private Font fonte;

    public RelogioTextual(double x, double y, int tFonte, int modo, int h, int m, int s) throws Exception {
        super(h, m, s, x, y, modo);

        this.tFonte = (tFonte < 10 || tFonte > 50) ? 24 : tFonte;
        this.fonte = new Font("Monospaced", Font.BOLD, this.tFonte);

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

    @Override
    public void desenhar(Draw desenho) {
        desenho.setFont(this.fonte);
        desenho.setPenColor(Draw.BLACK);

        String str = String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
        desenho.text(this.x, this.y, str);
    }
}