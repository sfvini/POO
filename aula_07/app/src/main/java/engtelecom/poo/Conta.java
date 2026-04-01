package engtelecom.poo;

public class Conta {
    private final int numConta;
    private final String titular;
    private double saldo;

    public Conta(int numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = Math.abs(saldo);
    }

    public void sacar(double v) {
        if (Math.abs(v) <= saldo) this.saldo -=  v;
    }

    public void depositar(double v) {
        this.saldo += Math.abs(v);
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
