package engtelecom.poo;

public class Carta {
    private NaipeCarta naipe;
    private ValorCarta valor;

    public Carta(NaipeCarta naipe, ValorCarta valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}