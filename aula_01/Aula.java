package aula_01;

public class Aula {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //Imprime a matriz totalmente
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        //Imprime a diagonal principal
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i] == matriz[j]){
                    System.out.print(matriz[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}