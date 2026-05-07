package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.ArrayList;

public class Display {
    private ArrayList<Segmento> segmentos;
    private int numero;

    public Display(double x, double y, double tamanho){
        this.segmentos = new ArrayList<>();
        this.numero = 0;

        // fazer lógica para criar os 7 segmentos

        setValor(0);
    }

    public void setValor(int numero){
        if (numero >= 0 && numero <= 9) {
            this.numero = numero;
            // fazer lógica para ligar cada segmento conforme número (loop)
        }
    }

    public void desenhar(Draw desenho, Color cor){
        segmentos.forEach(segmento -> {
            segmento.desenhar(desenho, cor);
        });
    }

}
