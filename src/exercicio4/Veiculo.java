package exercicio4;

import java.time.Year;

public abstract class Veiculo implements Fretavel, Tributavel {

    protected String placa;
    protected String marca;
    protected double valorLocacaoDiaria;
    protected int anoFabricacao;
    protected double precoFipe;

    public Veiculo(String placa, String marca, double valorLocacaoDiaria,
                   int anoFabricacao, double precoFipe) {

        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("Placa inválida");
        }

        if (valorLocacaoDiaria <= 0 || precoFipe <= 0) {
            throw new IllegalArgumentException("Valores inválidos");
        }

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
    }

    protected boolean isIsentoIpva() {
        int anoAtual = Year.now().getValue();
        return (anoAtual - anoFabricacao) > 20;
    }
}