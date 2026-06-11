package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class DadoGUI extends Dado implements Elemento {
    private double x;
    private double y;

    public DadoGUI(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void desenhar(Draw draw) {
        String caminhoImagem = "..." + this.valor + ".png";
        draw.picture(x, y, caminhoImagem);
    }
}