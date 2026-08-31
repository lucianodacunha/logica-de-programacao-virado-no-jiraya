# Lógica de Programação - Virado no Jiraya

# Aula 13 — Estruturas Condicionais: `if` e `else`

## 📚 Sobre a aula

Nesta aula é feita uma revisão dos principais conceitos estudados até o momento e, posteriormente, são introduzidas as **estruturas condicionais**.

As condicionais permitem que um programa tome decisões com base em determinadas condições.

O conceito é fundamental para a programação, pois grande parte dos programas precisa decidir qual caminho seguir dependendo dos dados recebidos ou do estado atual da aplicação.

---

# 🔄 Revisão dos conceitos

Antes de iniciar as condicionais, a aula revisa alguns conceitos importantes.

---

## 🧮 Algoritmos

Um algoritmo representa uma sequência de instruções utilizadas para resolver um determinado problema.

Existem diferentes formas de representar algoritmos e diferentes paradigmas de programação.

Neste curso estamos utilizando Java, uma linguagem que trabalha com o paradigma de **Programação Orientada a Objetos**.

---

# ☕ Classes Java

Java possui convenções para a criação e nomenclatura de classes.

Os nomes das classes normalmente começam com letra maiúscula.

Exemplo:

```java
public class Calculadora {
    
}
```

Quando o nome possui várias palavras, cada palavra começa com letra maiúscula:

```java
CalculadoraDiferencaIdade
```

Essa convenção é conhecida como **PascalCase**.

---

# ▶️ Método `main`

O método:

```java
public static void main(String[] args)
```

é o ponto de entrada de uma aplicação Java convencional.

Quando a aplicação é executada pela JVM, ela procura esse método para iniciar a execução do programa.

Podemos representar:

```text
JVM
 ↓
main()
 ↓
Execução do programa
```

---

# 🔢 Tipos de dados

A aula também revisa os tipos de dados estudados anteriormente.

Java possui **oito tipos primitivos**:

```text
byte
short
int
long
float
double
char
boolean
```

Além deles, trabalhamos com:

```java
String
```

que é utilizada para representar sequências de caracteres.

---

## 📊 Categorias

Podemos organizar os tipos da seguinte maneira:

```text
Tipos primitivos
│
├── Inteiros
│   ├── byte
│   ├── short
│   ├── int
│   └── long
│
├── Ponto flutuante
│   ├── float
│   └── double
│
├── Caractere
│   └── char
│
└── Lógico
    └── boolean
```

E:

```text
String
 ↓
Sequência de caracteres
```

---

# ✔️ `boolean`

O tipo `boolean` representa um valor lógico.

Ele possui apenas dois estados:

```java
true
false
```

Exemplo:

```java
boolean condicao = true;
```

Esse tipo será especialmente importante para trabalhar com estruturas condicionais.

---

# 🧠 O que são condicionais?

Uma condicional permite que o programa **tome uma decisão**.

Na vida cotidiana estamos constantemente tomando decisões baseadas em condições.

Por exemplo:

```text
Se não vier nenhum carro,
    atravesse a rua.
```

Ou:

```text
Se o ônibus parar,
    entre no ônibus.
Senão,
    espere o próximo.
```

Em programação, podemos representar esse tipo de lógica através de estruturas condicionais.

---

# 🔀 Condições

Uma condição produz apenas dois resultados possíveis:

```text
true
false
```

Ou:

```text
verdadeiro
falso
```

Não existe uma terceira possibilidade para uma expressão booleana.

Podemos representar:

```text
           Condição
              │
        ┌─────┴─────┐
        ↓           ↓
     true         false
        │           │
     caminho      caminho
        A           B
```

Esse conceito será utilizado para determinar qual trecho do programa deverá ser executado.

---

# 🟢 Estrutura `if`

A primeira estrutura condicional apresentada é:

```java
if
```

A sintaxe básica é:

```java
if (condição) {

    // código executado
}
```

A condição deve resultar em:

```text
true
```

ou:

```text
false
```

---

## 🧩 Exemplo simples

```java
boolean condicao = true;

if (condicao) {
    System.out.println("Dentro do if");
}

System.out.println("Fora do if");
```

Como:

```java
condicao = true;
```

o bloco do `if` será executado.

Resultado:

```text
Dentro do if
Fora do if
```

---

# 🔴 Quando a condição é `false`

Agora:

```java
boolean condicao = false;

if (condicao) {
    System.out.println("Dentro do if");
}

System.out.println("Fora do if");
```

Nesse caso, o bloco do `if` não será executado.

Resultado:

```text
Fora do if
```

O programa simplesmente passa pelo bloco e continua sua execução.

---

# 🧱 Bloco de código

O código associado ao `if` é delimitado por chaves:

```java
if (condicao) {

    // bloco do if

}
```

Tudo que estiver dentro das chaves pertence ao bloco do `if`.

Podemos ter várias instruções:

```java
if (condicao) {

    System.out.println("Linha 1");
    System.out.println("Linha 2");
    System.out.println("Linha 3");

}
```

Se a condição for verdadeira, todas as instruções do bloco serão executadas.

---

# 🔄 Fluxo de execução

O Java executa as instruções de maneira sequencial, mas uma estrutura condicional pode alterar o caminho da execução.

```text
Início
  ↓
Avaliar condição
  ↓
┌───────────────┐
│ true ou false │
└───────┬───────┘
        │
   ┌────┴────┐
   ↓         ↓
 true      false
   ↓         ↓
executa    pula
 bloco     bloco
   │         │
   └────┬────┘
        ↓
  continua execução
```

---

