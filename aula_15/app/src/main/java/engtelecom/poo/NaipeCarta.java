package engtelecom.poo;

public enum NaipeCarta {
    PAUS(1, "Paus"),
    OUROS(2, "Ouros"),
    COPAS(3, "Copas"),
    ESPADAS(4, "Espadas");

    public final int id;
    public final String nome;

    NaipeCarta( int id, String nome) {
        this.nome = nome;
        this.id = id;
    }

    public static NaipeCarta getById(int id) {
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
