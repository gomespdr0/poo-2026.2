package desafio6_observer;

/**
 * Padrão aplicado: Observer (observador concreto).
 * Problema resolvido: reage à finalização do pedido enviando e-mail, sem acoplar Pedido.
 */
public class EmailService implements PedidoListener {
    @Override
    public void aoFinalizar(Pedido pedido) {
        System.out.println("[EMAIL] Confirmação enviada para o pedido #" + pedido.getId());
    }
}
