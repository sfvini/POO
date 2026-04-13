package engtelecom.poo;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor(int hp, int giroAtual, int cilindros){
        this.hp = hp;
        this.giroAtual = giroAtual;
        this.cilindros = cilindros;
    }

    public void acelerar(int v){
        this.giroAtual += v*3;

    }
}
