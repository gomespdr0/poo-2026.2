package desafio4_abstract_factory;

/**
 * Padrão aplicado: Abstract Factory (fábrica concreta).
 * Problema resolvido: produz somente componentes do tema Light, impedindo misturas.
 */
public class FabricaLight implements FabricaUI {
    @Override
    public Botao criarBotao() {
        return new BotaoLight();
    }

    @Override
    public Menu criarMenu() {
        return new MenuLight();
    }
}
