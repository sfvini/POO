package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CartaGrafica extends Carta {

    private String link;
    private boolean face;
    private double x;
    private double y;
    public static final double LARGURA = 72;
    public static final double ALTURA = 96;

    public CartaGrafica(ValorCarta valor, NaipeCarta naipe, boolean face, double x, double y) {
        super(valor, naipe);
        this.link = "cartas/" + valor.inicial + naipe.incial + ".png";
        this.x = x;
        this.y = y;
        this.face = face;
    }

    public void desenhar(Draw draw){

        Random b = new Random();

        if (face){
            draw.picture(x, y, link);
        }
        else {
            if (b.nextInt(3) == 1) {
                draw.picture(x,y,"cartas/fundoa.png");
            }
            else {
                draw.picture(x,y,"cartas/fundov.png");
            }
        }
        draw.show();
    }

    public boolean clicouDentro(double x, double y){
        if (x > this.x - LARGURA/2 && x < this.x + LARGURA){
            return y > this.x - ALTURA / 2 && x < this.y + ALTURA;
        }
        return false;
    }

    public void virarCarta(){
        this.face = !face;
    }
}
