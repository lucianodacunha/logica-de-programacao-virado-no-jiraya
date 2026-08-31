# Lógica de Programação - Virado no Jiraya

# Aula 32 — Laço `do-while`

## 📚 Sobre a aula

Nesta aula é apresentado o último laço de repetição trabalhado neste tópico: o **`do-while`**.

A principal diferença em relação ao `while` está no momento em que a condição é verificada:

* no `while`, a condição é verificada **antes** da execução;
* no `do-while`, a condição é verificada **depois** da execução.

Por isso, o `do-while` garante que seu bloco seja executado **pelo menos uma vez**, independentemente do resultado inicial da condição.

---

## 🔄 `while` × `do-while`

### `while`

No `while`, a condição é analisada primeiro:

```java
while (condicao) {
    // código
}
```

Se a condição for `false` inicialmente, o bloco não será executado nenhuma vez.

```text
       condição
          ↓
    ┌─────┴─────┐
  true         false
    ↓             ↓
 executa         fim
    ↓
 volta para
 condição
```

---

### `do-while`

No `do-while`, o bloco é executado primeiro e somente depois a condição é verificada:

```java
do {
    // código
} while (condicao);
```

Dessa forma, o bloco será executado **pelo menos uma vez**.

```text
      executa
         ↓
     condição
         ↓
   ┌─────┴─────┐
 true         false
   ↓             ↓
repete          fim
```

Essa é a principal diferença entre as duas estruturas.

---

## 🧪 Exemplo simples

Considere:

```java
do {
    System.out.println("Executando...");
} while (false);
```

Mesmo que a condição seja `false`, a mensagem será exibida uma vez.

Isso acontece porque a ordem é:

```text
1. Executa o bloco
2. Verifica a condição
3. Se true → repete
4. Se false → encerra
```

No `while`, o comportamento seria diferente:

```java
while (false) {
    System.out.println("Executando...");
}
```

Nesse caso, nada seria executado, pois a condição é avaliada antes da primeira execução.

---

## 🎮 Exercício: pequeno jogo

Para demonstrar uma situação em que o `do-while` é útil, a aula propõe um pequeno jogo.

O funcionamento será:

1. O primeiro usuário informa um número de `1` a `10`.
2. O segundo usuário informa outro número.
3. O programa verifica se os números são iguais.
4. Informa o resultado.
5. Pergunta se os jogadores desejam continuar.
6. Enquanto a resposta indicar que desejam continuar, uma nova rodada é iniciada.

O exercício é adequado para o `do-while` porque uma rodada do jogo precisa acontecer **antes de perguntar se os usuários desejam jogar novamente**.

---

## 🔢 Recebendo os números

O programa utiliza o `Scanner` para receber os valores digitados:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Digite um número de 1 a 10: ");
int numero1 = scanner.nextInt();

System.out.print("Digite outro número de 1 a 10: ");
int numero2 = scanner.nextInt();
```

Os dois valores podem então ser comparados:

```java
if (numero1 == numero2) {
    System.out.println("Acertou!");
} else {
    System.out.println("Errou!");
}
```

O objetivo da comparação é verificar se os números escolhidos pelos usuários são iguais.

---

## 🔁 Controlando as rodadas

Para controlar se uma nova rodada deverá acontecer, é utilizada uma variável que representa a decisão do usuário.

Por exemplo:

```java
int desejaContinuar = 1;
```

O valor `1` pode representar:

```text
1 → continuar jogando
```

Depois da rodada, o programa pergunta ao usuário:

```text
Deseja continuar jogando?
```

E recebe uma nova opção.

A condição do `do-while` pode então ser:

```java
while (desejaContinuar == 1);
```

Assim:

```text
desejaContinuar = 1
        ↓
   nova rodada
        ↓
pergunta novamente
        ↓
deseja continuar?
        ↓
       ...
```

Se o usuário informar outro valor, a condição será falsa e o jogo terminará.

---

## 🧩 Estrutura completa

Uma implementação simplificada do exercício pode ser representada assim:

```java
int desejaContinuar = 1;

