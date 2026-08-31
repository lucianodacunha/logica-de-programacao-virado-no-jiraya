# Lógica de Programação - Virado no Jiraya

# Aula 08 — Comentários, Variáveis e Exercício de Diferença de Idade

## 📚 Sobre a aula

Nesta aula são apresentados alguns conceitos importantes antes da utilização da IDE:

- comentários em Java;
- sintaxe da linguagem;
- convenções de nomenclatura;
- criação de múltiplas variáveis;
- atribuição de valores;
- operações entre variáveis;
- impressão de resultados no console.

Ao final, é desenvolvido um pequeno exercício para calcular a diferença entre duas idades.

---

# 💬 Comentários

Comentários são trechos de código que **não são considerados pelo compilador**.

Eles são utilizados principalmente para fornecer informações aos desenvolvedores, ajudando a explicar determinados trechos do código.

```text
Código
   │
   ├── Instruções → compiladas
   │
   └── Comentários → ignorados pelo compilador
```

Os comentários podem ser utilizados para:

- explicar um trecho específico;
- documentar uma decisão;
- facilitar a compreensão do código;
- deixar alguma observação para outros desenvolvedores.

---

## 📝 Comentário de uma linha

Para criar um comentário de uma linha, utilizamos:

```java
// Este é um comentário
```

Tudo que estiver depois de `//`, naquela linha, será ignorado pelo compilador.

Exemplo:

```java
int idade = 30;

// Calcula a diferença entre as idades
int diferenca = idade - 20;
```

---

## 📄 Comentário de múltiplas linhas

Para comentar várias linhas, utilizamos:

```java
/*
   Este é um comentário
   de múltiplas linhas.
*/
```

Tudo que estiver entre:

```text
/*
```

e:

```text
*/
```

será tratado como comentário.

Exemplo:

```java
/*
   Este trecho explica
   o funcionamento
   do programa.
*/
```

---

# ⚠️ Comentários e boas práticas

A aula apresenta uma discussão importante sobre a utilização de comentários.

Uma abordagem apresentada é que o código deve ser, sempre que possível, **autoexplicativo**.

Isso significa que devemos procurar escrever código cuja intenção seja compreendida através de:

- nomes claros;
- métodos bem definidos;
- estrutura organizada;
- código simples.

Por exemplo:

```java
int idade;
```

é muito mais compreensível que:

```java
int x;
```

Nesse caso, o nome da variável já explica sua finalidade.

---

# 🏷️ Nomes de variáveis

A aula reforça a importância de utilizar nomes significativos.

Evite:

```java
int x;
int y;
int z;
```

Prefira:

```java
int primeiraIdade;
int segundaIdade;
int diferencaIdade;
```

Mesmo que nomes maiores sejam utilizados, eles podem tornar o código muito mais fácil de compreender.

```text
Nome curto
    ↓
x
    ↓
Pouca informação

Nome significativo
    ↓
diferencaIdade
    ↓
Mais informação
```

---

# 🌎 Convenção de nomenclatura

A aula reforça algumas convenções utilizadas em Java.

### Classes

Os nomes das classes começam com letra maiúscula.

Exemplo:

```java
CalculadoraDiferencaIdade
```

### Variáveis

Os nomes das variáveis começam normalmente com letra minúscula.

Exemplo:

```java
primeiraIdade
segundaIdade
diferencaIdade
```

### Palavras compostas

Quando um identificador possui mais de uma palavra, utiliza-se a convenção conhecida como **camelCase** para variáveis:

```java
primeiraIdade
segundaIdade
diferencaIdade
```

Para classes:

```java
CalculadoraDiferencaIdade
```

---

# 🧮 Exercício — Diferença de idade

O exercício proposto consiste em criar uma classe capaz de calcular a diferença entre duas idades.

O problema pode ser dividido em três informações:

```text
Primeira idade
       +
Segunda idade
       ↓
Diferença entre as idades
```

---

## 📦 Criando as variáveis

Primeiro criamos uma variável para armazenar a primeira idade:

```java
int primeiraIdade = 30;
```

Depois, uma variável para armazenar a segunda:

```java
int segundaIdade = 15;
```

Temos então duas variáveis armazenando valores diferentes:

```text
primeiraIdade → 30

segundaIdade  → 15
```

---

# 💾 Variáveis e memória

Cada variável representa um espaço utilizado pelo programa para armazenar um valor.

Podemos representar:

