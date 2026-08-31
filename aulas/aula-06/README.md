# Lógica de Programação - Virado no Jiraya

# Aula 06 — Memória Volátil

## 📚 Sobre a aula

Nesta aula é introduzido o conceito de **memória** e sua relação com os programas que estão sendo executados.

O objetivo é preparar o entendimento necessário para as próximas aulas, nas quais serão apresentadas as **variáveis e os tipos de dados em Java**.

---

## 🧠 Memória volátil

O computador possui diferentes tipos de memória.

A aula apresenta inicialmente a **memória volátil**, representada principalmente pela **memória RAM**.

A memória RAM é:

- volátil;
- rápida;
- utilizada durante a execução dos programas;
- compartilhada entre o sistema operacional e as aplicações em execução.

Por ser volátil, seus dados são perdidos quando o computador é desligado.

---

## 💻 Memória utilizada pelo computador

A memória RAM disponível no computador não é utilizada exclusivamente pelo programa que estamos desenvolvendo.

Uma parte é utilizada pelo **Sistema Operacional**, enquanto o restante é compartilhado pelas aplicações em execução.

Podemos representar de forma simplificada:

```text
Memória RAM
│
├── Sistema Operacional
│
├── Aplicações
│   ├── Navegador
│   ├── Outros programas
│   └── ...
│
└── Programa em execução
```

Quando um programa Java está sendo executado, a **JVM também utiliza memória** para executar o programa.

```text
Memória RAM
      │
      ├── Sistema Operacional
      │
      ├── Outras aplicações
      │
      └── JVM
           │
           └── Programa Java
```

---

## ⚙️ Por que precisamos entender memória?

Atualmente os computadores possuem quantidades significativas de memória RAM, como:

```text
8 GB
12 GB
16 GB
32 GB
...
```

Por isso, durante o aprendizado inicial de programação, normalmente não precisamos nos preocupar excessivamente com a quantidade de memória utilizada por cada dado.

Entretanto, entender como a memória funciona é importante porque programas maiores e mais complexos podem consumir grandes quantidades de memória.

Além disso, em ambientes de **computação em nuvem**, a quantidade de recursos utilizados pode influenciar diretamente o custo da infraestrutura.

---

## 🔢 Bit

O **bit** é apresentado como a menor unidade de informação utilizada pelo computador.

Um bit pode assumir dois valores:

```text
0
1
```

Isso está relacionado à forma como os computadores representam informações internamente utilizando estados binários.

De forma simplificada:

```text
Bit
 │
 ├── 0
 └── 1
```

---

## 📦 Byte

Um **byte** é formado por **8 bits**.

```text
1 byte = 8 bits
```

Podemos representar um byte como:

```text
┌───┬───┬───┬───┬───┬───┬───┬───┐
│ 0 │ 1 │ 0 │ 1 │ 1 │ 0 │ 0 │ 1 │
└───┴───┴───┴───┴───┴───┴───┴───┘
                8 bits
```

Cada posição pode armazenar um `0` ou um `1`.

---

## 🔢 Sistema decimal e sistema binário

Os seres humanos normalmente utilizam o **sistema decimal**, que possui base 10:

```text
0 1 2 3 4 5 6 7 8 9
```

Os computadores trabalham internamente utilizando o **sistema binário**, baseado em dois valores:

```text
0 e 1
```

Por isso, um valor numérico utilizado por um programa precisa ser representado internamente em uma forma que o computador consiga armazenar.

---

## 🔄 Decimal × Binário

Um mesmo número pode possuir representações diferentes nos sistemas decimal e binário.

Por exemplo:

```text
Decimal: 10
Binário: 1010
```

O número decimal `10` precisa de apenas quatro bits para sua representação binária:

```text
1010
```

Já valores maiores podem exigir mais bits.

Por exemplo, o número `50` pode ser representado utilizando oito bits:

```text
00110010
```

---

