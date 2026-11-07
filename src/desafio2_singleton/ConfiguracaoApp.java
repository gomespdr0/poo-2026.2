package desafio2_singleton;

/**
 * Padrão aplicado: Singleton (Initialization-on-demand holder).
 * Problema resolvido: garante uma única instância, com carregamento pesado feito
 * uma só vez, de forma lazy e thread-safe, sem sincronização explícita.
 * O construtor privado impede "new ConfiguracaoApp()" fora da classe.
 */
public class ConfiguracaoApp {
    private final String urlBanco;

    private ConfiguracaoApp() {
        // Carregamento pesado simulado
        System.out.println("Lendo arquivo de configurações do disco...");
        this.urlBanco = "jdbc:mysql://localhost:3306/meubanco";
    }

    private static class Holder {
        private static final ConfiguracaoApp INSTANCIA = new ConfiguracaoApp();
    }

    public static ConfiguracaoApp getInstance() {
        return Holder.INSTANCIA;
    }

    public String getUrlBanco() {
        return urlBanco;
    }
}
