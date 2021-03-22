package Classes;

public class Professor extends Funcionario {
    private String aulas;
    private String materia;

    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getAulas() {
        return aulas;
    }

    public void setAulas(String aulas) {
        this.aulas = aulas;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    } 

}