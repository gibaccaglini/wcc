package Escola;

import java.util.Date;

public class Main {
    public static <curso> void main(String[] args) {

        Alunos aluno1 = new Alunos();
        aluno1.setRa(123456);
        aluno1.setNome(" Gisele ");
        aluno1.setGenero("Feminino");
        aluno1.setNascimento( " 22/08/1985");

        Alunos aluno2 = new Alunos();
        aluno2.setRa(654321);
        aluno2.setNome(" Maria ");
        aluno2.setGenero("Feminino");
        aluno2.setNascimento( " 11/06/1990");

        Alunos[] alunos = new Alunos[2];
        alunos[0] = aluno1;
        alunos[1] = aluno2;

        Curso curso = new Curso();
        curso.setNivel(" Basic ");
        curso.setPeriodo(" 2 Semestre ");
        curso.setAlunos(alunos);
        System.out.println( curso.getNivel());
        curso.listaAlunos();


        Funcionario funcionario = new Funcionario();

        funcionario.setCargo("Secretaria");
        funcionario.setSalario(2000);
        funcionario.setNome("Roberta");
        funcionario.setGenero("Feminino");
        funcionario.setDocumento("29.078.458-06");
        funcionario.setNascimento ("24/ 2 /1982");
        System.out.println(" →  Nome do Funcionário : " + funcionario.getNome());
        System.out.println(" Gênero : " + funcionario.getGenero());
        System.out.println(" Data de Nascimento :" + funcionario.getNascimento());
        System.out.println(" Documento : " + funcionario.getDocumento());
        System.out.println(" Cargo : " + funcionario.getCargo());
        System.out.println(" Salário : " + funcionario.getSalario());



        Professor professor = new Professor();
        professor.setNome( "Joao");
        professor.setSalario( 3000 );
        professor.setDocumento(" 288.977.905-73");
        professor.setGenero("Masculino");
        professor.setNascimento(" 11/11/1960");


        curso.setProfessor(professor);

        System.out.println(" → Professor: " + professor.getNome());
        System.out.println(" Gênero : " + professor.getGenero());
        System.out.println(" Data de Nascimento :" + professor.getNascimento());
        System.out.println(" Documento : " + professor.getDocumento());
        System.out.println(" Salario: " + professor.getSalario());


        //System.out.println(" RA: " + alunos[i].getRa());


    }
}

