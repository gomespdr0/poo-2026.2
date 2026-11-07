package desafio4_abstract_factory;

/**
 * Padrão aplicado: Abstract Factory (produto concreto).
 * Problema resolvido: menu da família Dark, criado apenas pela fábrica Dark.
 */
public class MenuDark implements Menu {
    @Override
    public void desenhar() {
        System.out.println("Desenhando menu tema DARK");
    }
}
