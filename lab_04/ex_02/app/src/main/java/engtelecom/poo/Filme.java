package engtelecom.poo;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int ano;
    private String genero;
    private String diretor;
    private ArrayList<Avaliacao> avaliacoes;
    private ArrayList<Ator> atores;

    public Filme(String titulo, int ano, String genero, String diretor) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.avaliacoes = new ArrayList<>();
        this.atores = new ArrayList<>();
    }

    public boolean addAvaliacao(Avaliacao avaliacao){
        return this.avaliacoes.add(avaliacao);
    }

    public boolean addAtor(Ator ator){
        return this.atores.add(ator);
    }
}
