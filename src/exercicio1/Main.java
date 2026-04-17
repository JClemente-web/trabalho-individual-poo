package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        int opcao;
        int saquesHoje = 0;

        do {
            System.out.println("\n1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Saldo: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Valor para depositar: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    break;

                case 3:
                    if (saquesHoje >= 3) {
                        System.out.println("Limite de saques atingido!");
                        break;
                    }

                    System.out.print("Valor para saque: ");
                    double saque = sc.nextDouble();

                    if (saque > 1000) {
                        System.out.println("Limite por saque é R$ 1000");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= saque;
                        saquesHoje++;
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        sc.close();
    }
}