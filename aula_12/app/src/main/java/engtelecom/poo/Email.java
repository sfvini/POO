package engtelecom.poo;

public class Email {
    private String rotulo;
    private String valor;

    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;
    }

    public String getRotulo() {
        return rotulo;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return rotulo + ": " + valor;
    }
}