# Lógica de Programação — Virado no Jiraya

# Aula 41 — Arrays Multidimensionais e `for` Aninhado

## 📚 Sobre a aula

Nesta aula continuamos o estudo dos **arrays multidimensionais**, aprofundando o conceito apresentado anteriormente.

Primeiro é mostrado como funciona um array de **três dimensões** e, em seguida, como percorrer seus elementos utilizando **laços de repetição aninhados**.

A ideia principal é simples:

> **Cada dimensão adicional de um array exige mais um índice para acessar seus valores e, normalmente, mais um nível de repetição para percorrê-los.**

---

# 🔹 Revisão: Array bidimensional

Um array bidimensional pode ser representado como:

```java
int[][] numeros = new int[2][2];
```

Conceitualmente:

```text
Array principal
   ↓
[ Array ][ Array ]
    ↓       ↓
 [ ][ ]   [ ][ ]
```

Para acessar um valor são necessários dois índices:

```java
numeros[i][j]
```

Por exemplo:

```text
numeros[0][0]
numeros[0][1]
numeros[1][0]
numeros[1][1]
```

O primeiro índice identifica uma estrutura interna e o segundo identifica uma posição dentro dela.

---

# 🔹 Array tridimensional

A aula amplia esse conceito para **três dimensões**.

A lógica continua exatamente a mesma: uma dimensão referencia outra, que referencia outra estrutura, até chegar ao nível final, onde estão armazenados os valores.

Podemos visualizar:

```text
Array
  ↓
Array
  ↓
Array
  ↓
Valores
```

Assim, um array tridimensional pode ser declarado como:

```java
int[][][] numeros = new int[2][2][2];
```

Nesse caso existem três dimensões:

```text
1ª dimensão → 2
2ª dimensão → 2
3ª dimensão → 2
```

A estrutura possui, portanto:

```text
2 × 2 × 2 = 8 valores
```

O princípio apresentado na aula é que cada nível adicional passa a referenciar uma nova estrutura até chegar ao último nível, que contém os valores do tipo definido.

---

# 📐 Mais dimensões = mais índices

No array de uma dimensão:

```java
numeros[i]
```

No array de duas dimensões:

```java
numeros[i][j]
```

No array de três dimensões:

```java
numeros[i][j][k]
```

Podemos visualizar a evolução:

```text
1 dimensão → [i]

2 dimensões → [i][j]

3 dimensões → [i][j][k]
```

Cada índice representa uma posição em uma determinada dimensão.

---

# 🔄 Percorrendo um array multidimensional

Para acessar todos os valores de um array bidimensional, utilizamos dois `for`.

Por exemplo:

```java
for (int i = 0; i < numeros.length; i++) {
    for (int j = 0; j < numeros[i].length; j++) {
        System.out.println(numeros[i][j]);
    }
}
```

O primeiro `for` percorre a primeira dimensão.

O segundo percorre o array interno correspondente.

Essa ideia é chamada de **laço de repetição aninhado**: um `for` está dentro de outro `for`.

---

# 🧩 `for` dentro de `for`

A lógica pode ser representada assim:

```text
FOR i
 ├── FOR j
 │    ├── valor
 │    ├── valor
 │    └── valor
 │
 └── próximo i
```

O `for` externo controla a primeira dimensão.

O `for` interno percorre completamente a segunda dimensão antes que o `for` externo avance para a próxima posição.

---

# 🔢 Percorrendo três dimensões

Para um array tridimensional:

```java
int[][][] numeros = new int[2][2][2];
```

precisamos de três níveis de repetição:

```java
for (int i = 0; i < numeros.length; i++) {
    for (int j = 0; j < numeros[i].length; j++) {
        for (int k = 0; k < numeros[i][j].length; k++) {
            System.out.println(numeros[i][j][k]);
        }
    }
}
```

A relação fica:

```text
i → primeira dimensão
j → segunda dimensão
k → terceira dimensão
```

Ou:

```text
[i][j][k]
```

---

# 📏 Usando `length`

Um ponto importante é que não devemos simplesmente assumir que todas as dimensões possuem o mesmo tamanho.

O `length` permite descobrir o tamanho da estrutura que estamos percorrendo.

No primeiro nível:

```java
numeros.length
```

No segundo:

```java
numeros[i].length
```

No terceiro:

```java
numeros[i][j].length
```

Essa forma é mais segura e representa corretamente a estrutura que está sendo percorrida.

---

# 🧠 A importância do escopo dos índices

Assim como estudamos anteriormente, as variáveis utilizadas nos `for` possuem escopo.

Podemos ter:

```java
for (int i = 0; ... ) {
    
    for (int j = 0; ... ) {
        
        for (int k = 0; ... ) {
            
        }
    }
}
```

Nesse caso:

```text
i → controla a primeira dimensão
j → controla a segunda dimensão
k → controla a terceira dimensão
```

Cada variável existe dentro do escopo correspondente ao seu bloco.

