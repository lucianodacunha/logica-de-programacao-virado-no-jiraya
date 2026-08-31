# Lógica de Programação - Virado no Jiraya

# Aula 37 — Criando e Manipulando Arrays

## 📚 Sobre a aula

Nesta aula começamos a trabalhar com **arrays (vetores) na prática em Java**.

O exemplo utilizado é o armazenamento das notas de um aluno. Inicialmente, podemos imaginar uma solução utilizando várias variáveis:

```java
double nota1 = 7.5;
double nota2 = 8;
double nota3 = 3;
```

Porém, essa abordagem se torna pouco prática quando a quantidade de valores aumenta.

O array permite armazenar vários valores do mesmo tipo utilizando **uma única variável**, tornando o código mais organizado e facilitando operações sobre todos os elementos.

---

## 🎯 O problema das variáveis individuais

Imagine que precisamos armazenar quatro notas:

```text id="4k3qz1"
nota1
nota2
nota3
nota4
```

Além de exigir várias declarações, qualquer operação sobre todas as notas precisa ser escrita individualmente.

Por exemplo, para calcular a média:

```java id="6m1p8v"
double media = (nota1 + nota2 + nota3 + nota4) / 4;
```

Se uma nova nota for adicionada, será necessário alterar o código.

Com um array, podemos concentrar essas notas em uma única estrutura e posteriormente percorrê-las para realizar cálculos de maneira mais flexível.

---

# 📦 Declaração de um Array

A declaração segue a ideia:

```java id="x8q3v5"
tipo[] nome;
```

Por exemplo:

```java id="w7n2k9"
double[] notas;
```

Os `[]` indicam que `notas` será um **array de `double`**.

Uma convenção apresentada na aula é colocar os colchetes imediatamente após o tipo:

```java id="g5f1r8"
double[] notas;
```

Embora Java também permita outras formas de posicionamento dos colchetes, essa é a convenção recomendada apresentada na aula.

A leitura pode ser feita como:

```text id="z2m6q4"
double[] notas

"notas é um array de double"
```

---

## 📏 O tamanho do Array

Em Java, ao criar um array é necessário informar seu **tamanho**.

Por exemplo:

```java id="p9k4s2"
double[] notas = new double[4];
```

Nesse caso, estamos solicitando um array com:

```text id="v3x7m1"
4 posições
```

Podemos imaginá-lo assim:

```text id="n6q2w8"
+------+------+------+------+
|      |      |      |      |
+------+------+------+------+
   0      1      2      3
```

Temos **4 posições**, mas os índices vão de `0` até `3`.

---

## 🔢 Tamanho × Índice

Assim como apresentado na aula anterior, é fundamental não confundir **tamanho** com **índice**.

Para:

```java id="c5v8j3"
double[] notas = new double[4];
```

temos:

```text id="r7m2k9"
Tamanho: 4

Índices:
0
1
2
3
```

Portanto:

```text id="u4p6x1"
Tamanho = 4
Último índice = 3
```

A regra é:

```text id="f8n3q5"
último índice = tamanho - 1
```

Isso acontece porque os arrays em Java utilizam **indexação iniciada em zero**.

---

# 📍 Acessando posições

Para acessar uma posição específica, utilizamos o índice entre colchetes.

Por exemplo:

```java id="k2v7m4"
notas[0]
```

representa o primeiro elemento do array.

Já:

```java id="s8q1x6"
notas[1]
```

representa o segundo elemento.

E:

```java id="a5m9r2"
notas[3]
```

representa o quarto e último elemento de um array com tamanho `4`.

Podemos visualizar:

```text id="j4p8c1"
Índice      0      1      2      3
             ↓      ↓      ↓      ↓
           +------+------+------+------+
notas      |      |      |      |      |
           +------+------+------+------+
```

---

# 📝 Atribuindo valores

Depois de criar o array, podemos atribuir valores individualmente:

```java id="h7q3w9"
notas[0] = 7.5;
notas[1] = 8;
notas[2] = 3;
notas[3] = 6;
```

Cada instrução coloca um valor em uma posição específica.

Podemos imaginar:

```text id="r3m8v2"
Índice:
   0     1     2     3
   ↓     ↓     ↓     ↓
+-----+-----+-----+-----+
| 7.5 |  8  |  3  |  6  |
+-----+-----+-----+-----+
```

Para acessar os valores:

```java id="z1x6k4"
System.out.println(notas[0]);
System.out.println(notas[1]);
System.out.println(notas[2]);
System.out.println(notas[3]);
```

---

# 🧠 O que a variável representa?

Um ponto importante apresentado na aula é entender que:

```java id="q6v2n8"
double[] notas;
```

não representa uma única nota.

A variável `notas` faz referência ao **array inteiro**.

Podemos pensar:

```text id="m5r9x3"
notas
  ↓
+------+------+------+------+
|      |      |      |      |
+------+------+------+------+
```

Já:

```java id="e8p4k1"
notas[0]
```

representa uma posição específica dentro desse array.

Portanto:

```text id="t2q7w5"
notas       → array inteiro
notas[0]    → primeira posição
notas[1]    → segunda posição
notas[2]    → terceira posição
...
```

---

# 🖥️ Imprimindo o Array

Um detalhe importante demonstrado na aula é que:

```java id="v6n1p8"
System.out.println(notas);
```

