package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_MAX = 23;
    private static final int MINUTO_MAX = 59;
    private static final int SEGUNDO_MAX = 59;
    private static final int MIN = 0;

    public boolean Horario(int h, int m, int s) {
        if (!(h > HORA_MAX || h < MIN || m > MINUTO_MAX || m < MIN || s > SEGUNDO_MAX || s < MIN)) {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
            return true;
        }
        return false;
    }

    public boolean Horario(int h, int m) {
        return Horario(h, m, 0);
    }

    public boolean Horario(int h) {
        return Horario(h, 0, 0);
    }

    public boolean setHora(int hora) {
        return (Horario(hora));
    }

    public boolean setMinuto(int minuto) {
        return (Horario(minuto));
    }

    public boolean setSegundo(int segundo) {
        return (Horario(segundo));
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    private String converterExtenso(int v){
      return switch (v){
          case 1 -> "um";
          case 2 -> "dois";
          case 3 -> "três";
          case 4 -> "quatro";
          case 5 -> "cinco";
          case 6 -> "seis";
          case 7 -> "sete";
          case 8 -> "oito";
          case 9 -> "nove";
          case 11 -> "onze";
          case 12 -> "doze";
          case 13 -> "treze";
          case 14 -> "catorze";
          case 15 -> "quinze";
          case 16 -> "dezesseis";
          case 17 -> "dezessete";
          case 18 -> "dezoito";
          case 19 -> "dezenove";

          case 10 -> "dez";
          case 20 -> "vinte";
          case 30 -> "trinta";
          case 40 -> "quarenta";
          case 50 -> "cinquenta";
          default -> "";
      };
    }

    public String extenso(){
        int dHora = (this.hora / 10) * 10;
        int uHora = this.hora % 10;

        String h = (this.hora == 1) ? "uma" : (this.hora == 2) ? "duas" : (this.hora < 20) ? converterExtenso(this.hora) :
                converterExtenso(dHora) + " e " + converterExtenso(uHora);

        h += (this.hora == 1) ? " hora, " : " horas, ";

        int dMinuto = (this.minuto / 10) * 10;
        int uMinuto = this.minuto % 10;

        String m = converterExtenso(dMinuto) + " e " + converterExtenso(uMinuto);

        m += (this.hora == 1) ? " minuto e " : " minutos e ";

        int dSegundo = (this.segundo / 10) * 10;
        int uSegundo = this.segundo % 10;

        String s = converterExtenso(dSegundo) + " e " + converterExtenso(uSegundo);
        s += (this.hora == 1) ? " segundo" : " segundos";

        return h+m+s;
    }

    public long emSegundos(){
        return (hora * 3600L) + (minuto * 60L) + segundo;
    }

    public long diferenca(Horario ho) {
        return Math.abs(this.emSegundos() - ho.emSegundos());
    }
}