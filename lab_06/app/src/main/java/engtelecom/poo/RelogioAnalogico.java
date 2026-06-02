package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class RelogioAnalogico extends Relogio {

    public RelogioAnalogico(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar(Draw desenho) {
        //tamanho do relogio
        double raio = 100.0;

        //fundo do relogio
        desenho.setPenColor(Draw.WHITE);
        desenho.filledCircle(this.x, this.y, raio);

        //borda do relogio
        desenho.setPenColor(Draw.BLACK);
        desenho.circle(this.x, this.y, raio);

        //circulo tem 360°.
        //o relogio tem 12 horas: 360 / 12 = 30° por hora.
        double anguloHora = Math.toRadians(30.0 * this.hora);

        //o relogio tem 60 minutos: 360 / 60 = 6° por minuto.
        double anguloMinuto = Math.toRadians(6.0 * this.minuto);

        //o relogio tem 60 segundos: 360 / 60 = 6° por segundo.
        double anguloSegundo = Math.toRadians(6.0 * this.segundo);

        //cor preta dos ponteiros
        desenho.setPenColor(Draw.BLACK);

        //ponteiro das horas
        desenho.line(this.x, this.y,
                this.x + (raio * 0.5) * Math.sin(anguloHora),
                this.y + (raio * 0.5) * Math.cos(anguloHora));

        //ponteiro dos minutos
        desenho.line(this.x, this.y,
                this.x + (raio * 0.8) * Math.sin(anguloMinuto),
                this.y + (raio * 0.8) * Math.cos(anguloMinuto));

        //ponteiro dos segundos
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