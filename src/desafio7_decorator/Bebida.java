package desafio7_decorator;

/**
 * Padrão aplicado: Decorator (componente).
 * Problema resolvido: interface comum para o café base e para todos os adicionais,
 * permitindo empilhá-los dinamicamente.
 */
public interface Bebida {
    double getCusto();
    String getDescricao();
}
