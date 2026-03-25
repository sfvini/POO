package engtelecom.poo;

import java.util.Random;

public class Robo {
    private String nome;
    private final int ns;
    private double posX;
    private double posY;
    private static int i = 0;

    public Robo(String nome) {
        this.nome = nome;
        this.posX = 0;
        this.posY = 0;
        this.ns = i + 1;
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
        this.posX = destX;
        this.posY = destY;
        return String.format("Distância percorrida: %.2f", distancia);
    }

    @Override
    public String toString() {
        return String.format("NS: %d\nNOME: %s\nPOSIÇÃO: (%.2f; %.2f)\n", ns, nome, posX, posY);
    }
}


