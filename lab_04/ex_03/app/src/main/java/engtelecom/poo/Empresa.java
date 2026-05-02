package engtelecom.poo;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Motorista> motoristas;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Corrida> corridas;
    private int cnpj;

    public Empresa(int cnpj) {
        this.cnpj = cnpj;
        this.motoristas = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.corridas = new ArrayList<>();
    }

    public void addMotorista(Motorista motorista) {
        if (motorista != null) {
            this.motoristas.add(motorista);
        }
    }

    public void addVeiculo(Veiculo veiculo) {
        if (veiculo != null) {
            this.veiculos.add(veiculo);
        }
    }

    public boolean addCorrida(Corrida corrida) {
        if (corrida != null) {
            return this.corridas.add(corrida);
        }
        return false;
    }
}