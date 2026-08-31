# Lógica de Programação - Virado no Jiraya

# Aula 30 — Exercício: Menu Interativo com `while`

## 📚 Sobre a aula

Nesta aula é desenvolvido um exercício prático utilizando o **laço de repetição `while`**.

O objetivo é criar um **menu que permaneça disponível durante a execução do programa**, permitindo que o usuário escolha diferentes operações sem precisar reiniciar o programa a cada vez.

O menu deverá permanecer em execução **até que o usuário escolha a opção `3`**.

---

## 🎯 Objetivo do exercício

O programa deverá apresentar um menu semelhante a:

```text id="z0xv0u"
1 - Calcular imposto
2 - Calcular salário
3 - Sair
```

O comportamento esperado é:

```text id="v2w3qk"
Usuário escolhe 1
       ↓
Executa a opção 1
       ↓
Menu aparece novamente
       ↓
Usuário escolhe 2
       ↓
Executa a opção 2
       ↓
Menu aparece novamente
       ↓
Usuário escolhe 3
       ↓
Programa encerrado
```

A principal característica é que o menu **não deve desaparecer após uma operação**. Ele deve continuar disponível enquanto o usuário não escolher `3`.

---

## 🔄 Utilizando o `while`

Como o menu precisa ser exibido repetidamente, utilizamos um laço `while`.

A ideia central é:

```java id="w6j35a"
while (opcao != 3) {
    // exibe o menu
    // recebe a opção
    // executa a operação escolhida
}
```

A condição:

```java id="qgl3po"
opcao != 3
```

significa:

> **Enquanto a opção escolhida for diferente de `3`, continue executando o menu.**

Quando o usuário escolher `3`, a condição se tornará falsa e o `while` será encerrado.

---

## ⌨️ Recebendo a opção do usuário

Para que o usuário possa interagir com o menu, é necessário receber uma entrada pelo teclado.

A aula utiliza o `Scanner`:

```java id="o4ckc9"
Scanner teclado = new Scanner(System.in);
```

Depois, a opção pode ser obtida com:

```java id="d9w6ag"
opcao = teclado.nextInt();
```

O fluxo fica:

```text id="plx7o6"
Exibe menu
    ↓
Usuário digita opção
    ↓
Scanner recebe valor
    ↓
opcao recebe o valor
    ↓
while verifica a condição
```

---

## 🧩 Estrutura do menu

Dentro do `while`, o programa pode apresentar as opções para o usuário:

```java id="5q75ms"
System.out.println("1 - Calcular imposto");
System.out.println("2 - Calcular salário");
System.out.println("3 - Sair");
```

Em seguida, recebe a escolha:

```java id="l8p8qy"
opcao = teclado.nextInt();
```

A partir da opção recebida, o programa poderá executar o processamento correspondente.

Nesta aula, o foco não está na implementação das operações de imposto ou salário, mas na construção da estrutura que mantém o menu funcionando.

---

## 🔀 Verificando a opção escolhida

Depois de receber a opção, podemos utilizar uma estrutura condicional para verificar o que o usuário escolheu.

Por exemplo:

```java id="v9e0hd"
if (opcao == 1) {
    // calcular imposto
}

if (opcao == 2) {
    // calcular salário
}
```

Quando a opção for `3`, nenhuma operação precisa ser executada, pois essa escolha representa a saída do programa.

Ao final da iteração, o `while` verifica novamente:

```text id="i3u1y5"
opcao != 3
```

Se for verdadeira, o menu continua.

Se for falsa, o programa termina.

---

## 🔁 Fluxo completo

O funcionamento do programa pode ser representado assim:

```text id="xk3v0b"
          Início
            ↓
       Exibe o menu
            ↓
      Recebe a opção
            ↓
    ┌───────┴────────┐
    ↓                ↓
 opção 1          opção 2
    ↓                ↓
Executa           Executa
operação 1        operação 2
    │                │
    └───────┬────────┘
            ↓
      Exibe o menu
       novamente
            ↓
      opção == 3?
        ↓       ↓
      não      sim
       ↓         ↓
    repete      Fim
```

A repetição permite que várias operações sejam realizadas durante a mesma execução do programa.

---

## ⚠️ A importância da condição de saída

O ponto fundamental do exercício é definir corretamente a **condição de parada**.

Neste caso:

```java id="1m9a7y"
while (opcao != 3)
```

A opção `3` funciona como o comando de saída.

Enquanto:

```text id="c2wh1a9"
opcao = 1 → continua
opcao = 2 → continua
```

Quando:

```text id="8u1fpk"
opcao = 3 → encerra
```

Isso evita que o programa precise ser encerrado manualmente ou reiniciado após cada operação.

---

## 🧠 Modelo mental

O exercício pode ser resumido como:

```text id="8zj6zq"
INÍCIO
   ↓
MOSTRA MENU
   ↓
RECEBE OPÇÃO
   ↓
EXECUTA OPERAÇÃO
   ↓
OPÇÃO É 3?
   ↓
 ┌─┴─┐
não  sim
 ↓    ↓
volta FIM
ao menu
```

O conceito principal é utilizar o `while` para controlar **todo o ciclo de interação com o usuário**.

---

## 🔑 Conceitos importantes

* **Menu interativo:** conjunto de opções que permite ao usuário escolher uma operação.
* **`while`:** mantém o menu em execução enquanto sua condição for verdadeira.
* **`Scanner`:** utilizado para receber a opção digitada pelo usuário.
* **Variável `opcao`:** armazena a escolha realizada pelo usuário.
* **Condição de parada:** neste exercício, ocorre quando `opcao` recebe `3`.
* **Opção `3`:** representa a saída do programa.
* **Repetição:** permite executar várias operações sem reiniciar o programa.

---

## 💡 Principal aprendizado

O principal objetivo da aula é perceber que o `while` não serve apenas para percorrer números.

Ele também pode controlar **fluxos de interação**.

Neste exercício:

```java id="3o4f1c"
while (opcao != 3) {
    // mostra menu
    // recebe opção
    // executa operação
}
```

o laço representa a ideia:

> **"Continue mostrando o menu e permitindo operações enquanto o usuário não escolher sair."**

Esse padrão é bastante importante em programas que precisam permanecer ativos e aguardando decisões do usuário.

---

## 🚀 Próxima aula

**Continuação dos exercícios com laços de repetição**
