package engtelecom.poo;

import java.util.ArrayList;

public class Livro {
     private String titulo;
     private ArrayList<Pessoa> autor;
     private ArrayList<Capitulo> capitulos;

     public Livro(String titulo, Pessoa autor){
         this.titulo = titulo;
         this.autor = new ArrayList<>();
         this.capitulos = new ArrayList<>();
     }

     public void adicionaCapitulo(String t){
         Capitulo c = new Capitulo(t);
         capitulos.add(c);
     }
}
