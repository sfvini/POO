package engtelecom.poo;

import java.util.ArrayList;

public class Aviao {
    private int numMaxTrip;
    private int numMaxPass;
    private double pesoMax;
    private double combusMax;
    private int quantidadeMotores;
    private ArrayList<Motor> motores;

    public Aviao(int numMaxTrip, int numMaxPass, double pesoMax,
                 double combusMax, String tipoMotor, int quantidadeMotores){
        this.numMaxTrip = numMaxTrip;
        this.numMaxPass = numMaxPass;
        this.pesoMax = pesoMax;
        this.combusMax = combusMax;

        if (Math.abs(quantidadeMotores) > 8){
            this.quantidadeMotores = 4;
        }
        else {
            this.quantidadeMotores = quantidadeMotores;
        }

        if (!tipoMotor.equalsIgnoreCase("helice") && !tipoMotor.equalsIgnoreCase("turbina") ){
            tipoMotor = "helice";
        }

        this.motores = new ArrayList<>();

        for (int i = 0; i < this.quantidadeMotores; i++) {
            motores.add(new Motor(tipoMotor));
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Capacidade máxima: " + (numMaxTrip + numMaxPass)  + "\n" +
                "Peso máximo: " + pesoMax + "\n" +
                "Combustível máximo: " + combusMax + "\n" +
                "Motores: " + quantidadeMotores + "\n" + motores + "\n" );
    }

    public void isLigada(int i, boolean all){
       if (i <= quantidadeMotores) {
           if (all) {
               motores.forEach(Motor::isLigada);
           } else {
               motores.get(i).isLigada();
           }
       }
    }
}
