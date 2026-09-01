# Exercícios — Lógica de Programação

> Lista de exercícios para consolidar os conceitos estudados no curso **Lógica de Programação — Virado no Jiraya**, do DevDojo.

Os exercícios foram organizados em uma sequência progressiva, começando pelos fundamentos e avançando até arrays, matrizes e um mini projeto final.

---

## 📚 Conteúdos abordados

Ao longo dos exercícios serão praticados:

* Variáveis
* Tipos primitivos
* Valores literais
* `String`
* `char`
* `boolean`
* Operadores aritméticos
* Operadores relacionais
* Operadores lógicos
* `if`
* `else`
* `else if`
* `Scanner`
* `switch`
* `while`
* `do-while`
* `for`
* Operador `%`
* Contadores
* Acumuladores
* Arrays
* Índices
* Propriedade `length`
* Arrays multidimensionais
* Loops aninhados
* Debugging com breakpoints
* Organização do código em pacotes

---

# 🟢 Exercícios — Fundamentos

## 01 — Informações do usuário

Crie um programa que armazene informações sobre uma pessoa utilizando diferentes tipos de dados.

O programa deve armazenar:

* Nome
* Idade
* Altura
* Sexo
* Possui carteira de motorista

Utilize tipos apropriados para cada informação.

### Requisitos

Utilize pelo menos:

* `String`
* `int`
* `double`
* `char`
* `boolean`

Ao final, imprima todas as informações.

### Exemplo

```text
Nome: João
Idade: 25
Altura: 1.75
Sexo: M
Possui CNH: true
```

### Objetivo

Praticar:

* Variáveis
* Tipos primitivos
* `String`
* Valores literais
* `System.out.println()`

---

# 🟢 02 — Calculadora de salário

Crie um programa que armazene o valor de um salário.

Calcule:

* 30% do salário
* 15% do salário
* 5% do salário

A cada cálculo, armazene o resultado em uma variável.

Depois:

1. Exiba o resultado.
2. Reutilize a variável que armazenou o resultado.
3. Utilize-a para realizar o próximo cálculo.

### Exemplo

```text
Salário: R$ 3000.00

30%: R$ 900.00
15%: R$ 450.00
5%: R$ 150.00
```

### Objetivo

Praticar:

* Variáveis
* Operadores aritméticos
* Reutilização de variáveis
* Atribuição

---

# 🟢 03 — Média do aluno

Crie um programa que receba três notas de um aluno.

Calcule a média e determine a situação do aluno.

Utilize as seguintes regras:

```text
Média >= 7     → Aprovado
Média >= 5     → Recuperação
Média < 5      → Reprovado
```

### Requisito adicional

As notas devem estar entre `0` e `10`.

Caso uma nota seja inválida, informe o usuário.

### Exemplo

```text
Nota 1: 8
Nota 2: 7
Nota 3: 9

Média: 8.0
Situação: Aprovado
```

### Objetivo

Praticar:

* Entrada de dados
* Operadores
* `if`
* `else if`
* `else`
* Comparações

---

# 🟢 04 — Classificador de números

Leia três números inteiros.

O programa deve informar:

1. O maior número.
2. O menor número.
3. Se existem números iguais.
4. Quais números são positivos.
5. Quais números são negativos.
6. Quais números são iguais a zero.

### Exemplo

```text
Número 1: 10
Número 2: -5
Número 3: 10

Maior: 10
Menor: -5
Existem números iguais.
```

### Objetivo

Praticar:

* `if`
* `else`
* Operadores relacionais
* Operadores lógicos
* Comparação entre múltiplos valores

---

# 🟡 Exercícios — Switch e estruturas de decisão

## 05 — Menu de operações

Crie uma calculadora utilizando um menu.

O programa deve apresentar:

```text
===== CALCULADORA =====

1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Dividir
5 - Sair

Escolha uma opção:
```

O usuário deverá escolher uma operação.

Depois, informe dois números e execute a operação escolhida.

Utilize `switch`.

### Regras

* Não permita divisão por zero.
* Caso o usuário informe uma opção inválida, mostre uma mensagem de erro.

### Desafio

Faça o menu continuar aparecendo até que o usuário escolha a opção `5`.

### Objetivo

Praticar:

