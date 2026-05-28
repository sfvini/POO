package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;
    protected double x;
    protected double y;

    public Relogio(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Relogio(int hora, int minuto, int segundo, double x, double y) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar(Draw desenho);
    public abstract void atualizarTempo();
}