package desafio4_abstract_factory;

/** Demonstração do Abstract Factory: o tema é escolhido uma única vez, na configuração. */
public class Main {
    static FabricaUI fabricaPara(String tema) {
        return tema.equalsIgnoreCase("DARK") ? new FabricaDark() : new FabricaLight();
    }

    public static void main(String[] args) {
        System.out.println("== Tema DARK ==");
        new Aplicacao(fabricaPara("DARK")).renderizarTela();

        System.out.println("== Tema LIGHT ==");
        new Aplicacao(fabricaPara("LIGHT")).renderizarTela();
    }
}
