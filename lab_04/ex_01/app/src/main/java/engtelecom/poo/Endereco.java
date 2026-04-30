package engtelecom.poo;

public class Endereco {
    private String cep;
    private String rua;
    private int numero;
    private String complemento;

    public Endereco(String cep, String rua, int numero, String complemento) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }
}
