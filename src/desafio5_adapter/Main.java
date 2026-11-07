package desafio5_adapter;

/** Demonstração do Adapter: o sistema usa só a interface ProcessadorPagamento. */
public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento pagamento = new FastPayAdapter(new FastPayLegacy(), 5.0);
        pagamento.processar(100.0); // R$ 100 -> US$ 20 (cotação 5.0)
    }
}
