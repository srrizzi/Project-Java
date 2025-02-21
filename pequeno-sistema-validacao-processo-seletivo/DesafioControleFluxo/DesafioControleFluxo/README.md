# Desafio Controle de Fluxo

Este projeto é um pequeno sistema de validação de processo seletivo que recebe dois parâmetros via terminal e realiza uma contagem com base nesses parâmetros. Se o primeiro parâmetro for maior que o segundo, uma exceção customizada é lançada.

## Estrutura do Projeto

O projeto contém duas classes principais:

1. `Contador.java`: Contém a lógica principal do programa.
2. `ParametrosInvalidosException.java`: Representa a exceção customizada que é lançada quando o primeiro parâmetro é maior que o segundo.

## Como Executar

### Pré-requisitos

- Java Development Kit (JDK) instalado.
- Um terminal ou IDE para executar o código.

### Passos

1. Clone o repositório para sua máquina local.
2. Navegue até o diretório do projeto.
3. Compile as classes Java:
    ```sh
    javac src/Contador.java src/ParametrosInvalidosException.java
    ```
4. Execute o programa:
    ```sh
    java src/Contador
    ```

### Exemplo de Uso

Ao executar o programa, você será solicitado a inserir dois parâmetros:

```sh
Digite o primeiro parâmetro:
12
Digite o segundo parâmetro:
30
