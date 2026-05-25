package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.time.LocalTime;
import java.awt.Color;

public abstract class Relogio {
    protected int horas;
    protected int minutos;
    protected int segundos;
    protected int posX;
    protected int posY;
    protected Color cor;
    protected double tamanho;

    public Relogio(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.cor = Color.BLACK;
        setHorarioAtual();
    }

    public boolean setHorarioAtual() {
        LocalTime agora = LocalTime.now();
        this.horas = agora.getHour();
        this.minutos = agora.getMinute();
        this.segundos = agora.getSecond();
        return true;
    }

    public boolean setHorarioManual(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            this.horas = h;
            this.minutos = m;
            this.segundos = s;
            return true;
        }
        return false;
    }

    public abstract void avancarTempo();

    public abstract boolean desenhar(Draw canvas);
}