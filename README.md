# Calculadora Simples em Java com Testes Unitários e CLI

## 1. Descrição do Projeto

Este projeto consiste no desenvolvimento de uma calculadora simples em Java como parte de uma atividade acadêmica. A calculadora implementa as quatro operações matemáticas básicas (adição, subtração, multiplicação e divisão).

O projeto inclui:
* A lógica principal da calculadora em uma classe dedicada (`Calculadora.java`).
* Testes unitários robustos utilizando JUnit 5 para garantir a corretude de cada operação da calculadora (`CalculadoraTeste.java`), cobrindo diversos cenários de sucesso e falha.
* Uma interface de linha de comando (CLI) interativa (`AppCalculadora.java`) que permite ao usuário final utilizar a calculadora de forma simples e intuitiva.

## 2. Funcionalidades Implementadas

* **Adição:** Soma dois números de ponto flutuante.
* **Subtração:** Subtrai um número de ponto flutuante de outro.
* **Multiplicação:** Multiplica dois números de ponto flutuante.
* **Divisão:** Divide um número de ponto flutuante por outro, com tratamento específico para evitar divisão por zero.
* **Interface de Linha de Comando (CLI):**
    * Permite ao usuário inserir o primeiro número.
    * Permite ao usuário escolher a operação desejada (`+`, `-`, `*`, `/`) ou sair do programa.
    * Permite ao usuário inserir o segundo número.
    * Exibe o resultado da operação.
    * Valida entradas numéricas e operações inválidas, informando o usuário.
* **Testes Unitários:**
    * Cobertura de testes para as operações de soma, subtração, multiplicação e divisão.
    * Testes incluem cenários com números positivos, negativos, zero e, para a divisão, o caso de divisão por zero (esperando uma exceção).

## 3. Tecnologias Utilizadas

* **Linguagem de Programação:** Java (JDK 8)
* **Framework de Testes:** JUnit 5
* **Ambiente de Desenvolvimento (IDE):** Eclipse IDE
* **Gerenciamento de Dependências (Opcional):** Biblioteca JUnit adicionada diretamente ao Build Path do Eclipse.

## 4. Estrutura do Projeto

O código-fonte está organizado da seguinte forma (assumindo o pacote `projeto.calculadora`):

* **`src/projeto/calculadora/Calculadora.java`**: Classe principal com a lógica de negócios das operações da calculadora.
* **`src/projeto/calculadora/AppCalculadora.java`**: Classe com o método `main` que implementa a interface de linha de comando para interação com o usuário.
* **`src/projeto/calculadora/CalculadoraTeste.java`**: Classe contendo os testes unitários para a classe `Calculadora`, utilizando JUnit 5.

## 5. Como Compilar e Executar

### 5.1. Pré-requisitos

* JDK (Java Development Kit) instalado e configurado.
* Eclipse IDE (ou outra IDE Java).
* JUnit 5 devidamente configurado no classpath do projeto no Eclipse.

### 5.2. Compilando

O Eclipse IDE geralmente compila os arquivos `.java` automaticamente ao salvá-los. Caso contrário, você pode usar a opção "Project" > "Build Project".

### 5.3. Executando a Calculadora Interativa (CLI)

1.  No Eclipse, localize a classe `AppCalculadora.java` no "Package Explorer".
2.  Clique com o botão direito do mouse sobre o arquivo `AppCalculadora.java`.
3.  Selecione "Run As" > "1 Java Application".
4.  A interação ocorrerá no painel "Console" do Eclipse.

### 5.4. Executando os Testes Unitários

1.  No Eclipse, localize a classe `CalculadoraTeste.java` no "Package Explorer".
2.  Clique com o botão direito do mouse sobre o arquivo `CalculadoraTeste.java` (ou sobre um método de teste específico dentro da classe).
3.  Selecione "Run As" > "1 JUnit Test".
4.  Os resultados dos testes serão exibidos na aba "JUnit" do Eclipse, indicando testes que passaram (barra verde) ou falharam (barra vermelha com detalhes do erro).

## 6. Instruções de Uso da Calculadora (CLI)

Ao executar `AppCalculadora.java`:

1.  O console exibirá a mensagem: "Bem-vindo à Calculadora Interativa!".
2.  Siga as instruções:
    * Digite o primeiro número e pressione `Enter`.
    * Digite a operação desejada (`+`, `-`, `*`, `/`) ou digite `sair` para encerrar o programa, e pressione `Enter`.
    * Se uma operação válida for inserida (e não "sair"), digite o segundo número e pressione `Enter`.
3.  O resultado da operação será exibido formatado.
4.  O programa solicitará novas entradas para continuar calculando até que `sair` seja digitado.
5.  O programa informará sobre entradas numéricas inválidas ou operações não reconhecidas, permitindo que o usuário tente novamente.
6.  Em caso de divisão por zero, uma mensagem de erro específica será exibida.

## 7. Autor(es)

* Genison Leal
---
