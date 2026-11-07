package desafio5_adapter;

/**
 * Padrão aplicado: Adapter.
 * Problema resolvido: implementa ProcessadorPagamento (Reais) e traduz a chamada
 * para FastPayLegacy (Dólar), convertendo o valor, sem modificar a biblioteca legada.
 */
public class FastPayAdapter implements ProcessadorPagamento {
    private final FastPayLegacy fastPay;
    private final double cotacaoDolar; // quantos Reais valem 1 Dólar

    public FastPayAdapter(FastPayLegacy fastPay, double cotacaoDolar) {
        if (cotacaoDolar <= 0) {
            throw new IllegalArgumentException("Cotação deve ser positiva");
        }
        this.fastPay = fastPay;
        this.cotacaoDolar = cotacaoDolar;
    }

    @Override
    public void processar(double valorEmReais) {
        double valorEmDolar = valorEmReais / cotacaoDolar;
        fastPay.executeTransaction(valorEmDolar);
    }
}
