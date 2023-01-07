# Padrões comportamentais

## Chain of Responsibility

O Chain of Responsibility é um padrão de projeto comportamental que permite que passe pedidos ao longo de uma corrente
de processadores. Ao receber um pedido, cada processador decide se o processa ou o passa adiante para o próximo
processador da corrente.

### Participantes

- Handler — define uma interface para processar pedidos.
- ConcreteHandler — processa pedidos que podem ser tratados. Caso contrário, passa o pedido para o próximo processador
  da corrente.
- Client — inicializa a corrente e envia pedidos.

## Observer

O Observer é um padrão de projeto comportamental que permite que defina uma dependência de 1-N entre objetos de modo que
quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.

### Participantes

- Subject — sabe os seus observadores. Envia uma notificação para os observadores quando o estado do Subject muda.
- Observer — define uma interface para atualizar que objeto o observa.
- ConcreteObserver — mantém uma referência para um objeto ConcreteSubject. Armazena o estado do ConcreteSubject.
  Implementa a interface Observer para atualizar o estado do ConcreteObserver quando o estado do ConcreteSubject muda.

# Template Method

O Template Method é um padrão de projeto comportamental que define o esqueleto de um algoritmo na superclasse, mas
permite que as subclasses substituam etapas específicas do algoritmo sem alterar a sua estrutura.

### Participantes

— AbstractClass define operações primitivas que devem ser implementadas por suas subclasses e implementa uma operação
template que chama essas operações primitivas.
— ConcreteClass implementa as operações primitivas para executar etapas específicas de um algoritmo.

# Strategy

O Strategy é um padrão de projeto comportamental que permite que defina uma família de algoritmos, coloque cada um numa
classe separada e faça os seus objetos intercambiáveis.

### Participantes

- Context — é configurado com um objeto ConcreteStrategy. Mantém uma referência a um objeto Strategy. Pode definir
  uma interface que permite que o Strategy acesse os seus dados.
- Strategy — declara uma interface comum para todos os algoritmos suportados. Context usa essa interface para chamar o
  algoritmo definido por um ConcreteStrategy.
- ConcreteStrategy — implementa o algoritmo usando a interface Strategy.

## Memento

O Memento é um padrão de projeto comportamental que permite que salve e restaure o estado anterior de um objeto sem
revelar os detalhes da sua implementação.

### Participantes

- Originator — cria um objeto Memento contendo um estado interno.
- Memento — armazena o estado interno do Originator. O Memento não permite que outros objetos acessem o estado interno
  do Originator, a menos que o Originator o faça.
- Caretaker — é responsável por manter o objeto Memento. Não opera ou examina o conteúdo do Memento.

# State

O State é um padrão de projeto comportamental que permite que um objeto altere o seu comportamento quando o seu estado
interno muda. Parece que o objeto mudou de classe.

### Participantes

- Context — define a interface de interesse para os clientes. Mantém uma instância de uma ConcreteState que define o
  estado atual.
- State — declara uma interface para encapsular o comportamento associado a um determinado estado do Context.
- ConcreteState — implementa um comportamento associado a um estado do Context.
