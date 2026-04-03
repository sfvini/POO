package engtelecom.poo;

public class Conta {
    private final int numConta;
    private final String titular;
    private double saldo;

    private static int contador = 1;

    public Conta(String titular, double saldo) {
        this.numConta = contador;
        this.titular = titular;
        this.saldo = Math.abs(saldo);
        contador++;
    }

    public void depositar(double valor){
        this.saldo += Math.abs(valor);
    }

    public boolean sacar(double valor) {
        if (saldo >= valor){
            saldo -= Math.abs(valor);
            return true;
        }
        return false;
    }

    public int getNumConta() {
        return numConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numConta=" + numConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
