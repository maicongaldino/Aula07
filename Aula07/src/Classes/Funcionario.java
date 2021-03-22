package Classes;

public class Funcionario extends Pessoa {
    private String baterHora;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getBaterHora() {
        return baterHora;
    }

    public void setBaterHora(String baterHora) {
        this.baterHora = baterHora;
    }
}