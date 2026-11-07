package desafio1_strategy;

/**
 * Padrão aplicado: Strategy (contexto).
 * Problema resolvido: a calculadora não possui mais condicionais; delega o cálculo
 * à estratégia injetada. Novas transportadoras não exigem alterar esta classe (OCP).
 */
public class CalculadoraFrete {
    private EstrategiaFrete estrategia;

    public CalculadoraFrete(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double peso) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia de frete não definida");
        }
        return estrategia.calcular(peso);
    }
}
