package desafio6_observer;

/** Demonstração do Observer: ouvintes cadastrados sem alterar a classe Pedido. */
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(42);
        pedido.adicionarOuvinte(new EmailService());
        pedido.adicionarOuvinte(new LogService());
        // Novo serviço sem tocar em Pedido (lambda):
        pedido.adicionarOuvinte(p -> System.out.println("[ESTOQUE] Baixa de itens do pedido #" + p.getId()));

        pedido.finalizar();
    }
}
