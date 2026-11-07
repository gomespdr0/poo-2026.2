package desafio3_factory_method;

/**
 * Padrão aplicado: Factory Method (criador concreto).
 * Problema resolvido: decide criar NotificacaoSMS sem expor isso ao cliente.
 */
public class ProcessadorSMS extends ProcessadorNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}
