# Lógica de Programação - Virado no Jiraya

# Aula 07 — Tipos Primitivos e Declaração de Variáveis

## 📚 Sobre a aula

Nesta aula começamos a trabalhar efetivamente com **variáveis em Java**.

Depois de compreender que os programas utilizam espaços de memória para armazenar dados, o próximo passo é aprender como esses espaços são definidos e acessados através das variáveis.

O Java é uma linguagem **fortemente tipada**, portanto, ao criar uma variável, precisamos informar qual tipo de dado ela poderá armazenar.

---

# 🔒 Tipagem forte

Java é uma linguagem fortemente tipada.

Isso significa que, ao criar uma variável, precisamos informar o seu tipo.

Por exemplo:

```java
int idade;
```

Nesse caso estamos dizendo ao Java:

```text
Crie uma variável
      ↓
do tipo int
      ↓
que poderá armazenar um número inteiro
```

Não podemos simplesmente utilizar a variável para armazenar qualquer tipo de informação.

Por exemplo:

```java
int idade = 30;
```

é válido.

Já tentar armazenar um valor incompatível com o tipo da variável poderá gerar um erro de compilação.

---

# 🧱 Tipos primitivos

Java possui **oito tipos primitivos**.

São eles:

| Tipo | Categoria |
|---|---|
| `byte` | Inteiro |
| `short` | Inteiro |
| `int` | Inteiro |
| `long` | Inteiro |
| `float` | Ponto flutuante |
| `double` | Ponto flutuante |
| `char` | Caractere |
| `boolean` | Booleano |

Esses são os tipos mais básicos disponibilizados pela linguagem.

---

# 📊 Tamanho dos tipos

Cada tipo primitivo possui uma determinada capacidade de armazenamento.

De forma geral:

| Tipo | Tamanho | Utilização |
|---|---:|---|
| `byte` | 8 bits | Inteiros pequenos |
| `short` | 16 bits | Inteiros |
| `int` | 32 bits | Inteiros |
| `long` | 64 bits | Inteiros maiores |
| `float` | 32 bits | Decimais |
| `double` | 64 bits | Decimais |
| `char` | 16 bits | Caracteres |
| `boolean` | — | `true` / `false` |

A escolha do tipo determina a quantidade de memória e a faixa de valores que pode ser representada.

---

# 🔢 Tipos inteiros

Os tipos utilizados para números inteiros são:

```text
byte
short
int
long
```

Podemos visualizar de forma simplificada:

```text
byte
  ↓
short
  ↓
int
  ↓
long
```

Quanto maior a capacidade do tipo, maior a quantidade de valores que pode ser representada.

---

## `int`

O `int` utiliza **32 bits**.

É um dos tipos inteiros mais utilizados em Java.

Exemplo:

```java
int idade = 35;
```

Nesse caso:

```text
Tipo:       int
Nome:       idade
Valor:      35
```

---

## `long`

O `long` utiliza **64 bits** e permite armazenar valores inteiros maiores que o `int`.

Exemplo:

```java
long populacao = 1000000000L;
```

---

## `short`

O `short` utiliza **16 bits** e possui uma faixa de valores menor que `int`.

Exemplo:

```java
short quantidade = 1000;
```

---

## `byte`

O `byte` utiliza **8 bits**.

É adequado quando precisamos representar valores inteiros pequenos.

Exemplo:

```java
byte idade = 35;
```

A aula utiliza esse conceito para mostrar que devemos escolher o tipo de acordo com aquilo que pretendemos armazenar.

---

# 🔢 Faixa de valores

Como cada tipo possui uma quantidade limitada de bits, existe também uma faixa limitada de valores que pode ser armazenada.

Por exemplo, o `int` possui 32 bits e permite representar valores inteiros dentro de uma determinada faixa.

A faixa apresentada para `int` é aproximadamente:

```text
-2.147.483.648
        até
 2.147.483.647
```

Portanto:

```java
int idade = 35;
```

é perfeitamente adequado.

---

# 🧠 Escolha do tipo

A escolha do tipo deve levar em consideração o problema que estamos tentando resolver.

Imagine um sistema que precisa armazenar a idade de uma pessoa.

Não faria sentido utilizar um tipo capaz de armazenar valores gigantescos se sabemos que a idade será um número relativamente pequeno.

