# Tabela de conteúdos

- [Padrões de Criação](#padrões-de-criação)
    - [Abstract Factory](#abstract-factory)
    - [Builder](#builder)
    - [Factory Method](#factory-method)
    - [Prototype](#prototype)
    - [Singleton](#singleton)
- [Padrões de Estrutura](#padrões-de-estrutura)
    - [Adapter](#adapter)
    - [Bridge](#bridge)
    - [Composite](#composite)
    - [Decorator](#decorator)
    - [Facade](#facade)
    - [Flyweight](#flyweight)
    - [Proxy](#proxy)
- [Padrões de Comportamento](#padrões-de-comportamento)
    - [Chain of Responsibility](#chain-of-responsibility)
    - [Command](#command)
    - [Interpreter](#interpreter)
    - [Iterator](#iterator)
    - [Mediator](#mediator)
    - [Memento](#memento)
    - [Observer](#observer)
    - [State](#state)
    - [Strategy](#strategy)
    - [Template Method](#template-method)
    - [Visitor](#visitor)

# Padrões de Criação

Os padrões criacionais são padrões que abstraem a criação de objetos, de forma que o cliente não precise se preocupar
com a criação de objetos, mas sim com o uso destes. Os padrões criacionais são:

## Abstract Factory

### Objetivo

Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar as suas classes
concretas.

### Aplicabilidade

Use o Abstract Factory quando:

* Uma aplicação deve ser independente de como os seus objetos são criados, compostos e representados.
* Uma aplicação deve ser configurada com uma de múltiplas famílias de produtos.
* Uma família de objetos relacionados ou dependentes deve ser criada em conjunto e deve garantir que essa família seja
  criada.

### Participantes

* **AbstractFactory**: declara uma interface para operações que criam objetos de produtos abstratos.
* **ConcreteFactory**: implementa as operações para criar objetos de produtos concretos.
* **AbstractProduct**: declara uma interface para uma categoria de objeto de produto.
* **Product**: Define um objeto de produto a ser criado pela fábrica correspondente, implementando a interface
  AbstractProduct.
* **Client**: Usa apenas interfaces declaradas pela AbstractFactory e AbstractProduct.

### Colaborações

* O cliente usa apenas as interfaces declaradas pela AbstractFactory e AbstractProduct. O cliente não sabe (ou não deve
  saber) as classes concretas de fábricas e produtos que ele usa.
* Uma fábrica concreta cria um conjunto de produtos concretos correspondentes. Um cliente deve usar apenas os produtos
  da fábrica concreta correspondente.

### Consequências

* O padrão Abstract Factory ajuda a isolar as classes de clientes de classes concretas de produtos.
* O padrão Abstract Factory ajuda a garantir que os produtos criados sejam compatíveis.
* O padrão Abstract Factory ajuda a evitar a repetição de código de criação de produtos.

### Padrões relacionados

* Pode ser usado com o Factory Method ou Prototype para evitar a repetição de código de criação de produtos.
* Pode ser usado com o Singleton para garantir que uma fábrica concreta tenha apenas uma instância.

## Builder

### Objetivo

Separar a construção de um objeto complexo da sua representação, de forma que o mesmo processo de construção possa criar
diferentes representações.

### Aplicabilidade

Use o Builder quando:

* O algoritmo de construção de um objeto complexo deve ser independente das partes que compõem o objeto e como elas são
  montadas.
* A construção de um objeto complexo deve ser processada em várias etapas.
* O ‘design’ deve permitir diferentes representações para o objeto a ser construído.

### Participantes

* **Builder**: declara uma interface para criar partes do objeto Product e uma interface para retornar o objeto.
* **ConcreteBuilder**: implementa a interface Builder e constrói e monta as partes do objeto Product.
* **Director**: constrói um objeto usando a interface Builder.
* **Product**: representa o objeto complexo que está sendo construído.
* **Client**: usa a interface Director para construir um objeto usando a interface Builder.

### Colaborações

* O cliente usa a interface Director para construir um objeto usando a interface Builder.
* O Director usa a interface Builder para construir as partes do objeto Product.
* O ConcreteBuilder implementa a interface Builder e constrói e monta as partes do objeto Product.
* O ConcreteBuilder retorna o objeto Product.

### Consequências

* O padrão Builder ajuda a isolar o código de construção de um objeto complexo da sua representação.
* O padrão Builder ajuda a evitar a repetição de código de construção de objetos complexos.
* O padrão Builder ajuda a controlar o processo de construção de objetos complexos.

### Padrões relacionados

* É semelhante ao Abstract Factory, mas foca em construir objetos complexos passo a passo. O Abstract Factory retorna
  uma família de objetos prontos, enquanto o Builder retorna um objeto complexo pronto.
* Por vezes constrói um Composite

## Factory Method

### Objetivo

Definir uma interface para criar um objeto, mas deixar as subclasses decidirem qual classe instanciar. O Factory Method
permite que uma classe adie a instanciação para subclasses.

### Aplicabilidade

Use o Factory Method quando:

* Uma classe não pode antecipar a classe dos objetos que deve criar.
* Uma classe quer suas subclasses para especificar os objetos que ela cria.
* Classes delegam responsabilidades para uma das suas subclasses, e querem que localize a responsabilidade num
  local centralizado.

### Participantes

* **Creator**: declara o método Factory Method, que retorna um objeto de um tipo Product. Creator pode também definir
  uma
  implementação padrão do Factory Method que retorna um objeto ConcreteProduct padrão.
* **ConcreteCreator**: sobrescreve o método Factory Method para retornar uma instância de um ConcreteProduct.
* **Product**: declara a interface dos objetos que o Factory Method cria.
* **ConcreteProduct**: define um objeto criado pelo método Factory Method.
* **Client**: usa somente interfaces declaradas por Creator e Product.

### Colaborações

* O cliente usa somente interfaces declaradas por Creator e Product.
* Uma ConcreteCreator sobrescreve o método Factory Method para retornar uma instância de um ConcreteProduct.
* O método Factory Method retorna um objeto de um tipo Product. Creator pode também definir uma implementação padrão do
  Factory Method que retorna um objeto ConcreteProduct padrão.
* O método Factory Method pode ser chamado diretamente pelo cliente, ou indiretamente por um método de um
  ConcreteCreator.

### Consequências

* O padrão Factory Method ajuda a garantir que os produtos criados sejam compatíveis.
* O padrão Factory Method ajuda a evitar a repetição de código de criação de produtos.
* O padrão Factory Method ajuda a controlar a extensão. Pode estender o sistema apenas estendendo as classes
  Creator e ConcreteCreator.

### Padrões relacionados

* Comum serem chamados dentro de um Template Method.
* Prototypes não requerem subclasses de Creators

## Prototype

### Objetivo

Especificar os tipos de objetos a serem criados usando uma instância protótipo e criar objetos copiando este protótipo.

### Aplicabilidade

Use o Prototype quando:

* Uma instância de uma classe não pode ser criada em tempo de execução.
* Uma instância de uma classe deve ser criada em tempo de execução, mas não sabe qual classe concreta deve ser
  instanciada.
* Uma instância de uma classe deve ser criada em tempo de execução, e quer economizar o custo de criar a instância
  e inicializá-la.
* Uma instância de uma classe deve ser criada em tempo de execução, e quer evitar a repetição de inicialização
  que pode ocorrer se várias instâncias forem criadas.

### Participantes

* **Prototype**: declara uma interface para clonar a si mesmo.
* **ConcretePrototype**: implementa a operação de clonagem para criar um objeto.
* **Client**: cria um objeto solicitando a uma instância protótipo que clone a si mesmo.

### Colaborações

* O cliente cria um objeto solicitando a uma instância protótipo que clone a si mesmo.
* Uma instância protótipo implementa a operação de clonagem para criar um objeto.
* O cliente usa somente a interface declarada por Prototype.
* O cliente não sabe qual classe concreta de Prototype é clonada.
* O cliente não sabe se a operação de clonagem cria uma instância ou retorna uma instância existente.

### Consequências

* O padrão Prototype ajuda a evitar a repetição de inicialização que pode ocorrer se várias instâncias forem criadas.
* O padrão Prototype ajuda a controlar a extensão. Pode estender o sistema apenas estendendo as classes
  Prototype e ConcretePrototype.
* O padrão Prototype ajuda a economizar o custo de criar e inicializar objetos.
* O padrão Prototype ajuda a evitar a repetição de código de criação de produtos.

### Padrões relacionados

* Designs que usam o Composite e o Decorator podem usar o Prototype para copiar objetos compostos e decorados.

## Singleton

### Objetivo

Garantir que uma classe tenha somente uma instância e fornecer um ponto global de acesso a ela.

### Aplicabilidade

Use o Singleton quando:

* Uma classe precisa ter somente uma instância.
* A instância única deve ser acessível pelos clientes a partir de um ponto de acesso global.

### Participantes

* **Singleton**: declara uma instância de si mesmo e fornece um método de acesso global a ela.
* **Client**: usa a instância única de Singleton.

### Colaborações

* O cliente usa a instância única de Singleton.
* Uma instância única de Singleton é criada quando a classe é carregada.

### Consequências

* O padrão Singleton ajuda a controlar o acesso a recursos compartilhados, como impressoras, arquivos, sockets de rede,
  etc.

### Padrões relacionados

* Vários padrões podem ser implementados como Singletons, como Abstract Factory, Builder, Prototype, etc.

# Padrões de Estrutura

Os padrões estruturais descrevem como montar objetos e classes em estruturas maiores, enquanto mantém essas estruturas
flexíveis e eficientes. Os padrões estruturais usam herança para combinar interfaces e definições de implementação.

## Adapter

### Objetivo

Converter a interface de uma classe para outra interface que o cliente espera. O Adapter permite que classes com
interfaces incompatíveis trabalhem em conjunto — o que de outra forma seria impossível.

### Aplicabilidade

Use o Adapter quando:

* Quiser usar uma classe existente, mas sua interface não corresponder às suas necessidades.
* Quiser criar uma classe reutilizável que coopere com classes não relacionadas ou que não possam ser previamente
  adaptadas.

### Participantes

* **Target**: define a interface específica que o cliente usa.
* **Adapter**: adapta a interface Adaptee para a interface Target.
* **Adaptee**: define uma interface existente que precisa ser adaptada.
* **Client**: usa objetos somente através da interface Target.

### Colaborações

* O cliente usa somente a interface Target.
* O cliente não sabe que o Adapter é usado.
* O Adapter envolve o Adaptee e implementa a interface Target.
* O Adapter traduz pedidos do cliente para pedidos que o Adaptee pode entender.

### Consequências

* O padrão Adapter permite ao cliente trabalhar com objetos de classes incompatíveis.
* O padrão Adapter permite que crie uma classe reutilizável que coopere com classes não relacionadas ou que
  não possam ser previamente adaptadas.

### Padrões relacionados

* Bridge tem uma estrutura semelhante ao Adapter, mas tem um propósito diferente. O Bridge é usado para separar
  uma abstração da sua implementação, de modo que as duas possam variar independentemente. O Adapter é usado para
  converter a interface de uma classe para outra interface que o cliente espera. O Adapter permite que classes
  com interfaces incompatíveis trabalhem em conjunto — o que de outra forma seria impossível.
* Decorator acrescenta a um objeto sem alterar a sua interface, sendo mais transparente para a aplicação.
* Proxy fornece uma interface idêntica à do objeto controlado, enquanto o Adapter altera a interface
  de um objeto.

## Bridge

### Objetivo

Desacoplar uma abstração da sua implementação, de forma que as duas possam variar independentemente.

### Aplicabilidade

Use o Bridge quando:

* Quiser evitar um vínculo permanente entre uma abstração e a sua implementação. Isso pode ser útil quando a
  implementação deve ser escolhida ou mudada em tempo de execução.
* Quiser extender a implementação de uma abstração sem alterar a abstração.
* Quiser controlar as subclasses de uma abstração e querer que elas sejam implementadas de forma independente.

### Participantes

* **Abstraction**: define a interface da abstração.
* **RefinedAbstraction**: estende a interface da abstração.
* **Implementor**: define a interface da implementação.
* **ConcreteImplementor**: implementa a interface da implementação.
* **Client**: usa a interface da abstração.

### Colaborações

* O cliente usa somente a interface da abstração.
* O cliente não sabe que o Implementor é usado.
* A Abstraction envolve o Implementor e delega a ele todas as operações que a Abstraction define.
* A Abstraction pode definir operações adicionais que usam os serviços do Implementor.
* A Abstraction pode estender a interface do Implementor sem alterar o Implementor.

### Consequências

* O padrão Bridge permite que varie a implementação e a abstração independentemente.
* O padrão Bridge permite que adicione novas implementações e abstrações independentemente.
* O padrão Bridge permite que esconda detalhes de implementação de um cliente.
* O padrão Bridge pode resultar em muitas classes pequenas e específicas.

### Padrões relacionados

* O Abstract Factory pode criar e configurar um Bridge em tempo de execução.
* O Adapter é usado em classes não relacionadas, após o sistema ser desenhado. O Bridge faz parte do design inicial do
  sistema sendo usado para separar uma abstração da sua implementação, de modo que as duas possam variar
  independentemente.

## Composite

### Objetivo

Compor objetos em estruturas de árvore para representar hierarquias de parte-todo. O Composite permite que os clientes
tratem objetos individuais e composições de objetos de forma uniforme.

### Aplicabilidade

Use o Composite quando:

* Quiser representar hierarquias de parte-todo.
* Quiser que os clientes ignorem a diferença entre composições de objetos e objetos individuais. Os clientes
  tratarão todos os objetos de forma uniforme.

### Participantes

* **Component**: define a interface para objetos na composição e para objetos individuais.
* **Leaf**: representa objetos individuais na composição. Um objeto Leaf não tem filhos.
* **Composite**: define comportamentos para componentes que têm filhos. Armazena componentes-filho e implementa
  operações relacionadas aos filhos.
* **Client**: manipula os objetos na composição através da interface Component.

### Colaborações

* O cliente usa somente a interface Component.
* O cliente não sabe se está a manipular um objeto Leaf ou um objeto Composite.
* O Composite envolve os objetos Leaf e os objetos Composite e implementa a interface Component.
* O Composite delega operações para os objetos Leaf e para os objetos Composite.
* O Composite define operações relacionadas aos filhos e implementa-as recursivamente.

### Consequências

* O padrão Composite permite que trate objetos individuais e composições de objetos de forma uniforme.
* O padrão Composite simplifica a implementação de clientes.
* O padrão Composite facilita adicionar novos tipos de componentes.

### Padrões relacionados

* Iterator para percorrer uma composição.
* Visitor para executar operações sobre uma composição.
* Decorator para adicionar responsabilidades a objetos individuais e
  composições de objetos.
* Flyweight para compartilhar objetos Leaf, mas não objetos Composite.
* Chain of Responsibility para processar pedidos numa composição.

## Decorator

### Objetivo

Anexar responsabilidades adicionais a um objeto dinamicamente. Os Decorators fornecem uma alternativa flexível à herança
para estender a funcionalidade.

### Aplicabilidade

Use o Decorator quando:

* Quiser adicionar responsabilidades a objetos individuais dinamicamente e de forma transparente, sem afetar outros
  objetos.
* Quiser fornecer responsabilidades adicionais que podem ser retiradas.
* Quiser que uma classe possa ser estendida para fornecer novas funcionalidades, mas que quer que essas funcionalidades
  sejam opcionais e desvinculadas da classe original.

### Participantes

* **Component**: define a interface para objetos que podem ter responsabilidades adicionais anexadas.
* **ConcreteComponent**: define um objeto ao qual responsabilidades adicionais podem ser anexadas.
* **Decorator**: mantém uma referência para um objeto Component e define uma interface que corresponde à interface
  de Component.
* **ConcreteDecorator**: adiciona responsabilidades ao componente.
* **Client**: gerencia as responsabilidades adicionais.

### Colaborações

* O cliente usa somente a interface Component.
* O cliente não sabe que o Decorator é usado.
* O Decorator envolve o Component e delega-lhe todas as operações que o Component define.
* O Decorator pode definir operações adicionais que usam os serviços do Component.
* O Decorator pode estender a interface do Component sem alterar o Component.

### Consequências

* O padrão Decorator permite que varie a responsabilidade de um objeto dinamicamente.
* O padrão Decorator permite que adicione responsabilidades a um objeto de forma transparente e opcional.
* O padrão Decorator simplifica a extensão de classes.
* O padrão Decorator pode resultar em muitas classes pequenas e específicas.

### Padrões relacionados

* Adapter define uma nova interface, o Decorator apenas altera as responsabilidades do objeto
* Strategy permite que varie o algoritmo de um objeto, o Decorator permite que varie as responsabilidades de um objeto

## Facade

### Objetivo

Prover uma interface unificada para um conjunto de interfaces num subsistema. O Facade define uma interface de nível
mais alto que torna o subsistema fácil de ser usado.

### Aplicabilidade

Use o Facade quando:

* Quiser fornecer uma interface simples para um subsistema complexo.
* Quiser desacoplar um cliente de um subsistema complexo.
* Quiser desacoplar um cliente de várias interfaces de um subsistema complexo.
* Quiser centralizar a funcionalidade de um subsistema complexo.

### Participantes

* **Facade**: fornece uma interface simples para um subsistema complexo.
* **Subsistema Classes**: implementam funcionalidades do subsistema. Pode haver muitas classes para um subsistema.
* **Client**: usa a interface do Facade.

### Colaborações

* O cliente usa somente a interface do Facade.
* O Facade delega as solicitações do cliente para os objetos do subsistema.
* O Facade não sabe quais objetos do subsistema são usados para realizar uma solicitação.

### Consequências

* O padrão Facade simplifica a interface de um subsistema complexo.
* O padrão Facade desacopla o cliente de um subsistema complexo e das suas interfaces.

### Padrões relacionados

* Abstract Factory pode ser usado para criar objetos do subsistema.
* Mediator é semelhante ao Facade, mas enquanto o Mediator abstrai a comunicação arbitrariamente complexa entre vários
  objetos, o Facade abstrai uma interface para um subsistema complexo.
* Objetos Facade podem ser Singletons.

## Flyweight

### Objetivo

O Flyweight reduz o custo de armazenamento ao compartilhar objetos semelhantes em vez de armazenar objetos individuais.

### Aplicabilidade

Use o Flyweight quando:

* Um aplicativo usa uma grande número de objetos.
* A maioria dos estados de um objeto pode ser extrínseco.
* Muitos grupos de objetos podem ser substituídos por relativamente poucos objetos compartilhados.
* A classe de um objeto não pode ser alterada.

### Participantes

* **Flyweight**: declara uma interface que é comum a todos os objetos Flyweight.
* **ConcreteFlyweight**: implementa a interface Flyweight e armazena estados intrínsecos. Um objeto ConcreteFlyweight
  pode ser compartilhado por vários objetos Client.
* **UnsharedConcreteFlyweight**: não é compartilhado. Não pode ter estados intrínsecos.
* **FlyweightFactory**: cria e gere objetos Flyweight. Garante que objetos Flyweight sejam compartilhados
  corretamente. Quando um cliente solicita um objeto Flyweight, o FlyweightFactory retorna um objeto existente ou
  cria um, se necessário.
* **Client**: mantém uma referência para um objeto Flyweight. Calcula ou armazena estados extrínsecos e passa-os para
  o objeto Flyweight.

### Colaborações

* O cliente usa somente a interface do Flyweight.
* O cliente não sabe se um objeto Flyweight é compartilhado ou não.
* O cliente não pode alterar o estado de um objeto Flyweight.
* O FlyweightFactory cria e gerencia objetos Flyweight.

### Consequências

* O padrão Flyweight reduz o custo de armazenamento ao compartilhar objetos semelhantes em vez de armazenar objetos
  individuais.
* O padrão Flyweight pode reduzir o custo de acesso a objetos compartilhados.
* O padrão Flyweight pode aumentar a complexidade do código e torná-lo mais difícil de ler.

### Padrões relacionados

* Combinado frequentemente com o Composite, o Flyweight pode ser usado para implementar uma árvore de objetos
  compartilhados.
* É melhor implementar objetos State e Strategy como Flyweights.

## Proxy

### Objetivo

O Proxy fornece um substituto ou um espaço reservado para outro objeto para controlar o acesso a ele.

### Aplicabilidade

Use o Proxy quando:

* Um objeto não deve ser acessado diretamente por um cliente, mas sim acessado por um objeto intermediário.
* Um objeto deve ser acessado remotamente.
* Um objeto deve ser criado on-demand.
* A representação de um objeto deve ser carregada on-demand.
* Um objeto deve ser acessado somente se o cliente tiver certos privilégios.

### Participantes

* **Subject**: declara a interface do objeto Proxy e do objeto RealSubject.
* **Proxy**: mantém uma referência para um objeto RealSubject. Fornece uma interface idêntica a Subject e controla o
  acesso a um objeto RealSubject.
* **RealSubject**: define a interface real do objeto que o Proxy representa.
* **Client**: usa a interface Subject para comunicar-se com o Proxy e com o RealSubject.

### Colaborações

* O cliente usa somente a interface Subject.
* O Proxy controla o acesso ao objeto RealSubject.
* O Proxy pode ser responsável por criar, apagar e gerir o ciclo de vida do objeto RealSubject.

### Consequências

* O padrão Proxy permite que um objeto seja substituído por outro objeto para controlar o acesso a ele.
* O padrão Proxy permite que um objeto seja acessado remotamente.

### Padrões relacionados

* O padrão Proxy é semelhante ao Adapter, mas enquanto o Adapter muda a interface de um objeto, o Proxy controla o
  acesso a ele.
* O padrão Proxy é semelhante ao Decorator, mas enquanto o Decorator adiciona responsabilidades a um objeto, o Proxy
  controla o acesso a ele.

# Padrões de Comportamento

Os padrões comportamentais são aqueles que definem a comunicação entre os objetos e como os objetos se distribuem e se
comunicam entre si. Os padrões comportamentais são os padrões mais difíceis de serem aplicados, pois, por serem
dependentes do contexto do problema. Os padrões comportamentais são:

## Chain of Responsibility

### Objetivo

O Chain of Responsibility evita acoplar o remetente de uma solicitação ao seu destinatário, dando a mais de um objeto a
oportunidade de tratar a solicitação. Encadeia os objetos recetores e passa a solicitação ao longo da cadeia até que um
objeto a trate.

### Aplicabilidade

Use o Chain of Responsibility quando:

* Mais de um objeto pode tratar uma solicitação e o remetente não sabe qual objeto tratará a solicitação.
* Quer passar uma solicitação ao longo de uma cadeia de objetos.
* A solicitação deve ser tratada por um objeto específico ou por todos os objetos da cadeia.

### Participantes

* **Handler**: declara uma interface para tratar solicitações.
* **ConcreteHandler**: trata solicitações que pode tratar. Se o ConcreteHandler não pode tratar a solicitação, passa-a
  para o seu sucessor.
* **Client**: inicializa a cadeia de objetos Handler.

### Colaborações

* O cliente envia uma solicitação para um objeto Handler.
* Um objeto Handler trata a solicitação ou passa-a para o seu sucessor.
* Um objeto Handler pode ser um sucessor de outro Handler ou de vários Handlers.

### Consequências

* Permite que um objeto trate uma solicitação sem saber quem é o seu destinatário.
* Permite que uma cadeia de objetos trate uma solicitação.

### Padrões relacionados

* Usado em conjunto com o Composite, o pai de um objeto Composite pode ser um objeto Handler.

## Command

### Objetivo

O Command encapsula uma solicitação como um objeto, permitindo assim parametrizar outros objetos com diferentes
solicitações, enfileirar ou registrar solicitações e suportar operações que podem ser desfeitas.

### Aplicabilidade

Use o Command quando:

* Quer parametrizar objetos com operações.
* Quer enfileirar operações, registrar solicitações e suportar operações que podem ser desfeitas.
* Quer implementar operações de desfazer.

### Participantes

* **Command**: declara uma interface para executar uma operação.
* **ConcreteCommand**: define uma ligação entre uma ação e um recetor.
* **Client**: cria um ConcreteCommand e define o seu receptor.
* **Invoker**: solicita uma operação a um objeto Command.
* **Receiver**: conhece como executar uma operação.

### Colaborações

* O cliente cria um ConcreteCommand e define o seu recetor.
* O cliente envia uma solicitação para o invoker.
* O invoker solicita uma operação a um objeto Command.
* O objeto Command executa a operação solicitada no seu recetor.

### Consequências

* Permite desacoplar o objeto que invoca a operação do objeto que a executa.
* Permite enfileirar uma operação, registar solicitações e suportar operações que podem ser desfeitas.
* Permite implementar operações de desfazer.

### Padrões relacionados

* O Composite pode ser usado para criar MacroCommands.
* O Memento pode guardar o estado de um Command antes de ser executado.
* Um comando que necessite de ser copiado pode ser implementado como um Prototype.

## Interpreter

### Objetivo

O Interpreter fornece uma forma de incluir linguagens de domínio específico no código. Dado uma linguagem, define uma
representação para a sua gramática com um interpretador que usa a representação para interpretar sentenças
da linguagem.

### Aplicabilidade

Use o Interpreter quando:

* Uma linguagem de domínio específico deve ser interpretada.
* O problema pode ser representado como uma gramática para uma linguagem simples.
* O desempenho não é crítico.

### Participantes

* **Context**: contém informações globais para a gramática.
* **AbstractExpression**: declara uma interface para interpretar uma sentença ou parte de uma sentença na gramática.
* **TerminalExpression**: implementa uma interpretar uma parte da gramática.
* **NonterminalExpression**: implementa uma interpretar uma parte da gramática.
* **Client**: constrói (ou é fornecido) uma árvore de objetos AbstractExpression. Interpreta uma sentença usando a
  árvore.

### Colaborações

* O cliente constrói (ou é fornecido) uma árvore de objetos AbstractExpression.
* O cliente interpreta uma sentença usando a árvore.
* Um objeto AbstractExpression interpreta uma sentença ou parte de uma sentença na gramática.
* Um objeto TerminalExpression interpreta uma parte da gramática.
* Um objeto NonterminalExpression interpreta uma parte da gramática.
* Um objeto Context é passado para os objetos AbstractExpression.

### Consequências

* Permite incluir linguagens de domínio específico no código.
* Permite implementar gramáticas de forma eficiente.
* Permite estender e modificar gramáticas facilmente.

### Padrões relacionados

* A classe AbstractSyntaxTree é uma instância de Composite.
* O Visitor pode ser usado para implementar operações sobre gramáticas.
* O Iterator pode ser usado para percorrer a estrutura de uma gramática.
* O Flyweight pode ser usado para reduzir o número de objetos TerminalExpression.

## Iterator

### Objetivo

O Iterator provê um modo de acessar sequencialmente os elementos de um objeto agregado sem expor a sua representação
interna.

### Aplicabilidade

Use o Iterator quando:

* Quer acessar os elementos de um objeto agregado sem expor a sua representação interna.
* Quer suportar múltiplas formas de acessar um agregado.
* Quer que o acesso a um agregado seja uniforme, sequencial e transparente para os clientes.

### Participantes

* **Iterator**: declara uma interface para acessar e percorrer elementos de um agregado.
* **ConcreteIterator**: implementa a interface Iterator. Mantém a posição atual no agregado.
* **Aggregate**: declara uma interface para criar um objeto Iterator.
* **ConcreteAggregate**: implementa a interface Aggregate. Cria um objeto ConcreteIterator.
* **Client**: acessa e percorre os elementos de um agregado.

### Colaborações

* O cliente acessa e percorre os elementos de um agregado.
* Um objeto ConcreteIterator acessa e percorre os elementos de um agregado.

### Consequências

* Suporta variações de acesso a um agregado.
* Simplifica a interface de um agregado.
* Permite múltiplas formas de percorrer um agregado.

### Padrões relacionados

* O Composite pode ser percorrido recursivamente usando o Iterator.
* Iterators polimórficos podem ser criados com o Factory Method.
* O Memento pode ser usado para guardar o estado de um Iterator.

## Mediator

### Objetivo

O Mediator define um objeto que encapsula como um conjunto de objetos interage. O Mediator promove o loose coupling ao
evitar que os objetos se refiram reciprocamente explicitamente e permite variar as suas interações independentemente.

### Aplicabilidade

Use o Mediator quando:

* Quer reduzir as dependências entre objetos.
* Quer variar as interações entre objetos de forma independente.
* Quer restringir o acesso a um conjunto de objetos.

### Participantes

* **Mediator**: declara uma interface para comunicar com objetos Colleague.
* **ConcreteMediator**: implementa a comunicação entre objetos Colleague. Conhece e mantém os objetos Colleague.
* **Colleague**: declara uma interface para receber notificações do Mediator.
* **ConcreteColleague**: implementa a interface Colleague. Notifica o Mediator quando ocorre um evento.
* **Client**: cria objetos ConcreteColleague e ConcreteMediator. Envia solicitações a um objeto ConcreteColleague.

### Colaborações

* O cliente cria objetos ConcreteColleague e ConcreteMediator.
* O cliente envia solicitações a um objeto ConcreteColleague.
* Um objeto ConcreteColleague envia notificações e recebe solicitações do Mediator.

### Consequências

* Limita a criação de subclasses.
* Simplifica a comunicação entre objetos.
* Permite o decoupling de interações.
* Abstrai a complexidade de comunicação entre objetos.
* Centraliza o controlo de interações.

### Padrões relacionados

* O Observer pode ser usado para notificar objetos sobre mudanças de estado.
* O Facade abstrai um subsistema para fornecer uma interface conveniente, sendo unidirecional.

## Memento

### Objetivo

O Memento captura e externaliza um estado interno de um objeto, de forma que o objeto possa ser restaurado para esse
estado mais tarde, sem violar o encapsulamento.

### Aplicabilidade

Use o Memento quando:

* Quer capturar e externalizar o estado interno de um objeto de forma que o objeto possa ser restaurado para esse estado
  mais tarde, sem violar o encapsulamento.
* Quer implementar o rollback de uma transação.
* Quer implementar o controle de versões.
* Quer implementar um histórico de operações.

### Participantes

* **Originator**: cria um objeto Memento que contém o estado interno do Originator. Usa o Memento para restaurar o seu
  estado.
* **Memento**: armazena o estado interno do Originator. O Memento é protegido contra o acesso por objetos de fora do
  Originator.
* **Caretaker**: é responsável por manter o Memento. O Caretaker não opera ou examina o conteúdo do Memento.
* **Client**: cria um objeto Originator. Define o estado inicial do Originator. Cria um objeto Caretaker. Solicita ao
  Originator que crie um Memento. Solicita ao Caretaker que armazene o Memento. Solicita ao Originator que restaure o
  seu estado a partir do Memento.

### Colaborações

* O cliente cria um objeto Originator e define o seu estado inicial.
* O cliente cria um objeto Caretaker e solicita ao Originator que crie um Memento.
* O Memento é armazenado pelo Caretaker e não é examinado pelo Caretaker.
* O cliente solicita ao Originator que restaure o seu estado a partir do Memento, ou diretamente do Caretaker.
* O Originator restaura o seu estado a partir do Memento.

### Consequências

* Permite o encapsulamento do estado interno de um objeto.
* O uso de Mementos pode ser custoso em memória.
* Custos de caregar e salvar o estado de um objeto podem ser elevados.

### Padrões relacionados

* Guardar o estado de uma iteração com o Iterator
* Commands usam mementos para implementar o rollback de uma transação.

## Observer

### Objetivo

O Observer define uma dependência 1-N entre objetos de forma que quando um objeto muda de estado, todos os
seus dependentes são notificados e atualizados automaticamente.

### Aplicabilidade

Use o Observer quando:

* Quer notificar outros objetos quando o estado de um objeto muda.
* Quer permitir que objetos interessados registem-se para receber notificações de outros objetos.
* Quer permitir que objetos interessados se desregistrem de outros objetos.
* Quer notificar outros objetos quando um objeto destrói-se.

### Participantes

* **Subject**: mantém uma lista de objetos Observer. Fornece uma interface para anexar e desanexar objetos Observer.
* **ConcreteSubject**: armazena o estado de interesse para os objetos Observer. Envia notificações para os objetos
  Observer quando o seu estado muda.
* **Observer**: define uma interface para atualizar que objetos dependem dele.
* **ConcreteObserver**: mantém uma referência para um objeto ConcreteSubject. Armazena o estado que deve ser
  consistente com o estado do ConcreteSubject. Implementa a interface Observer para manter o estado consistente com o
  estado do ConcreteSubject.
* **Client**: cria objetos ConcreteSubject e ConcreteObserver. Anexa objetos ConcreteObserver a um objeto
  ConcreteSubject.

### Colaborações

* O cliente cria objetos ConcreteSubject e ConcreteObserver.
* O ConcreteSubject anexa objetos ConcreteObserver a si.
* O ConcreteSubject envia notificações para os objetos ConcreteObserver quando o seu estado muda.
* O ConcreteObserver atualiza o seu estado quando o ConcreteSubject muda.

### Consequências

* Permite a comunicação entre objetos de forma que os objetos não precisam de conhecer reciprocamente, nem de
  conhecer a estrutura do sistema.
* Suporta broadcast de notificações.
* Pode levar a atualizações inesperadas se os objetos Observer não forem cuidadosamente desanexados.
* Custos de manutenção e de desempenho podem ser elevados.
* Pode ser difícil de implementar o Observer em algumas linguagens de programação.

### Padrões relacionados

* O ChangeManager funciona como um Mediator.
* O ChangeManager pode ser implementado com o Singleton, para ser um ponto único de acesso global.

## State

O State permite que um objeto altere o seu comportamento quando o seu estado interno muda. Parece que o objeto mudou de
classe.

### Aplicabilidade

Use o State quando:

* Um objeto deve alterar o seu comportamento quando o seu estado interno muda. Parece que o objeto mudou de classe.
* Um objeto tem muitos estados e todos eles são representados por classes concretas.
* Um conjunto de operações parece estar relacionadas com estados de um objeto, mas não estão.
* Quer evitar o uso de condicionais extensas que dependem do estado do objeto.
* Quer distribuir o código relacionado com estados por vários objetos em vez de colocá-lo todos num objeto.

### Participantes

* **Context**: define a interface de interesse para os clientes. Mantém uma instância de uma classe ConcreteState que
  define o estado atual do Context.
* **State**: define uma interface para encapsular o comportamento associado a um determinado estado do Context.
* **ConcreteState**: implementa uma variante do comportamento do Context definido por State.
* **Client**: cria um objeto ConcreteState e configura o seu objeto Context com o ConcreteState.

### Colaborações

* O cliente cria um objeto ConcreteState e configura o seu objeto Context com o ConcreteState.
* O Context delega pedidos para o seu objeto State atual.
* O Context altera o seu objeto State atual quando o seu comportamento muda.
* O Context pode armazenar o seu estado interno no objeto State atual.

### Consequências

* Localiza o código relacionado com estados num único objeto.
* Torna as transições de estado explícitas.
* Simplifica o código dos clientes.
* Os objetos State podem ser partilhados por vários objetos Context.

### Padrões relacionados

* O Flyweight pode ser usado para reduzir o número de objetos State.
* Os objetos State podem ser implementados com o Singleton, para serem partilhados por vários objetos Context.

## Strategy

### Objetivo

O Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. O Strategy permite que
o algoritmo varie independentemente dos clientes que o utilizam.

### Aplicabilidade

Use o Strategy quando:

* Muitos algoritmos relacionados e que variam independentemente dos clientes que os utilizam.
* Quer utilizar diferentes versões de um algoritmo dentro de um objeto.
* Quer evitar um código extenso com condicionais que dependem dos valores dos parâmetros.
* Quer isolar o código do algoritmo dos clientes que o utilizam.

### Participantes

* **Strategy**: define a interface comum a todos os algoritmos suportados. Context usa esta interface para chamar o
  algoritmo definido por um ConcreteStrategy.
* **ConcreteStrategy**: implementa o algoritmo usando a interface Strategy.
* **Context**: mantém uma referência para um objeto Strategy. Pode definir um interface que permite alterar
  dinamicamente o Strategy associado.
* **Client**: configura o objeto Context com um objeto ConcreteStrategy.

### Colaborações

* O Strategy define uma interface comum a todos os algoritmos suportados. Context usa esta interface para chamar o
  algoritmo definido por um ConcreteStrategy.
* O Context pode passar dados para o Strategy através da interface Strategy.

### Consequências

* Famílias de algoritmos relacionados podem ser encapsuladas em classes Strategy.
* Fornece uma alternativa a subclasses para alterar o comportamento de um objeto.
* Elimina a necessidade de condicionais extensas que dependem do objeto.
* Escolha das classes Strategy pode ser feita em tempo de execução.
* O cliente tem de conhecer as diferentes estratégias, e há um custo associado à comunicação entre o Context e as
  classes Strategy.

### Padrões relacionados

* Objetos Strategy são bons candidatos para Flyweights.

## Template Method

### Objetivo

O Template Method define o esqueleto de um algoritmo numa operação, adiando alguns passos para as subclasses. O Template
Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do mesmo.

### Aplicabilidade

Use o Template Method quando:

* Implementar um algoritmo que consiste numa sequência de passos.
* O comportamento de certos passos depende de detalhes que devem ser definidos pelas subclasses.
* Quer permitir que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do mesmo.
* Quer controlar os passos de um algoritmo.

### Participantes

* **AbstractClass**: define operações primitivas que devem ser implementadas pelas subclasses e operações de alto
  nível que já estão implementadas.
* **ConcreteClass**: implementa as operações primitivas para executar passos específicos de um algoritmo.
* **Client**: utiliza a interface AbstractClass para executar um algoritmo.

### Colaborações

* O ConcreteClass depende do AbstractClass para implementar as operações de alto nível.

### Consequências

* Define o esqueleto de um algoritmo numa operação.
* Constitui uma técnica fundamental de reutilização de código.

### Padrões relacionados

* O Template Method pode ser usado para implementar o Factory Method.
* Os passos de um algoritmo podem ser implementados com o Strategy.

## Visitor

### Objetivo

O Visitor permite definir uma nova operação sem alterar as classes dos elementos sobre os quais opera.

### Aplicabilidade

* A estrutura de um objeto contém muitos elementos de classes diferentes e quer definir novas operações sobre esses
  elementos sem alterar as classes.
* Quer definir uma operação que depende de vários tipos de elementos.
* Quer isolar operações que dependem de tipos de elementos de classes concretas.

### Participantes

* **Visitor**: define uma interface para uma operação que aceita um objeto como argumento.
* **ConcreteVisitor**: implementa uma operação para cada classe ConcreteElement da estrutura do objeto que aceita.
* **Element**: declara uma operação aceitar que recebe um argumento do tipo Visitor.
* **ConcreteElement**: implementa uma operação aceitar que chama um método do Visitor que corresponde à classe do
  ConcreteElement.
* **ObjectStructure**: contém uma coleção de Elementos. Fornece uma interface para permitir que os visitantes
  acessem os seus elementos.
* **Client**: cria um ObjectStructure e um ConcreteVisitor. O ConcreteVisitor é passado para cada elemento do
  ObjectStructure.

### Colaborações

* O Visitor visita um Element através da operação aceitar.
* O Client cria um ObjectStructure e um ConcreteVisitor. O ConcreteVisitor é passado para cada elemento do
  ObjectStructure.
* Quando um ConcreteVisitor visita um ConcreteElement, este chama um método do ConcreteVisitor que corresponde à
  classe do ConcreteElement.

### Consequências

* Permite definir novas operações com facilidade.
* Um visitor agrupa operações relacionadas e separa as independentes.
* Definir novos ConcreteElements é difícil porque requer alterar todos os ConcreteVisitors.
* Visita segundo hierarquias de classes diferentes.
* Acumula estado durante a visita de uma estrutura de objetos.
* Quebra o encapsulamento dos elementos.

### Padrões relacionados

* Pode ser usado para fazer a interpretação do Interpreter.
* Pode ser usado para aplicar uma operação a uma estrutura de objetos Composite.