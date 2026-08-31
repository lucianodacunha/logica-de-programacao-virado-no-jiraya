# Lógica de Programação — Virado no Jiraya

# Aula 42 — Exercício: Multiplicação da Diagonal Principal

## 📚 Sobre a aula

Esta aula encerra o tópico de **arrays** com um exercício envolvendo **matrizes (arrays bidimensionais)**.

O objetivo é elaborar um programa capaz de calcular a **multiplicação dos elementos da diagonal principal de uma matriz quadrada**.

A atividade reúne conceitos apresentados nas aulas anteriores:

* arrays multidimensionais;
* matrizes;
* índices;
* `for` aninhado;
* condições;
* variáveis acumuladoras;
* debug.

---

# 🎯 O exercício

O problema consiste em identificar os elementos pertencentes à **diagonal principal** de uma matriz quadrada e multiplicá-los.

Por exemplo:

```text id="7xk4m2"
+----+----+----+
| 12 |  5 |  7 |
+----+----+----+
|  8 | 15 |  3 |
+----+----+----+
|  2 |  9 | 16 |
+----+----+----+
```

A diagonal principal é formada pelos elementos:

```text id="9v1c8p"
12
15
16
```

Portanto, o cálculo será:

```text id="q4m7x2"
12 × 15 × 16
```

O exercício exige que o programa encontre esses elementos automaticamente, utilizando os índices da matriz.

---

# 📐 O que é a diagonal principal?

Em uma matriz quadrada, a **diagonal principal** vai do canto superior esquerdo ao canto inferior direito.

Visualmente:

```text id="r8n2k5"
[ X ][   ][   ]
[   ][ X ][   ]
[   ][   ][ X ]
```

Os elementos da diagonal principal possuem uma característica importante:

```text id="5wq3j7"
linha == coluna
```

Ou seja:

```text id="m1x9p4"
[0][0]
[1][1]
[2][2]
...
```

Esse padrão será justamente utilizado para resolver o exercício.

---

# 🔢 Relação entre os índices

Considere uma matriz:

```java id="8c4vqn"
int[][] matriz = {
    {12, 5, 7},
    {8, 15, 3},
    {2, 9, 16}
};
```

Os índices são:

```text id="x7q2m8"
[0][0] → 12
[0][1] → 5
[0][2] → 7

[1][0] → 8
[1][1] → 15
[1][2] → 3

[2][0] → 2
[2][1] → 9
[2][2] → 16
```

A diagonal principal é:

```text id="f3n8w1"
[0][0]
[1][1]
[2][2]
```

Perceba o padrão:

```text id="a6k2p9"
i = 0 → j = 0
i = 1 → j = 1
i = 2 → j = 2
```

Portanto:

```text id="z5r7v3"
i == j
```

é a condição que identifica os elementos da diagonal principal.

---

# 🔄 Utilizando `for` aninhado

Como estamos trabalhando com uma matriz, podemos utilizar dois `for`:

```java id="c9m4x7"
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        // processamento
    }
}
```

O primeiro `for` percorre as linhas.

O segundo percorre as colunas.

A estrutura pode ser visualizada como:

```text id="p8w3k1"
FOR i
 └── FOR j
      └── matriz[i][j]
```

Esse é o mesmo conceito apresentado na aula anterior para percorrer arrays multidimensionais.

---

# 🎯 Identificando a diagonal

Dentro dos `for`, podemos verificar:

```java id="v2q6m8"
if (i == j) {
    // elemento pertence à diagonal principal
}
```

Isso significa:

> Se o índice da linha for igual ao índice da coluna, estamos diante de um elemento da diagonal principal.

Exemplo:

```text id="6xk4r9"
i = 0, j = 0 → 0 == 0 → diagonal

i = 0, j = 1 → 0 != 1 → não

i = 0, j = 2 → 0 != 2 → não

i = 1, j = 0 → 1 != 0 → não

i = 1, j = 1 → 1 == 1 → diagonal
```

E assim por diante.

---

# ✖️ Calculando a multiplicação

Precisamos de uma variável para armazenar o resultado acumulado.

A ideia é:

```text id="j5m9v2"
resultado inicial
       ↓
multiplica pelo primeiro elemento
       ↓
multiplica pelo segundo
       ↓
multiplica pelo terceiro
       ↓
resultado final
```

Por exemplo:

```java id="q8x1c6"
int resultado = 1;
```

Depois:

```java id="w3r7m4"
resultado = resultado * matriz[i][j];
```

Quando `i == j`, o valor da diagonal é incorporado ao resultado.

O valor inicial `1` é importante porque estamos realizando uma **multiplicação**.

Assim:

```text id="n2v8k5"
1 × 12 = 12
12 × 15 = 180
180 × 16 = 2880
```

---

# 🧠 Por que começar com `1`?

Para uma operação de soma, normalmente utilizamos:

```java id="s6p3x9"
int soma = 0;
```

porque:

```text id="r4m8q2"
0 + X = X
```

Para uma multiplicação, utilizamos:

```java id="k7v1c5"
int resultado = 1;
```

porque:

```text id="m9x2w6"
1 × X = X
```

Se começássemos com `0`:

```text id="z3q8p4"
0 × 12 = 0
```

e o resultado permaneceria `0`.

Portanto:

```text id="7n5m1x"
Soma → começa em 0

Multiplicação → começa em 1
```

---

# 🧩 Estrutura da solução

