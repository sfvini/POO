package engtelecom.poo;

public class Arqueiro extends Personagem implements Guerreiro {
    public Arqueiro(String nome) {
        super(35, 2, 1, nome);
    }

    @Override
    public String mover(int x, int y) {
        return String.format("O Arqueiro está se movendo para (" + x + ", " + y + ")");
    }

    @Override
    public String atacar() {
        return String.format("O Arqueiro está atacando com dano: " + super.dano);
    }
}
