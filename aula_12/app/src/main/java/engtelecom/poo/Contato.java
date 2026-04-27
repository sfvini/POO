package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public boolean addTelefone(String rotulo, String valor) {
        return telefones.add(new Telefone(rotulo, valor));
    }

    public boolean addEmail(String rotulo, String valor) {
        return emails.add(new Email(rotulo, valor));
    }

    public boolean removeTelefone(String rotulo) {
        return telefones.removeIf(t -> t.getRotulo().equals(rotulo));
    }

    public boolean removeEmail(String rotulo) {
        return emails.removeIf(e -> e.getRotulo().equals(rotulo));
    }

    public boolean updateTelefone(String rotulo, String valor) {
        for (Telefone t : telefones) {
            if (t.getRotulo().equals(rotulo)) {
                t.setValor(valor);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String valor) {
        for (Email e : emails) {
            if (e.getRotulo().equals(rotulo)) {
                emails.remove(e);
                emails.add(new Email(rotulo, valor));
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append(" ").append(sobrenome).append("\n");
        sb.append("Nascimento: ").append(dataNasc).append("\n");

        sb.append("Telefones:\n");
            for (Telefone t : telefones) {
                sb.append("  ").append(t).append("\n");
            }

        sb.append("Emails:\n");
            for (Email e : emails) {
                sb.append("  ").append(e).append("\n");
            }

        return sb.toString();
    }
}
