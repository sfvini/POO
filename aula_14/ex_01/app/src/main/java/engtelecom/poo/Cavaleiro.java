package engtelecom.poo;

public class Cavaleiro extends Personagem implements Guerreiro {
    public Cavaleiro(String nome) {
        super(50, 3, 2, nome);
    }

    @Override
    public String mover(int x, int y) {
        return String.format("O Cavaleiro está se movendo para (" + x + ", " + y + ")");
    }

    @Override
    public String atacar() {
        return String.format("O Cavaleiro está atacando com dano: " + super.dano );
    }

}