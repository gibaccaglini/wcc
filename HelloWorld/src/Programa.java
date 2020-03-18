public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.titular = "Gisele";
        minhaConta.saldo = 1000.0;

        System.out.println(" Saldo atual :" + minhaConta.saldo);
        System.out.println(" Titular :" + minhaConta.titular);



    }
}

