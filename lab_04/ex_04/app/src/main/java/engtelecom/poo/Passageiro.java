package engtelecom.poo;

import java.util.ArrayList;

public class Passageiro {
    private String nome;
    private String email;
    private int telefone;
    private ArrayList<Reserva> reservas;

    public Passageiro(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.reservas = new ArrayList<>();
    }

    public boolean addReserva(Reserva reserva) {
        if (reserva != null) {
            return this.reservas.add(reserva);
        }
        return false;
    }

    public String getNome() {
        return nome;
    }
}