* `switch`
* `case`
* `break`
* `default`
* Entrada de dados
* Estruturas de repetição

---

# 🟡 06 — Números pares e ímpares

Solicite ao usuário um número inteiro `N`.

Percorra todos os números de `0` até `N`.

Para cada número, informe se ele é:

* Par
* Ímpar

Utilize o operador `%`.

### Exemplo

Para:

```text
N = 10
```

Resultado:

```text
0 - Par
1 - Ímpar
2 - Par
3 - Ímpar
...
10 - Par
```

### Desafio

Ao final, informe:

* Quantidade de números pares.
* Quantidade de números ímpares.

### Objetivo

Praticar:

* `for`
* Operador `%`
* `if`
* Contadores

---

# 🟡 07 — Soma até zero

Crie um programa que leia números inteiros continuamente.

O programa deverá parar quando o usuário digitar `0`.

Ao final, informe:

* Quantidade de números digitados.
* Soma dos números.
* Média dos números.

### Exemplo

```text
Digite um número: 10
Digite um número: 20
Digite um número: 30
Digite um número: 0

Quantidade: 3
Soma: 60
Média: 20
```

### Desafio

Também informe:

* Maior número.
* Menor número.

### Objetivo

Praticar:

* `while`
* Entrada de dados
* Contadores
* Acumuladores
* Condições

---

# 🟡 08 — Jogo de adivinhação

Crie um jogo no qual um jogador deverá descobrir um número secreto entre `1` e `100`.

O programa deverá:

1. Definir um número secreto.
2. Solicitar um palpite.
3. Informar se o número secreto é maior ou menor.
4. Continuar solicitando palpites até acertar.
5. Contabilizar a quantidade de tentativas.

### Exemplo

```text
Digite seu palpite: 50

O número secreto é maior.

Digite seu palpite: 75

O número secreto é menor.

Digite seu palpite: 63

Parabéns! Você acertou.

Tentativas: 3
```

### Desafio

Pergunte ao usuário se deseja jogar novamente.

Utilize `do-while`.

### Objetivo

Praticar:

* `while`
* `do-while`
* `if`
* Contadores
* Entrada de dados

---

# 🟡 09 — Tabuada

Solicite ao usuário um número.

Exiba sua tabuada de `1` até `10`.

### Exemplo

```text
Digite um número: 7

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
```

### Desafio

Crie um menu permitindo escolher:

```text
1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Dividir
```

E utilize a estrutura de repetição para aplicar a operação de `1` até `10`.

### Objetivo

Praticar:

* `for`
* Operações aritméticas
* Entrada de dados
* `switch`

---

# 🟡 10 — Menu persistente

Crie um programa que apresente continuamente um menu.

Exemplo:

```text
===== MENU =====

1 - Exibir números de 1 a 10
2 - Exibir números pares de 1 a 10
3 - Exibir números ímpares de 1 a 10
4 - Sair

Escolha uma opção:
```

Cada opção deverá executar uma ação diferente.

O programa só deverá terminar quando o usuário escolher `4`.

### Requisitos

Utilize:

* `do-while`
* `switch`
* `for`
* `if`

### Objetivo

Este exercício combina diversos conceitos estudados no curso.

---

# 🔵 Exercícios — Arrays

## 11 — Cadastro de notas

Crie um array para armazenar cinco notas de um aluno.

Solicite as notas ao usuário.

Depois:

1. Exiba todas as notas.
2. Calcule a soma.
3. Calcule a média.
4. Encontre a maior nota.
5. Encontre a menor nota.
6. Informe quantas notas estão acima da média.

### Exemplo

```text
Notas:

8
7
9
6
10

Maior nota: 10
Menor nota: 6
Soma: 40
Média: 8
Notas acima da média: 2
```

### Objetivo

Praticar:

* Arrays
* Índices
* `length`
* `for`
* Acumuladores
* Comparações

---

# 🔵 12 — Array de números

Crie um array capaz de armazenar dez números inteiros.

Solicite os números ao usuário.

Depois apresente:

* Todos os números.
* Apenas os números pares.
* Apenas os números ímpares.
* Soma dos números.
* Média.
* Maior número.
* Menor número.

### Requisito

Utilize:

```java
array.length
```

para controlar os loops.

Não utilize manualmente:

```java
i < 10
```

