# Lógica de Programação - Virado no Jiraya


# Aula 09 — IntelliJ IDEA

## 📚 Sobre a aula

Nesta aula é apresentada uma **IDE (Integrated Development Environment)** para auxiliar no desenvolvimento de programas Java.

A IDE utilizada no curso é o **IntelliJ IDEA**.

Até este momento, os programas poderiam ser desenvolvidos utilizando ferramentas mais simples, como um editor de texto. Entretanto, conforme os programas ficam maiores, uma IDE oferece recursos que facilitam o desenvolvimento, como:

- organização de projetos;
- criação de classes;
- autocompletar;
- identificação de erros;
- compilação;
- execução;
- acesso ao console;
- gerenciamento dos arquivos do projeto.

---

## 🧰 O que é uma IDE?

IDE significa:

> **Integrated Development Environment**

É um ambiente integrado de desenvolvimento utilizado para criar outros programas.

Para Java, existem diversas IDEs, entre elas:

- Eclipse;
- NetBeans;
- IntelliJ IDEA.

A escolha da IDE não altera a lógica ou o código da aplicação.

Um código Java bem desenvolvido deve ser independente da IDE utilizada.

```text
Código Java
     ↓
┌───────────────┐
│ IntelliJ IDEA │
├───────────────┤
│    Eclipse    │
├───────────────┤
│    NetBeans   │
└───────────────┘
     ↓
Mesmo código Java
```

A IDE é uma ferramenta para auxiliar o desenvolvedor, e não deve determinar como o código da aplicação funciona.

---

## ☕ IntelliJ IDEA

O IntelliJ IDEA possui diferentes versões.

A aula apresenta:

- **Community:** versão gratuita, suficiente para os estudos básicos de Java;
- **Ultimate:** versão com recursos adicionais e destinada a necessidades mais avançadas.

Para o objetivo deste curso, a versão **Community** é suficiente.

---

## 🌎 Trabalhando em inglês

A aula utiliza a IDE em inglês.

Esse contato com ferramentas em inglês é importante porque grande parte do ambiente profissional de desenvolvimento utiliza:

- documentação em inglês;
- IDEs em inglês;
- bibliotecas em inglês;
- mensagens de erro em inglês;
- código escrito em inglês.

Por isso, é interessante desenvolver familiaridade com os termos utilizados pela ferramenta.

---

# 📦 Projetos

A IDE trabalha com o conceito de **projeto**.

Um projeto representa um sistema ou aplicação e pode conter:

- várias classes;
- vários arquivos;
- várias linhas de código;
- configurações;
- outros recursos.

Por exemplo:

```text
Projeto: SistemaPDV
│
├── Classes
├── Arquivos
├── Configurações
└── Código
```

Todos esses elementos estão relacionados à mesma aplicação.

---

## 📂 Abrir, importar e criar projetos

O IntelliJ apresenta diferentes opções para trabalhar com projetos.

### Criar

Cria um novo projeto a partir do zero.

### Abrir

Abre um projeto existente que não depende necessariamente de configurações de outra IDE.

### Importar

Pode ser utilizado quando o projeto foi criado utilizando outra IDE ou possui arquivos de configuração que podem ser utilizados pelo IntelliJ.

No início do curso, utilizaremos principalmente a criação de **novos projetos**.

---

# 🆕 Criando um projeto Java

Para criar um novo projeto:

```text
New Project
    ↓
Java
```

É necessário selecionar o **JDK** que será utilizado pelo projeto.

Caso o IntelliJ não encontre automaticamente o JDK, podemos indicar manualmente o diretório onde ele está instalado.

---

## 📁 Nome e localização do projeto

Ao criar um projeto, precisamos definir:

```text
Nome do projeto
Localização do projeto
```

Por exemplo:

```text
Projeto:
logica-programacao
```

A IDE criará a estrutura necessária para o projeto.

---

# 📂 Estrutura do projeto

Um projeto Java criado pelo IntelliJ possui uma estrutura de arquivos e diretórios.

Um dos diretórios mais importantes é:

```text
src
```

