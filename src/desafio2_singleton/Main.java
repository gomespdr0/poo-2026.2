package desafio2_singleton;

/** Demonstração do Singleton: a mensagem de leitura do disco aparece apenas uma vez. */
public class Main {
    public static void main(String[] args) {
        ConfiguracaoApp c1 = ConfiguracaoApp.getInstance();
        ConfiguracaoApp c2 = ConfiguracaoApp.getInstance();

        System.out.println("URL: " + c1.getUrlBanco());
        System.out.println("Mesma instância? " + (c1 == c2));
    }
}
