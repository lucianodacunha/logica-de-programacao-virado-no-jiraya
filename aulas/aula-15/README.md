# Lógica de Programação - Virado no Jiraya

# Aula 15 — Controle de Fluxo, Escopo e Reutilização de Variáveis

## 📚 Sobre a aula

Nesta aula continuamos trabalhando com **controle de fluxo** e estruturas condicionais.

O exercício utiliza uma situação semelhante aos exercícios anteriores de porcentagem, mas agora acrescenta uma condição:

- receber um determinado salário;
- verificar se o salário é maior que um determinado valor;
- aplicar uma porcentagem diferente dependendo da condição;
- armazenar o resultado;
- apresentar o resultado no console.

A aula também aprofunda o conceito de **escopo das variáveis** e apresenta uma situação em que precisamos utilizar uma variável para armazenar a informação sobre qual porcentagem foi aplicada.

---

# 🔀 Controle de fluxo

O exercício utiliza novamente o:

```java
if
```

e:

```java
else
```

para determinar qual cálculo deverá ser realizado.

A lógica pode ser representada:

```text
             Salário
                ↓
       salário > 4500?
          ↓           ↓
        true        false
          ↓           ↓
       30%           10%
          ↓           ↓
       resultado    resultado
```

O programa segue caminhos diferentes dependendo do valor armazenado na variável `salario`.

---

# 💰 Exercício — Porcentagem do salário

O problema proposto consiste em calcular uma porcentagem sobre um salário.

A regra utilizada é:

```text
Se o salário for maior que 4500:
    calcular 30%

Senão:
    calcular 10%
```

Podemos representar:

```text
salário > 4500
      │
 ┌────┴────┐
 ↓         ↓
SIM       NÃO
 ↓         ↓
30%       10%
```

---

# 📦 Criando a variável `salario`

Primeiro criamos uma variável para armazenar o salário:

```java
double salario = 4700.50;
```

Nesse exemplo:

```text
salario → 4700.50
```

Como o salário pode possuir casas decimais, utilizamos:

```java
double
```

---

# 🟢 Condição `if`

Podemos verificar o salário utilizando:

```java
if (salario > 4500) {

    // cálculo de 30%

}
```

A expressão:

```java
salario > 4500
```

será avaliada pelo Java.

Como:

```text
4700.50 > 4500
```

é verdadeiro:

```text
true
```

o bloco do `if` será executado.

---

# 📊 Calculando 30%

Dentro do `if`, podemos calcular 30%:

```java
double valor = salario * 0.30;
```

Considerando:

```text
salario = 4700.50
```

temos aproximadamente:

```text
4700.50 × 0.30 = 1410.15
```

O resultado será armazenado em:

```text
valor
```

---

# 🔵 Utilizando `else`

Quando a condição do `if` for falsa, utilizamos:

```java
else
```

Exemplo:

```java
if (salario > 4500) {

    double valor = salario * 0.30;

} else {

    double valor = salario * 0.10;

}
```

Assim:

```text
salário > 4500?
       ↓
   ┌───┴───┐
   ↓       ↓
 true    false
   ↓       ↓
 30%      10%
```

---

# 🧠 Escopo das variáveis

Um dos conceitos mais importantes apresentados nesta aula é o **escopo**.

Uma variável criada dentro de um bloco de código pertence àquele escopo.

Por exemplo:

```java
if (salario > 4500) {

    double valor = salario * 0.30;

}
```

A variável:

```java
valor
```

foi criada dentro do bloco do `if`.

Ela não pode ser utilizada livremente fora desse bloco.

Podemos visualizar:

```text
if
┌─────────────────────────────┐
│                             │
│  double valor = ...;        │
│                             │
│  escopo de valor            │
│                             │
└─────────────────────────────┘
```

---

# 🌳 Escopo externo e interno

Uma variável criada em um escopo externo pode ser utilizada dentro de escopos internos.

Por exemplo:

```java
double resultado = 0;

if (salario > 4500) {

    resultado = salario * 0.30;

}
```

A variável:

