package exercicio4;

public class Caminhao extends Veiculo {

    private double capacidadeCargaToneladas;

    public Caminhao(String placa, String marca, double valorLocacaoDiaria,
                    int anoFabricacao, double precoFipe,
                    double capacidadeCargaToneladas) {

        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);

        if (capacidadeCargaToneladas <= 0) {
            throw new IllegalArgumentException("Capacidade inválida");
        }

        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Dias inválidos");
        }

        double total = valorLocacaoDiaria * dias;

        if (pesoCarga > capacidadeCargaToneladas) {
            total *= 1.10; // +10%
        }

        return total;
    }

    @Override
    public double calcularIpva() {
        if (isIsentoIpva()) return 0.0;
        return precoFipe * 0.015;
    }
}