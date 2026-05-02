package engtelecom.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Avaliação de Filmes ---");

        Ator ator1 = new Ator("Keanu Reeves", LocalDate.of(1964, 9, 2));
        Ator ator2 = new Ator("Carrie-Anne Moss", LocalDate.of(1967, 8, 21));

        Filme filme1 = new Filme("Matrix", 1999, "Ficção Científica", "Lana Wachowski");

        filme1.addAtor(ator1);
        filme1.addAtor(ator2);

        Usuario user = new Usuario("Carlos Silva", "carlos@email.com", "123456");

        Avaliacao notaMatrix = new Avaliacao(5, "Um dos melhores filmes de ficção já feitos!", user, filme1);
        filme1.addAvaliacao(notaMatrix);
        user.addAvaliacao(notaMatrix);

        System.out.println("Filme: Matrix registrado com " + (filme1.addAtor(ator1) ? "atores" : "erro"));
        System.out.println("Avaliação do usuário " + user.getNome() + " concluída.");
    }
}