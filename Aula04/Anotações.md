# Herança:
* Facilita a programação, uma classe A deve herdar de uma classe B quando podemos dizer que A é um B;
* Reduz a quantidade de código escrito;
* Diminui o tamanho dos códigosfonte;
* Distribui a complexidade da aplicação;
* Para definirmos que uma classe herda de outra, em java, utilizamos a mágica **extends**;
* Uma classe herda todas os atributos e métodos públicos (public) da classe `pai`, bem como os métodos protegidos(protected).

# Herança : Generalização:
* Depois de definir as classes, procura-se por aspectos comuns nessas classes e verifica se faz sentido criar uma superclasse para conter esses aspectos;
* Pergunte se as duas classes poderiam ter um pai comum;
* Exemplo: Todas as pessoas que participam de uma aplicação : Funcionários, Clientes, Gerentes, etc.

# Herança : Especialização:
* Já sabendo que haverá uma família de classes com informações muito semelhantes, começa-se criando a superclasse e depois as classes mais específicas;
* Exemplo: Peças em uma linha de montagem.

# Superclasse:
* Base para a herança das outras classes;
* Chamamos essas classes base de superclasses.

# Subclasse: 
* Classe que herda de outra.

# Classes Abstratas: 
* São classes que não podem ser instanciadas (new Numero);
* São uteis quando a superclasse não existe por si só;
* Palavra mágica: **abstract**.

# Sobreescrita de Métodos: 
* Uma subclasse que possui um método com o mesmo nome e tipo de parâmetros da superclasse;
* Esse método especializa um comportamento do método da superclasse, realizando a mesma operação, porém de forma diferente.
* @Override : Sinaliza que um método está substituindo o comportamento de seu ancestral;
* super : Sempre que precisamos invocar o método ancestral, chamamos super( ).

# Método toString()
* Em java, todas as classes herdam de uma superclasse chamada **Object**;
* A classe Object define um método chamado toString(), que gera uma representação textual da instância do objeto em uso;
* Podemos sobreescrever o método toString() para que o mesmo retorne uma resposta mais adequada para nossas necessidades.
