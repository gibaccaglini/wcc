package Escola;

public class Gerente  extends Funcionario {
    private String nome;
    private String cpf;
    Double salario;
    public String getNome(){
        return nome;
    }


    public void setNome(String nomeFuncionario) {
        nome = nomeFuncionario;
        System.out.println(nome);
    }


    public String setCpf(String cpf) {
        System.out.println(cpf);
        return cpf;

    }
    public int setSenha (int senha){
        System.out.println(senha);
        return senha;

    }
    public Double setSalario (Double salario){
        System.out.println(salario);
        return salario;
    }
}
