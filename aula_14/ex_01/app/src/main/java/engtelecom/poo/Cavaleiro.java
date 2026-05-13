package engtelecom.poo;

public class Cavaleiro extends Personagem {
    public Cavaleiro(String nome) {
        super(50, 3, 2, nome);
    }

    @Override
    public String mover(int x, int y) {
        return String.format("O Cavaleiro " + super.mover(x, y));
    }

    @Override
    public String atacar() {
        return String.format("O Cavaleiro " + super.atacar());
    }
}
