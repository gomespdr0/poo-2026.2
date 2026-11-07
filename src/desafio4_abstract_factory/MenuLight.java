package desafio4_abstract_factory;

/**
 * Padrão aplicado: Abstract Factory (produto concreto).
 * Problema resolvido: menu da família Light, criado apenas pela fábrica Light.
 */
public class MenuLight implements Menu {
    @Override
    public void desenhar() {
        System.out.println("Desenhando menu tema LIGHT");
    }
}
