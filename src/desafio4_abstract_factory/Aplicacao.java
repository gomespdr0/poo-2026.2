package desafio4_abstract_factory;

/**
 * Padrão aplicado: Abstract Factory (cliente).
 * Problema resolvido: a aplicação recebe uma fábrica e usa só as interfaces,
 * sem condicionais de tema e sem conhecer classes concretas.
 */
public class Aplicacao {
    private final Botao botao;
    private final Menu menu;

    public Aplicacao(FabricaUI fabrica) {
        this.botao = fabrica.criarBotao();
        this.menu = fabrica.criarMenu();
    }

    public void renderizarTela() {
        botao.desenhar();
        menu.desenhar();
    }
}
