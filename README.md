# 🪙 Conversor de Moedas (Terminal Interativo)

![Java](https://img.shields.io/badge/Java-JDK%2011%2B-ED8B00?style=for-the-badge&logo=openjdk)
![Status](https://img.shields.io/badge/Status-Concluído-4CAF50?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

Este é um aplicativo simples de conversão de moedas baseado em terminal, desenvolvido em Java para um Challenge da capacitação em Java na Alura. Ele permite aos usuários converter valores entre diferentes pares de moedas, obtendo as taxas de câmbio em tempo real através de uma API externa.

## ✨ Funcionalidades

* ✅ **Conversão de Moedas**: Converte valores entre pares de moedas pré-definidos (USD, BRL, EUR, JPY, GBP, CAD).
* ✅ **Taxas de Câmbio em Tempo Real**: Obtém as taxas de câmbio mais recentes de uma API externa.
* ✅ **Interface de Terminal Interativa**: Menu simples e fácil de usar para seleção de opções e entrada de valores.
* ✅ **Tratamento de Erros**: Lida com entradas inválidas do usuário e erros de comunicação com a API.

## 🚀 Como Executar o Projeto

Para executar este projeto, você precisará ter o Java Development Kit (JDK) instalado em sua máquina (versão 11 ou superior é recomendada) e seguir os passos de configuração abaixo.

### Pré-requisitos

* **Java Development Kit (JDK)**: Certifique-se de ter o JDK instalado e configurado corretamente em suas variáveis de ambiente. Você pode baixá-lo em [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) ou [OpenJDK](https://jdk.java.net/).
* **Chave de API da ExchangeRate-API**: Este projeto utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/). Você precisará de uma chave de API gratuita.
* **Dependência Gson**: O projeto utiliza a biblioteca [Gson](https://github.com/google/gson) para interpretar as respostas JSON da API. Você pode baixar o arquivo `.jar` diretamente do repositório.

### Configuração

1.  **Obtenha sua Chave de API**: Vá para o site da [ExchangeRate-API](https://www.exchangerate-api.com/) e registre-se para obter sua chave de API gratuita.

2.  **Atualize o arquivo `Main.java`**:
    No arquivo `Main.java` (ou na sua classe de serviço correspondente), atualize a variável `apiKey` com a sua chave obtida:

    ```java
    private static final String apiKey = "SUA_CHAVE_API_AQUI"; // Substitua por sua chave real
    private static final String apiBaseUrl = "[https://v6.exchangerate-api.com/v6/](https://v6.exchangerate-api.com/v6/)";
    ```

3.  **Adicione o Gson ao projeto**:
    Coloque o arquivo `.jar` do Gson que você baixou em uma pasta `lib` na raiz do seu projeto.

### Compilando e Executando

Abra um terminal na pasta raiz do seu projeto e siga os passos:

1.  **Compile o código-fonte** (incluindo o Gson no classpath):

    * No Windows:
        ```shell
        javac -cp ".;lib/gson-2.10.1.jar" *.java
        ```
    * No Linux/macOS:
        ```shell
        javac -cp ".:lib/gson-2.10.1.jar" *.java
        ```
    *(**Atenção**: ajuste o nome do arquivo `gson-2.10.1.jar` para a versão que você baixou)*

2.  **Execute o programa**:

    * No Windows:
        ```shell
        java -cp ".;lib/gson-2.10.1.jar" Main
        ```
    * No Linux/macOS:
        ```shell
        java -cp ".:lib/gson-2.10.1.jar" Main
        ```
    *(Substitua `Main` pelo nome da sua classe principal, se for diferente)*
