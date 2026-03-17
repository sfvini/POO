package engtelecom.poo;

public class App {

    public static void main(String[] args) {

        Disciplina d = new Disciplina();
        d.setDisciplina("Programacao Orientada a Objetos", 80, "Mello");
        System.out.println(d.getDisciplina());
    }

}