`src` é utilizado para armazenar o código-fonte do projeto.

Uma representação simplificada:

```text
Projeto
│
├── src
│   └── classes Java
│
└── arquivos de configuração
```

---

## 📦 `src` e pacotes

Dentro de `src`, podemos criar os elementos que formarão o código da aplicação.

Em Java, diretórios dentro dessa estrutura também estão relacionados à organização dos **packages**.

Neste momento, não é necessário aprofundar o conceito de pacotes. Ele será explorado posteriormente.

---

# 📝 Criando uma classe

Para criar uma classe dentro de `src`:

```text
Botão direito em src
       ↓
New
       ↓
Java Class
```

Podemos então informar o nome da classe.

Por exemplo:

```text
CalculadoraDiferencaIdade
```

A IDE criará o arquivo Java correspondente.

---

## ✍️ Escrevendo código

Depois de criar a classe, podemos escrever o código diretamente no editor do IntelliJ.

A IDE fornece recursos para facilitar esse processo, incluindo:

- destaque de sintaxe;
- autocomplete;
- identificação de problemas;
- sugestões;
- navegação pelo código.

---

# 💡 Autocomplete

Um dos recursos apresentados é o **autocomplete**.

Ao começar a digitar determinadas instruções, o IntelliJ apresenta sugestões.

Por exemplo:

```java
System.out.
```

A IDE pode apresentar os métodos disponíveis para aquele objeto.

Isso ajuda o desenvolvedor a descobrir funcionalidades da API e escrever código mais rapidamente.

---

# ⚠️ Identificação de erros

Um dos recursos mais importantes da IDE é a identificação antecipada de erros.

Por exemplo, se esquecermos um ponto e vírgula:

```java
System.out.println("Olá")
```

o IntelliJ poderá destacar o problema visualmente.

Um trecho do código pode aparecer marcado em vermelho.

A IDE também pode indicar a linha em que o problema foi encontrado e fornecer uma descrição do erro.

---

## 🚫 Não execute código com erro de compilação

Uma regra prática apresentada na aula:

> Se existe um erro de compilação identificado pela IDE, não adianta tentar executar o programa.

Antes de executar:

```text
Código
   ↓
Verificar erros
   ↓
Corrigir
   ↓
Compilar
   ↓
Executar
```

---

# ▶️ Executando o programa

O IntelliJ oferece diferentes formas de executar uma aplicação.

Podemos utilizar o botão de execução ou o atalho:

```text
Shift + F10
```

Ao executar, a IDE realiza automaticamente o processo necessário para compilar e executar o programa.

---

# 🖥️ Console × Terminal

Durante a aula é apresentada uma diferença importante entre o **Console** e o **Terminal**.

O console mostra a saída resultante da execução da aplicação.

Por exemplo:

```text
Resultado da execução
```

Já o terminal é um ambiente de linha de comando que pode ser utilizado para executar comandos do sistema.

O IntelliJ possui seu próprio terminal integrado.

```text
IntelliJ IDEA
│
├── Editor
├── Console
└── Terminal
```

São recursos diferentes.

---

# 🔄 Compilação dentro do IntelliJ

Quando executamos um programa através da IDE, o IntelliJ realiza automaticamente a compilação necessária.

O fluxo continua sendo:

```text
Código Java
     ↓
Compilação
     ↓
Bytecode
     ↓
JVM
     ↓
Execução
```

A diferença é que a IDE automatiza esse processo.

---

# 📦 Arquivos `.class`

A compilação produz arquivos:

```text
.class
```

Esses arquivos contêm o **bytecode** Java.

O IntelliJ mantém esses arquivos em um diretório de saída do projeto, apresentado na aula como:

```text
out
```

Uma representação simplificada:

```text
Projeto
│
├── src
│   └── Código Java
│
└── out
    └── arquivos .class
```

Por exemplo:

```text
CalculadoraDiferencaIdade.class
```

---

# 🔬 Bytecode

O arquivo `.class` contém o bytecode produzido a partir do código Java.

