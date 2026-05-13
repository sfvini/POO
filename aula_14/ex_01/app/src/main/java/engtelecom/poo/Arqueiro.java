package engtelecom.poo;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(35, 2, 1, nome);
    }

    @Override
    public String mover(int x, int y) {
        return String.format("O Arqueiro " + super.mover(x, y));
    }

    @Override
    public String atacar() {
        return String.format("O Arqueiro " + super.atacar());
    }
}
