package exercicio4;

public class Main {
    public static void main(String[] args) {

        try {
            Caminhao caminhao = new Caminhao(
                    "ABC1234", "Volvo", 500,
                    2010, 200000, 10
            );

            CarroPasseio carro = new CarroPasseio(
                    "XYZ5678", "Toyota", 200,
                    2022, 80000
            );

            double aluguelCaminhao = caminhao.alugarVeiculo(12, 3);
            double aluguelCarro = carro.alugarVeiculo(0, 5);

            System.out.println("Aluguel Caminhão: R$ " + aluguelCaminhao);
            System.out.println("IPVA Caminhão: R$ " + caminhao.calcularIpva());

            System.out.println("Aluguel Carro: R$ " + aluguelCarro);
            System.out.println("IPVA Carro: R$ " + carro.calcularIpva());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}