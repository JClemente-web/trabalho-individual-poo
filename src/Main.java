import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        ContaBancaria minhaConta = new ContaBancaria("12345-6", "Seu Nome Aqui");

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
                    System.out.printf("Saldo atual: R$ %.2f\n", minhaConta.saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = leitor.nextDouble();

                    minhaConta.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = leitor.nextDouble();

                    minhaConta.sacar(saque);
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