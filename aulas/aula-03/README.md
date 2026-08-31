# Lógica de Programação - Virado no Jiraya

# Aula 03 — Como Java Funciona

## 📚 Sobre a aula

Nesta aula é apresentado o funcionamento básico do **Java** e os motivos pelos quais a linguagem consegue executar o mesmo programa em diferentes sistemas operacionais.

O professor retoma rapidamente os conceitos de linguagens de baixo e alto nível e apresenta a arquitetura básica que envolve:

- Sistema Operacional;
- Java;
- JVM;
- JDK;
- código-fonte;
- compilação;
- bytecode;
- execução.

O objetivo não é aprofundar Java neste momento, mas compreender **como a linguagem funciona por baixo do código que será escrito durante o curso de lógica**.

---

## ☕ Por que utilizar Java no curso?

O curso de lógica será baseado em Java.

O professor apresenta alguns motivos para essa escolha:

- Java é bastante utilizada no mercado de trabalho;
- existem muitas oportunidades profissionais relacionadas à linguagem;
- existe uma sequência posterior de estudos dedicada especificamente a Java;
- Java permite que os conceitos de lógica sejam praticados utilizando uma linguagem de programação real.

Entretanto, o ponto mais importante destacado é:

> O objetivo principal é aprender os conceitos básicos de como funciona um algoritmo.

A linguagem utilizada é uma ferramenta para colocar esses conceitos em prática.

---

## 🖥️ Sistema Operacional

O **Sistema Operacional (SO)** é apresentado como um programa responsável por gerenciar os recursos do computador.

Entre esses recursos estão:

- CPU;
- memória;
- discos;
- rede;
- dispositivos;
- placa de vídeo;
- outros componentes de hardware.

Exemplos de sistemas operacionais apresentados:

- Windows;
- macOS;
- Linux.

O sistema operacional atua como uma camada responsável por gerenciar o hardware e fornecer os recursos necessários para a execução dos programas.

```text
Aplicações
     ↓
Sistema Operacional
     ↓
Hardware
```

---

## 🐧 Sistemas Operacionais

A aula apresenta algumas diferenças entre os sistemas operacionais.

No caso do Linux, são mencionadas diferentes distribuições, como:

- Ubuntu;
- Fedora;
- CentOS.

As distribuições possuem diferentes características e propósitos, podendo ser direcionadas para usuários finais ou para servidores.

Também é apresentada a diferença entre sistemas com **código fechado** e sistemas **open source**.

Windows e macOS são apresentados como sistemas cujo núcleo não é disponibilizado da mesma forma que o Linux, enquanto o Linux possui seu código aberto e conta com participação de comunidades de desenvolvedores.

---

## 💻 32 bits e 64 bits

A aula apresenta também a diferença entre sistemas de **32 bits e 64 bits**.

Essa informação será importante posteriormente durante a instalação do Java, pois é necessário escolher uma versão compatível com o sistema operacional.

De maneira geral, a versão de 64 bits permite trabalhar com maior quantidade de memória.

Ao realizar uma instalação, termos como:

```text
32 bits
x86
64 bits
x64
```

podem indicar a arquitetura correspondente.

---

## 🌎 O problema da dependência do Sistema Operacional

Uma aplicação tradicional pode depender do sistema operacional para o qual foi desenvolvida.

Por exemplo, um programa desenvolvido especificamente para Windows pode não funcionar diretamente em outro sistema operacional.

Nesse cenário, seria necessário utilizar mecanismos adicionais, como virtualização ou emulação, para executar aquele ambiente em outro sistema.

A proposta do Java foi justamente diminuir esse problema.

---

## ☕ O princípio do Java

Um dos princípios fundamentais apresentados para o Java é:

> **"Write once, run anywhere"**

Ou seja:

> Escreva uma vez e execute em qualquer lugar.

A ideia é que o programador escreva o código uma vez e possa executá-lo em diferentes sistemas operacionais.

Para isso, o Java utiliza uma camada intermediária:

```text
Programa Java
      ↓
     JVM
      ↓
Sistema Operacional
      ↓
Hardware
```

A JVM funciona como uma camada que se comunica com o sistema operacional.

---

## ⚙️ JVM — Java Virtual Machine

**JVM** significa:

> **Java Virtual Machine**

A JVM é responsável por executar o programa Java compilado.

Ela funciona como uma camada entre o programa e o sistema operacional.

```text
Código Java
     ↓
Bytecode
     ↓
JVM
     ↓
Sistema Operacional
```

Existe uma JVM apropriada para cada plataforma.

Assim, o mesmo bytecode pode ser executado em diferentes sistemas, desde que exista uma JVM compatível com aquele sistema operacional.

```text
                 Bytecode
                    ↓
          ┌─────────┼─────────┐
          ↓         ↓         ↓
        JVM       JVM       JVM
       Windows    Linux     macOS
```

---

## 📝 Código-fonte Java

Um programa Java é escrito em um arquivo com extensão:

```text
.java
```

Por exemplo:

```text
Programa.java
```

Esse arquivo contém o código-fonte escrito pelo programador utilizando a linguagem Java.

Como Java é uma linguagem de alto nível, o código-fonte é relativamente fácil de ser compreendido por seres humanos.

---

## 🔄 Compilação

A JVM não executa diretamente o código-fonte `.java`.

Antes da execução, o código precisa passar pelo processo de **compilação**.

