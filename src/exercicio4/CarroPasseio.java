package exercicio4;

public class CarroPasseio extends Veiculo {

    public CarroPasseio(String placa, String marca, double valorLocacaoDiaria,
                        int anoFabricacao, double precoFipe) {

        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Dias inválidos");
        }

        return valorLocacaoDiaria * dias;
    }

    @Override
    public double calcularIpva() {
        if (isIsentoIpva()) return 0.0;
        return precoFipe * 0.04;
    }
}