---

# 🔍 Entendendo a execução

Considere:

```java
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 2; k++) {
            System.out.println(numeros[i][j][k]);
        }
    }
}
```

A execução pode ser entendida aproximadamente assim:

```text
i = 0
 ├── j = 0
 │    ├── k = 0
 │    └── k = 1
 │
 └── j = 1
      ├── k = 0
      └── k = 1

i = 1
 ├── j = 0
 │    ├── k = 0
 │    └── k = 1
 │
 └── j = 1
      ├── k = 0
      └── k = 1
```

O `for` mais interno é executado completamente para cada combinação das dimensões externas.

---

# 🧱 Relação entre dimensões e `for`

Existe uma correspondência bastante importante:

```text
Array de 1 dimensão
        ↓
      1 for

Array de 2 dimensões
        ↓
    2 for aninhados

Array de 3 dimensões
        ↓
    3 for aninhados
```

Generalizando:

```text
N dimensões
     ↓
N níveis de acesso
     ↓
N níveis de repetição
```

Essa é uma maneira prática de visualizar como percorrer arrays multidimensionais.

---

# 💾 Estrutura na memória

O conceito fica mais claro quando lembramos que os arrays multidimensionais são formados por referências.

Em uma estrutura tridimensional:

```text
array
 ↓
arrays
 ↓
arrays
 ↓
valores
```

A primeira dimensão referencia estruturas da segunda dimensão.

A segunda referencia estruturas da terceira.

A terceira contém os valores finais.

Por isso precisamos utilizar:

```java
[i][j][k]
```

para chegar ao valor.

A aula reforça essa representação como uma alternativa à explicação tradicional utilizando matrizes, pois ela evidencia melhor a relação entre as estruturas e suas referências.

---

# 🛠️ Preenchendo um array multidimensional

A mesma lógica utilizada para percorrer os valores pode ser utilizada para preenchê-los.

Por exemplo:

```java
for (int i = 0; i < numeros.length; i++) {
    for (int j = 0; j < numeros[i].length; j++) {
        for (int k = 0; k < numeros[i][j].length; k++) {
            numeros[i][j][k] = 10;
        }
    }
}
```

Cada combinação de índices representa uma posição diferente do array.

---

# ⚠️ Arrays multidimensionais no Java

A aula também faz uma observação importante sobre o uso desses arrays.

Embora seja fundamental compreender como eles funcionam, **arrays multidimensionais não são algo que será utilizado constantemente no desenvolvimento Java cotidiano**.

Na prática, estruturas como **classes e coleções da linguagem Java** são frequentemente mais adequadas para representar dados complexos.

Por isso, o conhecimento de arrays continua sendo importante principalmente para:

* compreender os fundamentos da linguagem;
* resolver exercícios de lógica;
* trabalhar com determinados tipos de dados;
* enfrentar questões de entrevistas técnicas.

---

# 🔑 Conceitos importantes

* **Array multidimensional:** estrutura com mais de uma dimensão.
* **Array bidimensional:** possui dois níveis de índices.
* **Array tridimensional:** possui três níveis de índices.
* **Referência:** uma dimensão pode referenciar outra estrutura de array.
* **Índice:** identifica a posição dentro de uma determinada dimensão.
* **`length`:** informa o tamanho da dimensão que está sendo acessada.
* **`for` aninhado:** um laço de repetição dentro de outro.
* **Escopo:** determina onde as variáveis dos laços podem ser utilizadas.
* **Dimensões:** cada nova dimensão adiciona um índice à expressão de acesso.

---

# 💡 Principal aprendizado

O ponto central desta aula é compreender a relação entre **dimensões, índices e laços de repetição**.

Para um array tridimensional:

```java
numeros[i][j][k]
```

temos:

```text
i → dimensão 1
j → dimensão 2
k → dimensão 3
```

E, para percorrê-lo:

```text
for i
 └── for j
      └── for k
```

Ou seja:

> **A quantidade de dimensões do array determina a quantidade de índices necessários para acessar um valor e, normalmente, a quantidade de `for` aninhados necessária para percorrê-lo.**

Esse padrão é importante porque aparece em diversos problemas de programação, mesmo quando a estrutura de dados utilizada posteriormente não for um array.

---

# 🚀 Fechamento do tópico

Com esta aula, o conceito de arrays multidimensionais fica completo:

```text
Array
 ├── 1 dimensão
 │    └── [i]
 │
 ├── 2 dimensões
 │    └── [i][j]
 │
 └── 3 dimensões
      └── [i][j][k]
```

E a relação com os laços:

```text
1 dimensão → 1 for
2 dimensões → 2 for
3 dimensões → 3 for
```

O mais importante neste momento não é decorar estruturas tridimensionais, mas entender **como uma estrutura pode conter referências para outras estruturas e como os índices permitem navegar por seus níveis**.

Esse raciocínio será útil posteriormente ao trabalhar com estruturas de dados mais sofisticadas.
