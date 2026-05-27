package engtelecom.poo;

public abstract class Cronometro extends Relogio {
    protected boolean progressivo;
    protected boolean regressivo;
    protected int h_cont;
    protected int m_cont;
    protected int s_cont;

    public Cronometro(double x, double y) {
        super((int) x, (int) y);
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
    public void atualizarTempo() {
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
            this.segundo++;
            if (this.segundo >= 60) {
                this.segundo = 0;
                this.minuto++;
                if (this.minuto >= 60) {
                    this.minuto = 0;
                    this.hora = (this.hora + 1) % 24;
                }
            }
        }
    }

    @Override
    public void avancarTempo() {
        this.atualizarTempo();
    }
}