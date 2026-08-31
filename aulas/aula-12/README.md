# Lógica de Programação - Virado no Jiraya

# Aula 12 — `char`, `String` e `boolean`

## 📚 Sobre a aula

Nesta aula continuamos o estudo dos tipos de dados utilizados em Java.

O foco principal está nos tipos:

- `char`;
- `String`;
- `boolean`.

Também são apresentados alguns atalhos do IntelliJ IDEA para facilitar a escrita e edição do código.

---

# ⚡ Atalhos do IntelliJ IDEA

A IDE possui atalhos que ajudam a acelerar o desenvolvimento.

Um exemplo apresentado é o uso de:

```text
psvm + Tab
```

para gerar automaticamente:

```java
public static void main(String[] args) {

}
```

Outro atalho apresentado é:

```text
sout + Tab
```

que gera:

```java
System.out.println();
```

Esses recursos são chamados de **Live Templates** e permitem gerar estruturas de código rapidamente.

---

## 📋 Outros atalhos

Também são apresentados atalhos para manipular linhas de código.

### Duplicar uma linha

```text
Ctrl + D
```

### Excluir uma linha

```text
Ctrl + Y
```

### Executar

```text
Shift + F10
```

Esses atalhos tornam o desenvolvimento mais rápido e reduzem a necessidade de escrever estruturas repetitivas manualmente.

---

# 🔤 Tipo `char`

O tipo:

```java
char
```

é utilizado para armazenar **um único caractere**.

Exemplo:

```java
char inicial = 'L';
```

A sintaxe utiliza **aspas simples**:

```java
'L'
```

---

## 📦 `char` e representação numérica

Um `char` está relacionado a uma representação numérica dos caracteres.

Por isso, podemos fazer:

```java
char letra = 65;
```

Quando o valor é utilizado como `char`, o Java associa esse valor ao caractere correspondente na tabela de caracteres utilizada.

Por exemplo:

```text
65 → A
66 → B
```

Assim:

```java
char letra = 65;

System.out.println(letra);
```

pode produzir:

```text
A
```

---

# 🔢 Caracteres e valores numéricos

Essa característica acontece porque o caractere possui uma representação numérica.

Podemos visualizar:

```text
Valor numérico
      ↓
Tabela de caracteres
      ↓
Caractere correspondente
```

Por exemplo:

```text
65 → A
66 → B
```

Portanto, um `char` pode ser utilizado com valores numéricos correspondentes aos caracteres.

---

# ➕ Operações com `char`

Um ponto importante apresentado na aula é que o comportamento do operador `+` depende do contexto.

Por exemplo:

```java
char masculino = 'M';
char feminino = 'F';

System.out.println(masculino + feminino);
```

Nesse caso, o Java pode realizar uma operação numérica utilizando os valores associados aos caracteres.

O resultado não será necessariamente:

```text
MF
```

Para trabalhar com os caracteres como texto, precisamos considerar a utilização de `String`.

---

# 📝 Convertendo para texto

Quando queremos garantir que o resultado seja tratado como texto, podemos utilizar uma `String`.

Por exemplo:

```java
System.out.println("" + masculino + feminino);
```

Nesse caso, o `+` passa a realizar concatenação.

Resultado:

```text
MF
```

A partir do momento em que uma `String` participa da expressão, o comportamento do `+` passa a ser de concatenação.

---

# 🧵 Tipo `String`

`String` é utilizada para representar uma **sequência de caracteres**.

Por exemplo:

```java
String nome = "Luciano";
```

Enquanto:

```java
char letra = 'L';
```

representa um único caractere:

```text
'L'
```

uma `String` pode representar vários:

```text
"Luciano"
```

---

## 🔤 Aspas simples × aspas duplas

Essa diferença é importante em Java:

### `char`

Utiliza aspas simples:

```java
char letra = 'A';
```

### `String`

Utiliza aspas duplas:

```java
String nome = "Luciano";
```

Podemos resumir:

```text
'A'
 ↓
char
 ↓
um caractere


"Java"
 ↓
String
 ↓
sequência de caracteres
```

---

# 📏 Uma `String` pode conter vários caracteres

Uma `String` pode armazenar uma palavra:

```java
String nome = "Luciano";
```

ou uma frase inteira:

```java
String mensagem = "Olá, seja bem-vindo!";
```

Diferentemente do `char`, não estamos limitados a apenas um caractere.

---

# 💾 `char` × `String`

A aula chama atenção para a diferença de utilização de memória.

Se precisamos armazenar apenas um caractere:

```java
char sexo = 'M';
```

não faz sentido utilizar uma `String` contendo apenas um caractere:

