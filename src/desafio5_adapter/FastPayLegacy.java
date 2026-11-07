package desafio5_adapter;

/**
 * Padrão aplicado: Adapter (classe adaptada / Adaptee).
 * Problema resolvido: representa a biblioteca legada de terceiros, que opera em
 * Dólar com assinatura diferente e NÃO pode ser alterada.
 */
public class FastPayLegacy {
    public void executeTransaction(double dollarsAmount) {
        System.out.println("Pago via FastPay: $" + dollarsAmount);
    }
}
