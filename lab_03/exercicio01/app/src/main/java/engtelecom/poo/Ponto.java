package engtelecom.poo;

public class Ponto {

    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }

    public double distancia(Ponto ponto){
        return Math.sqrt(Math.pow(ponto.x - getX(), 2) + Math.pow(ponto.y - getY(), 2));
    }
}
