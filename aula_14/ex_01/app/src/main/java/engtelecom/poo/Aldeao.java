package engtelecom.poo;

public class Aldeao extends Personagem implements Coletador, Guerreiro {
    public Aldeao(String nome) {
        super(25, 1, 0.8, nome);
    }

    @Override
    public String mover(int x, int y) {
        return String.format("O Aldeão está se movendo para (" + x + ", " + y + ")");
    }

    @Override
    public String atacar() {
        return String.format("O Aldeão está atacando com dano: " + super.dano );
    }

    @Override
    public String coletarMadeira() {
        return "Aldeão coletou madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeão coletou ouro";
    }
}
