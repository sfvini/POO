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

    public boolean addMotorista(Motorista motorista) {
        if (motorista != null) {
            return this.motoristas.add(motorista);
        }
        return false;
    }

    public boolean addVeiculo(Veiculo veiculo) {
        if (veiculo != null) {
            return this.veiculos.add(veiculo);
        }
        return false;
    }

    public boolean addCorrida(Corrida corrida) {
        if (corrida != null) {
            return this.corridas.add(corrida);
        }
        return false;
    }
}