```text
Programa.java
      ↓
  Compilação
      ↓
Programa.class
```

Durante a compilação, são realizadas diversas validações para verificar se o código segue as regras definidas pela linguagem Java.

Entre outras coisas, o compilador verifica se as instruções estão de acordo com a sintaxe e os padrões da linguagem.

---

## 📦 Bytecode

Após a compilação, é produzido um arquivo com extensão:

```text
.class
```

Por exemplo:

```text
Programa.class
```

Esse arquivo contém o **bytecode**.

O bytecode está em um nível mais próximo daquele que a JVM consegue processar do que o código-fonte Java.

```text
Código-fonte
   ↓
.java
   ↓
Compilador
   ↓
Bytecode
   ↓
.class
   ↓
JVM
```

---

## 🔗 Relação entre código Java, bytecode e JVM

O fluxo básico apresentado na aula é:

```text
Código-fonte Java
       ↓
    Programa.java
       ↓
     Compilação
       ↓
    Programa.class
       ↓
     Bytecode
       ↓
       JVM
       ↓
Sistema Operacional
       ↓
    Computador
```

Esse processo permite separar o código escrito pelo programador da plataforma onde ele será executado.

---

## 🌍 Executando em diferentes sistemas

Uma vez compilado, o bytecode pode ser executado em diferentes sistemas operacionais utilizando a JVM correspondente.

Por exemplo:

```text
                 Programa.class
                       ↓
          ┌────────────┼────────────┐
          ↓            ↓            ↓
       JVM Windows  JVM Linux   JVM macOS
          ↓            ↓            ↓
       Windows        Linux        macOS
```

O programa não precisa ser desenvolvido novamente para cada sistema operacional.

A JVM funciona como a camada responsável por fazer essa comunicação com a plataforma.

---

## 🛠️ JDK — Java Development Kit

**JDK** significa:

> **Java Development Kit**

É o kit utilizado para **desenvolver aplicações Java**.

O JDK possui ferramentas necessárias para o desenvolvimento, incluindo o compilador responsável por transformar arquivos `.java` em arquivos `.class`.

```text
JDK
 ├── Compilador
 ├── Ferramentas de desenvolvimento
 └── Outros recursos
```

Durante o curso, o JDK será utilizado para desenvolver e compilar os programas Java.

---

## ▶️ JRE — Java Runtime Environment

A aula também diferencia o ambiente de desenvolvimento do ambiente necessário para executar aplicações.

A **JRE (Java Runtime Environment)** fornece o ambiente necessário para executar aplicações Java.

De forma simplificada:

```text
JDK
 ↓
Desenvolvimento
Compilação
Ferramentas
```

Enquanto:

```text
JRE
 ↓
Execução
```

A aula destaca que, para desenvolver, utilizamos o JDK. Para simplesmente executar uma aplicação já compilada, não é necessariamente necessário possuir o ambiente completo de desenvolvimento.

---

## 🧩 JDK × JRE × JVM

Podemos organizar os conceitos apresentados da seguinte forma:

```text
JDK
│
├── Ferramentas de desenvolvimento
│      └── Compilador
│
└── Ambiente necessário para trabalhar com Java
        │
        ↓
       JRE
        │
        ↓
       JVM
        │
        ↓
   Executa bytecode
```

> **Observação:** essa representação é uma simplificação didática compatível com o nível da aula.

---

## 🔑 Conceitos importantes

- **Java:** linguagem utilizada no curso para colocar em prática os conceitos de lógica.
- **Sistema Operacional:** gerencia os recursos do computador.
- **JVM:** Java Virtual Machine, responsável pela execução do bytecode.
- **JDK:** Java Development Kit, utilizado para desenvolvimento Java.
- **JRE:** Java Runtime Environment, ambiente destinado à execução.
- **`.java`:** arquivo contendo o código-fonte Java.
- **Compilação:** processo que transforma o código-fonte em bytecode.
- **`.class`:** arquivo produzido pela compilação.
- **Bytecode:** código intermediário executado pela JVM.
- **32/64 bits:** arquiteturas que devem ser consideradas durante a instalação de softwares como o Java.

---

## 🧠 Modelo mental

O funcionamento básico do Java apresentado nesta aula pode ser resumido assim:

```text
              Desenvolvedor
                    ↓
             Código Java
                    ↓
             Programa.java
                    ↓
               Compilação
                    ↓
             Programa.class
                    ↓
                Bytecode
                    ↓
                   JVM
                    ↓
           Sistema Operacional
                    ↓
                Hardware
```

A principal vantagem é que o código-fonte pode ser compilado uma vez e o bytecode pode ser executado em diferentes plataformas utilizando uma JVM adequada.

---

## 💡 Principal aprendizado

O ponto fundamental desta aula é compreender que **o Java utiliza uma camada intermediária para tornar seu código independente da plataforma de execução**.

O programador escreve:

```text
.java
```

O compilador transforma em:

```text
.class
```

O arquivo `.class` contém:

```text
Bytecode
```

E a:

```text
JVM
```

é responsável por executar esse bytecode no sistema operacional correspondente.

```text
.java
  ↓
Compilador
  ↓
.class
  ↓
Bytecode
  ↓
JVM
  ↓
Sistema Operacional
```

Esse é o funcionamento básico que será necessário compreender antes de começarmos a escrever nossos primeiros programas Java.

---

## 🚀 Próxima aula

**Aula 04 — Instalando Java**