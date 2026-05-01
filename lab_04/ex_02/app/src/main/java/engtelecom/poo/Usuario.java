package engtelecom.poo;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Avaliacao> avaliacoes;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.avaliacoes = new ArrayList<>();
    }

    public boolean addAvaliacao(Avaliacao avaliacao){
        return this.avaliacoes.add(avaliacao);
    }
}
