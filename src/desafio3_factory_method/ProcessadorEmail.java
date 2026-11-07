package desafio3_factory_method;

/**
 * Padrão aplicado: Factory Method (criador concreto).
 * Problema resolvido: decide criar NotificacaoEmail sem expor isso ao cliente.
 */
public class ProcessadorEmail extends ProcessadorNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
