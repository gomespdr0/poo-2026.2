package desafio7_decorator;

/**
 * Padrão aplicado: Decorator (decorador concreto).
 * Problema resolvido: adiciona leite (custo e descrição) a qualquer bebida, sem subclasse nova.
 */
public class Leite extends AdicionalDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 1.5;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite";
    }
}
