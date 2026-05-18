package engtelecom.poo;

public abstract class Personagem {
    protected int hp;
    protected int dano;
    protected double vel;
    protected String nome;

    public abstract String mover(int x, int y);

    public abstract String atacar();

    public Personagem(int hp, int dano, double vel, String nome) {
        this.hp = hp;
        this.dano = dano;
        this.vel = vel;
        this.nome = nome;
    }
}
