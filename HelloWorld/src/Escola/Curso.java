package Escola;


public class Curso {
    String curso;
    String nivel;
    String periodo;

    /**
     * Somente um professo por curso
     */
    Professor professor;

    /**
     * Um array/lista de alunos.
     * [] -> isso indiac que é pode ser mais de um.
     * */
    Alunos[] alunos;

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Professor getProfessor(String s) {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public void listaAlunos() {
        int tamanho = alunos.length;
        // dá o tamanho da lista de alunos

        for (int i = 0 ; i < tamanho; i++) {
            System.out.println(" → Nome do Aluno: " + alunos[i].getNome());
            System.out.println(" RA: " + alunos[i].getRa());






            

        }
    }


    }






