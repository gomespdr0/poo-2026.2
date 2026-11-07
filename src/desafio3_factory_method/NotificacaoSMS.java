package desafio3_factory_method;

/**
 * Padrão aplicado: Factory Method (produto concreto).
 * Problema resolvido: implementação do envio por SMS, desacoplada da regra de negócio.
 */
public class NotificacaoSMS implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}
