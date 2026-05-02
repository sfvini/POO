package engtelecom.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Empresa transportadora = new Empresa(123456789);

        Motorista m1 = new Motorista("Ayrton Senna");
        Veiculo v1 = new Veiculo("Mercedes-Benz Actros", "ABC-1234", 2024);

        Motorista m2 = new Motorista("Lewis Hamilton");
        Veiculo v2 = new Veiculo("Volvo FH 540", "XYZ-9876", 2023);

        transportadora.addMotorista(m1);
        transportadora.addMotorista(m2);
        transportadora.addVeiculo(v1);
        transportadora.addVeiculo(v2);

        Corrida viagem01 = new Corrida(LocalDate.now(), 450.75, m1, v1);

        if (transportadora.addCorrida(viagem01)) {
            System.out.println("✅ Corrida registrada com sucesso!");

            System.out.println("Motorista: " + m1.getNome());
            System.out.println("Veículo: " + v1.getModelo() + " (Placa: " + v1.getPlaca() + ")");
            System.out.println("Distância: " + viagem01.getDistancia() + " km");
        } else {
            System.out.println("❌ Falha ao registrar corrida.");
        }
    }
}