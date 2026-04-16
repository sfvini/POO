package engtelecom.poo;

public class Motor {
    private boolean ligado;
    private double consumo;
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
        this.consumo = tipo.equalsIgnoreCase("helice") ? 50 : 8000;
        this.ligado = false;
    }

    @Override
    public String toString() {
        return String.format(
                "Tipo: " + tipo + "\n" + "Ligado: " + ligado + "\n" + "Consumo: " + consumo + "\n"
        );
    }

    public void isLigada() {
        this.ligado = !ligado;
    }
}
