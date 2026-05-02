package engtelecom.poo;

import java.time.LocalDate;

public class Corrida {
    private LocalDate data;
    private double distancia;
    private Motorista motorista;
    private Veiculo veiculo;

    public Corrida(LocalDate data, double distancia, Motorista motorista, Veiculo veiculo) {
        this.data = data;
        this.distancia = distancia;

        if (motorista != null) {
            this.motorista = motorista;
        } else {
            this.motorista = new Motorista("Motorista não informado");
        }

        if (veiculo != null) {
            this.veiculo = veiculo;
        } else {
            this.veiculo = new Veiculo("Indefinido", "000-0000", 0);
        }
    }

    public double getDistancia() {
        return distancia;
    }
}