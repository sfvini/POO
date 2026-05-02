package engtelecom.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Reserva de Passagens Aéreas ---");

        Voo vooGaleao = new Voo(1502, "Rio de Janeiro (GIG)", LocalDate.of(2026, 7, 15), 14, 180);

        Passageiro passageiro = new Passageiro("Ana Souza", "ana.souza@email.com", 99887766);

        Reserva reservaAna = new Reserva(vooGaleao, passageiro, "12A");
        boolean sucessoVoo = vooGaleao.addReserva(reservaAna);
        boolean sucessoPassageiro = passageiro.addReserva(reservaAna);
        if (sucessoVoo && sucessoPassageiro) {
            System.out.println("✅ Reserva confirmada para " + passageiro.getNome() + "!");
            System.out.println("Destino: " + vooGaleao.getDestino() + " | Assento: " + reservaAna.getAssento());
        } else {
            System.out.println("❌ Erro ao processar a reserva.");
        }
    }
}