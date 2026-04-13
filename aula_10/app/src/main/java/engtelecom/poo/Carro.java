package engtelecom.poo;

public class Carro {
    private String marca;
    private Motor propulsor;

    public Carro(String m, Motor mo){
        this.marca = m;
        this.propulsor = mo;
    }

    public void acelerar(int v) {
        this.propulsor.acelerar(v);
    }

    public void trocarMotor(Motor mo){
        this.propulsor = mo;
    }
}
