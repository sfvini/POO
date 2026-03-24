package engtelecom.poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private static final int DIA_PADRAO = 1;
    private static final int MES_PADRAO = 1;
    private static final int ANO_PADRAO = 1970;

    public Data() {
        this.dia = DIA_PADRAO;
        this.mes = MES_PADRAO;
        this.ano = ANO_PADRAO;
    }

    public Data(int dia) {
        this.dia = dia;
        this.mes = MES_PADRAO;
        this.ano = ANO_PADRAO;
    }

    public Data(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ANO_PADRAO;
    }

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = DIA_PADRAO;
            this.mes = MES_PADRAO;
            this.ano = ANO_PADRAO;
        }
    }

    private boolean eBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private int diasNoMes(int mes, int ano) {
        return switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> eBissexto(ano) ? 29 : 28;
            default -> 0;
        };
    }

    private boolean validarData(int d, int m, int a) {
        if (m < 1 || m > 12) return false;
        if (a < 1) return false;
        return d >= 1 && d <= diasNoMes(m, a);
    }

    public boolean setDia(int dia) {
        if (validarData(dia, this.mes, this.ano)) {
            this.dia = dia;
            return true;
        }
        return false;
    }

    public boolean setMes(int mes) {
        if (validarData(this.dia, mes, this.ano)) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public boolean setAno(int ano) {
        if (validarData(this.dia, this.mes, ano)) {
            this.ano = ano;
            return true;
        }
        return false;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }


    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String extenso() {
        String nomeMes = switch (mes) {
            case 1 -> "janeiro";
            case 2 -> "fevereiro";
            case 3 -> "março";
            case 4 -> "abril";
            case 5 -> "maio";
            case 6 -> "junho";
            case 7 -> "julho";
            case 8 -> "agosto";
            case 9 -> "setembro";
            case 10 -> "outubro";
            case 11 -> "novembro";
            case 12 -> "dezembro";
            default -> "";
        };
        return dia + " de " + nomeMes + " de " + ano;
    }

    private long totalDiasDesdeZero() {
        long total = (long) ano * 365 + (ano / 4) - (ano / 100) + (ano / 400);
        for (int m = 1; m < mes; m++) {
            total += diasNoMes(m, ano);
        }
        total += dia;
        return total;
    }

    public long diferenca(Data dd) {

        return Math.abs(this.totalDiasDesdeZero() - dd.totalDiasDesdeZero());
    }
}