não imprime diretamente os valores armazenados no array.

Isso acontece porque `notas` representa uma **referência para o array**, e não uma posição específica.

Para acessar um valor, precisamos indicar o índice:

```java id="b4x8m2"
System.out.println(notas[0]);
```

Assim estamos solicitando especificamente o conteúdo da posição `0`.

---

# 🔢 Valores padrão

Outro comportamento importante de Java apresentado na aula é que, quando criamos um array de tipos primitivos, suas posições são inicializadas automaticamente com **valores padrão**.

Por exemplo:

```java id="y3q7k1"
double[] notas = new double[4];
```

Antes de atribuirmos valores, as posições possuem:

```text id="p8m4v6"
0.0
0.0
0.0
0.0
```

Da mesma forma, os tipos primitivos possuem valores padrão correspondentes.

Entre os exemplos:

```text id="q5x2r9"
int      → 0
double   → 0.0
boolean  → false
```

O ponto importante para esta aula é que os elementos de um array de tipo primitivo são inicializados automaticamente pelo Java.

---

# ⚠️ Acessando uma posição inexistente

É necessário respeitar os limites do array.

Se criarmos:

```java id="m7k3p5"
int[] numeros = new int[4];
```

os índices válidos são:

```text id="s4q8n2"
0
1
2
3
```

Não existe o índice `4`.

Se tentarmos:

```java id="x1v6r9"
numeros[4]
```

o Java lançará uma exceção indicando que o índice está fora dos limites do array.

A exceção apresentada é:

```text id="f9m2q7"
ArrayIndexOutOfBoundsException
```

O conceito pode ser entendido como:

```text id="n5w8k3"
Array com 4 posições
       ↓
índices válidos: 0 a 3
       ↓
acessar índice 4
       ↓
índice fora dos limites
       ↓
exceção
```

---

# 🚨 O mesmo vale para atribuição

O problema não ocorre apenas ao tentar ler uma posição inexistente.

Também não podemos atribuir um valor a uma posição que não existe:

```java id="c7p2m8"
numeros[4] = 10;
```

Se o array possui apenas quatro posições, `numeros[4]` é inválido.

O tamanho determina quais índices podem ser utilizados.

---

# 🔄 Array como estrutura de dados

O array permite representar vários valores relacionados por meio de uma única variável.

Em vez de:

```java id="r4x9k2"
double nota1;
double nota2;
double nota3;
double nota4;
```

podemos ter:

```java id="w6m1q8"
double[] notas = new double[4];
```

E acessar individualmente:

```java id="h3v7p5"
notas[0]
notas[1]
notas[2]
notas[3]
```

Isso prepara o caminho para utilizar os **laços de repetição** sobre arrays, evitando escrever manualmente uma operação para cada posição.

---

## 🧠 Modelo mental

Uma boa maneira de visualizar um array é:

```text id="x8q4m1"
                  ARRAY
                    ↓
              variável notas
                    ↓
        +------+------+------+------+
        |      |      |      |      |
        +------+------+------+------+
          0      1      2      3
          ↑      ↑      ↑      ↑
        índice índice índice índice
```

Temos:

```text id="k5n9r3"
Tamanho → quantidade de posições
Índice  → identifica uma posição
Valor   → conteúdo daquela posição
```

Por exemplo:

```text id="j2p7v6"
notas[2] = 3.0
```

significa:

```text
notas
  ↓
posição de índice 2
  ↓
valor 3.0
```

---

## 🔑 Conceitos importantes

* **Array (vetor):** estrutura que armazena vários valores do mesmo tipo.
* **Declaração:** utiliza o tipo seguido de `[]`, como `double[]`.
* **`new`:** utilizado para criar o array.
* **Tamanho:** quantidade de posições existentes.
* **Índice:** identifica uma posição do array.
* **Indexação:** começa em `0`.
* **Primeiro índice:** `0`.
* **Último índice:** `tamanho - 1`.
* **Acesso:** realizado utilizando `array[indice]`.
* **Atribuição:** permite armazenar um valor em uma posição específica.
* **Valores padrão:** arrays de tipos primitivos são inicializados com valores padrão.
* **`ArrayIndexOutOfBoundsException`:** ocorre quando tentamos acessar um índice fora dos limites do array.

---

## 💡 Principal aprendizado

Nesta aula começamos a utilizar arrays efetivamente em Java.

A ideia fundamental é substituir várias variáveis individuais por uma única estrutura capaz de armazenar vários valores do mesmo tipo:

```java id="q9w3m7"
double[] notas = new double[4];
```

Essa estrutura possui:

```text id="v4p8x2"
4 posições
↓
índices 0, 1, 2 e 3
```

Os valores podem ser atribuídos e acessados utilizando os índices:

```java id="s6k1n5"
notas[0] = 7.5;
notas[1] = 8;
notas[2] = 3;
notas[3] = 6;
```

O ponto mais importante para fixar é:

```text id="m8r2q6"
TAMANHO = quantidade de posições

ÍNDICE = posição utilizada para acessar um elemento

O índice começa em 0.
```

Também é importante lembrar que **o array possui tamanho definido no momento de sua criação** e que tentar acessar uma posição inexistente resulta em uma exceção.

---

## 🚀 Próxima aula

**Manipulação e processamento dos valores armazenados em arrays**
