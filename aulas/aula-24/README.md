# Lógica de Programação - Virado no Jiraya

# Aula 24 — Estruturas de Decisão e Introdução ao Switch

## 📚 Sobre a aula

Nesta aula continuamos estudando **estruturas de decisão e controle de fluxo**.

O exercício principal é simples: receber um número inteiro e informar o **dia da semana correspondente**.

Apesar de o problema ser simples, ele serve para introduzir uma questão importante no desenvolvimento de software:

> **Não basta o código funcionar. Ele também precisa ser legível e fácil de manter.**

A aula apresenta uma primeira solução utilizando `if` e `else if` e, em seguida, prepara a introdução do **`switch`**, uma estrutura que pode tornar esse tipo de código mais organizado.

---

# 🎯 Objetivos da aula

Ao final da aula, os principais conceitos trabalhados são:

- Praticar `if`, `else if` e `else`;
- Trabalhar com múltiplas alternativas;
- Receber um número inteiro;
- Associar valores numéricos a determinadas opções;
- Validar entradas fora das opções esperadas;
- Compreender a importância da legibilidade do código;
- Identificar situações em que o `switch` pode ser mais adequado que vários `if`.

---

# 🧩 Exercício proposto

O problema é:

> Receber um número inteiro do usuário e imprimir o dia da semana correspondente.

A associação utilizada é:

| Número | Dia |
|---:|---|
| 1 | Segunda-feira |
| 2 | Terça-feira |
| 3 | Quarta-feira |
| 4 | Quinta-feira |
| 5 | Sexta-feira |
| 6 | Sábado |
| 7 | Domingo |

Qualquer número diferente de `1` a `7` deverá ser considerado inválido.

---

# 🧠 Primeira solução: `if` e `else if`

Uma forma de resolver o problema é utilizar uma sequência de condições:

```java
if (dia == 1) {
    // Segunda-feira
} else if (dia == 2) {
    // Terça-feira
} else if (dia == 3) {
    // Quarta-feira
}
```

E assim sucessivamente até o número `7`.

Ao final, podemos utilizar `else` para tratar valores que não correspondem a nenhum dia:

```java
else {
    // Dia inválido
}
```

---

# 🔄 Fluxo da solução

O funcionamento pode ser representado da seguinte forma:

```text
Recebe um número
       ↓
   dia == 1?
    /     \
  SIM      NÃO
   ↓        ↓
Segunda   dia == 2?
            ↓
          NÃO
            ↓
        dia == 3?
            ↓
           ...
            ↓
        dia == 7?
         /     \
       SIM      NÃO
        ↓        ↓
     Domingo  Inválido
```

A lógica funciona, mas existe uma característica que começa a chamar atenção: **há muitas condições semelhantes sendo verificadas**.

---

# ⚠️ Problema de manutenção

Para um exercício pequeno, vários `if` não representam um grande problema.

Porém, imagine um sistema muito maior, com milhares ou milhões de linhas de código.

A quantidade de estruturas condicionais pode tornar o código:

- mais difícil de ler;
- mais difícil de entender;
- mais difícil de alterar;
- mais sujeito a erros durante manutenção.

Por isso, uma preocupação importante na programação é a:

## Legibilidade do código

Código não deve ser escrito apenas para funcionar.

Ele também deve ser escrito de maneira que outros desenvolvedores consigam:

```text
ler
 ↓
entender
 ↓
alterar
 ↓
manter
```

---

# 🧹 Legibilidade e manutenibilidade

A aula chama atenção para uma prática importante da programação:

> Procurar utilizar códigos que sejam de fácil leitura.

Um código pode produzir exatamente o resultado esperado e, ainda assim, não ser uma boa solução do ponto de vista de manutenção.

Isso se torna especialmente importante em projetos grandes.

Quanto maior o sistema, maior a importância de:

- organização;
- clareza;
- simplicidade;
- padronização;
- facilidade de manutenção.

---

# 🔀 O problema do exercício

Observe a estrutura do problema:

```text
Se dia == 1 → Segunda
Se dia == 2 → Terça
Se dia == 3 → Quarta
Se dia == 4 → Quinta
...
Se dia == 7 → Domingo
```

Existe uma característica evidente:

**todas as condições estão comparando a mesma variável (`dia`) com diferentes valores.**

Esse é justamente o tipo de situação em que uma estrutura específica pode deixar o código mais organizado.

Essa estrutura é o:

```java
switch
```

---

# 🚀 Introdução ao `switch`

O `switch` permite trabalhar de maneira mais organizada quando precisamos comparar uma variável com diferentes valores possíveis.

Conceitualmente:

