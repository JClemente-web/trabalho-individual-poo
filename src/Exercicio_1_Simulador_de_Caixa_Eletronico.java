import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 0.0;
        int saquesDiarios = 0;
        int opcao;

        do {
            System.out.println("\n--- Caixa Eletrônico ---");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = leitor.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;

                case 3:
                    if (saquesDiarios >= 3) {
                        System.out.println("Limite de saques diários atingido.");
                    } else {
                        System.out.print("Digite o valor do saque: R$ ");
                        double saque = leitor.nextDouble();

                        if (saque > 1000.0) {
                            System.out.println("O valor máximo por saque é de R$ 1.000,00.");
                        } else if (saque > saldo) {
                            System.out.println("Saldo insuficiente para realizar este saque.");
                        } else if (saque > 0) {
                            saldo -= saque;
                            saquesDiarios++;
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Valor inválido para saque.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        leitor.close();
    }
}