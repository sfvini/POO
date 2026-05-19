package engtelecom.poo;

public class Retangulo extends FComArea {
    private Ponto pf;

    @Override
    public double calcArea() {
        return Math.abs(this.pf.x - this.inicial.x) * Math.abs(this.pf.y - this.inicial.y);
    }

    @Override
    public double calcPerimetro() {
        return 2 * (Math.abs(this.pf.x - this.inicial.x) + Math.abs(this.pf.y - this.inicial.y));
    }

    @Override
    public String desenhar() {
        return "Desenhando um retângulo.";
    }
}