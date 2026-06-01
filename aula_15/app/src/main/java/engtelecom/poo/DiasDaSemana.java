package engtelecom.poo;

public enum DiasDaSemana {
    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda-feira"),
    TERCA(3, "Terça-feira"),
    QUARTA(4, "Quarta-feira"),
    QUINTA(5, "Quinta-feira"),
    SEXTA(6, "Sexta-feira"),
    SABADO(7, "Sábado");

    public final int codigo;
    public final String extensao;

    DiasDaSemana(int codigo, String extensao) {
        this.codigo = codigo;
        this.extensao = extensao;
    }

    public static DiasDaSemana getByCodigo(int c) {
        for (DiasDaSemana dia : DiasDaSemana.values()) {
            if (dia.codigo == c) {
                return dia;
            }
        }
        throw new IllegalArgumentException("Código Inválido");
    }

    @Override
    public String toString() {
        return String.format("%s", this.extensao);
    }
}
