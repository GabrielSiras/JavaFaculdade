# Quatro pilares da OO:**
* Abstração : Identidade, propriedades e métodos.
* Encapsulamento : Caixa Preta.
* Herança : Menos código-fonte.
* Polimorfismo : Mesma chamada, objeto diferente, comportamento diferente + Mesmo objeto, diferentes chamadas, diferentes comportamentos.

## Abstração:
* Forma de retirar as características relevantes de algo do mundo real para incluir em um projeto;
* Classes são objetos;
* Habilidade de focar no principal de um qualquer elemento ou código, ignorando as coisas menos importantes.

## Encapsulamento:
* Técnica em que os detalhes internos do funcionamento de uma classe fiquem ocultos para os objetos;
* Dados e comportamentos estão encapsulados dentro dos objetos, sendo dados **atributos** e comportamentos **métodos**;
* Usa para separar o programa em partes, o mais isoladas possível;
* Sua ideia é ter uma facilidade de modificar e de criar novas implementações no código;
* Inibe acessos não autorizados aos dados;
* Restringe os erros a escopos (partes) menores.

## Herança: 
* Permite que as classes compartilhem atributos e métodos;
* Usa para reaproveitar código ou comportamento generalizado ou especializar operações ou atributos;
* Uma classe X deve herdar de uma classe Y quando podemos dizer que X é um Y;
* Distribui a complexidade da aplicação.

## Polimorfismo:
* Facilita invocação de uma função sem se preocupar em como a ação foi implementada, utiliza a mesma função em classes diferentes;
* Como por exemplo um método colisao() em um jogo, pode ser usado para vários objetos diferentes, desde que tenha uma colisão a ser definida.

# Estrutura fundamental da Classe em Orientação de Objetos:
* Utilizamos para representar objetos do mundo real, é comum declararmos atributos e métodos, as características e comportamentos desse objeto;
* Classes são os **moldes**, por exemplo a forma de um bolo;
* Objetos são os produtos gerados a partir destas formas.

# Modificadores de Acesso:
* Usa para definir o que será **visível** para outras partes do código;
* Usa-se modificadores para implementarmos o **Encapsulamento**;
* Há quatro modificadores de acesso:
- private;
- protected;
- public;
- default;

## Private:
* Mais restrito que existe, atributos e métodos só são acessíveis somente pela classe que declara;
* Métodos e atributos com private não são herdados.

## Protected:
* Mais permissivo que o **private**, atributos e métodos declarados são acessíveis pela classe que os declara, suas subclasses em outros pacotes e outras classes
dentro do mesmo pacote;
* Métodos e atributos declarados com o modificador **protected** numa superclasse devem ser definidos como protected ou public em suas subclasses.

## Public:
* Mais permissivo que existe, atributos, métodos e classes declarados como public são acessíveis por qualquer classe do Java;
* Todos os métodos e atributos declarados como public são herdados pelas subclasses;
* Métodos e atributos declarados como public devem se manter public em todas as subclasses.

## Default: 
* Usado quando nenhum for definido;
* Atributos, métodos e classes são visíveis por todas as classes dentro do mesmo pacote.

# Instanciando um objeto: 
* Usamos o comando **new** para criar objetos; 
* **new** faz a alocação da memória e cria o objeto invocando o construtor chamado.
- Exemplo: Primos p = new Primos();

# Método main()
* Em Java permite que cada classe possua um método **main()**;
* O método **main()** é sempre o primeiro método a ser chamado quando a classe é executada.
* A estrutura do método **main()* é sempre a mesma:
    public static void main(String[ ] args) {
        // corpo do método
    }