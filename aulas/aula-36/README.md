# Lógica de Programação - Virado no Jiraya

# Aula 36 — Introdução a Vetores (Arrays)

## 📚 Sobre a aula

Nesta aula é iniciado o último tópico do curso: **vetores**, também chamados de **arrays**.

Até aqui, os exemplos utilizaram principalmente variáveis simples, capazes de armazenar um único valor.

O problema surge quando precisamos armazenar **vários valores relacionados do mesmo tipo**.

Para isso, podemos utilizar um vetor.

> Na linguagem Java, o termo mais comum é **array**. Para pesquisas, é recomendado utilizar também o termo "vetores".

---

## 🔢 Variáveis simples

Até este momento, trabalhamos com variáveis primitivas que armazenam um único valor.

Por exemplo:

```java id="f4v7a2"
int idade = 25;
```

Podemos representar:

```text id="z9c2m4"
idade
  ↓
+-----+
| 25  |
+-----+
```

Se precisarmos armazenar várias idades utilizando apenas variáveis simples, teríamos que criar várias variáveis:

```java id="5zq7w3"
int idade1 = 12;
int idade2 = 25;
int idade3 = 30;
int idade4 = 6;
int idade5 = 10;
```

Isso funciona, mas se a quantidade de valores aumentar, a solução se torna trabalhosa.

---

## 🚨 O problema de muitas variáveis

Imagine que o sistema precise armazenar:

```text id="7yq2p5"
5 idades
10 idades
20 idades
100 idades
...
```

Criar manualmente uma variável para cada valor não é uma solução adequada.

Além disso, podemos nem saber antecipadamente quantos valores serão necessários.

Em vez de:

```text id="j1n6v4"
idade1
idade2
idade3
idade4
idade5
...
```

podemos ter uma única variável representando uma estrutura capaz de armazenar vários valores:

```text id="q4w8k1"
idades
  ↓
+----+----+----+----+----+----+----+----+----+
|    |    |    |    |    |    |    |    |    |
+----+----+----+----+----+----+----+----+----+
```

Essa estrutura é o **vetor (array)**.

---

## 📦 O que é um vetor?

Um vetor é uma estrutura que permite armazenar **vários valores do mesmo tipo**.

Em Java, quando criamos um array, definimos o tipo dos valores que ele poderá armazenar.

Por exemplo, um array de `int` armazenará valores inteiros:

```text id="y6w2r9"
int → array de inteiros
```

Um array de `double` armazenará valores do tipo `double`, e assim por diante.

Isso está relacionado ao fato de Java ser uma linguagem **fortemente tipada**.

---

## 🧱 Vetor como espaços de memória

Podemos imaginar um vetor como vários espaços de memória organizados em sequência:

```text id="j9f3s1"
idades

+----+----+----+----+----+----+----+----+----+
| 12 | 25 | 30 |  6 | 10 | 15 | 56 | 89 | ...|
+----+----+----+----+----+----+----+----+----+
```

Todos esses valores pertencem a uma única estrutura chamada:

```text id="a5p8u2"
idades
```

Em vez de criar uma variável diferente para cada idade, temos **uma variável que referencia o array**.

---

## 📏 Tamanho do vetor

Um vetor possui uma quantidade determinada de posições.

Por exemplo, se tivermos:

```text id="e8q4w7"
+----+----+----+----+----+----+----+----+----+
| 12 | 25 | 30 |  6 | 10 | 15 | 56 | 89 | ...|
+----+----+----+----+----+----+----+----+----+
```

e existirem **9 espaços**, dizemos que o tamanho do vetor é `9`.

Portanto:

> **Tamanho é a quantidade de espaços existentes no vetor.**

---

## 🔢 Índice

Para acessar cada posição do vetor, utilizamos um **índice**.

Um ponto extremamente importante é:

> **O índice de um array começa em `0`.**

Se o vetor possui 9 posições:

```text id="q5r2x8"
Índice:
   0    1    2    3    4    5    6    7    8
   ↓    ↓    ↓    ↓    ↓    ↓    ↓    ↓    ↓
+----+----+----+----+----+----+----+----+----+
| 12 | 25 | 30 |  6 | 10 | 15 | 56 | 89 | ...|
+----+----+----+----+----+----+----+----+----+
```

Temos:

```text id="k3y6p1"
Tamanho → 9 posições
Índices → 0 até 8
```

Portanto, o maior índice é sempre:

```text id="f8q1z4"
tamanho - 1
```