```text
Memória

┌────────────────────┐
│ primeiraIdade      │
│        30          │
└────────────────────┘

┌────────────────────┐
│ segundaIdade       │
│        15          │
└────────────────────┘
```

O programa não precisa trabalhar diretamente com os valores `30` e `15` em todas as operações.

Podemos trabalhar utilizando os **nomes das variáveis**.

---

# ➖ Calculando a diferença

Para calcular a diferença entre as duas idades:

```java
int diferencaIdade = primeiraIdade - segundaIdade;
```

O Java irá buscar os valores armazenados nas variáveis:

```text
primeiraIdade → 30
segundaIdade  → 15
```

e realizar:

```text
30 - 15
```

resultando em:

```text
15
```

O resultado será armazenado em:

```java
diferencaIdade
```

---

# 🖨️ Exibindo o resultado

Podemos utilizar:

```java
System.out.println(diferencaIdade);
```

para imprimir o resultado.

Também podemos apresentar uma mensagem:

```java
System.out.println("Diferença de idade: " + diferencaIdade);
```

Resultado:

```text
Diferença de idade: 15
```

---

# 🧩 Programa completo

Um exemplo completo do exercício:

```java
public class CalculadoraDiferencaIdade {

    public static void main(String[] args) {

        int primeiraIdade = 30;
        int segundaIdade = 15;

        int diferencaIdade = primeiraIdade - segundaIdade;

        System.out.println("Diferença de idade: " + diferencaIdade);
    }
}
```

---

# 🔄 Como o programa funciona

Podemos acompanhar o processamento:

```text
1. Criar primeiraIdade
          ↓
       valor 30

2. Criar segundaIdade
          ↓
       valor 15

3. Criar diferencaIdade
          ↓
 primeiraIdade - segundaIdade
          ↓
       30 - 15
          ↓
          15

4. Exibir resultado
          ↓
Diferença de idade: 15
```

---

# 🔢 Trabalhando com valores diferentes

Uma característica importante das variáveis é que podemos alterar seus valores sem precisar alterar a lógica do cálculo.

Por exemplo:

```java
int primeiraIdade = 45;
int segundaIdade = 30;
```

A expressão:

```java
int diferencaIdade = primeiraIdade - segundaIdade;
```

continuará sendo exatamente a mesma.

O resultado será:

```text
15
```

Isso demonstra uma ideia fundamental da programação:

> A lógica do programa pode trabalhar com valores armazenados nas variáveis, em vez de depender de valores fixos diretamente na expressão.

---

# ➖ Números negativos

Se a primeira idade for menor que a segunda:

```java
int primeiraIdade = 30;
int segundaIdade = 45;
```

a operação:

```java
primeiraIdade - segundaIdade
```

produzirá:

```text
-15
```

O Java consegue trabalhar com números negativos.

O tratamento e as operações envolvendo números negativos serão aprofundados posteriormente no curso.

---

# 🔑 Conceitos importantes

- **Comentário:** trecho ignorado pelo compilador.
- **Comentário de uma linha:** iniciado por `//`.
- **Comentário de múltiplas linhas:** delimitado por `/*` e `*/`.
- **Variável:** espaço utilizado para armazenar um valor.
- **Atribuição:** associação de um valor a uma variável.
- **Identificador:** nome utilizado para identificar classes, variáveis e outros elementos.
- **CamelCase:** convenção utilizada para nomes compostos.
- **Operador `-`:** utilizado para realizar subtração.
- **`System.out.println()`:** utilizado para imprimir informações no console.

---

# 🧠 Modelo mental

O exercício permite visualizar a relação entre variáveis e operações:

```text
        Memória
           │
     ┌─────┴─────┐
     ↓           ↓
 primeira      segunda
  idade         idade
     ↓           ↓
    30           15
     └─────┬─────┘
           ↓
       subtração
           ↓
      30 - 15
           ↓
     diferença
           ↓
          15
           ↓
        Console
```

---

# 💡 Principal aprendizado

Nesta aula começamos a trabalhar com **mais de uma variável** e a utilizar essas variáveis em uma expressão.

O ponto importante é entender que não precisamos realizar operações diretamente sobre valores fixos.

Podemos armazenar os valores em variáveis e trabalhar com seus identificadores:

```java
int diferencaIdade = primeiraIdade - segundaIdade;
```

Assim, a mesma lógica funciona independentemente dos valores armazenados.

A aula também reforça a importância de escrever código legível, utilizando nomes significativos e seguindo as convenções da linguagem.

---

## 🚀 Próxima aula

**Aula 09 — IntelliJ IDEA**