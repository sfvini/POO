package engtelecom.poo;

public enum NaipeCarta {
    COPAS(1, "Copas", 'c'),
    ESPADAS(2, "Espadas", 'e'),
    OUROS(3, "Ouros", 'o'),
    PAUS(4, "Paus", 'p');

    private final int id;
    private final char inicial;
    private final String nome;

    NaipeCarta(int id, String nome, char inicial) {
        this.id = id;
        this.nome = nome;
        this.inicial = inicial;
    }

    public char getInicial() {
        return inicial;
    }

    @Override
    public String toString() {
        return nome;
    }
}