---

## ⚠️ Tamanho não é índice

Essa diferença é fundamental.

Se temos:

```text id="d7m4k2"
9 posições
```

os índices serão:

```text id="x2p6n8"
0 1 2 3 4 5 6 7 8
```

Logo:

```text id="n5r8c3"
Tamanho = 9
Último índice = 8
```

Não existe índice `9` nesse array.

É comum para quem está começando confundir:

```text
posição 9
```

com:

```text
índice 9
```

Mas, como a contagem começa em `0`, a nona posição possui índice `8`.

---

## 📍 Acessando uma posição

O índice representa a posição que queremos acessar.

Por exemplo:

```text id="c3v7x1"
Índice 0 → 12
Índice 1 → 25
Índice 2 → 30
Índice 3 → 6
Índice 4 → 10
```

Portanto, se quisermos o valor armazenado no índice `4`, encontraremos:

```text id="w8q2m6"
10
```

O índice é, portanto, a forma utilizada para localizar um elemento dentro do array.

---

## 🧠 Índices começam em zero

A contagem tradicionalmente utilizada por nós é:

```text id="s7f4p2"
1 2 3 4 5 6 7 8 9
```

Em programação, os índices começam em:

```text id="r5x9k3"
0 1 2 3 4 5 6 7 8
```

Assim, um array com 9 posições possui:

```text id="n2v6h8"
9 posições
0 como primeiro índice
8 como último índice
```

Essa característica é extremamente importante para trabalhar corretamente com arrays.

---

## 🔄 Uma variável para vários valores

Uma das principais vantagens do array é permitir representar vários valores relacionados utilizando uma única variável.

Sem array:

```java id="j4k8q1"
int idade1;
int idade2;
int idade3;
int idade4;
int idade5;
```

Com array:

```text id="x6p2v9"
idades
   ↓
[12, 25, 30, 6, 10, ...]
```

Assim, uma única variável representa uma coleção de valores do mesmo tipo.

---

## 🧩 Tipo do array

O tipo definido para o array determina o tipo de valores que podem ser armazenados nele.

Por exemplo, conceitualmente:

```text id="u3f7m2"
array de int
     ↓
inteiros
```

Se tivermos um array de `int`, não podemos utilizá-lo para armazenar valores de outro tipo incompatível.

A definição do tipo faz parte do sistema de tipagem do Java.

---

## 🧠 Modelo mental

Podemos imaginar um array como uma sequência de caixas:

```text id="p9w4k6"
             ARRAY
               ↓
+-------+-------+-------+-------+-------+
| índice| índice| índice| índice| índice|
|   0   |   1   |   2   |   3   |   4   |
+-------+-------+-------+-------+-------+
| valor | valor | valor | valor | valor |
+-------+-------+-------+-------+-------+
```

A variável representa o array inteiro, enquanto o índice permite localizar um elemento específico.

```text id="a1s5d8"
idades
   ↓
array
   ↓
índice
   ↓
valor
```

---

## 🔑 Conceitos importantes

* **Vetor:** estrutura que permite armazenar vários valores.
* **Array:** termo utilizado em Java para representar essa estrutura.
* **Tipo:** determina o tipo de valores que o array pode armazenar.
* **Tamanho:** quantidade de posições existentes no array.
* **Índice:** identifica uma posição dentro do array.
* **Índice inicial:** sempre `0`.
* **Último índice:** corresponde ao tamanho menos `1`.
* **Variável de referência:** permite trabalhar com o array como uma única estrutura.

---

## 💡 Principal aprendizado

O principal objetivo desta aula é entender **por que os arrays existem e como devemos pensar sobre eles**.

Em vez de criar:

```text id="r2k6v9"
idade1
idade2
idade3
idade4
idade5
...
```

podemos utilizar:

```text id="h7p3x5"
idades
   ↓
[12, 25, 30, 6, 10, ...]
```

O array permite armazenar vários valores relacionados em uma única estrutura.

O conceito fundamental pode ser resumido assim:

```text id="m4q8z1"
ARRAY
  ↓
vários valores
  ↓
mesmo tipo
  ↓
cada valor possui um índice
  ↓
índice começa em 0
```

Também é essencial diferenciar:

```text id="c6n2v7"
TAMANHO ≠ ÍNDICE

Tamanho = quantidade de posições
Índice  = posição utilizada para acessar um valor
```

---

## 🚀 Próxima aula

**Criação e utilização de vetores (arrays) em Java**
