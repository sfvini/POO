package engtelecom.poo;


import java.util.Random;

public class Personagem {
    private int hp;
    private int dano;

    public void setPersonagem(int h, int d) {
        hp = h;
        dano = d;
    }

    public String lutar(int hpRival) {
        Random sorte = new Random();

        while (hp > 0 && hpRival > 0){
            int rodada = sorte.nextInt(2);

            if (rodada == 1){
                hpRival -= sorte.nextInt(dano) + 1;
            }
            else {
                hp -= sorte.nextInt(5) + 1;
            }
        }

        if (hp <= 0){
            return "Você perdeu!";
        }

        return String.format("Você ganhou!\nHP: %d", hp);
    }

    public String curar(int vida){
        hp += vida;
        return String.format("HP: %d", hp);
    }
}


