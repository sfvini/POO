package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Voo {
    private int numero;
    private String destino;
    private LocalDate data;
    private int hora;
    private int capacidade;
    private ArrayList<Reserva> reservas;

    public Voo(int numero, String destino, LocalDate data, int hora, int capacidade) {
        this.numero = numero;
        this.destino = destino;
        this.data = data;
        this.hora = hora;
        this.capacidade = capacidade;
        this.reservas = new ArrayList<>();
    }

    public boolean addReserva(Reserva reserva) {
        if (reserva != null && this.reservas.size() < this.capacidade) {
            return this.reservas.add(reserva);
        }
        return false;
    }

    public String getDestino() {
        return destino;
    }
}