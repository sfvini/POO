package engtelecom.poo;

public enum Planetas {
    MERCURIO(1, "Mercúrio"),
    VENUS(2, "Vênus"),
    TERRA(3, "Terra"),
    MARTE(4, "Marte"),
    JUPITER(5, "Júpiter"),
    SATURNO(6, "Saturno"),
    URANO(7, "Urano"),
    NETUNO(8, "Netuno");

    public final String nome;
    public final int posicao;

    Planetas(int posicao, String nome) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public static Planetas getByPosicao(int p) {
        for (Planetas ss : Planetas.values()) {
            if (ss.posicao == p) {
                return ss;
            }
        }
        throw new IllegalArgumentException("Código Inválido");
    }

    @Override
    public String toString() {
        return String.format("%s", this.nome);
    }
}
