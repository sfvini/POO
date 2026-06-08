package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.util.Random;

public class CartaGrafica extends Carta {

    private String link;
    private boolean face;
    private double x;
    private double y;

    public CartaGrafica(ValorCarta valor, NaipeCarta naipe, boolean face, double x, double y) {
        super(valor, naipe);
        this.link = "cartas/" + valor.inicial + naipe.incial + ".png";
        this.x = x;
        this.y = y;
        this.face = face;
    }

    public void desenhar(Draw draw){

        Random r = new Random();
        Random b = new Random();

        if (r.nextBoolean()){
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
}
