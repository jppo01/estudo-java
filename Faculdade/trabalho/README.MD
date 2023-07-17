# Aluno
João Paulo Pires de Oliveira
RU: 2444892

# Cofrinho de Moedas

Este é um pequeno projeto em Java que emula um "Cofrinho de moedas". O objetivo do projeto é demonstrar o bom uso dos conceitos de herança e polimorfismo, conforme solicitado no trabalho da disciplina de Programação Orientada a Objetos (POO) do Curso de Engenharia de Software da instituição UNINTER.

## Funcionalidades do Sistema

O sistema oferece as seguintes funcionalidades aos usuários:

1. Adicionar moedas de diferentes valores e países ao cofrinho.
2. Remover moedas específicas do cofrinho.
3. Listar todas as moedas presentes no cofrinho.
4. Calcular o valor total do dinheiro no cofrinho convertido para Real.

## Estrutura do Projeto

O projeto está estruturado em classes e faz uso do conceito de herança e polimorfismo. A seguir, são apresentadas as principais classes do projeto:

1. `Principal`: Esta classe é responsável por apresentar o menu ao usuário e interagir com o sistema.
2. `Cofrinho`: Esta classe representa o cofrinho e contém uma coleção de moedas. Utiliza uma estrutura de dados (como um `ArrayList`) para armazenar as moedas.
3. `Moeda` (classe mãe abstrata): Esta é uma classe abstrata que serve como base para outras classes específicas de moedas, como `Dolar`, `Euro`, `Real` e `Atributo`. Ela define os atributos e métodos comuns a todas as moedas.
4. Classes específicas de moedas (por exemplo, `Dolar`, `Euro`, `Real`, `Bitcoin`, etc.): Essas classes estendem a classe `Moeda` e implementam os métodos específicos de cada moeda, como a conversão para Real.

O projeto pode conter outras classes, métodos e atributos adicionais.

## Consumo de API e Utilização de Gson

Para complementar o trabalho, foi realizado o consumo de uma API de moedas (https://docs.awesomeapi.com.br/api-de-moedas) utilizando a biblioteca Gson. A API foi utilizada para obter os valores de dólar, euro e bitcoin em relação ao Real. Essas informações são utilizadas para calcular o valor total do dinheiro no cofrinho convertido para Real.

## Classe Price

A classe `Price` é responsável por consumir a API e obter os valores de cotação das moedas em relação ao Real. Ela utiliza a biblioteca Gson para fazer a leitura e manipulação do JSON retornado pela API.

A classe possui os seguintes atributos:

- `USDBRL`: representa o valor de cotação do Dólar em relação ao Real.
- `EURBRL`: representa o valor de cotação do Euro em relação ao Real.
- `BTCBRL`: representa o valor de cotação do Bitcoin em relação ao Real.
- `jsonObject`: objeto do tipo `JsonObject` que armazena o JSON retornado pela API.

O construtor da classe `Price` chama o método `getPrice()`, que é responsável por fazer a requisição HTTP à API e armazenar o JSON retornado no atributo `jsonObject`.

O método `getPrice()` utiliza a classe `HttpClient` para fazer uma requisição GET à URL da API `https://economia.awesomeapi.com.br/json/last/USD-BRL,EUR-BRL,BTC-BRL`. Em seguida, o método lê o corpo da resposta e utiliza a biblioteca Gson para converter o JSON em um objeto `JsonObject`.

Existem métodos específicos para atualizar os valores das cotações de cada moeda (`setUSDBRL()`, `setEURBRL()`, `setBTCBRL()`) que chamam o método `getPrice()` para obter os valores atualizados do JSON e armazená-los nos respectivos atributos.

Também existem métodos getters (`getUSDBRL()`, `getEURBRL()`, `getBTCBRL()`) que retornam os valores das cotações atualizadas das moedas.

Em resumo, a classe `Price` encapsula a lógica para consumir a API de moedas e obter os valores de cotação do Dólar, Euro e Bitcoin em relação ao Real, permitindo que o sistema do cofrinho utilize esses valores para calcular o valor total do dinheiro no cofrinho convertido para Real.

Observação: Certifique-se de ter a biblioteca Gson adicionada ao projeto para utilizar a classe `Price` corretamente.


## Requisitos do Projeto

Para executar o projeto, são necessários os seguintes requisitos:

1. JDK (Java Development Kit) instalado no ambiente.
2. Biblioteca `Gson (2.10.1)` adicionada ao projeto (https://github.com/google/gson).
3. Conexão com a internet uma vez que é feito o consumo de uma API

## Executando o Projeto

Para executar o projeto, siga as etapas abaixo:

1. Abra o projeto em um ambiente de desenvolvimento Java, como o VSC (utilizei o maven para gerenciamento), Eclipse ou IntelliJ.
2. Certifique-se de que a biblioteca Gson está configurada corretamente no projeto.
3. Execute a classe `Princiapl` para iniciar o programa.
4. Siga as instruções apresentadas no menu para interagir com o sistema.

## Observações
Como o uso do software eclipse foi opcional (recomendado), eu preferi utilizar o VSC configurado para desenvolvimento JAVA. Utilizei a extensão `Maven for Java` para gerenciamento do projeto (e dependência).

Além disso, é importante mencionar que o consumo da API, utilização do Gson e a moeda Bitcoin são complementos opcionais para o projeto, realizados como uma extensão além do solicitado no trabalho.

## Meus contatos
Caso haja a necessidade de entrar em contato comigo
E-mail: jppo@live.com
WhatsApp: (62)9 8456-0310.
