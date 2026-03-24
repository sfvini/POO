package engtelecom.poo;

public class App {
    public static void main(String[] args) {
        Data d1 = new Data();
        System.out.println(d1);

        Data bissexto = new Data(29, 2, 2024);
        System.out.println(bissexto);
        bissexto.extenso();

        Data invalida = new Data(29, 2, 2023);
        System.out.println(invalida);

        Data d2 = new Data(31, 3, 2024);
        System.out.println(d2);

        boolean trocou = d2.setMes(4);
        System.out.println(trocou);
        System.out.println(d2);

        Data hoje = new Data(24, 3, 2026);
        Data natal = new Data(25, 12, 2026);

        long diasParaNatal = hoje.diferenca(natal);
        System.out.println(diasParaNatal);

        Data descobrimento = new Data(22, 4, 1500);
        System.out.println(descobrimento.diferenca(hoje));
    }
}