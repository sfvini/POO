package engtelecom.poo;

public abstract class Cronometro extends Relogio {
    protected int modo;

    public Cronometro(int hora, int minuto, int segundo, double x, double y, int modo) {
        super(hora, minuto, segundo, x, y);
        this.modo = modo;
    }

    public void setModo(int m){
        this.modo = m;
    }
}
