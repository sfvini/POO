package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_MAX = 23;
    private static final int MINUTO_MAX = 59;
    private static final int SEGUNDO_MAX = 59;
    private static final int MIN = 0;

    public void setHorario(int h, int m, int s) {
        if (!(h > HORA_MAX || h < MIN || m > MINUTO_MAX || m < MIN || s > SEGUNDO_MAX || s < MIN)) {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        }
    }

    public void setHorario(int h, int m) {
        setHorario(h, m, 0);
    }

    public void setHorario(int h) {
        setHorario(h, 0, 0);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hora,minuto,segundo);
    }
}
