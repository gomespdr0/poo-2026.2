package desafio3_factory_method;

/** Demonstração do Factory Method. */
public class Main {
    public static void main(String[] args) {
        ProcessadorNotificacao email = new ProcessadorEmail();
        ProcessadorNotificacao sms = new ProcessadorSMS();

        email.enviar("Seu pedido foi aprovado!");
        sms.enviar("Seu pedido saiu para entrega!");
    }
}
