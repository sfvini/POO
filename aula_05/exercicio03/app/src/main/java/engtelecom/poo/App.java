package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Batedeira b = new Batedeira();

        b.capacidade = 5.0;

        System.out.println(b.encher(2.0));

        b.setLigada();

        System.out.println(b.bater());
        System.out.println(b.encher(4.0));
        System.out.println(b.esvaziar());
    }
}