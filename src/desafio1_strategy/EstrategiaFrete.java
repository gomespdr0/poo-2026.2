package desafio1_strategy;

/**
 * Padrão aplicado: Strategy.
 * Problema resolvido: contrato comum para os algoritmos de frete, permitindo
 * trocá-los sem condicionais (if/else) na classe principal.
 */
public interface EstrategiaFrete {
    double calcular(double peso);
}