```java
resultado
```

foi criada antes do `if`.

Portanto, ela está disponível dentro do bloco:

```java
if
```

e também depois dele.

Podemos representar:

```text
Escopo externo
┌───────────────────────────────┐
│                               │
│ resultado                     │
│                               │
│     ┌─────────────────────┐   │
│     │ if                  │   │
│     │                     │   │
│     │ pode acessar        │   │
│     │ resultado           │   │
│     │                     │   │
│     └─────────────────────┘   │
│                               │
└───────────────────────────────┘
```

---

# 🚫 Variável de escopo interno

O contrário não funciona.

Uma variável criada dentro do `if` não pode ser utilizada fora dele.

Exemplo:

```java
if (salario > 4500) {

    double valor = salario * 0.30;

}

System.out.println(valor);
```

Nesse caso, `valor` não existe no escopo onde está sendo utilizado.

O Java produzirá um erro de compilação.

---

# 🧩 Desafio da aula

A aula apresenta um desafio:

> Utilizar apenas uma variável para armazenar o resultado.

O objetivo é evitar a criação de uma variável diferente para cada caminho.

Em vez de:

```java
double resultado30;
double resultado10;
```

podemos criar uma única variável:

```java
double resultado = 0;
```

e posteriormente atribuir o resultado dentro da condição.

---

# 🔄 Reutilizando `resultado`

Podemos fazer:

```java
double resultado = 0;

if (salario > 4500) {

    resultado = salario * 0.30;

} else {

    resultado = salario * 0.10;

}
```

A variável `resultado` existe no escopo externo.

Por isso, ambos os blocos podem utilizá-la.

```text
resultado
    ↓
┌───────────────┐
│               │
│     if        │
│       ↓       │
│     30%       │
│               │
│     else      │
│       ↓       │
│     10%       │
│               │
└───────────────┘
```

Depois da estrutura condicional, podemos utilizar novamente:

```java
System.out.println(resultado);
```

---

# ⚠️ Inicialização da variável

Ao criar uma variável que será utilizada posteriormente, é necessário considerar se ela possui um valor válido antes de ser utilizada.

Por exemplo:

```java
double resultado = 0;
```

Inicializamos `resultado` com:

```text
0
```

Depois, dependendo do caminho executado:

```java
resultado = salario * 0.30;
```

ou:

```java
resultado = salario * 0.10;
```

O valor inicial garante que a variável tenha um valor definido.

---

# 🏷️ Identificando a porcentagem aplicada

A aula apresenta outro desafio:

> Na impressão, informar se o cálculo realizado foi de 30% ou de 10%.

O problema é que, depois do `if/else`, não queremos depender de saber qual caminho foi executado para montar a mensagem.

Uma solução apresentada é utilizar uma `String`.

---

# 📝 Variável para armazenar a porcentagem

Podemos criar:

```java
String maiorPorcentagem = "";
```

A variável começa com uma `String` vazia.

Depois, dentro do `if`:

```java
maiorPorcentagem = "30%";
```

E dentro do `else`:

```java
maiorPorcentagem = "10%";
```

Assim, a variável passa a armazenar a informação correspondente ao caminho executado.

---

# 🔗 Concatenação

Depois do processamento, podemos montar uma mensagem utilizando o operador:

```java
+
```

Por exemplo:

```java
System.out.println(
    "O valor final é " + maiorPorcentagem + " de " + resultado
);
```

O operador `+`, nesse contexto, realiza **concatenação**.

Podemos representar:

```text
"O valor final é "
        +
"30%"
        +
" de "
        +
1410.15
```

Resultado:

```text
O valor final é 30% de 1410.15
```

---

# 🧩 Programa completo

Uma implementação seguindo a lógica apresentada na aula:

```java
public class CalculadoraPorcentagem {

    public static void main(String[] args) {

        double salario = 4700.50;

        double resultado = 0;
        String porcentagem = "";

        if (salario > 4500) {

            resultado = salario * 0.30;
            porcentagem = "30%";

        } else {

            resultado = salario * 0.10;
            porcentagem = "10%";
        }

        System.out.println(
            "O valor final é " + porcentagem + " de " + resultado
        );
    }
}
```