Por exemplo:

```java
byte idade = 35;
```

pode representar uma idade.

Entretanto, devemos considerar também as necessidades futuras do sistema.

Um tipo muito pequeno pode causar problemas caso o domínio do sistema seja alterado posteriormente.

Portanto:

> A escolha do tipo deve considerar tanto os valores atuais quanto as necessidades do sistema.

---

# 🔢 Tipos de ponto flutuante

Java possui dois tipos principais para números decimais:

```text
float
double
```

O `float` utiliza 32 bits.

O `double` utiliza 64 bits.

Exemplo:

```java
float altura = 1.75F;
double salario = 2500.50;
```

Esses tipos permitem trabalhar com números que possuem casas decimais.

---

# 🔤 `char`

O tipo:

```java
char
```

é utilizado para representar **um caractere**.

Ele utiliza 16 bits.

Uma característica importante é que um `char` representa apenas um caractere.

Exemplo:

```java
char inicial = 'L';
```

Observe a utilização de aspas simples:

```java
'L'
```

---

# 📝 `char` × `String`

É importante não confundir:

```java
char
```

com:

```java
String
```

Um `char` representa um único caractere:

```java
char letra = 'A';
```

Uma `String` representa uma sequência de caracteres:

```java
String nome = "Luciano";
```

A aula destaca essa diferença ao apresentar a utilização de aspas simples e duplas.

```text
'A'
 ↓
char

"Java"
 ↓
String
```

---

# ✔️ `boolean`

O tipo:

```java
boolean
```

é utilizado para representar valores lógicos.

Seus valores são:

```java
true
false
```

Exemplo:

```java
boolean maiorDeIdade = true;
```

Esse tipo será especialmente importante posteriormente para trabalhar com condições e decisões.

---

# 📝 Declaração de uma variável

Para declarar uma variável, precisamos informar:

```text
tipo + nome
```

Por exemplo:

```java
int idade;
```

Podemos representar:

```text
int
 ↓
tipo

idade
 ↓
identificador
```

Essa operação é chamada de **declaração da variável**.

---

# 💾 Variável e memória

Quando declaramos:

```java
int idade;
```

estamos indicando ao Java que precisamos de um espaço apropriado para armazenar um valor do tipo `int`.

Como `int` possui 32 bits:

```text
int
 ↓
32 bits
 ↓
espaço adequado para armazenar o valor
```

A variável `idade` funciona como um identificador que permite acessar esse espaço.

---

# 📥 Atribuição

Depois de declarar uma variável, podemos atribuir um valor utilizando o operador:

```java
=
```

Exemplo:

```java
int idade;
idade = 35;
```

Nesse caso:

```text
idade
  ↓
35
```

O sinal `=` representa uma **atribuição**.

---

# ⚡ Declaração e inicialização

Podemos declarar e atribuir o valor ao mesmo tempo:

```java
int idade = 35;
```

Nesse caso temos:

```text
Declaração
    +
Inicialização
    ↓
int idade = 35;
```

A variável é criada e recebe seu primeiro valor na mesma instrução.

---

# 🧩 Exemplo completo

```java
public class ViradoNoJiraya {

    public static void main(String[] args) {

        int idade = 35;

        System.out.println(idade);
    }
}
```

O programa:

1. cria uma variável `idade`;
2. define seu tipo como `int`;
3. atribui o valor `35`;
4. imprime o valor armazenado.

Resultado:

```text
35
```

---

# 🖨️ Acessando o valor da variável

Para imprimir o valor armazenado em uma variável:

```java
System.out.println(idade);
```

O Java utiliza o identificador:

```text
idade
```

para localizar o valor associado a ele.

```text
idade
  ↓
memória
  ↓
35
```

Portanto:

```java
System.out.println(idade);
```

produzirá:

```text
35
```

---

# 📝 Variável × valor literal

Existe uma diferença importante entre:

```java
System.out.println(idade);
```

e:

```java
System.out.println("idade");
```

No primeiro caso:

```java
idade
```

é interpretado como uma variável.

No segundo:

```java
"idade"
```

é uma **String literal**.

Resultado:

```text
System.out.println(idade);

35
```

Enquanto:

```java
System.out.println("idade");

idade
```

As aspas duplas fazem com que `idade` seja interpretado como texto literal.

---

