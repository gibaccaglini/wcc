package Escola;

public class Funcionario extends Pessoas {
 int salario;
 String cargo;


     int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

     String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
