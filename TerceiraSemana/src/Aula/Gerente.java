package Aula;

public class Gerente extends Funcionario{
    private int senha = 1234;

    public boolean autentica(int senha) {
        if (this.senha == senha){
            System.out.println("Acesso Permitido");
            return true;

        } else {
            System.out.println("Acesso Negado");
            return false;
        }
    }
}
// return this.senha == senha; - outra forma mais simples de fazer.