# Refatoração e Padrões de Projeto em Java

Atividade prática: cada desafio refatora um code smell aplicando um Design Pattern.

| Pacote | Padrão | Problema resolvido |
|---|---|---|
| `desafio1_strategy` | Strategy | Condicionais no cálculo de frete |
| `desafio2_singleton` | Singleton | Múltiplas instâncias de configuração pesada |
| `desafio3_factory_method` | Factory Method | Instanciação direta de notificações |
| `desafio4_abstract_factory` | Abstract Factory | Mistura de componentes Dark/Light |
| `desafio5_adapter` | Adapter | Biblioteca legada em Dólar incompatível |
| `desafio6_observer` | Observer | Pedido acoplado a serviços |
| `desafio7_decorator` | Decorator | Explosão de subclasses de café |

Cada pacote possui uma classe `Main` de demonstração.

## Como executar

```bash
mkdir out
javac -encoding UTF-8 -d out $(find src -name '*.java')
java -cp out desafio1_strategy.Main   # troque pelo pacote desejado
```
Requer JDK 8+ (os exemplos usam lambdas).