Na aula é demonstrado que esse bytecode pode ser analisado e até **descompilado**.

O processo pode ser representado como:

```text
Código Java
     ↓
Compilador
     ↓
Bytecode (.class)
     ↓
Descompilador
     ↓
Código Java aproximado
```

O resultado da descompilação pode se parecer bastante com o código original.

---

## ⚠️ Código compilado não significa código secreto

A demonstração da descompilação mostra que o arquivo `.class` não deve ser tratado como uma forma de esconder completamente o código-fonte.

Em determinadas situações, é possível recuperar uma representação bastante próxima do código original a partir do bytecode.

Portanto, informações que precisam permanecer secretas não devem simplesmente ser colocadas no código esperando que a compilação as torne inacessíveis.

---

# 💾 Salvamento automático

Outra característica apresentada pelo IntelliJ é que o desenvolvedor não precisa ficar salvando manualmente o arquivo a cada alteração antes de executar.

Ao executar o programa, a IDE realiza o processo necessário para trabalhar com a versão atual do código.

Isso facilita o fluxo:

```text
Escrever
   ↓
Executar
   ↓
Compilar
   ↓
Executar
```

---

# 🔑 Conceitos importantes

- **IDE:** ambiente integrado de desenvolvimento.
- **IntelliJ IDEA:** IDE utilizada no curso.
- **Projeto:** conjunto de arquivos e configurações relacionados a uma aplicação.
- **JDK:** ambiente Java utilizado pelo projeto.
- **`src`:** diretório utilizado para o código-fonte.
- **Classe:** unidade de organização do código Java.
- **Autocomplete:** recurso que sugere elementos enquanto escrevemos código.
- **Console:** apresenta a saída da execução do programa.
- **Terminal:** ambiente de linha de comando.
- **Compilação:** transformação do código Java em bytecode.
- **`.class`:** arquivo que contém o bytecode.
- **Bytecode:** código intermediário executado pela JVM.
- **`out`:** diretório utilizado pelo IntelliJ para arquivos compilados.
- **Descompilação:** processo de obter uma representação de código a partir do bytecode.

---

# 🧠 Modelo mental

A utilização do IntelliJ pode ser resumida assim:

```text
             Desenvolvedor
                   ↓
             IntelliJ IDEA
                   ↓
                Projeto
                   ↓
                 src
                   ↓
              Código Java
                   ↓
               Compilação
                   ↓
             arquivo .class
                   ↓
                Bytecode
                   ↓
                  JVM
                   ↓
               Execução
                   ↓
                Console
```

A IDE automatiza diversas etapas, mas o processo fundamental do Java continua sendo o mesmo.

---

# 💡 Principal aprendizado

A IDE é uma **ferramenta para aumentar a produtividade do desenvolvedor**.

Ela não substitui o conhecimento da linguagem e não deve determinar como o código deve ser estruturado.

O IntelliJ facilita o desenvolvimento ao fornecer:

- organização dos projetos;
- edição do código;
- autocomplete;
- identificação de erros;
- compilação;
- execução;
- acesso ao console;
- ferramentas de navegação e análise.

O objetivo é permitir que o desenvolvedor se concentre cada vez mais na **solução do problema**, enquanto a IDE automatiza tarefas repetitivas.

```text
Problema
   ↓
Lógica
   ↓
Código
   ↓
IntelliJ IDEA
   ↓
Compilação
   ↓
Execução
```

---

> Texto 2 - Abordagem de instalação.

# Aula 09 — Instalando e Configurando o IntelliJ IDEA no Ubuntu

## 📚 Sobre a aula

Nesta aula é apresentada a utilização de uma **IDE (Integrated Development Environment)** para desenvolvimento Java.

A IDE escolhida é o **IntelliJ IDEA**, da JetBrains.

No Ubuntu, podemos instalar o IntelliJ IDEA e configurá-lo para facilitar o desenvolvimento dos programas Java que serão utilizados durante o curso.

---

## 🧰 O que é uma IDE?

IDE significa:

> **Integrated Development Environment**

Uma IDE reúne diversas ferramentas necessárias para desenvolver software em um único ambiente.