```java
String sexo = "M";
```

Embora ambas possam representar `M`, são tipos diferentes e possuem comportamentos diferentes.

A escolha do tipo deve considerar aquilo que realmente precisamos armazenar.

---

# 🔤 Convenção de nomenclatura

A aula reforça que `String` é uma exceção em relação aos tipos primitivos apresentados anteriormente.

Os tipos primitivos são escritos com letra minúscula:

```text
byte
short
int
long
float
double
char
boolean
```

Já:

```java
String
```

começa com letra maiúscula.

Isso ocorre porque `String` não é um tipo primitivo.

---

# ✔️ Tipo `boolean`

O tipo:

```java
boolean
```

é utilizado para representar valores lógicos.

Ele trabalha com apenas dois valores:

```java
true
false
```

Exemplo:

```java
boolean masculino = true;
```

Ou:

```java
boolean feminino = false;
```

---

# 🔀 `boolean` em Java

Em algumas linguagens de programação, valores booleanos podem ser representados utilizando `0` e `1`.

De acordo com a explicação da aula, Java trabalha diretamente com:

```java
true
false
```

Portanto, devemos declarar:

```java
boolean condicao = true;
```

ou:

```java
boolean condicao = false;
```

---

# 🧠 Booleano e lógica

O tipo `boolean` será especialmente importante para os próximos conteúdos do curso.

Uma variável booleana pode representar o resultado de uma condição.

Por exemplo:

```java
boolean maiorDeIdade = true;
```

Podemos pensar:

```text
Condição
   ↓
Verdadeira ou falsa
   ↓
boolean
```

Esse conceito será fundamental quando começarmos a trabalhar com **condicionais**.

---

# 🖨️ Imprimindo um `boolean`

Podemos imprimir diretamente uma variável booleana:

```java
boolean condicao = true;

System.out.println(condicao);
```

Resultado:

```text
true
```

Também podemos utilizar uma `String` para apresentar o resultado:

```java
System.out.println("Condição: " + condicao);
```

Resultado:

```text
Condição: true
```

---

# ⚠️ `boolean` e `String`

É importante diferenciar:

```java
boolean valor = true;
```

de:

```java
String valor = "true";
```

No primeiro caso:

```text
true
```

é um valor booleano.

No segundo:

```text
"true"
```

é um texto.

As aspas fazem toda a diferença.

```text
true
 ↓
boolean

"true"
 ↓
String
```

---

# 🔑 Tipos estudados até aqui

Ao longo das aulas, foram apresentados os principais tipos utilizados nos exercícios iniciais:

### Inteiros

```java
byte
short
int
long
```

### Ponto flutuante

```java
float
double
```

### Caractere

```java
char
```

### Booleano

```java
boolean
```

Além disso:

```java
String
```

é utilizada para representar sequências de caracteres.

---

# 📊 Resumo dos tipos

| Tipo | Utilização |
|---|---|
| `byte` | Inteiros pequenos |
| `short` | Inteiros |
| `int` | Inteiros |
| `long` | Inteiros maiores |
| `float` | Números decimais |
| `double` | Números decimais |
| `char` | Um único caractere |
| `boolean` | `true` ou `false` |
| `String` | Sequência de caracteres |

---

# 🧩 Exemplo utilizando os tipos da aula

```java
public class TiposPrimitivos {

    public static void main(String[] args) {

        char inicial = 'L';

        String nome = "Luciano";

        boolean estudante = true;

        System.out.println("Inicial: " + inicial);
        System.out.println("Nome: " + nome);
        System.out.println("Estudante: " + estudante);
    }
}
```

Resultado:

```text
Inicial: L
Nome: Luciano
Estudante: true
```

---

# 🧠 Modelo mental

Podemos organizar os conceitos apresentados desta forma:

```text
Dados
 │
 ├── Números inteiros
 │     ├── byte
 │     ├── short
 │     ├── int
 │     └── long
 │
 ├── Números decimais
 │     ├── float
 │     └── double
 │
 ├── Caractere
 │     └── char
 │
 ├── Texto
 │     └── String
 │
 └── Lógica
       └── boolean
```

---

# 💡 Principal aprendizado

Nesta aula aprendemos a diferenciar três formas importantes de representar informações:

```text
char
 ↓
um único caractere


String
 ↓
uma sequência de caracteres


boolean
 ↓
true ou false
```

Também aprendemos que o tipo escolhido influencia a forma como o Java interpreta e manipula o valor.

Além disso, a aula prepara o terreno para as **estruturas condicionais**, nas quais valores booleanos serão utilizados para representar o resultado de condições.

---

## 🚀 Próxima aula

**Aula 13 — Operadores**
