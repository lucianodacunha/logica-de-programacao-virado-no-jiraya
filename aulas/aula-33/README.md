# Lógica de Programação - Virado no Jiraya

# Aula 33 — Laço `for`

## 📚 Sobre a aula

Nesta aula é apresentado o **laço `for`**, uma das estruturas de repetição mais utilizadas em programação.

O `for` é especialmente útil quando precisamos trabalhar com uma **variável auxiliar para realizar contagens ou percorrer valores**.

Nas aulas anteriores, utilizando o `while`, era necessário escrever separadamente:

1. a declaração e inicialização da variável;
2. a condição de repetição;
3. a alteração da variável.

O `for` permite concentrar essas três operações em uma única estrutura.

---

## 🔄 Relembrando o `while`

Com o `while`, podemos ter:

```java
int contador = 0;

while (contador <= 10) {
    System.out.println(contador);
    contador++;
}
```

Nesse código, existem três elementos relacionados à variável `contador`:

```text
1. Inicialização → int contador = 0
2. Condição     → contador <= 10
3. Incremento   → contador++
```

O `for` permite colocar essas três partes juntas.

---

## 🔹 Sintaxe do `for`

A estrutura básica é:

```java
for (inicialização; condição; incremento) {
    // código a ser executado
}
```

Por exemplo:

```java
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

O `for` possui **três partes**, separadas por ponto e vírgula:

```text
for (
    inicialização;
    condição;
    incremento
)
```

Cada uma possui uma função específica.

---

## 1️⃣ Inicialização

A primeira parte é responsável por **declarar e inicializar a variável de controle**.

```java
int i = 0;
```

Dentro do `for`, podemos fazer isso diretamente:

```java
for (int i = 0; ...; ...) {
}
```

Nesse exemplo, a variável `i` começa com o valor `0`.

A inicialização acontece uma única vez, no início da execução do `for`.

---

## 2️⃣ Condição

A segunda parte determina **até quando o `for` deverá continuar executando**.

```java
i <= 10
```

Enquanto essa condição for verdadeira, o bloco será executado.

```text
i <= 10
   ↓
true  → executa
false → encerra
```

Assim como no `while`, a condição precisa resultar em um valor booleano.

---

## 3️⃣ Incremento

A terceira parte determina como a variável de controle será modificada após cada execução.

```java
i++
```

O operador `++` incrementa o valor da variável em `1`.

É equivalente a:

```java
i = i + 1;
```

Portanto:

```text
0 → 1 → 2 → 3 → 4 → ...
```

O incremento permite que a condição eventualmente se torne falsa, encerrando o laço.

---

## 🧮 Exemplo completo

Podemos utilizar:

```java
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

O resultado será:

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

O funcionamento pode ser visualizado assim:

```text
i = 0
 ↓
0 <= 10 → true
 ↓
imprime 0
 ↓
i++
 ↓
i = 1
 ↓
1 <= 10 → true
 ↓
imprime 1
 ↓
i++
 ↓
...
 ↓
i = 10
 ↓
10 <= 10 → true
 ↓
imprime 10
 ↓
i++
 ↓
i = 11
 ↓
11 <= 10 → false
 ↓
fim
```

---

## 🔁 Ordem de execução

É importante compreender a ordem em que as partes do `for` são executadas.

Considere:

```java
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

A sequência é:

```text
1. Inicializa i = 0
          ↓
2. Verifica i <= 10
          ↓
3. Executa o bloco
          ↓
4. Executa i++
          ↓
5. Verifica novamente a condição
          ↓
6. Se true → executa novamente
          ↓
7. Se false → encerra
```

Um ponto importante é que a **inicialização ocorre apenas uma vez**. O que se repete são a verificação da condição, a execução do bloco e o incremento.

---

## 🆚 `for` × `while`

Os dois podem realizar o mesmo tipo de repetição.

### Com `while`

```java
int i = 0;

while (i <= 10) {
    System.out.println(i);
    i++;
}
```

### Com `for`

```java
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

O `for` deixa a estrutura de controle da repetição mais compacta:

```text
while:
inicialização
     +
condição
     +
incremento
```

versus:

```text
for:
inicialização + condição + incremento
```

Essa é uma das principais vantagens do `for` quando estamos trabalhando com contadores.

---

## 🔢 Variável de iteração

É muito comum utilizar a variável `i` como variável de iteração:

```java
for (int i = 0; i <= 10; i++) {
    ...
}
```

`i` é uma convenção bastante utilizada para representar uma variável de índice ou iteração.

Por exemplo:

