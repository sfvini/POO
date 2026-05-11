package engtelecom.poo.produtos;

public class TelSemFio extends Telefone {
    private double frequencia;
    private int canais;
    private double distancia;

    public TelSemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "TelSemFio{" +
                "frequencia=" + frequencia +
                ", canais=" + canais +
                ", distancia=" + distancia +
                '}';
    }


}
