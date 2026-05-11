package engtelecom.poo;

import java.util.ArrayList;
import edu.princeton.cs.algs4.Draw;
import java.awt.*;

public class Relogio {
  private ArrayList<Display> displays;
  private int hora;
  private int minuto;
  private int segundo;
  private Color cor;
  private double x;
  private double y;
  private double tamanho;

  public Relogio(int hora, int minuto, int segundo, Color cor, double x, double y, double tamanho) {
    this.displays = new ArrayList<>();
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
    this.cor = cor;
    this.x = x;
    this.y = y;
    this.tamanho = tamanho;
  }

  public void ligarDisplay(){

  }

  public void desenhar(Draw desenho, Color cor){
      displays.forEach(display -> {
        display.desenhar(desenho, cor);
      });
  }

  public void atualizarTempo(){

  }
}
