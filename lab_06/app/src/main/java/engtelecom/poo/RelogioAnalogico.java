package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.time.LocalTime;

public class RelogioAnalogico extends Relogio {

    public RelogioAnalogico(double x, double y) {
        super(x, y);
        super.hora = LocalTime.now().getHour();
        super.minuto = LocalTime.now().getMinute();
        super.segundo = LocalTime.now().getSecond();
    }

    @Override
    public void desenhar(Draw desenho) {
        double raio = 100.0;

        desenho.setPenColor(Draw.WHITE);
        desenho.filledCircle(this.x, this.y, raio);

        desenho.setPenColor(Draw.BLACK);
        desenho.circle(this.x, this.y, raio);
        double anguloHora = Math.toRadians(30.0 * (this.hora % 12) + 0.5 * this.minuto);
        double anguloMinuto = Math.toRadians(6.0 * this.minuto + 0.1 * this.segundo);
        double anguloSegundo = Math.toRadians(6.0 * this.segundo);

        desenho.setPenColor(Draw.BLACK);

        desenho.line(this.x, this.y,
                this.x + (raio * 0.5) * Math.sin(anguloHora),
                this.y + (raio * 0.5) * Math.cos(anguloHora));

        desenho.line(this.x, this.y,
                this.x + (raio * 0.8) * Math.sin(anguloMinuto),
                this.y + (raio * 0.8) * Math.cos(anguloMinuto));

        desenho.setPenColor(Draw.RED);
        desenho.line(this.x, this.y,
                this.x + (raio * 0.85) * Math.sin(anguloSegundo),
                this.y + (raio * 0.85) * Math.cos(anguloSegundo));
    }

    @Override
    public void atualizarTempo() {
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
    }
}