package engtelecom.poo;

public enum ValorCarta {
    AS(1, "Ás", "1"),
    DOIS(2, "Dois", "2"),
    TRES(3, "Três", "3"),
    QUATRO(4, "Quatro", "4"),
    CINCO(5, "Cinco", "5"),
    SEIS(6, "Seis", "6"),
    SETE(7, "Sete", "7"),
    OITO(8, "Oito", "8"),
    NOVE(9, "Nove", "9"),
    DEZ(10, "Dez", "10"),
    VALETE(11, "Valete", "j"),
    DAMA(12, "Dama", "q"),
    REI(13, "Rei", "k");

    public final int id;
    public final String nome;
    public final String inicial;

    ValorCarta(int id, String nome, String inicial) {
        this.id = id;
        this.nome = nome;
        this.inicial = inicial;
    }

    public static ValorCarta getById(int id) {
        for (ValorCarta v : ValorCarta.values()) {
            if (v.id == id) {
                return v;
            }
        }
        throw new IllegalArgumentException("ID Inválido");
    }

    @Override
    public String toString() {
        return String.format("%s", this.nome);
    }
}
