package desafio3_factory_method;

/**
 * Padrão aplicado: Factory Method (produto concreto).
 * Problema resolvido: implementação do envio por e-mail, desacoplada da regra de negócio.
 */
public class NotificacaoEmail implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] " + mensagem);
    }
}
