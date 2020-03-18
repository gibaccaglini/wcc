public class Conta {

    public String titular;

    int numero;

    double saldo;

    void saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    double deposito (double valorDeposito) {
        double novoSaldo = this.saldo + valorDeposito;
        this.saldo = novoSaldo;
        return novoSaldo;
    }

}
