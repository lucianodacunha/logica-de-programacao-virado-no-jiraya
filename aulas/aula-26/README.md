# Lógica de Programação - Virado no Jiraya

# Aula 26 — Switch/Case

## 📚 Sobre a aula

Nesta aula continuamos estudando **estruturas de decisão e controle de fluxo**.

O assunto principal é a estrutura:

```java
switch/case
```

Ela oferece uma alternativa ao uso de vários `if/else if` quando precisamos avaliar **uma mesma variável contra diferentes valores possíveis**.

O exercício utilizado como exemplo é o dos **dias da semana**, desenvolvido anteriormente com diversos `if`.

---

# 🎯 Objetivos da aula

- Conhecer a estrutura `switch/case`;
- Entender a sintaxe do `switch`;
- Utilizar `case` para representar diferentes possibilidades;
- Entender o funcionamento do `break`;
- Utilizar `default` para tratar situações não previstas;
- Compreender o comportamento do `switch`;
- Conhecer algumas restrições dos tipos utilizados no `switch`;
- Perceber quando o `switch` pode tornar o código mais legível.

---

# 🔀 Switch x If

No exercício anterior, tínhamos uma variável contendo o número do dia:

```java
int dia = 1;
```

E várias condições:

```java
if (dia == 1) {
    System.out.println("Segunda-feira");
} else if (dia == 2) {
    System.out.println("Terça-feira");
} else if (dia == 3) {
    System.out.println("Quarta-feira");
}
```

Esse código funciona, mas fica cada vez mais extenso conforme aumenta a quantidade de possibilidades.

Quando estamos avaliando **uma única variável contra vários valores**, o `switch` pode deixar essa lógica mais organizada.

---

# 🧱 Estrutura básica do Switch

A sintaxe apresentada é baseada na seguinte estrutura:

```java
switch (variavel) {

    case valor:
        // código
        break;

    case outroValor:
        // código
        break;

    default:
        // código padrão
}
```

A variável é colocada entre os parênteses do `switch`:

```java
switch (dia) {
```

Depois são definidos os possíveis valores utilizando `case`:

```java
case 1:
```

---

# 🔎 Funcionamento do `case`

No exemplo dos dias da semana:

```java
switch (dia) {

    case 1:
        System.out.println("Segunda-feira");
        break;

    case 2:
        System.out.println("Terça-feira");
        break;
}
```

O Java verifica o valor armazenado em `dia` e procura um `case` correspondente.

Se:

```java
dia = 1;
```

o Java encontra:

```java
case 1:
```

e executa o código associado a ele.

---

# 🛑 O papel do `break`

Um dos conceitos mais importantes da aula é o `break`.

Ele é utilizado para informar que a execução do `switch` deve ser interrompida.

Exemplo:

```java
case 1:
    System.out.println("Segunda-feira");
    break;
```

Depois de executar o código do `case 1`, o `break` faz o programa sair do `switch` e continuar a execução normalmente após essa estrutura.

---

# ⚠️ O que acontece sem `break`?

O `switch` possui um comportamento importante.

Quando encontra um `case` correspondente, ele começa a executar aquele bloco e **continua executando os próximos blocos** até encontrar um `break` ou chegar ao final do `switch`.

Por exemplo:

```java
switch (dia) {

    case 1:
        System.out.println("Segunda-feira");

    case 2:
        System.out.println("Terça-feira");
}
```

Se:

```java
dia = 1;
```

o programa pode executar:

```text
Segunda-feira
Terça-feira
```

Isso acontece porque não existe um `break` após o primeiro `case`.

Portanto, em uma utilização convencional do `switch`, é importante lembrar:

```text
case
 ↓
executa código
 ↓
break
 ↓
sai do switch
```

---

# 🧪 Exemplo completo

Uma implementação para os dias da semana pode ser:

```java
switch (dia) {

    case 1:
        System.out.println("Segunda-feira");
        break;

    case 2:
        System.out.println("Terça-feira");
        break;

    case 3:
        System.out.println("Quarta-feira");
        break;

    case 4:
        System.out.println("Quinta-feira");
        break;

    case 5:
        System.out.println("Sexta-feira");
        break;

    case 6:
        System.out.println("Sábado");
        break;

    case 7:
        System.out.println("Domingo");
        break;

    default:
        System.out.println("Dia inválido");
}
```

Essa estrutura representa diretamente a relação:

```text
1 → Segunda-feira
2 → Terça-feira
3 → Quarta-feira
4 → Quinta-feira
5 → Sexta-feira
6 → Sábado
7 → Domingo
outro → Dia inválido
```

---

# 🧩 Default

O `default` funciona como uma espécie de alternativa padrão.

Ele será executado quando nenhum dos `case` corresponder ao valor avaliado.

Por exemplo:

```java
default:
    System.out.println("Dia inválido");
```

Se:

```java
dia = 10;
```

nenhum dos seguintes valores será encontrado:

```text
1
2
3
4
5
6
7
```

Então será executado:

```java
default
```

resultando em:

```text
Dia inválido
```

---

# 📌 Posicionamento do `default`

A aula demonstra que o `default` pode aparecer em diferentes posições dentro do `switch`.

Porém, a recomendação apresentada é deixá-lo **no final**.

Exemplo:

```java
switch (dia) {

    case 1:
        // ...

    case 2:
        // ...

    case 3:
        // ...

    default:
        // ...
}
```

