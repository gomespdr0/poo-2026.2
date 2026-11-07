package desafio1_strategy;

/**
 * Padrão aplicado: Strategy (estratégia concreta).
 * Problema resolvido: isola a regra de cálculo do SEDEX em uma classe própria.
 */
public class FreteSedex implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 1.5 + 10;
    }
}
