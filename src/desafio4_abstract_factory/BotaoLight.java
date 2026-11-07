package desafio4_abstract_factory;

/**
 * Padrão aplicado: Abstract Factory (produto concreto).
 * Problema resolvido: botão da família Light, criado apenas pela fábrica Light.
 */
public class BotaoLight implements Botao {
    @Override
    public void desenhar() {
        System.out.println("Desenhando botão tema LIGHT");
    }
}
