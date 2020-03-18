import java.util.Scanner;
public class TesteCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro  novoCarro = new Carro ();

        novoCarro.pegaMarcha();

        System.out.println(" Qual a sua velocidade ? ");
        double velocidade = sc.nextInt();
        novoCarro.velocidadeAtual = velocidade;
                System.out.println(" Use a marcha: " + novoCarro.pegaMarcha());



    }
}

