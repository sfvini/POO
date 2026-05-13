package engtelecom.poo;

public class Personagem {
    private int hp;
    private int dano;
    private double vel;
    private String nome;

    public String mover(int x, int y){
        return String.format(this.nome + " está indo para: (" + x + "," + y + ")");
    }

    public String atacar(){
        return String.format(this.nome + " está atacando com dano: " + this.dano);
    }

    public Personagem(int hp, int dano, double vel, String nome) {
        this.hp = hp;
        this.dano = dano;
        this.vel = vel;
        this.nome = nome;
    }
}
