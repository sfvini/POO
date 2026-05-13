package engtelecom.poo;

public class Aldeao extends Personagem {
    public Aldeao(String nome) {
        super(25, 1, 0.8, nome);
    }

    @Override
    public String mover(int x, int y) {
        return String.format("O Aldeao " + super.mover(x, y));
    }

    @Override
    public String atacar() {
        return String.format("O Aldeao " + super.atacar());
    }
}
