# Lógica de Programação - Virado no Jiraya

# Aula 16 — Operador de Resto e Número Par ou Ímpar

## 📚 Sobre a aula

Nesta aula continuamos o estudo dos **operadores aritméticos** e do **controle de fluxo**.

O principal conceito apresentado é o operador:

```java
%
```

que representa o **resto da divisão inteira** em Java.

Esse operador é utilizado para resolver um exercício clássico de lógica:

> Dado um número inteiro, verificar se ele é par ou ímpar.

A aula também reforça:

- operadores aritméticos;
- resto da divisão;
- operadores de comparação;
- expressões booleanas;
- prioridade de operadores;
- utilização de parênteses;
- aplicação de condicionais na resolução de problemas.

---

# ➕ Operadores aritméticos

Até este momento já conhecemos os principais operadores aritméticos:

| Operador | Operação |
|---|---|
| `+` | Adição |
| `-` | Subtração |
| `*` | Multiplicação |
| `/` | Divisão |
| `%` | Resto da divisão |

Os quatro primeiros realizam operações matemáticas tradicionais.

O operador `%` possui uma característica diferente: ele retorna o **resto da divisão**.

---

# `%` — Operador de resto

O operador:

```java
%
```

retorna o resto de uma divisão.

Por exemplo:

```text
10 ÷ 2 = 5
```

Como a divisão é exata:

```text
resto = 0
```

Portanto:

```java
10 % 2
```

resulta em:

```text
0
```

---

## 🧮 Outro exemplo

Considere:

```text
10 ÷ 3
```

Temos:

```text
3 × 3 = 9
```

e sobra:

```text
1
```

Portanto:

```java
10 % 3
```

resulta em:

```text
1
```

Podemos representar:

```text
10 ÷ 3

quociente = 3
resto     = 1
```

O operador `%` retorna:

```text
1
```

---

# 📊 Exemplos

| Expressão | Resultado |
|---|---:|
| `10 % 2` | `0` |
| `10 % 3` | `1` |
| `10 % 4` | `2` |
| `10 % 5` | `0` |
| `15 % 2` | `1` |
| `20 % 2` | `0` |

O resultado representa aquilo que **sobrou da divisão**.

---

# 🧠 Resto da divisão e lógica

O operador `%` pode ser muito útil para resolver problemas de lógica.

Um dos exemplos mais conhecidos é determinar se um número é:

```text
PAR
```

ou:

```text
ÍMPAR
```

Existe uma propriedade matemática simples:

```text
Número par
   ↓
divisão por 2
   ↓
resto 0
```

Enquanto:

```text
Número ímpar
   ↓
divisão por 2
   ↓
resto diferente de 0
```

Portanto:

```java
numero % 2 == 0
```

pode ser utilizado para verificar se um número é par.

---

# 🟢 Verificando se um número é par

Considere:

```java
int numero = 10;
```

Podemos fazer:

```java
numero % 2
```

Como:

```text
10 % 2 = 0
```

podemos comparar:

```java
numero % 2 == 0
```

A expressão resulta em:

```text
true
```

Portanto, o número é par.

---

# 🔴 Verificando se um número é ímpar

Agora considere:

```java
int numero = 11;
```

Temos:

```text
11 % 2 = 1
```

Portanto:

```java
numero % 2 == 0
```

resulta em:

```text
false
```

Nesse caso, o número é ímpar.

---

# 🔀 Utilizando `if` e `else`

Podemos combinar o operador `%` com as estruturas condicionais estudadas anteriormente:

```java
int numero = 10;

if (numero % 2 == 0) {

    System.out.println("Esse é um número par");

} else {

    System.out.println("Esse é um número ímpar");

}
```

O processamento será:

```text
numero = 10
     ↓
10 % 2
     ↓
   resto 0
     ↓
0 == 0
     ↓
   true
     ↓
Número par
```

---

# 🧩 Exercício — Par ou Ímpar

O exercício proposto consiste em:

> Dado um número inteiro, verificar se ele é par ou ímpar.

Podemos transformar o requisito em uma sequência lógica:

```text
Receber um número inteiro
          ↓
Calcular o resto da divisão por 2
          ↓
       resto == 0?
        ↓       ↓
      true    false
        ↓       ↓
       PAR    ÍMPAR
```

---

# 💻 Implementação

Uma implementação simples:

```java
public class ParOuImpar {

    public static void main(String[] args) {

        int numero = 10;

        if (numero % 2 == 0) {

            System.out.println("Esse é um número par");

        } else {

            System.out.println("Esse é um número ímpar");
        }
    }
}
```

Para:

```java
numero = 10;
```

a saída será:

```text
Esse é um número par
```

---

# 🔢 Testando com números diferentes

Podemos alterar:

```java
int numero = 7;
```

Nesse caso:

```text
7 % 2 = 1
```

Então:

```java
7 % 2 == 0
```

resulta em:

```text
false
```

A saída será:

```text
Esse é um número ímpar
```

---

# 🧠 A expressão booleana

A expressão:

```java
numero % 2 == 0
```