Para:

```text
salario = 4700.50
```

o resultado será aproximadamente:

```text
O valor final é 30% de 1410.15
```

---

# 🔄 Fluxo completo

Podemos visualizar o processamento:

```text
                 salário
                    ↓
              4700.50
                    ↓
           salário > 4500?
              ↓          ↓
            true       false
              ↓          ↓
            30%         10%
              ↓          ↓
       resultado =     resultado =
       salário × 0.30  salário × 0.10
              ↓          ↓
              └────┬─────┘
                   ↓
              resultado
                   +
              porcentagem
                   ↓
                Console
```

---

# 🧠 Conceito de escopo

A aula utiliza o exercício para mostrar que o escopo influencia diretamente onde uma variável pode ser utilizada.

Uma variável criada fora do `if`:

```java
double resultado = 0;
```

pode ser utilizada dentro:

```java
if
```

e:

```java
else
```

porque esses blocos estão dentro do escopo onde `resultado` foi declarada.

Já uma variável criada dentro do `if`:

```java
if (...) {

    double resultado = ...;

}
```

fica restrita àquele bloco.

---

# 📌 Regra prática de escopo

Podemos memorizar:

```text
Escopo externo
     ↓
pode ser acessado por escopos internos


Escopo interno
     ↓
não pode ser acessado livremente
por escopos externos
```

Ou:

```text
┌──────────────────────────┐
│ Escopo externo           │
│                          │
│  variável A              │
│       ↓                  │
│  ┌──────────────────┐    │
│  │ Escopo interno   │    │
│  │                  │    │
│  │ acesso a A       │    │
│  │ variável B       │    │
│  └──────────────────┘    │
│                          │
│ acesso a B → ❌          │
└──────────────────────────┘
```

---

# 🔑 Conceitos importantes

- **Controle de fluxo:** permite que o programa siga caminhos diferentes.
- **`if`:** executa um bloco quando uma condição é verdadeira.
- **`else`:** executa um bloco quando a condição é falsa.
- **Escopo:** região do código onde uma variável pode ser acessada.
- **Atribuição:** substituição do valor armazenado em uma variável.
- **Inicialização:** definição do primeiro valor de uma variável.
- **`String`:** utilizada para armazenar texto.
- **Concatenação:** união de valores utilizando `+`.
- **Reutilização de variável:** utilização da mesma variável para armazenar resultados diferentes.

---

# 🧠 Modelo mental

O exercício pode ser resumido em:

```text
                  SALÁRIO
                     ↓
              ┌─────────────┐
              │ salário >   │
              │    4500?    │
              └──────┬──────┘
                     ↓
              ┌──────┴──────┐
              ↓             ↓
            true          false
              ↓             ↓
             30%           10%
              ↓             ↓
         ┌────┴─────────────┴────┐
         │                       │
         ↓                       ↓
     resultado              porcentagem
         │                       │
         └───────────┬───────────┘
                     ↓
                  Console
```

---

# 💡 Principal aprendizado

A aula amplia o conceito de condicionais apresentado anteriormente.

Agora não estamos apenas decidindo **qual mensagem imprimir**.

Estamos utilizando a condição para determinar:

1. qual cálculo realizar;
2. qual valor armazenar;
3. qual porcentagem foi utilizada;
4. como apresentar o resultado posteriormente.

O conceito de **escopo** também se torna fundamental.

Uma variável criada em um escopo externo pode ser utilizada pelos blocos internos:

```java
double resultado = 0;

if (salario > 4500) {
    resultado = salario * 0.30;
} else {
    resultado = salario * 0.10;
}
```

Dessa maneira, conseguimos executar diferentes caminhos, mas manter uma única variável para armazenar o resultado final.

Esse padrão será importante à medida que os programas começarem a ficar mais complexos.

---

## 🚀 Próxima aula

**Aula 16 — Continuação do Controle de Fluxo**