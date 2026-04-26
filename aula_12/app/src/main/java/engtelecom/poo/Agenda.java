package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c) {
        return contatos.add(c);
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome) {
        ArrayList<Contato> resultado = new ArrayList<>();
        for (Contato c : contatos) {
            if (c.getNome().equals(nome) && c.getSobrenome().equals(sobrenome)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public boolean removeContato(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            contatos.remove(indice);
            return true;
        }
        return false;
    }

    public boolean addTelefone(String rotulo, String valor, int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            return contatos.get(indice).addTelefone(rotulo, valor);
        }
        return false;
    }

    public boolean addEmail(String rotulo, String valor, int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            return contatos.get(indice).addEmail(rotulo, valor);
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String valor, int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            return contatos.get(indice).updateTelefone(rotulo, valor);
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String valor, int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            return contatos.get(indice).updateEmail(rotulo, valor);
        }
        return false;
    }

    public boolean removeTelefone(String rotulo, int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            return contatos.get(indice).removeTelefone(rotulo);
        }
        return false;
    }

    public boolean removeEmail(String rotulo, int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            return contatos.get(indice).removeEmail(rotulo);
        }
        return false;
    }

    @Override
    public String toString() {
        return contatos.toString();
    }
}