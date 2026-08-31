# Lógica de Programação - Virado no Jiraya

# Aula 28 — Laços de Repetição: `while`

## 📚 Sobre a aula

Nesta aula é apresentado um dos conceitos fundamentais da **lógica de programação: os laços de repetição**.

Até aqui, os programas trabalhavam principalmente com execução sequencial e estruturas condicionais. Os laços de repetição acrescentam a capacidade de **executar um determinado bloco de código várias vezes enquanto uma condição for verdadeira**.

O primeiro laço apresentado é o `while`.

---

## 🔄 O que são Laços de Repetição?

Um laço de repetição permite determinar que o computador continue executando um processamento **enquanto uma determinada condição for verdadeira**.

De forma simplificada:

```text
Enquanto a condição for verdadeira
    execute o código
```

Todo laço precisa de uma condição que determine quando a repetição deve terminar. Caso contrário, o programa poderá entrar em um **loop infinito**.

---

## 🔁 Tipos de Laços

Existem diferentes tipos de estruturas de repetição em Java.

Entre as principais estão:

* `while`;
* `do-while`;
* `for`.

A principal diferença entre essas estruturas está na **sintaxe e na forma como a repetição é controlada**. Nesta aula, o foco é o `while`.

---

## 🔹 Laço `while`

A palavra `while` significa **"enquanto"**.

Sua sintaxe básica é:

```java
while (condicao) {
    // código a ser repetido
}
```

A condição deve retornar um valor booleano:

```text
true  → executa o bloco
false → encerra o laço
```

Enquanto a condição permanecer verdadeira, o bloco será executado novamente.

---

## ♾️ Loop Infinito

Um exemplo simples de loop infinito é:

```java
while (true) {
    // código
}
```

Como a condição será sempre `true`, o bloco continuará sendo executado indefinidamente.

```text
while (true)
    ↓
executa
    ↓
volta para a condição
    ↓
true
    ↓
executa novamente
    ↓
...
```

Um loop infinito pode consumir continuamente recursos do computador, especialmente **CPU**. Em ambientes de computação em nuvem, o consumo contínuo de recursos também pode representar custos maiores.

---

## 🔢 Controlando a Repetição

Para controlar um `while`, podemos utilizar uma variável que seja modificada durante a execução do laço.

Exemplo:

```java
int contador = 0;

while (contador <= 10) {
    System.out.println(contador);
    contador = contador + 1;
}
```

O fluxo será:

```text
contador = 0
     ↓
0 <= 10 → true
     ↓
imprime 0
     ↓
contador = contador + 1
     ↓
contador = 1
     ↓
1 <= 10 → true
     ↓
imprime 1
     ↓
...
```

A variável `contador` precisa ser alterada para que, em determinado momento, a condição se torne falsa.

---

## 🧮 Entendendo a Execução

É importante desenvolver a capacidade de **prever o resultado do código antes de executá-lo**.

No exemplo:

```java
int contador = 0;

while (contador <= 10) {
    System.out.println(contador);
    contador = contador + 1;
}
```

Os valores impressos serão:

```text
0
1
2
3
4
5
6
7
8
9
10
```

O laço será executado **11 vezes**, porque o contador começa em `0` e a condição utiliza `<= 10`.

```text
0 → 1ª execução
1 → 2ª execução
...
10 → 11ª execução
```

Depois de imprimir `10`, o contador passa para `11`:

```text
11 <= 10 → false
```

Nesse momento, o `while` é encerrado.

---

## ➕ Alterando a variável de controle

A variável utilizada para controlar o laço não precisa necessariamente ser incrementada de `1` em `1`.

Por exemplo:

```java
int contador = 1;

while (contador <= 10) {
    System.out.println(contador);
    contador = contador + 2;
}
```

Nesse caso, os valores serão:

```text
1
3
5
7
9
```

Depois de `9`, o contador passa para `11`, tornando a condição falsa.

A forma como a variável é atualizada determina quais valores serão percorridos durante as iterações.

---

## 🔄 Iteração

Cada execução do bloco de um laço de repetição é chamada de **iteração**.

Por exemplo:

```java
while (contador <= 10) {
    System.out.println(contador);
    contador++;
}
```

Podemos representar:

```text
Iteração 1 → contador = 0
Iteração 2 → contador = 1
Iteração 3 → contador = 2
...
```

É importante diferenciar **iteração** de interação. Em estruturas de repetição, o termo correto é **iteração**.

---

## ⚠️ Cuidado com a condição

Ao utilizar um `while`, é necessário verificar se a variável utilizada na condição realmente será alterada.

Por exemplo:

```java
int contador = 0;

while (contador <= 10) {
    System.out.println(contador);
}
```

Nesse caso, `contador` nunca muda.

Portanto:

```text
0 <= 10 → true
0 <= 10 → true
0 <= 10 → true
...
```

O resultado será um **loop infinito**.

Uma das principais preocupações ao trabalhar com `while` é garantir que exista uma condição de parada.

---

## 🧠 Modelo mental

O funcionamento de um `while` pode ser entendido como um ciclo:

```text
        Inicialização
             ↓
      Verifica condição
             ↓
       ┌─────┴─────┐
     true         false
       ↓             ↓
    Executa         Fim
       ↓
Atualiza variável
       ↓
Volta para condição
       ↓
      ...
```

O padrão fundamental é:

```text
INICIALIZA
    ↓
VERIFICA
    ↓
EXECUTA
    ↓
ATUALIZA
    ↓
VERIFICA NOVAMENTE
```

---

## 🔑 Conceitos importantes

* **Laço de repetição:** estrutura que permite executar um bloco várias vezes.
* **`while`:** executa um bloco enquanto uma condição for verdadeira.
* **Condição:** expressão que determina se o laço continuará executando.
* **`true`:** mantém a execução do `while`.
* **`false`:** encerra o `while`.
* **Iteração:** cada execução do bloco de repetição.
* **Variável de controle:** variável utilizada para controlar a repetição.
* **Loop infinito:** acontece quando a condição nunca se torna falsa.

---

## 💡 Principal aprendizado

O `while` permite dizer ao computador:

> **"Enquanto esta condição for verdadeira, continue executando este código."**

O ponto central é compreender que a condição é **verificada novamente após cada iteração**.

Um `while` pode ser resumido em:

```java
while (condicao) {
    // código
}
```

Para utilizá-lo corretamente, é necessário pensar em três elementos:

```text
1. Valor inicial
2. Condição de repetição
3. Alteração da variável de controle
```

Se a variável utilizada na condição não for alterada de maneira adequada, o programa pode permanecer preso em um loop infinito.

---

## 🚀 Próxima aula

**Continuação dos Laços de Repetição**
