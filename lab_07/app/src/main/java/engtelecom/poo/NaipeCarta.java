package engtelecom.poo;

public enum NaipeCarta {
    PAUS(1, "Paus", 'p'),
    OUROS(2, "Ouros", 'o'),
    COPAS(3, "Copas", 'c'),
    ESPADAS(4, "Espadas", 'e');

    public final int id;
    public final char incial;
    public final String nome;

    NaipeCarta( int id, String nome, char inicial) {
        this.nome = nome;
        this.id = id;
        this.incial = inicial;
    }

    public static NaipeCarta getByInicial(int id) {
        for (NaipeCarta n : NaipeCarta.values()) {
            if (n.id == id) {
                return n;
            }
        }
        throw new IllegalArgumentException("ID Inválido");
    }

    @Override
    public String toString() {
        return String.format("%s", this.nome);
    }
}
