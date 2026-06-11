package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.util.Random;

public class CartaGUI extends Carta implements Elemento {

    private String link;
    private boolean face;
    private double x;
    private double y;
    public static final double LARGURA = 72;
    public static final double ALTURA = 96;

    public CartaGUI(NaipeCarta naipe, ValorCarta valor, boolean face, double x, double y) {
        super(naipe, valor);
        this.link = "cartas/" + valor.getInicial() + naipe.getInicial() + ".png";
        this.x = x;
        this.y = y;
        this.face = face;
    }

    @Override
    public void desenhar(Draw draw) {
        Random b = new Random();

        if (face) {
            draw.picture(x, y, link);
        } else {
            if (b.nextBoolean()) {
                draw.picture(x, y, "cartas/fundoa.png");
            } else {
                draw.picture(x, y, "cartas/fundov.png");
            }
        }
    }

    public boolean clicouDentro(double x, double y) {
        if (x > this.x - LARGURA / 2 && x < this.x + LARGURA / 2) {
            return y > this.y - ALTURA / 2 && y < this.y + ALTURA / 2;
        }
        return false;
    }

    public void virarCarta() {
        this.face = !face;
    }
}