### Objetivo

Praticar:

* Arrays
* `length`
* Índices
* `for`
* `%`
* Acumuladores

---

# 🔵 13 — Invertendo um array

Crie um array contendo dez números.

Depois exiba os valores na ordem original e na ordem inversa.

### Exemplo

```text
Original:

1 2 3 4 5

Invertido:

5 4 3 2 1
```

### Desafio

Crie um segundo array para armazenar os valores invertidos.

### Objetivo

Praticar:

* Arrays
* Índices
* `length`
* `for`
* Acesso reverso aos elementos

---

# 🔵 14 — Pesquisa em array

Crie um array contendo dez números inteiros.

Solicite ao usuário um número para pesquisar.

O programa deverá informar:

* Se o número existe.
* Em qual posição ele foi encontrado.

### Exemplo

```text
Array:

10 20 30 40 50

Digite um número: 30

Número encontrado!
Índice: 2
```

### Desafio

Caso o número apareça várias vezes, informe todas as posições.

### Objetivo

Praticar:

* Arrays
* Busca
* Índices
* `for`
* Condições

---

# 🟣 Exercícios — Arrays multidimensionais

## 15 — Matriz 3x3

Crie uma matriz `3x3` de números inteiros.

Solicite ao usuário todos os valores.

Depois exiba a matriz formatada.

### Exemplo

```text
1 2 3
4 5 6
7 8 9
```

### Requisito

Utilize dois loops:

```text
for externo → linhas
for interno → colunas
```

### Objetivo

Praticar:

* Arrays multidimensionais
* Matrizes
* Índices
* Loops aninhados

---

# 🟣 16 — Soma de linhas e colunas

Crie uma matriz `3x3`.

Preencha a matriz com valores informados pelo usuário.

Depois calcule:

* Soma de cada linha.
* Soma de cada coluna.
* Soma total da matriz.

### Exemplo

```text
1 2 3
4 5 6
7 8 9
```

Resultado:

```text
Soma linha 1: 6
Soma linha 2: 15
Soma linha 3: 24

Soma coluna 1: 12
Soma coluna 2: 15
Soma coluna 3: 18

Soma total: 45
```

### Objetivo

Praticar:

* Matrizes
* Loops aninhados
* Acumuladores
* Índices
* `length`

---

# 🟣 17 — Diagonal principal

Crie uma matriz quadrada `5x5`.

Exiba a matriz e identifique os elementos da diagonal principal.

Lembre-se:

```java
i == j
```

identifica os elementos da diagonal principal.

### Exemplo

```text
1 2 3
4 5 6
7 8 9
```

Diagonal principal:

```text
1 5 9
```

### Calcule

* Soma da diagonal principal.
* Multiplicação dos elementos da diagonal principal.

### Desafio

Faça o mesmo para a diagonal secundária.

### Objetivo

Praticar:

* Matrizes
* Loops aninhados
* Condições
* `i == j`
* Acumuladores
* Multiplicação

---

# 🟣 18 — Matriz e estatísticas

Crie uma matriz `5x5` de números inteiros.

Preencha a matriz e apresente:

1. A matriz completa.
2. Maior valor.
3. Menor valor.
4. Soma de todos os elementos.
5. Média.
6. Quantidade de números pares.
7. Quantidade de números ímpares.
8. Soma da diagonal principal.
9. Soma da diagonal secundária.

### Desafio

Informe também:

* A posição do maior valor.
* A posição do menor valor.

### Objetivo

Este exercício reúne praticamente todos os conceitos estudados sobre arrays multidimensionais.

---

# 🔴 MINI PROJETO FINAL

# Sistema de Cadastro e Análise de Alunos

Agora vamos juntar os conceitos estudados em um pequeno sistema.

O objetivo não é criar um sistema profissional, mas construir um programa que obrigue você a utilizar os conceitos fundamentais de lógica de programação.

---

## 🎯 Objetivo

Criar um sistema de cadastro e análise de alunos executado pelo terminal.

O programa deverá apresentar um menu principal:

```text
=================================
     SISTEMA DE ALUNOS
=================================

1 - Cadastrar alunos
2 - Exibir alunos
3 - Exibir médias
4 - Exibir maior média
5 - Exibir menor média
6 - Exibir aprovados
7 - Exibir reprovados
8 - Estatísticas da turma
9 - Sair

Escolha uma opção:
```