# 🔵 Estrutura `else`

O `else` permite definir uma **segunda alternativa**.

A estrutura básica é:

```java
if (condicao) {

    // executado se for true

} else {

    // executado se for false

}
```

Podemos interpretar como:

```text
SE condição for verdadeira
    execute bloco A
SENÃO
    execute bloco B
```

---

# 🧩 Exemplo com `if` e `else`

```java
boolean condicao = true;

if (condicao) {

    System.out.println("Condição verdadeira");

} else {

    System.out.println("Condição falsa");

}
```

Como a condição é:

```java
true
```

será executado:

```text
Condição verdadeira
```

O bloco do `else` não será executado.

---

# 🔄 Quando a condição é falsa

Se alterarmos:

```java
boolean condicao = false;
```

teremos:

```text
Condição falsa
```

Nesse caso:

```text
if
 ↓
não executado

else
 ↓
executado
```

---

# ⚖️ `if` × `else`

Podemos visualizar a relação:

```text
              condição
                  │
          ┌───────┴───────┐
          ↓               ↓
        true            false
          ↓               ↓
       if                else
          ↓               ↓
      bloco A          bloco B
```

Portanto:

> Quando utilizamos `if` e `else`, um dos dois caminhos será executado.

Se o `if` for executado:

```text
else → não executa
```

Se o `if` não for executado:

```text
else → executa
```

---

# 🚦 Exemplo do cotidiano

Podemos transformar uma situação cotidiana em um algoritmo:

```text
Se o ônibus parar:
    entrar no ônibus
Senão:
    esperar o próximo ônibus
```

Em Java:

```java
if (onibusParou) {

    System.out.println("Entrar no ônibus");

} else {

    System.out.println("Esperar o próximo");

}
```

A variável:

```java
onibusParou
```

poderia ser um `boolean`.

---

# 💾 Condição utilizando uma variável

Uma condição pode utilizar o valor armazenado em uma variável.

Exemplo:

```java
boolean condicao = true;

if (condicao) {

    System.out.println("Executou o if");

}
```

Durante a execução, a JVM verifica o valor associado à variável:

```text
Memória
   ↓
condicao
   ↓
true
```

Então avalia:

```java
if (condicao)
```

Como o valor é `true`, o bloco é executado.

---

# 🔍 Debugger

A aula apresenta rapidamente o **debugger** do IntelliJ IDEA.

O debugger permite acompanhar a execução do programa passo a passo.

Para isso podemos utilizar um **breakpoint**.

---

## 🔴 Breakpoint

Um breakpoint indica ao programa que a execução deve ser interrompida naquele ponto durante o processo de depuração.

Podemos colocar um breakpoint em uma determinada linha do código.

Quando o programa chegar até aquele ponto:

```text
Execução
   ↓
Breakpoint
   ↓
⏸ Pausa
```

Podemos então analisar o estado atual da aplicação.

---

# 👣 Execução passo a passo

Durante o debug, podemos executar o programa linha por linha.

No IntelliJ IDEA, o atalho apresentado para avançar uma instrução é:

```text
F8
```

Isso permite observar como o programa percorre cada linha.

Por exemplo:

```text
Linha 1
   ↓
Linha 2
   ↓
Avaliação do if
   ↓
Entra no bloco
   ↓
Executa linha
   ↓
Continua
```

---

# 🔎 Visualizando variáveis no debugger

Durante o debug podemos observar os valores armazenados na memória.

Por exemplo:

```java
boolean condicao = true;
```

O debugger pode mostrar:

```text
condicao = true
```

Ao chegar ao:

```java
if (condicao)
```

podemos acompanhar a avaliação da condição e observar qual caminho será executado.

---

# 🧠 Modelo mental completo

O funcionamento de `if` e `else` pode ser resumido:

```text
                Programa
                    ↓
              Avalia condição
                    ↓
             ┌──────┴──────┐
             ↓             ↓
           true          false
             ↓             ↓
          executa        pula
             ↓             ↓
          bloco if     bloco else
             │             │
             └──────┬──────┘
                    ↓
            Continua programa
```

---

# 🔑 Conceitos importantes

- **Condicional:** estrutura utilizada para tomar decisões.
- **Condição:** expressão que resulta em `true` ou `false`.
- **`if`:** executa um bloco quando a condição é verdadeira.
- **`else`:** executa um bloco alternativo quando a condição do `if` é falsa.
- **Bloco de código:** conjunto de instruções delimitado por `{` e `}`.
- **`boolean`:** tipo utilizado para representar `true` ou `false`.
- **Breakpoint:** ponto em que o debugger interrompe a execução.
- **Debugger:** ferramenta utilizada para acompanhar a execução do programa.
- **F8:** atalho utilizado no IntelliJ para avançar a execução passo a passo.

---

# 💡 Principal aprendizado

Até aqui, os programas trabalhados eram essencialmente sequenciais:

```text
Instrução 1
    ↓
Instrução 2
    ↓
Instrução 3
    ↓
Instrução 4
```

Com as condicionais, o programa passa a ser capaz de **escolher caminhos diferentes**:

```text
             Condição
                 ↓
          ┌──────┴──────┐
          ↓             ↓
        true          false
          ↓             ↓
       caminho A     caminho B
```

O `if` permite executar um bloco somente quando uma condição é verdadeira.

O `else` fornece uma alternativa para quando essa condição for falsa.

Esse é um dos primeiros passos importantes para transformar um programa puramente sequencial em um programa capaz de **tomar decisões**.

---

## 🚀 Próxima aula

**Aula 14 — Operadores Relacionais e Condições**