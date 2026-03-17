package engtelecom.poo;

public class Batedeira {
    double capacidade;
    double conteudo;
    boolean ligada;

    public void setLigada() {
        ligada = !ligada;
    }

    public String encher(double quantidade) {
        if (quantidade > capacidade || conteudo + quantidade > capacidade) {
            return "Capacidade excedida";
        }

        conteudo += quantidade;
        return "Batedeira preenchida. Conteúdo atual: " + conteudo;
    }

    public String esvaziar() {
        conteudo = 0;
        return "Batedeira esvaziada";
    }

    public String bater() {
        if (!ligada) {
            return "A batedeira está desligada";
        }

        if (conteudo == 0) {
            return "Não há conteúdo para bater";
        }

        return "Misturando " + conteudo + " litros";
    }
}