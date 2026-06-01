package engtelecom.poo;

public enum ValorCarta {
    AS(1, "Ás"),
    DOIS(2, "Dois"),
    TRES(3, "Três"),
    QUATRO(4, "Quatro"),
    CINCO(5, "Cinco"),
    SEIS(6, "Seis"),
    SETE(7, "Sete"),
    OITO(8, "Oito"),
    NOVE(9, "Nove"),
    DEZ(10, "Dez"),
    VALETE(11, "Valete"),
    DAMA(12, "Dama"),
    REI(13, "Rei");

    public final int id;
    public final String nome;

    ValorCarta( int id, String nome) {
        this.nome = nome;
        this.id = id;
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
