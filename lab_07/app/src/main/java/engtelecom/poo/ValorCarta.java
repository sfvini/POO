package engtelecom.poo;

public enum ValorCarta {
    AS(1, "A", "Ás"),
    DOIS(2, "2", "Dois"),
    TRES(3, "3", "Três"),
    QUATRO(4, "4", "Quatro"),
    CINCO(5, "5", "Cinco"),
    SEIS(6, "6", "Seis"),
    SETE(7, "7", "Sete"),
    OITO(8, "8", "Oito"),
    NOVE(9, "9", "Nove"),
    DEZ(10, "10", "Dez"),
    VALETE(11, "J", "Valete"),
    DAMA(12, "Q", "Dama"),
    REI(13, "K", "Rei");

    private final int id;
    private final String inicial;
    private final String nome;

    ValorCarta(int id, String inicial, String nome) {
        this.id = id;
        this.inicial = inicial;
        this.nome = nome;
    }

    public String getInicial() {
        return inicial;
    }

    @Override
    public String toString() {
        return nome;
    }
}