possui duas operações.

Primeiro:

```java
numero % 2
```

calcula o resto da divisão.

Depois:

```java
== 0
```

compara o resultado com zero.

Podemos representar:

```text
numero % 2
     ↓
resto da divisão
     ↓
resto == 0
     ↓
true / false
```

Esse resultado booleano é utilizado pelo `if`.

---

# 🧮 Prioridade dos operadores

A aula também chama atenção para a **prioridade das operações**.

Quando temos uma expressão como:

```java
numero % 2 == 0
```

o Java precisa determinar a ordem em que as operações serão realizadas.

Podemos utilizar parênteses para deixar essa intenção explícita:

```java
(numero % 2) == 0
```

Assim fica evidente que primeiro queremos calcular:

```java
numero % 2
```

e depois comparar o resultado com:

```java
0
```

---

# 🔢 Parênteses e prioridade

Assim como na matemática, os parênteses possuem prioridade.

Por exemplo:

```java
(10 % 2)
```

será calculado antes de qualquer operação externa à expressão.

Podemos pensar:

```text
(10 % 2) == 0
    ↓
    0 == 0
    ↓
   true
```

Os parênteses também tornam o código mais legível para quem está lendo.

---

# 🖨️ Exibindo o resto

Podemos imprimir diretamente o resultado do operador `%`.

Por exemplo:

```java
int numero = 10;

System.out.println(numero % 2);
```

Resultado:

```text
0
```

Isso pode ser útil para compreender o comportamento do operador durante o aprendizado e também para depurar problemas.

---

# 🔗 Operador `%` e concatenação

Quando uma expressão numérica é utilizada junto com uma `String`, o Java pode realizar a concatenação.

Por exemplo:

```java
int numero = 10;

System.out.println("Resto: " + (numero % 2));
```

Resultado:

```text
Resto: 0
```

Os parênteses deixam explícito que primeiro devemos calcular:

```java
numero % 2
```

e depois concatenar o resultado com o texto.

---

# 🧠 Aplicação prática

O operador `%` não serve apenas para descobrir se um número é par ou ímpar.

Ele pode ser utilizado sempre que precisamos descobrir propriedades relacionadas ao **resto de uma divisão**.

Por exemplo:

```text
É divisível por 2?
É divisível por 3?
É divisível por 5?
```

Podemos verificar:

```java
numero % 2 == 0
```

ou:

```java
numero % 3 == 0
```

ou:

```java
numero % 5 == 0
```

A lógica é a mesma:

```text
Resto == 0
    ↓
divisão exata
```

---

# 🧩 Relação com controle de fluxo

A aula conecta vários conceitos estudados anteriormente:

```text
Variável
   ↓
numero
   ↓
Operador aritmético
   ↓
%
   ↓
Resto da divisão
   ↓
Operador relacional
   ↓
==
   ↓
boolean
   ↓
if / else
   ↓
Decisão
```

Por exemplo:

```java
if (numero % 2 == 0)
```

combina:

- variável;
- operador aritmético;
- operador relacional;
- expressão booleana;
- estrutura condicional.

---

# 🔑 Conceitos importantes

- **Operador `%`:** retorna o resto da divisão.
- **Resto da divisão:** valor que sobra após uma divisão inteira.
- **Número par:** número cujo resto da divisão por `2` é `0`.
- **Número ímpar:** número cujo resto da divisão por `2` é diferente de `0`.
- **`==`:** compara dois valores.
- **Expressão booleana:** expressão cujo resultado é `true` ou `false`.
- **Precedência:** regras que determinam a ordem de avaliação das operações.
- **Parênteses:** podem definir explicitamente a ordem de avaliação.
- **Controle de fluxo:** utiliza o resultado da condição para determinar o caminho da execução.

---

# 🧠 Modelo mental

Para identificar se um número é par ou ímpar:

```text
              número
                 ↓
              % 2
                 ↓
        ┌────────┴────────┐
        ↓                 ↓
      resto 0          resto ≠ 0
        ↓                 ↓
       PAR              ÍMPAR
```

Em Java:

```java
if (numero % 2 == 0) {

    // Par

} else {

    // Ímpar
}
```

---

# 💡 Principal aprendizado

O principal aprendizado da aula é compreender o operador de **resto da divisão (`%`)** e perceber como uma operação matemática pode ser transformada em uma regra lógica.

Para determinar se um número é par:

```java
numero % 2 == 0
```

O Java realiza:

```text
número ÷ 2
      ↓
calcula o resto
      ↓
compara com 0
      ↓
true / false
      ↓
if / else
```

Esse é um excelente exemplo de transformação de um problema matemático em um **algoritmo de decisão**.

Além disso, a aula reforça uma habilidade essencial para a lógica de programação: nem sempre precisamos conhecer antecipadamente uma solução completa. Podemos identificar as ferramentas necessárias — neste caso, `%`, `==` e `if/else` — e combiná-las para chegar à solução.

---

## 🚀 Próxima aula

**Aula 17 — Continuação do Controle de Fluxo**