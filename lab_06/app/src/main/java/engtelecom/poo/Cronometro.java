package engtelecom.poo;

public abstract class Cronometro extends Relogio {
    protected boolean progressivo;
    protected boolean regressivo;
    protected int h_cont;
    protected int m_cont;
    protected int s_cont;

    public Cronometro(int x, int y) {
        super(x, y);
        setModoRelogioComum();
    }

    public boolean setModoProgressivo() {
        this.progressivo = true;
        this.regressivo = false;
        this.h_cont = 0;
        this.m_cont = 0;
        this.s_cont = 0;
        return true;
    }

    public boolean setModoRegressivo(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            this.progressivo = false;
            this.regressivo = true;
            this.h_cont = h;
            this.m_cont = m;
            this.s_cont = s;
            return true;
        }
        return false;
    }

    public boolean setModoRelogioComum() {
        this.progressivo = false;
        this.regressivo = false;
        this.h_cont = 0;
        this.m_cont = 0;
        this.s_cont = 0;
        return true;
    }

    @Override
    public void avancarTempo() {
        if (this.progressivo) {
            this.s_cont++;
            if (this.s_cont >= 60) {
                this.s_cont = 0;
                this.m_cont++;
                if (this.m_cont >= 60) {
                    this.m_cont = 0;
                    this.h_cont = (this.h_cont + 1) % 24;
                }
            }
        } else if (this.regressivo) {
            if (this.h_cont == 0 && this.m_cont == 0 && this.s_cont == 0) {
                return;
            }
            this.s_cont--;
            if (this.s_cont < 0) {
                this.s_cont = 59;
                this.m_cont--;
                if (this.m_cont < 0) {
                    this.m_cont = 59;
                    this.h_cont--;
                }
            }
        } else {
            this.segundos++;
            if (this.segundos >= 60) {
                this.segundos = 0;
                this.minutos++;
                if (this.minutos >= 60) {
                    this.minutos = 0;
                    this.horas = (this.horas + 1) % 24;
                }
            }
        }
    }
}