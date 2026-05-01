package engtelecom.poo;

public class Avaliacao {
    private int nota;
    private String comentario;
    private Usuario usuario;
    private Filme filme;

    public Avaliacao(int nota, String comentario, Usuario usuario, Filme filme) {
        this.nota = nota;
        this.comentario = comentario;
        this.usuario = usuario;
        this.filme = filme;
    }
}
