package desafio7_decorator;

/**
 * Padrão aplicado: Decorator (decorador base).
 * Problema resolvido: guarda a bebida decorada por composição e delega a ela,
 * deixando para as subclasses somar apenas o seu comportamento extra.
 */
public abstract class AdicionalDecorator implements Bebida {
    protected final Bebida bebida;

    protected AdicionalDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}
