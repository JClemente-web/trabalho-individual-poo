package exercicio2;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;
    private int saquesHoje;

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 50.0; // bônus
        this.saquesHoje = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (saquesHoje >= 3) {
            System.out.println("Limite de saques atingido!");
            return;
        }

        if (valor > 1000) {
            System.out.println("Limite por saque é R$ 1000");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            saquesHoje++;
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}