```text
i = 0
i = 1
i = 2
i = 3
...
```

Durante cada iteração, `i` assume um novo valor.

---

## 📦 Escopo da variável

Um conceito importante apresentado na aula é o **escopo da variável**.

Quando declaramos:

```java
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

a variável `i` foi declarada **dentro do `for`**.

Por isso, ela não pode ser utilizada fora dele:

```java
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}

System.out.println(i); // erro
```

Isso acontece porque `i` existe somente dentro do escopo onde foi declarada.

A regra apresentada é:

> **Onde você declara uma variável é onde você pode utilizá-la, respeitando o escopo.**

---

## 🌎 Escopo mais abrangente

Se for necessário utilizar a variável depois do `for`, ela precisa ser declarada em um escopo mais abrangente:

```java
int i;

for (i = 0; i <= 10; i++) {
    System.out.println(i);
}

System.out.println(i);
```

Nesse caso, `i` foi declarada fora do `for`, portanto seu escopo permite utilizá-la também depois do bloco.

Ao final da execução:

```text
i = 11
```

Isso acontece porque o `for` incrementa `i` depois da última execução e somente então verifica que `11 <= 10` é falso.

---

## ⚠️ Cuidado com declarações duplicadas

Se uma variável já foi declarada fora do `for`:

```java
int i = 20;
```

não devemos declará-la novamente dentro do `for` com o mesmo nome no mesmo contexto de escopo:

```java
for (int i = 0; i <= 10; i++) {
}
```

Nesse cenário, a declaração interna cria uma nova variável que entra em conflito com a declaração existente conforme o contexto de escopo apresentado na aula.

Se a intenção é utilizar a variável já existente, devemos apenas atribuir o valor:

```java
int i = 20;

for (i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

Assim, existe uma única variável `i`, cujo valor é alterado pelo `for`.

---

## 🐞 Utilizando o Debugger

A aula também utiliza o **debugger** para visualizar o funcionamento do `for` passo a passo.

Com um breakpoint, podemos interromper a execução e observar os valores armazenados na memória.

Avançando com `F8`, podemos acompanhar:

```text
i = 0
 ↓
condição
 ↓
execução
 ↓
i = 1
 ↓
condição
 ↓
execução
 ↓
...
```

Esse acompanhamento ajuda a compreender a ordem de execução das três partes do `for` e a perceber exatamente quando a condição deixa de ser verdadeira.

---

## 🧠 Modelo mental

Para memorizar o `for`, pense em três componentes:

```text
        FOR
         ↓
┌────────┼──────────┐
↓        ↓          ↓
INICIALIZAÇÃO      INCREMENTO
         │
      CONDIÇÃO
         ↓
      EXECUTA
         ↓
      INCREMENTA
         ↓
   VERIFICA NOVAMENTE
```

Ou, de maneira mais simples:

```text
INICIALIZA
    ↓
VERIFICA
    ↓
EXECUTA
    ↓
INCREMENTA
    ↓
VERIFICA
    ↓
...
```

A inicialização acontece apenas uma vez; a condição e o incremento participam do ciclo de repetição.

---

## 🔑 Conceitos importantes

* **`for`:** estrutura de repetição especialmente conveniente para trabalhar com contadores.
* **Inicialização:** primeira parte do `for`, responsável por preparar a variável de controle.
* **Condição:** determina se o bloco será executado.
* **Incremento:** altera a variável de controle após cada iteração.
* **`++`:** incrementa uma variável em `1`.
* **Variável de iteração:** variável utilizada para controlar ou representar cada passagem pelo laço.
* **Escopo:** determina onde uma variável pode ser utilizada.
* **Debugger:** permite acompanhar a execução do `for` passo a passo.

---

## 💡 Principal aprendizado

O principal objetivo desta aula é compreender que o `for` **organiza em uma única estrutura as três operações necessárias para controlar uma repetição**:

```java
for (inicialização; condição; incremento) {
    // código
}
```

Por exemplo:

```java
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

Pode ser interpretado como:

```text
"Comece i em 0,
enquanto i for menor ou igual a 10,
execute o código e incremente i em 1."
```

O `for` não introduz uma nova capacidade de repetição que o `while` não possua. Ele oferece uma forma **mais compacta e organizada de expressar determinados tipos de repetição**, especialmente aquelas baseadas em contadores.

Além disso, a aula reforça um conceito fundamental que continuará aparecendo em Java: **variáveis possuem escopo**, e o local onde são declaradas determina onde podem ser utilizadas.

---

## 🚀 Próxima aula

**Continuação dos laços de repetição**
