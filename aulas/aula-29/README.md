# Lógica de Programação - Virado no Jiraya

# Aula 29 — Exercício com `while`: Números Ímpares

## 📚 Sobre a aula

Nesta aula é realizado um exercício prático para reforçar o conceito de **laços de repetição**, utilizando principalmente o `while` em conjunto com uma **estrutura condicional `if`**.

O objetivo do exercício é:

> **Imprimir todos os números ímpares de 0 até o valor informado pelo usuário.**

O exercício combina conceitos já apresentados anteriormente, especialmente:

* entrada de dados;
* variável de controle;
* laço `while`;
* estrutura condicional `if`;
* operador de resto da divisão `%`.

---

## 🎯 Objetivo do exercício

O programa deve solicitar um número ao usuário e, a partir desse valor, percorrer todos os números desde `0` até o número informado.

Durante esse processo, devem ser impressos somente os números **ímpares**.

Por exemplo, se o usuário informar:

```text
10
```

O resultado esperado será:

```text
1
3
5
7
9
```

O exercício é importante porque mostra como combinar **repetição e decisão** para resolver um problema.

---

## ⌨️ Obtendo o valor do usuário

Primeiro, precisamos obter o valor final que será utilizado pelo programa.

Para isso, podemos utilizar o `Scanner`:

```java
Scanner scanner = new Scanner(System.in);

int valorFinal = scanner.nextInt();
```

A variável `valorFinal` armazenará o número informado pelo usuário.

Podemos imaginar:

```text
Usuário
   ↓
digita um número
   ↓
valorFinal
```

Esse valor será utilizado posteriormente como limite do `while`.

---

## 🔢 Variável de controle

Além do valor final, precisamos de uma variável que represente o número que está sendo analisado durante a repetição.

É comum utilizar uma variável chamada `i` para representar essa **variável de iteração**:

```java
int i = 0;
```

Assim, temos duas informações diferentes:

```text
valorFinal → limite informado pelo usuário
i          → valor que está sendo percorrido
```

O `i` começará em `0` e será incrementado durante o processamento. A utilização de `i` como variável de iteração é um padrão bastante comum em programação.

---

## 🔄 Estruturando o `while`

Agora podemos utilizar o `while` para percorrer os números de `0` até o valor informado.

```java
int i = 0;

while (i <= valorFinal) {
    // processamento
    i++;
}
```

A condição:

```java
i <= valorFinal
```

determina que o laço continuará enquanto `i` for menor ou igual ao valor informado pelo usuário.

O fluxo é:

```text
i = 0
 ↓
i <= valorFinal?
 ↓
sim → executa
 ↓
i++
 ↓
volta para a condição
 ↓
...
 ↓
condição falsa
 ↓
fim
```

---

## ➗ Descobrindo se um número é ímpar

Para descobrir se um número é par ou ímpar, podemos utilizar o operador de resto da divisão:

```text
%
```

O operador `%` retorna o **resto de uma divisão inteira**.

Por exemplo:

```text
10 % 2 = 0
11 % 2 = 1
12 % 2 = 0
13 % 2 = 1
```

Portanto:

```text
resto = 0 → número par
resto ≠ 0 → número ímpar
```

Para identificar um número ímpar:

```java
i % 2 != 0
```

---

## 🔀 Utilizando `if` dentro do `while`

Agora podemos combinar o `while` com uma estrutura condicional:

```java
while (i <= valorFinal) {

    if (i % 2 != 0) {
        System.out.println(i);
    }

    i++;
}
```

O funcionamento é:

```text
          i
          ↓
    i <= valorFinal?
       ↓       ↓
     true    false
       ↓       ↓
      if      fim
       ↓
   i % 2 != 0?
    ↓       ↓
  true    false
    ↓       ↓
 imprime  não imprime
    ↓
   i++
    ↓
volta ao while
```

Dessa forma, o `while` controla **quais números serão percorridos**, enquanto o `if` determina **quais deles serão impressos**.

---

