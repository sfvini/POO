public class Argumentos {
    public static void main(String[] args) {
        if (args.length < 2){
            System.err.println("Envie 2 parâmetros");
        }

        for (String str : args) {
            System.out.println(str);
        }

    }
}