---

# 1 — Cadastro de alunos

O programa deverá permitir cadastrar uma quantidade definida de alunos.

Para cada aluno, armazene:

* Nome
* Idade
* Três notas

Uma possível estrutura:

```text
nomes[]
idades[]
notas[][]
```

Por exemplo:

```text
nomes[0] = "João"
idades[0] = 20

notas[0][0] = 8
notas[0][1] = 7
notas[0][2] = 9
```

---

# 2 — Exibir alunos

Apresente todos os alunos cadastrados.

### Exemplo

```text
Aluno 1
Nome: João
Idade: 20

Aluno 2
Nome: Maria
Idade: 22
```

---

# 3 — Exibir médias

Calcule a média das três notas de cada aluno.

### Exemplo

```text
João
Notas: 8, 7, 9
Média: 8.0

Maria
Notas: 6, 5, 7
Média: 6.0
```

---

# 4 — Exibir maior média

Identifique qual aluno possui a maior média.

### Exemplo

```text
Maior média:

Aluno: João
Média: 9.2
```

---

# 5 — Exibir menor média

Identifique qual aluno possui a menor média.

### Exemplo

```text
Menor média:

Aluno: Pedro
Média: 4.8
```

---

# 6 — Exibir aprovados

Considere:

```text
Média >= 7 → Aprovado
```

Liste todos os alunos aprovados.

### Exemplo

```text
===== APROVADOS =====

João - Média: 8.3
Maria - Média: 7.5
```

---

# 7 — Exibir reprovados

Considere:

```text
Média < 5 → Reprovado
```

Liste todos os alunos reprovados.

### Exemplo

```text
===== REPROVADOS =====

Pedro - Média: 4.2
Carlos - Média: 3.8
```

---

# 8 — Estatísticas da turma

Apresente informações gerais sobre a turma.

O programa deverá calcular:

* Quantidade de alunos.
* Média geral da turma.
* Maior média.
* Menor média.
* Quantidade de aprovados.
* Quantidade de reprovados.

### Exemplo

```text
===== ESTATÍSTICAS =====

Alunos: 10

Média da turma: 7.2

Maior média: 9.5
Menor média: 4.1

Aprovados: 7
Reprovados: 3
```

---

# 9 — Sair

Ao selecionar `9`, o programa deverá finalizar.

Exiba uma mensagem:

```text
Programa encerrado.
Até a próxima!
```

---

# 📋 Requisitos técnicos do projeto

O mini projeto deverá obrigatoriamente utilizar os seguintes conceitos.

## Variáveis

Utilize variáveis para armazenar informações e resultados.

---

## Tipos primitivos

Utilize diferentes tipos, como:

```java
int
double
boolean
char
```

---

## String

Utilize `String` para armazenar nomes.

---

## Scanner

Utilize `Scanner` para receber dados do usuário.

---

## if / else

Utilize estruturas condicionais para determinar situações como:

```text
Aprovado
Recuperação
Reprovado
```

---

## switch

Utilize `switch` para controlar o menu principal.

---

## while

Utilize `while` para controlar alguma repetição necessária no sistema.

---

## do-while

Utilize `do-while` para manter o menu principal funcionando até que o usuário escolha sair.

---

## for

Utilize `for` para percorrer:

* Alunos
* Notas
* Arrays

---

## Arrays

Utilize arrays para armazenar os dados dos alunos.

Exemplo:

```java
String[] nomes;
int[] idades;
```

---

## Arrays multidimensionais

Utilize uma matriz para armazenar as notas:

```java
double[][] notas;
```

Uma possível organização:

```text
            Nota 1   Nota 2   Nota 3

Aluno 0       8        7        9
Aluno 1       6        8        7
Aluno 2       9        9        10
```

---

## Loops aninhados

Utilize loops aninhados para percorrer a matriz de notas.

Exemplo conceitual:

```java
for (int i = 0; i < notas.length; i++) {

    for (int j = 0; j < notas[i].length; j++) {

        // processamento da nota

    }

}
```

---

# ⭐ Desafios extras

Depois de concluir o projeto principal, tente implementar os seguintes recursos.

## Desafio 1 — Recuperação

Crie uma situação intermediária:

