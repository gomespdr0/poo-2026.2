package desafio7_decorator;

/**
 * Padrão aplicado: Decorator (decorador concreto).
 * Problema resolvido: adiciona chantilly (custo e descrição) a qualquer bebida, sem subclasse nova.
 */
public class Chantilly extends AdicionalDecorator {
    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.0;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly";
    }
}
