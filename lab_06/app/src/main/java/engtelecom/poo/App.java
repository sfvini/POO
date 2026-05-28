package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Draw desenho = new Draw();
        desenho.setXscale(0, 1000);
        desenho.setDefaultCloseOperation(3);
        desenho.setYscale(0, 1000);

        desenho.enableDoubleBuffering();
        TimeUnit.SECONDS.sleep(1);
    }
}
