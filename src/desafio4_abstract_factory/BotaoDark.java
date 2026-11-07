package desafio4_abstract_factory;

/**
 * Padrão aplicado: Abstract Factory (produto concreto).
 * Problema resolvido: botão da família Dark, criado apenas pela fábrica Dark.
 */
public class BotaoDark implements Botao {
    @Override
    public void desenhar() {
        System.out.println("Desenhando botão tema DARK");
    }
}
