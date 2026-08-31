# Lógica de Programação - Virado no Jiraya

# Aula 27 — Switch/Case: Aplicando a uma Regra de Negócio

## 📚 Sobre a aula

Nesta aula continuamos estudando a estrutura de decisão **`switch/case`**, apresentada na aula anterior.

Depois de aprender a sintaxe básica, o funcionamento do `case`, a importância do `break` e o uso do `default`, o conceito é aplicado a um exercício que representa uma situação mais próxima de um sistema real.

O problema consiste em permitir que o usuário informe o **tipo de conta bancária** e, a partir dessa informação, o sistema determine a **porcentagem de juros correspondente**.

O exercício trabalha principalmente a capacidade de transformar uma regra de negócio em uma estrutura de decisão.

---

# 🎯 Objetivos da aula

- Reforçar o uso do `switch/case`;
- Praticar a utilização de múltiplos `case`;
- Utilizar `break` corretamente;
- Aplicar `default` para situações não previstas;
- Relacionar uma entrada numérica a diferentes comportamentos;
- Transformar uma regra de negócio em código;
- Praticar a leitura e interpretação de requisitos.

---

# 🔄 Relação com a Aula 26

Na Aula 26 foi apresentado um problema em que uma variável `dia` poderia assumir valores de `1` a `7`.

A lógica era:

```text
1 → Segunda-feira
2 → Terça-feira
3 → Quarta-feira
...
7 → Domingo
```

O `switch` era utilizado porque tínhamos:

```text
uma variável
     +
vários valores possíveis
     +
uma ação para cada valor
```

Na Aula 27, o mesmo raciocínio é aplicado a outro domínio:

```text
tipo de conta
     +
vários tipos possíveis
     +
uma taxa de juros para cada tipo
```

Portanto, o objetivo não é aprender uma nova estrutura de controle, mas **consolidar o uso do `switch/case` em outro problema**.

---

# 🏦 O exercício

O requisito apresentado é:

```java
/**
 * Como gerente, eu gostaria que meus usuarios pudessem digitar o tipo de conta
 * e o sistema imprimir qual a porcentagem de juros que aquela conta ira
 * oferecer. Os tipos de contas sao:
 * 1 - POUPANCA: 0.05%
 * 2 - CORRENTE: 0.02%
 * 3 - INVESTIMENTO: 0.10%
 */
```

Podemos interpretar a regra da seguinte maneira:

| Código | Tipo de conta | Juros |
|---:|---|---:|
| `1` | Poupança | `0.05%` |
| `2` | Corrente | `0.02%` |
| `3` | Investimento | `0.10%` |

---

# 🧠 Transformando o requisito em lógica

Antes de escrever código, podemos transformar o problema em uma sequência lógica:

```text
Receber o tipo da conta
        ↓
Avaliar o tipo informado
        ↓
┌───────────────┐
│ 1 → Poupança  │
│ 2 → Corrente  │
│ 3 → Invest.   │
└───────────────┘
        ↓
Informar a taxa correspondente
```

Esse é exatamente o tipo de problema em que o `switch` se encaixa bem.

---

# 🔀 Utilizando Switch/Case

A estrutura conceitual será:

```java
switch (tipoConta) {

    case 1:
        // Poupança
        break;

    case 2:
        // Corrente
        break;

    case 3:
        // Investimento
        break;

    default:
        // Tipo de conta inválido
}
```

Observe que a estrutura é praticamente a mesma utilizada na aula anterior.

O que mudou foi apenas o **problema que estamos tentando resolver**.

---

# 🧩 Os Cases

Cada `case` representa uma possibilidade definida pelo requisito.

### Case 1 — Poupança

```java
case 1:
```

Representa:

```text
1 → POUPANÇA → 0.05%
```

### Case 2 — Corrente

```java
case 2:
```

Representa:

```text
2 → CORRENTE → 0.02%
```

### Case 3 — Investimento

```java
case 3:
```

Representa:

```text
3 → INVESTIMENTO → 0.10%
```

---

# 🛑 Novamente: o `break`

Assim como na Aula 26, o `break` é fundamental.

Exemplo:

```java
case 1:
    System.out.println("Poupança: 0.05%");
    break;
```

Depois de executar o `case 1`, o `break` encerra o `switch`.

Sem ele, o Java pode continuar executando os `case` seguintes.

Portanto, o fluxo esperado é:

```text
case encontrado
      ↓
executa
      ↓
break
      ↓
sai do switch
```

---

# ❓ Utilizando o Default

O exercício apresenta três tipos válidos:

```text
1
2
3
```

Mas o usuário pode informar qualquer outro número.

Por exemplo:

```text
4
```

Nesse caso, nenhum dos `case` será correspondente.

Podemos utilizar:

```java
default:
    System.out.println("Tipo de conta inválido");
```

O fluxo passa a ser:

