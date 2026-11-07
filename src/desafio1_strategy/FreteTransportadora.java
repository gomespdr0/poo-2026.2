package desafio1_strategy;

/**
 * Padrão aplicado: Strategy (estratégia concreta).
 * Problema resolvido: isola a regra de cálculo da transportadora em uma classe própria.
 */
public class FreteTransportadora implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 2.0;
    }
}
