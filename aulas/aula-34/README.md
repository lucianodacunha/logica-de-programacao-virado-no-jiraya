# Lógica de Programação - Virado no Jiraya

# Aula 34 — Exercícios com `for`

## 📚 Sobre a aula

Nesta aula o foco passa a ser a **prática com o laço `for`**.

Após aprender a estrutura do `for`, o objetivo agora é utilizá-la na resolução de problemas de lógica.

A aula trabalha dois exercícios:

1. apresentar os quadrados dos números inteiros de `15` até `200`;
2. apresentar a tabuada de um número.

A ideia central é reforçar a utilização do `for` para realizar **contagens e percorrer sequências de valores**.

---

## 🎯 Exercício 1 — Quadrados dos números de 15 até 200

O primeiro exercício propõe:

> Elaborar um programa que apresente os quadrados dos números inteiros existentes no intervalo de `15` até `200`.

Um número ao quadrado é obtido multiplicando o número por ele mesmo:

```text
n² = n × n
```

Por exemplo:

```text
15 × 15 = 225
16 × 16 = 256
17 × 17 = 289
```

Portanto, precisamos percorrer os números do intervalo e calcular o quadrado de cada um.

---

## 🔢 Utilizando o `for`

Como já conhecemos o `for`, podemos fazer a contagem:

```java id="5xwq2p"
for (int i = 15; i <= 200; i++) {
    System.out.println(i * i);
}
```

A estrutura pode ser entendida como:

```text id="r0q6n7"
i = 15
  ↓
i <= 200?
  ↓
sim → calcula i × i
  ↓
i++
  ↓
volta para a condição
  ↓
...
  ↓
i = 201
  ↓
201 <= 200 → false
  ↓
fim
```

O intervalo inclui o `200`, pois a condição utiliza:

```java id="hpr4w2"
i <= 200
```

---

## 🧮 Resultado

Os primeiros resultados serão:

```text id="1x7u0j"
15 × 15 = 225
16 × 16 = 256
17 × 17 = 289
18 × 18 = 324
...
```

O programa continua realizando o cálculo até chegar ao quadrado de `200`.

O exercício demonstra que não é necessário criar manualmente uma operação para cada número. O `for` automatiza a repetição.

---

## 🔎 Pesquisando quando não conhecemos um conceito

Durante a resolução, surge o conceito de **número quadrado perfeito**.

A aula apresenta uma prática importante: quando não conhecemos determinado conceito ou regra, podemos **pesquisar sua definição** antes de tentar implementar uma solução.

A definição pesquisada permite compreender que um número quadrado perfeito é obtido pelo produto de um número inteiro positivo por ele mesmo.

Exemplos:

```text id="n7a1rx"
1 × 1 = 1
2 × 2 = 4
3 × 3 = 9
4 × 4 = 16
5 × 5 = 25
```

No exercício, porém, não é necessário realizar uma verificação adicional para descobrir se os números são quadrados perfeitos. Basta calcular o quadrado dos valores do intervalo solicitado.

---

# 📊 Exercício 2 — Tabuada

O segundo exercício propõe:

> Elaborar um programa que apresente a tabuada de qualquer número.

A tabuada consiste em multiplicar um número por uma sequência de valores.

Por exemplo, para o número `5`:

```text id="u8q5n1"
5 × 1 = 5
5 × 2 = 10
5 × 3 = 15
5 × 4 = 20
5 × 5 = 25
5 × 6 = 30
5 × 7 = 35
5 × 8 = 40
5 × 9 = 45
5 × 10 = 50
```

A sequência utilizada vai de `1` até `10`.

---

## 🔢 Utilizando o `for` para a tabuada

O número da tabuada permanece **fixo**, enquanto o multiplicador varia de `1` até `10`.

Por exemplo:

```java id="6t3h3k"
int numero = 5;

for (int i = 1; i <= 10; i++) {
    System.out.println(numero * i);
}
```

Nesse caso:

