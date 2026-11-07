package desafio1_strategy;

/** Demonstração do Strategy: troca de algoritmo de frete em tempo de execução. */
public class Main {
    public static void main(String[] args) {
        double peso = 10;
        CalculadoraFrete calc = new CalculadoraFrete(new FreteSedex());
        System.out.println("SEDEX: R$ " + calc.calcular(peso));

        calc.setEstrategia(new FretePac());
        System.out.println("PAC: R$ " + calc.calcular(peso));

        calc.setEstrategia(new FreteTransportadora());
        System.out.println("TRANSPORTADORA: R$ " + calc.calcular(peso));

        // Nova transportadora sem alterar CalculadoraFrete (lambda, pois é interface funcional)
        calc.setEstrategia(p -> p * 3.0 + 1);
        System.out.println("NOVA (lambda): R$ " + calc.calcular(peso));
    }
}
