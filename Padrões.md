# Padrões estruturais

## Adapter

### Objetivo

Converter a interface de uma classe para outra interface que o cliente espera. O Adapter permite que classes com
interfaces incompatíveis trabalhem em conjunto - o que de outra forma seria impossível.

### Participantes

1) Target: define a interface que o cliente usa.
2) Adapter: adapta a interface Service para a interface Target.
3) Service: define uma interface que o Adapter usa.
4) Client: usa a interface Target para trabalhar com o Adapter.

## Bridge

### Objetivo

Desacoplar uma abstração da sua implementação, de forma que as duas possam variar independentemente.

### Participantes

1) Abstraction: define a interface da abstração e mantém uma referência para um objeto do tipo Implementation.
2) RefinedAbstraction: estende a interface da abstração.
3) Implementation: define a interface da implementação e define a implementação da interface.
4) ConcreteImplementation: implementa a interface da implementação.
5) Client: usa a interface da abstração.

## Composite

### Objetivo

Compor objetos em estruturas de árvore para representar hierarquias de parte-todo. O Composite permite que os clientes
tratem objetos individuais e composições de objetos de forma uniforme.

### Participantes

1) Component: define a interface para objetos da composição e para objetos individuais.
2) Leaf: define objetos da composição que não têm filhos.
3) Composite: armazena componentes-filho e implementa operações relacionadas com filhos.
4) Client: manipula objetos da composição através da interface Component.

## Decorator

### Objetivo

Anexar responsabilidades adicionais a um objeto dinamicamente. Os Decorators fornecem uma alternativa flexível à herança
para estender a funcionalidade.

### Participantes

1) Component: define a interface para objetos que podem ter responsabilidades adicionais anexadas.
2) ConcreteComponent: define um objeto ao qual responsabilidades adicionais podem ser anexadas.
3) BaseDecorator: mantém uma referência para um objeto Component e define uma interface que corresponde à interface de
   Component.
4) ConcreteDecorator: adiciona responsabilidades ao componente.
5) Client: gere os objetos Component.

## Facade

### Objetivo

Prover uma interface unificada para um conjunto de interfaces em um subsistema. O Facade define uma interface de nível
mais alto que torna o subsistema mais fácil de ser usado.

### Participantes

1) Facade: fornece uma interface unificada para um subsistema. Conhece quais classes do subsistema são responsáveis por
   uma solicitação e delega a solicitação para os objetos apropriados.
2) Subsystem Classes: implementam funcionalidades do subsistema. Não conhecem a existência do Facade e não têm nenhuma
   referência para ele.
3) Client: interage com o Facade.

## Flyweight

### Objetivo

O Flyweight reduz o custo de armazenamento ao compartilhar objetos que são semelhantes em vez de armazenar objetos
individuais.

### Participantes

1) Flyweight: declara uma interface que é comum a todos os objetos de suporte.
2) ConcreteFlyweight: implementa a interface Flyweight e adiciona estado que é único para um objeto concreto.
3) FlyweightFactory: cria e gere objetos Flyweight. Garante que objetos Flyweight sejam compartilhados corretamente.
4) Context: armazena o estado extrínseco de um objeto Flyweight.