# 🔗 Concatenação

Podemos combinar uma String com o valor de uma variável utilizando o operador:

```java
+
```

Exemplo:

```java
int idade = 35;

System.out.println("Minha idade é " + idade);
```

Resultado:

```text
Minha idade é 35
```

Nesse contexto, o `+` não está realizando uma soma.

Ele está realizando uma **concatenação**, ou seja, juntando uma String com o valor da variável.

---

## 🔄 Como funciona a concatenação

Podemos representar:

```text
"Minha idade é "
        +
      idade
        ↓
"Minha idade é 35"
```

O valor armazenado na variável é recuperado e combinado com o texto.

---

# ⚠️ O `+` pode ter funções diferentes

O operador `+` pode representar operações diferentes dependendo do contexto.

### Soma

```java
int resultado = 10 + 20;
```

Resultado:

```text
30
```

### Concatenação

```java
System.out.println("Idade: " + idade);
```

Resultado:

```text
Idade: 35
```

Portanto, o contexto determina o comportamento do operador.

---

# 🧠 Fluxo completo

Podemos resumir o processo de criação e utilização de uma variável:

```text
Escolher o tipo
      ↓
Declarar a variável
      ↓
Definir o identificador
      ↓
Reservar espaço adequado
      ↓
Atribuir um valor
      ↓
Utilizar a variável
      ↓
Obter o valor armazenado
```

Exemplo:

```java
int idade = 35;

System.out.println("Idade: " + idade);
```

---

# 📌 Convenções de nomenclatura

A aula reforça algumas convenções importantes.

### Variáveis

Começam normalmente com letra minúscula:

```java
idade
```

### Nomes compostos

Utilizamos **camelCase**:

```java
idadeDaMinhaMae
```

### Classes

Começam com letra maiúscula:

```java
CalculadoraIdade
```

---

## 🚫 Evite nomes pouco significativos

Evite:

```java
int x = 35;
```

Prefira:

```java
int idade = 35;
```

O nome da variável deve ajudar a explicar o que aquele dado representa.

Uma boa variável deve continuar fazendo sentido mesmo quando você voltar ao código meses depois.

---

# 🔑 Conceitos importantes

- **Tipagem forte:** as variáveis possuem um tipo definido.
- **Tipo primitivo:** tipo básico da linguagem Java.
- **Variável:** identificador associado a um espaço utilizado para armazenar um valor.
- **Declaração:** definição do tipo e do nome da variável.
- **Inicialização:** atribuição do primeiro valor à variável.
- **Atribuição:** utilização do operador `=` para colocar um valor na variável.
- **`int`:** tipo primitivo para números inteiros de 32 bits.
- **`long`:** tipo inteiro de 64 bits.
- **`short`:** tipo inteiro de 16 bits.
- **`byte`:** tipo inteiro de 8 bits.
- **`float`:** tipo para números de ponto flutuante de 32 bits.
- **`double`:** tipo para números de ponto flutuante de 64 bits.
- **`char`:** tipo para um único caractere.
- **`boolean`:** tipo lógico que representa `true` ou `false`.
- **Literal:** valor escrito diretamente no código.
- **Concatenação:** união de valores, como uma String e uma variável, utilizando `+`.

---

# 🧠 Modelo mental

A aula pode ser resumida pelo seguinte processo:

```text
              Tipo
               ↓
             int
               ↓
        Criar variável
               ↓
             idade
               ↓
       Reservar memória
               ↓
           Atribuir 35
               ↓
         idade → 35
               ↓
          Utilizar
               ↓
System.out.println(idade)
               ↓
              35
```

---

# 💡 Principal aprendizado

Uma variável em Java possui três elementos fundamentais:

```text
Tipo + Identificador + Valor
```

Por exemplo:

```java
int idade = 35;
```

onde:

```text
int
 ↓
tipo

idade
 ↓
identificador

35
 ↓
valor
```

O tipo determina **que tipo de informação pode ser armazenada** e influencia o espaço necessário na memória.

O identificador permite que o programa faça referência ao espaço de memória associado à variável.

O valor é a informação armazenada naquele momento.

A partir desse conceito, podemos começar a construir programas que manipulam dados de forma dinâmica.

---

## 🚀 Próxima aula

**Aula 08 — Comentários, Convenções e Exercício de Diferença de Idade**