```text
1 → Poupança
2 → Corrente
3 → Investimento
outros → Conta inválida
```

---

# 🧪 Exemplos de execução

### Entrada

```text
1
```

Resultado esperado:

```text
Poupança: 0.05%
```

### Entrada

```text
2
```

Resultado esperado:

```text
Corrente: 0.02%
```

### Entrada

```text
3
```

Resultado esperado:

```text
Investimento: 0.10%
```

### Entrada

```text
4
```

Resultado:

```text
Tipo de conta inválido
```

---

# 🧱 Estrutura completa do problema

A lógica pode ser representada assim:

```text
                 tipoConta
                     ↓
               switch(tipoConta)
                     ↓
       ┌─────────────┼─────────────┐
       ↓             ↓             ↓
    case 1        case 2        case 3
       ↓             ↓             ↓
   Poupança       Corrente    Investimento
    0.05%           0.02%        0.10%
       ↓             ↓             ↓
     break         break         break
       └─────────────┼─────────────┘
                     ↓
                continua
```

E, caso nenhum `case` seja encontrado:

```text
tipoConta
    ↓
nenhum case corresponde
    ↓
default
    ↓
conta inválida
```

---

# 💡 O principal aprendizado

O exercício mostra uma aplicação importante do `switch`: **representar diferentes comportamentos associados a valores específicos de uma mesma variável**.

Na Aula 26:

```text
dia = 1
     ↓
Segunda-feira
```

Na Aula 27:

```text
tipoConta = 1
     ↓
Poupança
     ↓
0.05%
```

A estrutura permanece praticamente a mesma.

O que muda é a **regra de negócio**.

---

# 🧠 Pensando como programador

Um ponto importante desta aula é aprender a separar:

### 1. Requisito

O gerente deseja:

> Informar o tipo de conta e descobrir a taxa de juros.

### 2. Regras

```text
1 → Poupança → 0.05%
2 → Corrente → 0.02%
3 → Investimento → 0.10%
```

### 3. Implementação

Utilizar:

```java
switch/case
```

Essa transformação:

```text
REQUISITO
   ↓
REGRAS
   ↓
LÓGICA
   ↓
CÓDIGO
```

é uma das habilidades fundamentais no desenvolvimento de software.

---

# 📌 Conceitos reforçados

| Conceito | Aplicação na aula |
|---|---|
| `switch` | Avaliar o tipo de conta |
| `case` | Representar cada tipo de conta |
| `break` | Encerrar cada alternativa |
| `default` | Tratar tipos de conta inválidos |
| Regra de negócio | Definir a taxa de cada conta |
| Controle de fluxo | Escolher qual código executar |
| Legibilidade | Manter alternativas organizadas |

---

# 🚀 Evolução das aulas 24–27

Podemos enxergar uma evolução clara:

```text
Aula 24
↓
if / else if
↓
Várias condições
↓
Aula 25
↓
Organização do código com pacotes
↓
Aula 26
↓
Introdução ao switch/case
↓
case + break + default
↓
Aula 27
↓
Aplicação do switch em uma regra de negócio
```

A Aula 26 ensinou **como funciona o `switch`**.

A Aula 27 começa a trabalhar **como reconhecer situações em que ele pode ser utilizado**.

---

# 🔑 Para memorizar

Quando encontrar um problema parecido com:

```text
Uma variável
      +
vários valores possíveis
      +
uma ação diferente para cada valor
```

pense em:

```java
switch
```

Por exemplo:

```text
Tipo de conta
    ↓
1 → Poupança
2 → Corrente
3 → Investimento
```

É um cenário clássico para `switch/case`.

---

# 📝 Exercício para praticar

Uma boa forma de consolidar a aula é tentar implementar o requisito sem consultar a solução.

Comece apenas com:

```java
int tipoConta = 1;
```

Depois implemente:

```java
switch (tipoConta) {
    ...
}
```

E faça o programa produzir a taxa correspondente.

Depois teste:

```text
1
2
3
4
```

O último teste é importante porque permite verificar se o `default` está funcionando corretamente.

---

# 🎓 Resumo final

A Aula 27 é uma aula de **fixação do `switch/case`**.

O conceito apresentado na aula anterior — utilizar `switch` quando uma variável pode assumir diferentes valores e cada valor possui um comportamento específico — é aplicado agora a uma situação de negócio envolvendo **tipos de contas e taxas de juros**.

O exercício reforça:

```text
switch
 ├── case 1 → Poupança → 0.05%
 ├── case 2 → Corrente → 0.02%
 ├── case 3 → Investimento → 0.10%
 └── default → Tipo inválido
```

O aprendizado mais importante é começar a reconhecer o **padrão lógico do problema**, em vez de simplesmente decorar a sintaxe.

> **Programar não é apenas saber escrever `switch`. É saber olhar para um requisito e identificar que aquele problema pode ser representado por um `switch`.**