package engtelecom.poo;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\n" +
                        "CPF: %s\n" +
                        "Email: %s\n",
                nome, cpf, email
        );
    }
}