Entre os recursos disponíveis estão:

- editor de código;
- destaque de sintaxe;
- autocompletar;
- compilação;
- execução;
- depuração (debug);
- gerenciamento de projetos;
- integração com ferramentas de desenvolvimento.

Em vez de utilizar apenas um editor de texto e o terminal, a IDE fornece um ambiente integrado para desenvolver e executar os programas.

---

# 🐧 Instalação no Ubuntu

Existem diferentes formas de instalar o IntelliJ IDEA no Ubuntu.

Uma opção simples é utilizar o **Snap**.

Primeiro, verifique se o Snap está disponível:

```bash
snap version
```

Caso o comando não esteja disponível:

```bash
sudo apt update
sudo apt install snapd
```

Depois, podemos instalar o IntelliJ IDEA Community:

```bash
sudo snap install intellij-idea-community --classic
```

Para verificar a instalação:

```bash
snap list intellij-idea-community
```

> O IntelliJ IDEA Community é suficiente para acompanhar os estudos iniciais de Java.

---

# 🚀 Primeira execução

Depois da instalação, o IntelliJ IDEA pode ser iniciado pelo terminal:

```bash
intellij-idea-community
```

Também é possível procurar por **IntelliJ IDEA** no menu de aplicativos do Ubuntu.

Na primeira execução, a IDE poderá apresentar opções relacionadas à configuração inicial, como:

- tema da interface;
- plugins;
- configurações de ambiente.

Para os estudos iniciais, podemos manter as configurações padrão.

---

# 🔗 Criando um atalho no menu do Ubuntu

Quando instalado pelo Snap, normalmente o IntelliJ IDEA já fica disponível no menu de aplicativos.

Caso isso não aconteça, podemos criar manualmente um arquivo `.desktop`.

Crie o arquivo:

```bash
mkdir -p ~/.local/share/applications

nano ~/.local/share/applications/intellij-idea.desktop
```

Adicione:

```ini
[Desktop Entry]
Version=1.0
Type=Application
Name=IntelliJ IDEA
Comment=Java IDE
Exec=/snap/bin/intellij-idea-community
Icon=/snap/intellij-idea-community/current/bin/idea.svg
Terminal=false
Categories=Development;IDE;
StartupWMClass=jetbrains-idea
```

Salve o arquivo.

Depois, atualize o banco de aplicações:

```bash
update-desktop-database ~/.local/share/applications
```

Agora procure por:

```text
IntelliJ IDEA
```

no menu de aplicativos do Ubuntu.

> Dependendo da versão do IntelliJ IDEA ou da forma de instalação, o caminho do executável e do ícone pode ser diferente. Caso o atalho não funcione, verifique o caminho utilizado pela instalação.

---

# ☕ Configurando o Java no IntelliJ IDEA

O IntelliJ IDEA precisa conhecer o **JDK** que será utilizado pelos projetos.

Como o Java foi instalado utilizando o **SDKMAN!**, podemos localizar o JDK instalado com:

```bash
sdk current java
```

Também podemos verificar o diretório:

```bash
echo $JAVA_HOME
```

O SDKMAN! normalmente mantém as versões instaladas dentro de:

```text
~/.sdkman/candidates/java/
```

Por exemplo:

```text
~/.sdkman/candidates/java/17.x.x-tem
```

---

# 📁 Criando o primeiro projeto Java

Abra o IntelliJ IDEA.

Na tela inicial, selecione:

```text
New Project
```

Escolha:

```text
Java
```

Na configuração do projeto, selecione o **JDK** que será utilizado.

Por exemplo:

```text
JDK 17
```

Caso o IntelliJ não encontre automaticamente o JDK instalado pelo SDKMAN!, utilize a opção para adicionar um JDK existente e indique o diretório correspondente.

Por exemplo:

```text
~/.sdkman/candidates/java/17.x.x-tem
```

---

# 📦 Nome do projeto

Para o primeiro projeto podemos utilizar:

```text
HelloWorld
```

Uma estrutura inicial poderá ser semelhante a:

