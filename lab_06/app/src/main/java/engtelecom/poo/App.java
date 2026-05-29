package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //menu
        System.out.println("MENU\n0 - Relógio normal\n1 - Cronômetro Progressivo\n2 - Cronômetro Regressivo");
        System.out.print("Opção: ");
        int modo = scanner.nextInt();

        //tempo para cronometro regressivo
        int h = 0, m = 0, s = 0;

        if (modo == 2) {
            System.out.print("Digite as horas: ");   h = scanner.nextInt();
            System.out.print("Digite os minutos: "); m = scanner.nextInt();
            System.out.print("Digite os segundos: "); s = scanner.nextInt();
        }
        scanner.close();

        //quadro
        Draw desenho = new Draw();
        desenho.setCanvasSize(800, 800);
        desenho.setXscale(0, 1200);
        desenho.setYscale(0, 1200);
        desenho.setDefaultCloseOperation(3);
        desenho.enableDoubleBuffering();

        //array de relogios
        ArrayList<Relogio> relogios = new ArrayList<>();
        relogios.add(new RelogioAnalogico(300, 900));
        relogios.add(new RelogioDisplay(150, 450, RelogioDisplay.TAM_MEDIO, modo, h, m, s));
        relogios.add(new RelogioTextual(750, 150, 42, modo, h, m, s));

        while (true) {
            desenho.clear(Draw.DARK_GRAY);
            for (Relogio r : relogios) {
                //percorre o array de relogios e mostra eles
                r.atualizarTempo();
                r.desenhar(desenho);
            }
            desenho.show();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}