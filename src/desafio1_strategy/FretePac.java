package desafio1_strategy;

/**
 * Padrão aplicado: Strategy (estratégia concreta).
 * Problema resolvido: isola a regra de cálculo do PAC em uma classe própria.
 */
public class FretePac implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 0.8 + 5;
    }
}
