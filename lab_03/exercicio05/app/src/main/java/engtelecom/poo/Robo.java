package engtelecom.poo;

import java.util.Random;

public class Robo {
    private String nome;
    private final int ns;
    private double posX;
    private double posY;
    private int i = 1;

    Random rr = new Random();

    public Robo(String nome) {
        this.nome = nome;
        this.ns = rr.nextInt(0, i);
        i++;
    }

    public int getQuantidadeRobos(){
        return i;
    }

    public String getPosicao(){
        return String.format("X: %.2f Y: %.2f", posX, posY);
    }

    public String andar(double destX, double destY){
        double distancia =  Math.sqrt(Math.pow(destX - this.posX, 2) + Math.pow(destY - this.posY, 2));
        return String.format("Distância percorrida: %.2f", distancia);
    }
}


