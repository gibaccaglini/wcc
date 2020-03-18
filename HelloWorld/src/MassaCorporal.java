import java.util.Scanner;

public class MassaCorporal {
    private double imc;
void calcula(double peso, double altura) {
        this.imc = peso / (altura * altura);
    }


    void resposta() {
        if (this.imc < 18.5) {
            System.out.println(" Adulto com baixo peso ");
        }

        if (this.imc >= 18.5 && this.imc < 25) {
            System.out.println(" Adulto com peso adequado ");
        }
        if (this.imc >= 25 && this.imc < 30) {
            System.out.println(" Adulto com sobrepeso");
        }
        if (this.imc >= 30) {
            System.out.println(" Adulto com obesidade");
        }
    }
}













