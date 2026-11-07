package desafio6_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Padrão aplicado: Observer (sujeito / subject).
 * Problema resolvido: Pedido não conhece mais EmailService nem LogService; mantém
 * uma lista de ouvintes cadastrados dinamicamente e os notifica ao finalizar.
 */
public class Pedido {
    private final int id;
    private final List<PedidoListener> ouvintes = new ArrayList<>();

    public Pedido(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void adicionarOuvinte(PedidoListener ouvinte) {
        ouvintes.add(ouvinte);
    }

    public void removerOuvinte(PedidoListener ouvinte) {
        ouvintes.remove(ouvinte);
    }

    public void finalizar() {
        // Lógica de finalização do pedido...
        System.out.println("Pedido #" + id + " finalizado.");
        notificarOuvintes();
    }

    private void notificarOuvintes() {
        for (PedidoListener ouvinte : ouvintes) {
            ouvinte.aoFinalizar(this);
        }
    }
}