A lógica pode ser organizada da seguinte maneira:

```java id="c2v7m9"
int resultado = 1;

for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        if (i == j) {
            resultado *= matriz[i][j];
        }
    }
}
```

O processamento ocorre assim:

```text id="p4x8k2"
Percorre matriz
      ↓
verifica i == j
      ↓
sim → elemento pertence à diagonal
      ↓
multiplica pelo resultado acumulado
      ↓
continua percorrendo
```

---

# 🔍 Debug como ferramenta de aprendizado

Durante a resolução, o professor utiliza **breakpoints e execução passo a passo** para verificar o comportamento do programa.

Essa abordagem permite observar:

```text id="q7m2x5"
i
j
matriz[i][j]
resultado
```

a cada iteração.

O debug ajuda a responder perguntas como:

* Qual é o valor atual de `i`?
* Qual é o valor atual de `j`?
* Estamos em uma posição da diagonal?
* Qual valor está sendo multiplicado?
* Qual é o resultado acumulado?

Essa prática é especialmente importante quando começamos a trabalhar com estruturas aninhadas.

---

# 🐛 Identificando um erro

Durante a implementação, ocorre um erro relacionado ao fato de utilizar uma **variável de resultado**, mas não acessar corretamente o valor correspondente da matriz.

A depuração permite identificar que o cálculo precisa utilizar:

```java id="d8k4p1"
matriz[i][j]
```

e não apenas a variável que representa o resultado.

Esse tipo de erro demonstra uma situação bastante comum durante o desenvolvimento:

```text id="m5v9x2"
Código parece correto
        ↓
Resultado inesperado
        ↓
Executar com Debug
        ↓
Observar valores
        ↓
Encontrar erro na lógica
        ↓
Corrigir
```

O debug, portanto, não serve apenas para encontrar erros de sintaxe. Ele também ajuda a descobrir **erros de lógica**.

---

# 📊 Matriz quadrada

O exercício utiliza uma **matriz quadrada**, ou seja, uma matriz que possui a mesma quantidade de linhas e colunas.

Exemplo:

```text id="x2q7m8"
3 × 3
```

ou:

```text id="v6k1r4"
4 × 4
```

A propriedade de ser quadrada facilita a identificação da diagonal principal, pois existe uma correspondência direta entre os índices:

```text id="n8p3w5"
[0][0]
[1][1]
[2][2]
...
```

---

# 🧠 Uma observação importante sobre a solução

O exercício poderia ser resolvido de outras maneiras.

Como sabemos que a diagonal principal ocorre quando:

```text id="h4x9m2"
i == j
```

é possível desenvolver uma solução que não precise percorrer todas as posições da matriz.

Porém, o objetivo do exercício neste momento é justamente **praticar arrays multidimensionais e `for` aninhados**.

Por isso, utilizar os dois laços é coerente com o conteúdo que está sendo estudado.

---

# 🔑 Conceitos importantes

* **Matriz:** representação bidimensional de dados.
* **Matriz quadrada:** possui o mesmo número de linhas e colunas.
* **Diagonal principal:** elementos que vão do canto superior esquerdo ao inferior direito.
* **Condição da diagonal principal:** `i == j`.
* **`for` aninhado:** permite percorrer linhas e colunas.
* **`matriz[i][j]`:** acessa um elemento específico.
* **Acumulador:** mantém o resultado entre as iterações.
* **Valor inicial da multiplicação:** `1`.
* **Debug:** permite acompanhar a execução passo a passo.
* **Breakpoint:** interrompe temporariamente a execução para inspeção dos valores.
* **Erro lógico:** programa executa, mas produz resultado incorreto.

---

# 💡 Principal aprendizado

O principal objetivo desta aula é consolidar o uso de **arrays multidimensionais em conjunto com laços de repetição e condições**.

A característica fundamental utilizada para encontrar a diagonal principal é:

```java id="q5x8m3"
i == j
```

E o acesso ao elemento correspondente é:

```java id="r7n2v6"
matriz[i][j]
```

Combinando os conceitos:

```java id="j3k9p1"
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        if (i == j) {
            resultado *= matriz[i][j];
        }
    }
}
```

temos uma solução capaz de localizar os elementos da diagonal principal e multiplicá-los.

Mais importante do que decorar o código é compreender o raciocínio:

```text id="w8m4q2"
índice da linha
      +
índice da coluna
      ↓
i == j
      ↓
diagonal principal
      ↓
matriz[i][j]
      ↓
multiplicação acumulada
```

---

# 🏁 Encerramento do tópico de Arrays

Com esta aula, encerramos o estudo de **arrays e arrays multidimensionais** dentro do curso.

A evolução do conteúdo foi:

```text id="k2v7x9"
Array
  ↓
Índices
  ↓
Acesso e atribuição
  ↓
for + Array
  ↓
Arrays correspondentes
  ↓
Arrays multidimensionais
  ↓
for aninhado
  ↓
Matrizes
  ↓
Processamento da diagonal principal
```

Esse conjunto de conhecimentos forma uma base importante para compreender estruturas de dados mais sofisticadas posteriormente.

A partir daqui, o mais importante é continuar praticando a lógica: **identificar a estrutura do problema, descobrir o padrão dos índices, escolher as condições necessárias e construir a solução passo a passo**.

## 🚀 Próxima etapa

**Encerramento do curso e orientação sobre os próximos passos após a conclusão da lógica de programação.**
