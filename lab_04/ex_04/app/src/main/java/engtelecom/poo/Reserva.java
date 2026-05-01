package engtelecom.poo;

import java.time.LocalDate;

public class Reserva {
    private Voo voo;
    private Passageiro passageiro;
    private String assento;

    public Reserva(Voo voo, Passageiro passageiro, String assento) {
        if (voo != null) {
            this.voo = voo;
        } else {
            this.voo = new Voo(0, "Voo não definido", LocalDate.now(), 0, 0);
        }

        if (passageiro != null) {
            this.passageiro = passageiro;
        } else {
            this.passageiro = new Passageiro("Anônimo", "n/a", 0);
        }

        this.assento = assento;
    }
}