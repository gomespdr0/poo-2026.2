package desafio6_observer;

/**
 * Padrão aplicado: Observer (observador).
 * Problema resolvido: contrato único para quem deseja ser notificado quando um
 * pedido é finalizado.
 */
public interface PedidoListener {
    void aoFinalizar(Pedido pedido);
}
