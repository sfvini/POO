package engtelecom.poo;

/**
 * Calculadora que realiza as 4 operações aritiméticas
 * @author Vinícius
 */

public class Calculadora {

    /**
     * Realiza a soma de dois inteiros e retorna o resultado
     * @param a primeiro elemento
     * @param b segundo elemento
     * @return resultado da operação
     */
    public int soma(int a, int b){
        return a + b;
    }

    /**
     * Recebe três lados e indica o tipo do triângulo
     * @param a lado a
     * @param b lado b
     * @param c lado c
     * @return equilátero, isósceles, escaleno e inválido
     */
    public String tipoTiangulo(int a, int b, int c){

        if (a == 0 || b == 0 || c == 0){
            return "inválido";
        }

        if (a < 0 || b < 0 || c < 0){
            return "inválido";
        }

        if (a == b && a == c){
            return "equilátero";
        }

        else if (a + b < c || a + c < b || c + b < a){
            return "inválido";
        }

        else if (a != b && a != c && b != c){
            return "escaleno";
        }

        else {
            return "isósceles";
        }
    }

}