```text id="8ky3wl"
numero = 5 → permanece fixo

i = 1 → 5 × 1
i = 2 → 5 × 2
i = 3 → 5 × 3
...
i = 10 → 5 × 10
```

O `for` é responsável por fazer a contagem, enquanto `numero` permanece com o valor escolhido.

---

## 🧠 Separando valor fixo e variável de iteração

Esse exercício ajuda a perceber uma diferença importante entre as variáveis:

```text id="q0v4px"
numero
   ↓
valor fixo da tabuada

i
   ↓
valor que varia de 1 até 10
```

Assim:

```java id="6x1p3a"
numero * i
```

representa:

```text id="6c2v8n"
valor fixo × valor da iteração
```

Essa ideia será importante em exercícios que envolvem **variáveis que permanecem constantes enquanto outra variável percorre uma sequência**.

---

## 🔄 Comparando os dois exercícios

Nos dois exercícios utilizamos o `for`, mas com objetivos diferentes.

### Quadrados

A variável percorre:

```text id="0xy9e3"
15 → 16 → 17 → ... → 200
```

E cada valor é multiplicado por ele mesmo:

```text id="u9i1ik"
i × i
```

### Tabuada

O número da tabuada permanece fixo:

```text id="b8n3w1"
numero = 5
```

Enquanto o contador percorre:

```text id="7v4p2k"
1 → 2 → 3 → ... → 10
```

E realizamos:

```text id="x8s2ra"
numero × i
```

---

## 🧠 Modelo mental

O padrão utilizado nos exercícios pode ser resumido como:

```text id="5tq5r7"
        FOR
         ↓
   inicializa contador
         ↓
   verifica condição
         ↓
      executa cálculo
         ↓
      incrementa
         ↓
   verifica novamente
         ↓
        ...
```

No exercício da tabuada:

```text id="g9x7k2"
número fixo
     ↓
multiplica por
     ↓
1 → 2 → 3 → ... → 10
```

---

## 🔑 Conceitos importantes

* **`for`:** utilizado para realizar repetições e contagens.
* **Variável de iteração:** percorre os valores definidos pelo `for`.
* **Quadrado de um número:** resultado da multiplicação do número por ele mesmo.
* **Tabuada:** sequência de multiplicações de um número por valores de `1` a `10`.
* **Valor fixo:** variável que permanece com o mesmo valor durante as iterações.
* **Intervalo:** conjunto de valores percorrido pelo contador.
* **`i++`:** incrementa o contador em `1`.

---

## 💡 Principal aprendizado

O principal aprendizado desta aula é perceber que o `for` começa a se tornar uma **ferramenta para resolver problemas**, e não apenas uma estrutura que imprime números.

Nos exercícios, ele é utilizado para:

```text id="f4l0dc"
PERCORRER UM INTERVALO
        ↓
EXECUTAR UM CÁLCULO
        ↓
REPETIR AUTOMATICAMENTE
```

No primeiro exercício:

```java id="q4d1pz"
i * i
```

No segundo:

```java id="2f6v9n"
numero * i
```

O mesmo mecanismo de repetição pode ser utilizado para resolver problemas diferentes, bastando modificar a lógica executada dentro do `for`.

---

## 📝 Exercício proposto para a próxima aula

Ao final da aula é proposto um novo exercício:

> **Criar um programa que apresente automaticamente a tabuada completa de `1` a `10`.**

Até aqui foi feita a tabuada de **um único número**, por exemplo:

```text id="v9y2d1"
5 × 1
5 × 2
...
5 × 10
```

O próximo desafio é automatizar todo o processo para produzir:

```text id="k4m7s8"
Tabuada do 1
Tabuada do 2
Tabuada do 3
...
Tabuada do 10
```

O professor destaca que esse exercício envolve um conceito que ainda não foi apresentado formalmente, mas que pode ser resolvido pensando na lógica de programação já estudada.

---

## 🚀 Próxima aula

**Exercício — Gerando automaticamente a tabuada de 1 a 10**
