package engtelecom.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean fechada = true;

    public void setCor(String c) {
        cor = c;
    }

    public String getCor() {
        return cor;
    }

    public void setNivelTinta(double nt) {
        nivelTinta = nt;
    }

    public void setFechada() {
        fechada = !fechada;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public String desenhar(int origemX, int origemY, int destinoX, int destinoY) {
        if (fechada){
            return "Caneta fechada";
        }

        double vetorRes = Math.sqrt(Math.pow(destinoX - origemX, 2) +
                Math.pow(destinoY - origemY, 2));

        double consumo = vetorRes * 0.01;

        if (nivelTinta < consumo){
            return "Tinta insuficiente";
        }

        nivelTinta -= consumo;

        return String.format("Distância: %.2f cm.\nConsumo: %.2f de tinta", vetorRes, consumo);
    }
}
