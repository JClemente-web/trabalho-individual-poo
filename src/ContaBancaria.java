public class ContaBancaria {

    String numero;
    String titular;
    double saldo;
    int saquesDiarios;

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 50.0;
        this.saquesDiarios = 0;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    public void sacar(double valor) {
        if (saquesDiarios >= 3) {
            System.out.println("Limite de saques diários atingido.");
        } else if (valor > 1000.0) {
            System.out.println("O valor máximo por saque é de R$ 1.000,00.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar este saque.");
        } else if (valor > 0) {
            saldo -= valor;
            saquesDiarios++;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }
}