do {
    System.out.print("Digite um número de 1 a 10: ");
    int numero1 = scanner.nextInt();

    System.out.print("Digite outro número de 1 a 10: ");
    int numero2 = scanner.nextInt();

    if (numero1 == numero2) {
        System.out.println("Acertou!");
    } else {
        System.out.println("Errou!");
    }

    System.out.print("Deseja continuar jogando? ");
    desejaContinuar = scanner.nextInt();

} while (desejaContinuar == 1);
```

O ponto importante não é a implementação do jogo em si, mas perceber como o `do-while` organiza o fluxo.

---

## 🧠 Por que utilizar `do-while` nesse caso?

Observe a lógica:

```text
Começa o jogo
     ↓
Executa uma rodada
     ↓
Verifica o resultado
     ↓
Pergunta se deseja continuar
     ↓
 ┌───┴────┐
sim       não
 ↓          ↓
nova       fim
rodada
```

Não faz sentido perguntar se o usuário deseja continuar **antes de executar a primeira rodada**, pois ainda não houve jogo.

Essa característica torna o `do-while` adequado para situações em que precisamos garantir uma primeira execução antes de verificar a condição de continuidade.

---

## 🔢 Utilizando valores numéricos para controlar o fluxo

A aula utiliza uma variável numérica para representar a decisão de continuar:

```java
desejaContinuar = 1;
```

E posteriormente:

```java
while (desejaContinuar == 1);
```

Nesse caso:

```text
1 → continua
qualquer outro valor → encerra
```

Isso permite controlar o laço diretamente a partir da entrada do usuário.

---

## 🧠 Modelo mental

A diferença fundamental pode ser memorizada assim:

```text
WHILE

     PERGUNTA
        ↓
   pode executar?
      ↙   ↘
    SIM   NÃO
     ↓     ↓
 EXECUTA  FIM
```

Enquanto:

```text
DO-WHILE

   EXECUTA
      ↓
   PERGUNTA
      ↓
   repetir?
    ↙   ↘
  SIM   NÃO
   ↓     ↓
repete  FIM
```

Uma forma simples de lembrar:

> **`while` pergunta antes. `do-while` faz primeiro e pergunta depois.**

---

## ⚠️ Ponto de atenção

O `do-while` possui uma característica que o diferencia claramente do `while`:

```java
do {
    // executa pelo menos uma vez
} while (condicao);
```

Mesmo que:

```java
condicao == false
```

o bloco já terá sido executado uma vez.

Por isso, a escolha entre `while` e `do-while` deve considerar **quando a condição precisa ser avaliada em relação à primeira execução**.

---

## 🔑 Conceitos importantes

* **`do-while`:** executa o bloco antes de verificar a condição.
* **`while`:** verifica a condição antes de executar o bloco.
* **Execução garantida:** o `do-while` executa pelo menos uma vez.
* **Condição:** determina se uma nova iteração deverá acontecer.
* **`Scanner`:** utilizado para receber os valores digitados pelo usuário.
* **Variável de controle:** armazena a informação utilizada para decidir se o laço continuará.
* **`==`:** utilizado para comparar valores primitivos, como os números do exercício.

---

## 💡 Principal aprendizado

O principal aprendizado desta aula é entender **a diferença de ordem entre `while` e `do-while`**.

No `while`:

```text
CONDIÇÃO
   ↓
EXECUÇÃO
```

No `do-while`:

```text
EXECUÇÃO
   ↓
CONDIÇÃO
```

Essa pequena diferença muda completamente o comportamento quando a condição já começa como `false`.

O `do-while` é especialmente útil quando precisamos garantir que determinada operação aconteça **ao menos uma vez**, como no jogo apresentado na aula.

O conceito pode ser resumido em:

```java
do {
    // executa primeiro
} while (condicao);
```

---

## 🚀 Próxima aula

**Aula 33 - For, parte 1**
