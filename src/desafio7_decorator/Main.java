package desafio7_decorator;

/** Demonstração do Decorator: combinações montadas em tempo de execução. */
public class Main {
    public static void main(String[] args) {
        Bebida simples = new Cafe();
        imprimir(simples);

        Bebida comLeite = new Leite(new Cafe());
        imprimir(comLeite);

        Bebida completo = new Chantilly(new Leite(new Cafe()));
        imprimir(completo);

        Bebida duploLeite = new Leite(new Leite(new Cafe()));
        imprimir(duploLeite);
    }

    private static void imprimir(Bebida b) {
        System.out.printf("%s = R$ %.2f%n", b.getDescricao(), b.getCusto());
    }
}
