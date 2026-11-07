package desafio6_observer;

/**
 * Padrão aplicado: Observer (observador concreto).
 * Problema resolvido: reage à finalização do pedido registrando log, sem acoplar Pedido.
 */
public class LogService implements PedidoListener {
    @Override
    public void aoFinalizar(Pedido pedido) {
        System.out.println("[LOG] Pedido #" + pedido.getId() + " registrado como finalizado");
    }
}
