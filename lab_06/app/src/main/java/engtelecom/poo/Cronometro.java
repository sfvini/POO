package engtelecom.poo;

public abstract class Cronometro extends Relogio {
    protected int modo;

    public Cronometro(int hora, int minuto, int segundo, double x, double y, int modo) {
        super(x, y, hora, minuto, segundo);
        this.modo = modo;
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
                    if (this.hora == 24) this.hora = 0;
                }
            }
        } else if (this.modo == 2) {
            if (this.hora == 0 && this.minuto == 0 && this.segundo == 0) return;
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
    }
}
