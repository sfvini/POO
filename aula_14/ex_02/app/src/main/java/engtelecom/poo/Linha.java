package engtelecom.poo;

public class Linha extends FormasGeo {
    private Ponto pf;

    @Override
    public String desenhar() {
        return "Desenhando uma linha do ponto inicial ao ponto final.";
    }
}