Dessa forma, a estrutura fica mais fácil de compreender logicamente:

```text
case 1
case 2
case 3
...
case 7

se nenhum deles funcionar
        ↓
    default
```

---

# 🧠 Como o Switch toma a decisão?

Podemos representar o funcionamento assim:

```text
                 dia
                  ↓
             switch(dia)
                  ↓
       ┌──────────┼──────────┐
       ↓          ↓          ↓
    case 1     case 2     case 3 ...
       ↓          ↓          ↓
    Segunda     Terça     Quarta
       ↓          ↓          ↓
     break      break      break
       ↓          ↓          ↓
       └──────────┴──────────┘
                  ↓
            continua o programa
```

Caso nenhum `case` corresponda:

```text
switch(dia)
     ↓
nenhum case corresponde
     ↓
  default
     ↓
continua o programa
```

---

# ⚠️ Tipos utilizados no Switch

A aula também apresenta algumas restrições relacionadas ao tipo da variável utilizada no `switch`.

De acordo com o conteúdo apresentado, podem ser utilizados tipos como:

- `byte`;
- `short`;
- `int`;
- `char`;
- `String`;
- `enum`.

O `long`, por exemplo, não é apresentado como um tipo permitido nesse contexto.

Neste momento, o objetivo não é aprofundar todas as regras, mas conhecer os principais tipos que podem ser utilizados.

---

# 🧮 Exemplo com `int`

Como o exercício utiliza um número representando o dia da semana, podemos usar:

```java
int dia = 5;
```

E então:

```java
switch (dia) {

    case 1:
        System.out.println("Segunda-feira");
        break;

    case 2:
        System.out.println("Terça-feira");
        break;

    case 5:
        System.out.println("Sexta-feira");
        break;
}
```

Nesse caso:

```text
dia = 5
  ↓
case 5
  ↓
Sexta-feira
  ↓
break
```

---

# 📝 Switch e legibilidade

Um dos principais motivos para utilizar o `switch` apresentado na aula é a **melhor organização visual do código**.

Compare:

```java
if (dia == 1) {
    ...
} else if (dia == 2) {
    ...
} else if (dia == 3) {
    ...
}
```

com:

```java
switch (dia) {

    case 1:
        ...
        break;

    case 2:
        ...
        break;

    case 3:
        ...
        break;
}
```

Quando temos muitas possibilidades para uma mesma variável, o `switch` torna a intenção do código mais evidente.

---

# 🔑 Conceitos importantes

| Conceito | Descrição |
|---|---|
| `switch` | Estrutura utilizada para avaliar uma variável e selecionar uma alternativa |
| `case` | Representa uma possibilidade de valor |
| `break` | Interrompe a execução do `switch` |
| `default` | Executa quando nenhum `case` corresponde |
| `fall-through` | Comportamento em que a execução continua para os próximos `case` quando não há `break` |
| Legibilidade | Um dos motivos para utilizar `switch` em determinadas situações |

---

# 🚨 Cuidado com o `break`

Um dos pontos que merece maior atenção nesta aula é:

```java
break;
```

Não basta saber escrever:

```java
case 1:
```

É necessário entender que, normalmente, depois de executar o bloco correspondente, devemos utilizar:

```java
break;
```

para evitar que os próximos `case` sejam executados.

Exemplo:

```java
case 1:
    System.out.println("Segunda-feira");
    break;
```

---

# 🧪 Testando diferentes valores

Podemos testar:

### `dia = 1`

```text
Segunda-feira
```

### `dia = 4`

```text
Quinta-feira
```

### `dia = 7`

```text
Domingo
```

### `dia = 10`

```text
Dia inválido
```

Assim conseguimos verificar tanto os `case` válidos quanto o `default`.

---

# 💡 Principal aprendizado

O `switch` é uma estrutura de controle de fluxo utilizada principalmente quando precisamos escolher entre **várias possibilidades baseadas no valor de uma mesma expressão**.

A estrutura pode ser resumida como:

```text
switch
  ↓
case
  ↓
executa
  ↓
break
```

E quando nenhuma opção corresponde:

```text
switch
  ↓
nenhum case encontrado
  ↓
default
```

O ponto mais importante desta aula não é apenas decorar a sintaxe.

É reconhecer o padrão do problema:

> **Uma variável + vários valores possíveis + uma ação diferente para cada valor.**

Nesse cenário, o `switch` pode proporcionar uma solução mais organizada e legível do que uma sequência extensa de `if/else if`.

---

# 🚀 Evolução do aprendizado

Até aqui, as estruturas de decisão estudadas podem ser organizadas assim:

```text
if
 ↓
else if
 ↓
else
 ↓
Operadores de comparação
 ↓
Operadores lógicos
 ↓
Condições compostas
 ↓
switch
 ↓
case
 ↓
break
 ↓
default
```

A evolução mostra que não basta conhecer uma única estrutura de decisão. É necessário saber **qual estrutura é mais adequada para cada tipo de problema**.

---

# 📚 Próximo passo

A partir daqui, podemos continuar utilizando as estruturas de controle para resolver problemas cada vez mais complexos, aplicando os conceitos de:

- condições;
- operadores;
- `if/else`;
- `switch/case`;
- `break`;
- `default`;
- organização e legibilidade do código.