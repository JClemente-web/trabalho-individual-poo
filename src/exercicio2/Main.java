package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("123", "João");

        int opcao;

        do {
            System.out.println("\n1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    conta.exibirSaldo();
                    break;

                case 2:
                    System.out.print("Valor: ");
                    conta.depositar(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Valor: ");
                    conta.sacar(sc.nextDouble());
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