## ⚠️ A importância do incremento

Um detalhe fundamental é incrementar a variável `i` **dentro do laço**.

Por exemplo:

```java
i++;
```

Se isso não for feito, `i` permanecerá com o mesmo valor.

Se começarmos com:

```java
int i = 0;
```

e nunca alterarmos `i`, teremos:

```text
i = 0
 ↓
0 <= valorFinal → true
 ↓
executa
 ↓
i continua 0
 ↓
0 <= valorFinal → true
 ↓
executa novamente
 ↓
...
```

Isso provocaria um **loop infinito**.

Portanto, em um `while` controlado por uma variável, devemos garantir que essa variável seja atualizada de maneira adequada.

---

## 🧮 Exemplo completo

Uma possível implementação do exercício é:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Digite um número: ");
int valorFinal = scanner.nextInt();

int i = 0;

while (i <= valorFinal) {

    if (i % 2 != 0) {
        System.out.println(i);
    }

    i++;
}
```

Se o usuário informar:

```text
10
```

O programa percorrerá:

```text
0 → par → não imprime
1 → ímpar → imprime
2 → par → não imprime
3 → ímpar → imprime
4 → par → não imprime
5 → ímpar → imprime
6 → par → não imprime
7 → ímpar → imprime
8 → par → não imprime
9 → ímpar → imprime
10 → par → não imprime
```

Resultado:

```text
1
3
5
7
9
```

---

## 🔄 Outra possibilidade

Como o objetivo é trabalhar com números ímpares, existe uma forma mais eficiente de percorrer o intervalo: começar em `1` e incrementar de `2` em `2`.

```java
int i = 1;

while (i <= valorFinal) {
    System.out.println(i);
    i += 2;
}
```

Nesse caso, não precisamos testar cada número com `if`, pois a própria forma de incremento garante que serão visitados apenas números ímpares:

```text
1 → 3 → 5 → 7 → 9 → ...
```

A aula utiliza o exercício principalmente para demonstrar a combinação entre **laço de repetição e estrutura condicional**.

---

## 🧠 Modelo mental

O exercício pode ser resumido em quatro etapas:

```text
1. Receber o valor final
          ↓
2. Inicializar a variável de iteração
          ↓
3. Repetir enquanto não ultrapassar o limite
          ↓
4. Verificar se o número é ímpar
          ↓
5. Imprimir
          ↓
6. Incrementar
          ↓
      repetir
```

Em código:

```java
int i = 0;

while (i <= valorFinal) {

    if (i % 2 != 0) {
        System.out.println(i);
    }

    i++;
}
```

---

## 🔑 Conceitos importantes

* **`while`:** controla a repetição do processamento.
* **Variável de iteração:** representa o valor que está sendo percorrido durante o laço.
* **`if`:** permite tomar uma decisão dentro do laço.
* **`%`:** retorna o resto de uma divisão inteira.
* **Número par:** quando `numero % 2 == 0`.
* **Número ímpar:** quando `numero % 2 != 0`.
* **`i++`:** incrementa a variável de iteração em `1`.
* **Loop infinito:** pode ocorrer quando a variável responsável pela condição não é atualizada adequadamente.

---

## 💡 Principal aprendizado

Esta aula demonstra como **combinar diferentes estruturas de controle** para resolver um problema.

O `while` é responsável por repetir:

```text
"Percorra os números até chegar ao limite."
```

O `if` é responsável por decidir:

```text
"Esse número é ímpar?"
```

E o operador `%` permite realizar essa verificação:

```java
i % 2 != 0
```

O padrão geral aprendido é:

```text
REPETIR
   ↓
VERIFICAR
   ↓
EXECUTAR SE NECESSÁRIO
   ↓
ATUALIZAR
   ↓
REPETIR
```

Esse tipo de combinação entre **repetição + condição** será fundamental para a resolução de problemas de lógica cada vez mais complexos.

---

## 🚀 Próxima aula

**Exercícios de introdução aos laços de repetição**
