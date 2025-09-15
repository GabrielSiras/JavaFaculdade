# Classes:
* Classe é o “molde” para criação de objetos;
* Tudo é objeto, por isso necessita de uma classe para ser feito.

# Atributos de classe VS Atributos de instância:
* Instância assume valores diferentes para cada objeto;
* Classe possue o mesmo valor para todos os objetos de uma determinada classe, pode ser variáveis ou constantes.

# Getters e Setters:
* Todos os atributos devem ser acessados através de métodos somente, faz parte do princípio do encapsulamento;
* Para acesso simples aos atributos é criado métodos:
- Getters : para ler dados.
- Sempre for consultar o valor de um atributo de um objeto, usamos o método get.
- Não se cria getters para Atributos que não quer que sejam acessados! 

- Setters : para alterar dados.
- Recebe um valor por parâmetro e o copia para o atributo da classe.

## Getter exemplo:
    private String nome; 
    
    public String getNome(){
        return nome;
        }

## Setter exemplo:
    private String nome;

    public String setNome(String nome){
        this.nome = nome;
    }

# This:
* Pode ser lida como “desta classe”;
* Serve para desambiguar uma atribuição em um setter;

# Métodos:
* Os métodos são os comportamentos do objeto,o quê se pode fazer com ele.
* Modificador informará como o
método será visto (ou não) pelas
outras classes : Pode ser public,
protected, private ou default

## Métodos : Tipo de Retorno:
* Pode ser um tipo primitivo, um objeto de uma classe ou mesmo nada;
* Métodos que não retornam nada retornam **void**.

## Métodos : Nome do método:
* Sem espaços, começando com letra minúscula.

## Métodos : Lista de parâmetros:
* Indicados por seu tipo e nome e separados por vírgulas;
* Parâmetros são informados entre parênteses.

## Métodos : Corpo do Método:
* Descrita a lógica interna de funcionamento do método;
* Fica entre chaves.

# Construtores
* Métodos especiais não possuem retorno e tem o mesmo nome da classe;
* Sua função é inicializar os atributos (características) do objeto no momento de sua criação;
* Uma classe pode possuir mais do que um construtor.

# Instanciação:
* Criação de um objeto, precisa de uma variável do tipo do objeto, da palavra-chave **new** e de um construtor da classe;
* A palavra-chave **new** realiza a alocação de memória para o objeto;
* O construtor inicializa os atributos da classe com os parâmetros ou com código contido no construtor.
* Exemplo de Instanciação:
    FichaInscricao f1 = new FichaInscricao("Gabriel","Rua João","Ameim"...);

# Chamada de métodos
* Usa-se o nome da variável e depois um ponto ( . ) antes do nome do método.
* Exemplo:
    f1.setNome("Garibel");