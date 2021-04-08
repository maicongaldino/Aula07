package Classes;

public class Professor extends Funcionario {
    private String aulas;
    private String materia;
    private double hrsTrab;

    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }
    //region
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
    public double getHrsTrab() {
        return hrsTrab;
    }

    public void setHrsTrab(double hrsTrab) {
        this.hrsTrab = hrsTrab;
    }
    public double calculaSalario() {
        return hrsTrab * 4.72;
    }
}