package engtelecom.poo;

public class Contador {
    private int valorAtual = 0;

    public void setValorAtual(int va){
        valorAtual = va;
    }

    public void incrementar(){
        valorAtual++;
    }

    public int getValorAtual(){
        return  valorAtual;
    }
}