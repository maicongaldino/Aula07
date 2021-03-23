package Programa;

import Classes.Aluno;
import Classes.Professor;

public class Programa {
    public static void main(String[] args) {

        Professor professor = new Professor("Galdino", "10987654321");
        Aluno aluno = new Aluno("Maicon", "12345678910");
        aluno.setEndereco("Rua abc, 123");
        aluno.setTelefone("4002-8922");
        aluno.setMatricula("1111");
        professor.setMateria("Portugues");
        professor.setBaterHora("13:00");


        System.out.println("Pessoa: " + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("\n//////////////////////////\n");
        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Cpf do professor: " + professor.getCpf());
        System.out.println("Matéria do professor: " + professor.getMateria());
        System.out.println("Horario de bater ponto: " + professor.getBaterHora());

        System.out.println();
    }
}