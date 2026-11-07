package desafio3_factory_method;

/**
 * Padrão aplicado: Factory Method (produto).
 * Problema resolvido: abstração comum para os canais de notificação.
 */
public interface Notificacao {
    void enviar(String mensagem);
}