## 📐 Limitação de espaço

Quando reservamos um determinado espaço de memória, existe uma quantidade limitada de informação que pode ser armazenada nele.

Se temos:

```text
1 byte
```

temos:

```text
8 bits
```

Portanto, existem apenas determinadas combinações possíveis de `0` e `1` que podem ser armazenadas nesse espaço.

Um exemplo apresentado na aula é o número `128`.

Sua representação binária exige **9 bits**:

```text
128 → 10000000
```

A quantidade de bits necessária para representar um valor é importante porque o espaço disponível na memória é limitado.

---

## 📊 Unidades de medida

A memória pode ser medida utilizando diferentes unidades.

Entre elas:

```text
Bit
 ↓
Byte
 ↓
Kilobyte
 ↓
Megabyte
 ↓
Gigabyte
 ↓
Terabyte
 ↓
Petabyte
```

A ideia fundamental é que a memória possui uma **capacidade limitada de armazenamento**, e os dados utilizados pelos programas ocupam espaço.

---

## 💾 Memória e programas

Quando um programa é executado, ele precisa utilizar memória.

O próprio programa precisa de espaço para funcionar, e os dados utilizados durante sua execução também precisam ser armazenados.

De maneira simplificada:

```text
Programa
   ↓
Utiliza memória
   ↓
Armazena dados
   ↓
Processa dados
```

Em linguagens modernas, como Java, o programador normalmente não precisa especificar manualmente cada espaço de memória que será utilizado.

Em vez disso, informa o **tipo de dado** que deseja armazenar.

---

## ☕ Relação com Java

A aula prepara o conceito que será utilizado nas próximas aulas:

> Para armazenar dados na memória, precisamos definir que tipo de dado estamos trabalhando.

Por exemplo, poderemos ter uma variável destinada a armazenar:

```text
número inteiro
```

ou outra destinada a armazenar:

```text
número decimal
```

O tipo de dado influencia a quantidade e a forma como o espaço será utilizado.

Nas próximas aulas veremos como isso é representado em Java através das **variáveis e dos tipos primitivos**.

---

## 🔑 Conceitos importantes

- **Memória volátil:** memória cujo conteúdo é perdido quando o computador é desligado.
- **RAM:** memória utilizada pelos programas durante sua execução.
- **Bit:** menor unidade de informação apresentada na aula, podendo representar `0` ou `1`.
- **Byte:** conjunto de 8 bits.
- **Binário:** sistema de representação baseado em `0` e `1`.
- **Decimal:** sistema numérico utilizado normalmente pelos seres humanos, baseado em 10.
- **Memória:** recurso utilizado pelo sistema operacional e pelos programas durante a execução.
- **Tipo de dado:** informação utilizada para definir que tipo de valor será armazenado pelo programa.

---

## 🧠 Modelo mental

O conceito apresentado nesta aula pode ser resumido assim:

```text
Computador
    ↓
Memória RAM
    ↓
Espaços de memória
    ↓
Bits e Bytes
    ↓
Dados
    ↓
Programa utiliza e processa esses dados
```

Em Java:

```text
Programa Java
     ↓
JVM
     ↓
Memória
     ↓
Dados
     ↓
Processamento
```

---

## 💡 Principal aprendizado

Todo programa precisa utilizar memória para armazenar informações durante sua execução.

A memória possui capacidade limitada e seus espaços são formados, em última análise, por unidades binárias representadas por **bits e bytes**.

Neste momento, não é necessário controlar manualmente cada posição da memória. Em linguagens modernas como Java, o programador trabalha principalmente declarando **tipos de dados**, enquanto o ambiente de execução administra o armazenamento.

O conceito de memória será utilizado diretamente nas próximas aulas, quando começarmos a trabalhar com **variáveis e tipos de dados em Java**.

---

## 🚀 Próxima aula

**Aula 07 — Variáveis e Tipos Primitivos**