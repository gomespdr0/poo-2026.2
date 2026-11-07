package desafio5_adapter;

/**
 * Padrão aplicado: Adapter (interface alvo / Target).
 * Problema resolvido: interface que o sistema espera, em Reais.
 */
public interface ProcessadorPagamento {
    void processar(double valorEmReais);
}
