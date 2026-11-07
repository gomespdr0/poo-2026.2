package desafio4_abstract_factory;

/**
 * Padrão aplicado: Abstract Factory (fábrica abstrata).
 * Problema resolvido: define a criação de uma família de componentes relacionados
 * (Botao + Menu), garantindo consistência visual.
 */
public interface FabricaUI {
    Botao criarBotao();
    Menu criarMenu();
}
