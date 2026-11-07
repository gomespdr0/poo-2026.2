package desafio7_decorator;

/**
 * Padrão aplicado: Decorator (componente concreto).
 * Problema resolvido: o café simples passa a ser apenas a base, sem subclasses
 * para cada combinação de adicionais.
 */
public class Cafe implements Bebida {
    @Override
    public double getCusto() {
        return 5.0;
    }

    @Override
    public String getDescricao() {
        return "Café Simples";
    }
}
