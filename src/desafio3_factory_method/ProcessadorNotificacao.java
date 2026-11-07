package desafio3_factory_method;

/**
 * Padrão aplicado: Factory Method (criador).
 * Problema resolvido: a regra de negócio depende apenas da interface Notificacao;
 * a criação do objeto concreto fica encapsulada no método de fabricação
 * criarNotificacao(), implementado pelas subclasses.
 */
public abstract class ProcessadorNotificacao {

    // Factory Method
    protected abstract Notificacao criarNotificacao();

    public void enviar(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}
