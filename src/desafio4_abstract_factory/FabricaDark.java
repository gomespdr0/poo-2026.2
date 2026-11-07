package desafio4_abstract_factory;

/**
 * Padrão aplicado: Abstract Factory (fábrica concreta).
 * Problema resolvido: produz somente componentes do tema Dark, impedindo misturas.
 */
public class FabricaDark implements FabricaUI {
    @Override
    public Botao criarBotao() {
        return new BotaoDark();
    }

    @Override
    public Menu criarMenu() {
        return new MenuDark();
    }
}
