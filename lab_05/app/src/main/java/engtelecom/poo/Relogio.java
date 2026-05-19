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
    if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
      this.hora = hora;
      this.minuto = minuto;
      this.segundo = segundo;
    } else {
      this.hora = 0;
      this.minuto = 0;
      this.segundo = 0;
    }
    this.cor = cor;
    this.x = x;
    this.y = y;
    if (tamanho < 1 || tamanho > 3) {
      this.tamanho = 2;
    } else {
      this.tamanho = tamanho;
    }

    double f = this.tamanho * 50;

    this.displays.add(new Display(x, y, this.tamanho));
    this.displays.add(new Display(x + (1.5 * f), y, this.tamanho));

    this.displays.add(new Display(x + (3.5 * f), y, this.tamanho));
    this.displays.add(new Display(x + (5.0 * f), y, this.tamanho));

    this.displays.add(new Display(x + (7.0 * f), y, this.tamanho));
    this.displays.add(new Display(x + (8.5 * f), y, this.tamanho));

    ligarDisplay();
  }

  public void ligarDisplay() {
    displays.get(0).setValor(this.hora / 10);
    displays.get(1).setValor(this.hora % 10);

    displays.get(2).setValor(this.minuto / 10);
    displays.get(3).setValor(this.minuto % 10);

    displays.get(4).setValor(this.segundo / 10);
    displays.get(5).setValor(this.segundo % 10);
  }

  public void desenhar(Draw desenho, Color cor){
      displays.forEach(display -> {
        display.desenhar(desenho, cor);
      });
  }

  public void atualizarTempo() {
    this.segundo++;

    if (this.segundo == 60) {
      this.segundo = 0;
      this.minuto++;

      if (this.minuto == 60) {
        this.minuto = 0;
        this.hora++;

        if (this.hora == 24) {
          this.hora = 0;
        }
      }
    }
    ligarDisplay();
  }
}