```text
HelloWorld
└── src
```

O diretório `src` será utilizado para armazenar o código-fonte do projeto.

---

# 📝 Criando a primeira classe

Dentro do diretório:

```text
src
```

crie uma nova classe Java chamada:

```text
HelloWorld
```

O arquivo será:

```text
HelloWorld.java
```

Adicione:

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
```

---

# ▶️ Executando o programa

O IntelliJ IDEA identifica o método:

```java
public static void main(String[] args)
```

como o ponto de entrada da aplicação.

Podemos executar o programa clicando no botão **Run** ao lado do método `main`.

Outra possibilidade é utilizar:

```text
Run → Run 'HelloWorld'
```

O resultado será apresentado no console:

```text
Hello World!
```

---

# 🔄 O que acontece quando executamos?

Mesmo utilizando uma IDE, o processo conceitual continua sendo o mesmo estudado nas aulas anteriores:

```text
Código Java
     ↓
HelloWorld.java
     ↓
Compilação
     ↓
Bytecode
     ↓
JVM
     ↓
Execução
     ↓
Hello World!
```

A diferença é que o IntelliJ IDEA automatiza grande parte desse processo.

---

# 🖥️ Estrutura básica do projeto

Um projeto simples pode ser organizado assim:

```text
HelloWorld/
│
└── src/
    └── HelloWorld.java
```

O arquivo:

```text
HelloWorld.java
```

contém o código-fonte da aplicação.

---

# 🧪 Hello World completo

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!");

    }

}
```

### `public class HelloWorld`

Declara uma classe chamada `HelloWorld`.

### `main`

```java
public static void main(String[] args)
```

É o ponto de entrada da aplicação Java convencional.

### `System.out.println()`

```java
System.out.println("Hello World!");
```

Imprime uma mensagem no console.

---

# 🧩 IntelliJ IDEA × JDK

É importante diferenciar as funções:

```text
IntelliJ IDEA
      │
      ├── Editor
      ├── Autocomplete
      ├── Run
      ├── Debug
      └── Gerenciamento do projeto
               │
               ↓
              JDK
               │
       ┌───────┴───────┐
       ↓               ↓
     javac            JVM
   compila           executa
```

A IDE **não substitui o JDK**.

Ela utiliza as ferramentas do ambiente Java para compilar e executar os programas.

---

# 🔑 Conceitos importantes

- **IDE:** ambiente integrado para desenvolvimento de software.
- **IntelliJ IDEA:** IDE da JetBrains utilizada para desenvolvimento Java.
- **JDK:** ambiente necessário para desenvolver e compilar aplicações Java.
- **Projeto:** estrutura que organiza os arquivos e configurações de uma aplicação.
- **`src`:** diretório convencional para código-fonte.
- **Classe:** estrutura fundamental utilizada para organizar código Java.
- **`main`:** ponto de entrada de uma aplicação Java convencional.
- **`System.out.println()`:** imprime informações no console.
- **Run:** executa a aplicação através da IDE.

---

# 🧠 Modelo mental

A utilização da IDE pode ser representada assim:

```text
              Desenvolvedor
                    ↓
             IntelliJ IDEA
                    ↓
              Código Java
                    ↓
                  JDK
                    ↓
             Compilação
                    ↓
                Bytecode
                    ↓
                  JVM
                    ↓
                Execução
```

A IDE facilita o processo, mas os conceitos fundamentais de Java continuam os mesmos.

---

# 💡 Principal aprendizado

O IntelliJ IDEA fornece um ambiente integrado para escrever, organizar, compilar e executar programas Java.

Neste primeiro projeto, o objetivo é simplesmente confirmar que o ambiente está funcionando:

```text
Criar projeto
     ↓
Criar classe
     ↓
Criar método main
     ↓
Escrever código
     ↓
Executar
     ↓
Hello World!
```

A partir desse ponto, podemos utilizar a IDE para desenvolver os exercícios de lógica das próximas aulas.

---

## 🚀 Próxima aula

**Aula 10 — Valores Literais + Exercícios**