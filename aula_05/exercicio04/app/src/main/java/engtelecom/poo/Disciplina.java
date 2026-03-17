package engtelecom.poo;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String professor;

    public void setDisciplina(String n, int ch, String p) {
        nome = n;
        cargaHoraria = ch;
        professor = p;
    }

    public String getDisciplina() {
        return "Disciplina: " + nome +
                "\nCarga Horaria: " + cargaHoraria +
                "\nProfessor: " + professor;
    }
}
