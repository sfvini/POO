package engtelecom.poo;

public class Lampada {

    // Atributos
    private boolean ligada = false;

    // Metodos
    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(){
        ligada = !ligada;
    }
}
