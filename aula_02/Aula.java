package aula_02;

public class Aula {

    public static void main(String[] args) {

        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++){
            notas[i] = Double.parseDouble(IO.readln("Entre com a " + (i+1) + "a. nota: "));
        }

         double soma = 0;

        for (double nota : notas){
            soma += nota;
        }

        int media = Math.round((float)(soma/ notas.length));

        IO.println("Sua média final é: " +media);

    }
}