```text
Média >= 7 → Aprovado
Média >= 5 → Recuperação
Média < 5  → Reprovado
```

---

## Desafio 2 — Maior nota individual

Descubra a maior nota de toda a turma.

Informe:

```text
Aluno
Nota
```

---

## Desafio 3 — Menor nota individual

Descubra a menor nota de toda a turma.

---

## Desafio 4 — Acima da média da turma

Calcule a média geral da turma.

Depois informe quais alunos possuem média acima da média da turma.

---

## Desafio 5 — Validação

Não permita que o usuário informe notas menores que `0` ou maiores que `10`.

---

## Desafio 6 — Menu persistente

Depois de executar qualquer operação, o programa deverá retornar ao menu principal.

---

## Desafio 7 — Quantidade dinâmica

Pergunte ao usuário quantos alunos serão cadastrados.

Por exemplo:

```text
Quantos alunos deseja cadastrar? 10
```

Depois crie os arrays com esse tamanho.

---

# 🧠 Regra importante

Neste primeiro momento, tente resolver o projeto utilizando **somente os conceitos estudados no curso**.

Evite utilizar:

* Classes auxiliares complexas
* Collections
* `ArrayList`
* `HashMap`
* Streams
* Lambda
* `enum`
* Banco de dados
* Frameworks
* Spring
* POO avançada

A ideia é testar sua capacidade de resolver problemas utilizando os fundamentos de lógica de programação.

Posteriormente, o mesmo projeto poderá ser reconstruído utilizando conceitos mais avançados de Java.

---

# 📊 Mapa de cobertura dos exercícios

| Conceito               | Exercícios               |
| ---------------------- | ------------------------ |
| Variáveis              | 01–18                    |
| Tipos primitivos       | 01–04                    |
| String                 | 01, 11, 18, Mini Projeto |
| Operadores             | 01–18                    |
| if / else              | 03–10, 11–18             |
| Scanner                | 03–05, 07–11, 15–18      |
| switch                 | 05, 09, 10, Mini Projeto |
| while                  | 07, 08, 10, Mini Projeto |
| do-while               | 08, 10, Mini Projeto     |
| for                    | 06, 09, 10–18            |
| Operador `%`           | 06, 12, 18               |
| Contadores             | 06–08, 11, 12, 18        |
| Acumuladores           | 07, 11, 12, 16–18        |
| Arrays                 | 11–14                    |
| `length`               | 11–14                    |
| Matrizes               | 15–18                    |
| Loops aninhados        | 15–18                    |
| Diagonal principal     | 17, 18                   |
| Organização em pacotes | Mini Projeto             |
| Debugging              | Todos os exercícios      |

---

# 🗺️ Recomendação Final

## Etapa 1 — Fundamentos

Resolva:

```text
01 → 02 → 03 → 04
```

Objetivo:

> Consolidar variáveis, tipos, operadores e condicionais.

---

## Etapa 2 — Controle de fluxo

Resolva:

```text
05 → 06 → 07 → 08 → 09 → 10
```

Objetivo:

> Consolidar `switch`, `while`, `do-while` e `for`.

---

## Etapa 3 — Arrays

Resolva:

```text
11 → 12 → 13 → 14
```

Objetivo:

> Aprender a pensar em conjuntos de dados e percorrê-los.

---

## Etapa 4 — Matrizes

Resolva:

```text
15 → 16 → 17 → 18
```

Objetivo:

> Consolidar arrays multidimensionais e loops aninhados.

---

## Etapa 5 — Projeto final

Por último:

```text
MINI PROJETO
```

Objetivo:

> Utilizar todos os conceitos em um problema único.

---

# 🏁 Objetivo final

Ao concluir esta lista, você deverá ser capaz de olhar para um problema simples e pensar em termos de:

```text
ENTRADA
   ↓
PROCESSAMENTO
   ↓
DECISÃO
   ↓
REPETIÇÃO
   ↓
ARMAZENAMENTO
   ↓
SAÍDA
```

Mais importante do que decorar a sintaxe do Java é desenvolver a capacidade de **quebrar um problema em pequenas etapas lógicas**.

Esse é o fundamento que será levado para os próximos estudos de Java, Orientação a Objetos, Spring e demais tecnologias do ecossistema.
