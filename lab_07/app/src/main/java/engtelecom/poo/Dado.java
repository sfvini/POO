package engtelecom.poo;

import java.util.Random;

public class Dado {
    protected int valor;
    protected int[] jogadas;
    protected int faces;

    public Dado() {
        this.faces = 6;
        this.jogadas = new int[faces];
    }

    public int jogar() {
        Random r = new Random();
        this.valor = r.nextInt(faces) + 1;
        this.jogadas[this.valor - 1]++;
        return this.valor;
    }

    public String estatisticas() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < faces; i++) {
            sb.append("Face ").append(i + 1).append(": ").append(jogadas[i]).append(" vezes\n");
        }
        return sb.toString();
    }
}