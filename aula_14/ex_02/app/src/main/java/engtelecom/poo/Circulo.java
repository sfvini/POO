package engtelecom.poo;

public class Circulo extends FComArea {
    private double raio;

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String desenhar() {
        return "Desenhando um círculo com raio " + raio;
    }
}