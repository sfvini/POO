package engtelecom.poo;

public class Carta {
    private ValorCarta valor;
    private NaipeCarta naipe;

    public Carta(ValorCarta valor, NaipeCarta naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return String.format("\n VALOR: " + this.valor + " NAIPE: " + this.naipe);
    }
}
