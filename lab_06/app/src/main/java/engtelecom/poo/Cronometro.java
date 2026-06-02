package engtelecom.poo;

public abstract class Cronometro extends Relogio {
    protected int modo;

    public Cronometro(int hora, int minuto, int segundo, double x, double y, int modo) {
        super(x, y, hora, minuto, segundo);
        this.modo = modo;
    }
}