```text
             dia
              ↓
       ┌──────┼──────┐
       ↓      ↓      ↓
       1      2      3   ...
       ↓      ↓      ↓
   Segunda  Terça  Quarta
```

Em vez de escrever vários:

```java
if (dia == 1)
if (dia == 2)
if (dia == 3)
```

podemos utilizar uma estrutura própria para esse tipo de decisão.

A aula termina preparando justamente essa transição.

---

# 📌 Quando pensar em `switch`

Uma boa situação para considerar `switch` é quando temos:

```text
UMA variável
     ↓
VÁRIOS valores possíveis
     ↓
UMA ação diferente para cada valor
```

Exemplo:

```text
dia = 1 → Segunda
dia = 2 → Terça
dia = 3 → Quarta
...
```

Isso torna o `switch` uma alternativa natural aos diversos `if/else if` utilizados no exercício.

---

# 🧪 Testes do exercício

A aula demonstra que o algoritmo deve produzir resultados diferentes conforme o valor recebido.

### Entrada

```text
1
```

Resultado:

```text
Segunda-feira
```

### Entrada

```text
5
```

Resultado:

```text
Sexta-feira
```

### Entrada

```text
7
```

Resultado:

```text
Domingo
```

### Entrada inválida

```text
8
```

Resultado:

```text
Dia inválido
```

Esses testes ajudam a verificar se todas as possibilidades previstas foram tratadas.

---

# 🧠 Conceito importante: regra de decisão

O exercício pode ser resumido como uma tabela de decisão:

```text
Entrada → Resultado

1 → Segunda
2 → Terça
3 → Quarta
4 → Quinta
5 → Sexta
6 → Sábado
7 → Domingo
outro valor → Inválido
```

Essa forma de visualizar o problema ajuda a transformar uma necessidade em uma estrutura lógica.

---

# 💻 Do requisito ao código

A aula demonstra novamente um processo importante para quem está aprendendo programação:

```text
PROBLEMA
   ↓
IDENTIFICAR AS POSSIBILIDADES
   ↓
CRIAR AS CONDIÇÕES
   ↓
IMPLEMENTAR
   ↓
TESTAR
   ↓
ANALISAR A QUALIDADE DO CÓDIGO
```

A última etapa é especialmente importante.

Depois de fazer o código funcionar, devemos perguntar:

```text
Existe uma forma mais simples?
Existe uma forma mais legível?
Existe uma estrutura mais apropriada?
```

É exatamente essa reflexão que leva ao `switch`.

---

# 🔑 Conceitos importantes

| Conceito | Descrição |
|---|---|
| `if` | Executa um bloco quando uma condição é verdadeira |
| `else if` | Permite testar uma nova condição |
| `else` | Trata situações que não satisfizeram as condições anteriores |
| `switch` | Estrutura apropriada para múltiplas alternativas baseadas em uma expressão/valor |
| Controle de fluxo | Determina quais partes do código serão executadas |
| Legibilidade | Facilidade de compreender o código |
| Manutenibilidade | Facilidade de modificar e manter o código |
| Validação | Verificação se a entrada está dentro das opções esperadas |

---

# 💡 Principal aprendizado

A Aula 24 vai além da simples construção de uma estrutura condicional.

O exercício mostra que **existem diferentes formas de resolver o mesmo problema**.

A primeira solução pode funcionar perfeitamente:

```java
if (...)
else if (...)
else if (...)
```

Mas isso não significa necessariamente que seja a melhor solução para aquele contexto.

No exercício dos dias da semana, todas as condições verificam a mesma variável:

```text
dia
```

contra diferentes valores:

```text
1, 2, 3, 4, 5, 6, 7
```

Por isso, o `switch` surge como uma alternativa mais adequada e organizada.

O conceito importante é:

> **Programar não é apenas fazer funcionar; é também escolher uma estrutura que torne o código compreensível e sustentável.**

---

# 📊 Evolução do aprendizado

Até aqui, a evolução das estruturas de decisão pode ser visualizada:

```text
Condição simples
       ↓
     if
       ↓
Múltiplas condições
       ↓
 if / else if / else
       ↓
Operadores lógicos
       ↓
&& / ||
       ↓
Condições compostas
       ↓
Problemas mais complexos
       ↓
Escolha da estrutura adequada
       ↓
switch
```

Essa evolução é importante porque, conforme os problemas aumentam de complexidade, a escolha da estrutura correta começa a fazer diferença.

---

# 🚀 Próxima aula

Na próxima aula será apresentada a utilização do:

```java
switch
```

como alternativa aos vários `if/else if` utilizados neste exercício.

O objetivo será tornar a solução **mais simples, organizada e legível**.