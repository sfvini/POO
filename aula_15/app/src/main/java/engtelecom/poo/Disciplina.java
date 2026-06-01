package engtelecom.poo;

import java.util.Arrays;

public class Disciplina {
    private String sigla;
    private DiasDaSemana[] dias;

    public Disciplina(String sigla, DiasDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    @Override
    public String toString() {
       return String.format("SIGLA: " + this.sigla + "\n" + "AULAS: " + Arrays.toString(dias));
    }
}
