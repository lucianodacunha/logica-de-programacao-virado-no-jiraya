# Lógica de Programação - Virado no Jiraya

# Aula 14 — Operadores Relacionais e Controle de Fluxo

## 📚 Sobre a aula

Nesta aula continuamos o estudo de **controle de fluxo**, aprofundando o uso das estruturas condicionais.

O principal objetivo é aprender como realizar **comparações** em Java e utilizar o resultado dessas comparações dentro de estruturas como:

```java
if
```

e:

```java
else
```

As condicionais são apresentadas como um conceito fundamental da programação, independentemente da linguagem utilizada. A sintaxe pode mudar entre linguagens, mas a lógica de decisão permanece bastante semelhante.

---

# 🔀 Controle de fluxo

Um programa normalmente executa suas instruções de forma sequencial.

As estruturas de controle de fluxo permitem alterar esse comportamento, fazendo com que o programa siga caminhos diferentes dependendo de determinadas condições.

Podemos representar:

```text
            Condição
                ↓
        ┌───────┴───────┐
        ↓               ↓
      true            false
        ↓               ↓
    caminho A       caminho B
```

O resultado de uma condição é sempre um valor booleano:

```java
true
```

ou:

```java
false
```

---

# 🔍 Operadores relacionais

Para realizar comparações, Java possui operadores relacionais.

Os principais apresentados nesta aula são:

| Operador | Significado |
|---|---|
| `==` | Igual a |
| `!=` | Diferente de |
| `<` | Menor que |
| `>` | Maior que |
| `<=` | Menor ou igual a |
| `>=` | Maior ou igual a |

Esses operadores produzem um resultado booleano.

Por exemplo:

```java
idade == 18
```

pode resultar em:

```text
true
```

ou:

```text
false
```

---

# ⚠️ `=` não é comparação

Uma das diferenças mais importantes desta aula é distinguir:

```java
=
```

de:

```java
==
```

## Atribuição

O operador:

```java
=
```

é utilizado para **atribuir um valor** a uma variável.

Exemplo:

```java
int idade = 18;
```

Nesse caso:

```text
idade ← 18
```

Estamos armazenando o valor `18` na variável.

---

## Comparação

Já:

```java
==
```

é utilizado para verificar se dois valores são iguais.

Exemplo:

```java
idade == 18
```

A pergunta agora é:

```text
idade é igual a 18?
```

O resultado será:

```text
true
```

ou:

```text
false
```

---

# 🧠 Diferença fundamental

Podemos memorizar:

```text
= 
↓
atribuição

==
↓
comparação
```

Exemplo:

```java
int idade = 18;
```

→ coloca `18` na variável.

Enquanto:

```java
idade == 18
```

→ verifica se `idade` possui o valor `18`.

---

# 🟰 Operador de igualdade `==`

O operador:

```java
==
```

verifica se dois valores são iguais.

Exemplo:

```java
int idade = 18;

if (idade == 18) {
    System.out.println("A idade é 18");
}
```

Como:

```text
18 == 18
```

é verdadeiro, o bloco do `if` será executado.

---

# ❌ Operador de diferença `!=`

O operador:

```java
!=
```

verifica se dois valores são diferentes.

Exemplo:

```java
int idade = 15;

if (idade != 18) {
    System.out.println("A idade é diferente de 18");
}
```

Como:

```text
15 != 18
```

é verdadeiro, o bloco será executado.

Se:

```java
idade = 18;
```

então:

```text
18 != 18
```

será:

```text
false
```

---

# ⬇️ Operador menor que `<`

O operador:

```java
<
```

verifica se o valor da esquerda é menor que o valor da direita.

Exemplo:

```java
int idade = 15;

if (idade < 18) {
    System.out.println("Menor de idade");
}
```

A comparação:

```text
15 < 18
```

resulta em:

```text
true
```

Portanto, o bloco será executado.

---

# ⬆️ Operador maior que `>`

O operador:

```java
>
```

verifica se o valor da esquerda é maior que o valor da direita.

Exemplo:

```java
int idade = 25;

if (idade > 18) {
    System.out.println("Adulto");
}
```

A comparação:

```text
25 > 18
```

resulta em:

```text
true
```

---

# ⬇️ Operador menor ou igual `<=`

O operador:

```java
<=
```

significa:

```text
menor ou igual
```

Exemplo:

```java
idade <= 18
```

Essa condição será verdadeira quando:

```text
idade < 18
```

ou quando:

```text
idade == 18
```

Por exemplo:

```text
15 <= 18 → true
18 <= 18 → true
25 <= 18 → false
```

---

# ⬆️ Operador maior ou igual `>=`

O operador:

```java
>=
```

significa:

```text
maior ou igual
```

Exemplo:

```java
idade >= 18
```

Essa condição será verdadeira quando:

```text
idade > 18
```

ou:

```text
idade == 18
```

Exemplos:

```text
25 >= 18 → true
18 >= 18 → true
15 >= 18 → false
```

---

# 📊 Resumo dos operadores

| Expressão | Significado |
|---|---|
| `a == b` | `a` é igual a `b` |
| `a != b` | `a` é diferente de `b` |
| `a < b` | `a` é menor que `b` |
| `a > b` | `a` é maior que `b` |
| `a <= b` | `a` é menor ou igual a `b` |
| `a >= b` | `a` é maior ou igual a `b` |

---

# 🧪 Exercício — Verificação de idade

O exercício proposto consiste em:

> Receber uma idade. Se a idade for maior que 18, imprimir que a pessoa é adulta. Caso contrário, informar que ainda não é adulta.

A lógica pode ser representada:

```text
Receber idade
      ↓
idade > 18?
   ↓       ↓
 true    false
   ↓       ↓
Adulto   Não adulto
```

---

# 💻 Implementação

Podemos implementar a lógica utilizando:

```java
int idade = 25;

if (idade > 18) {

    System.out.println("Adulto");

} else {

    System.out.println("Ainda não é adulto");

}
```

Se:

```java
idade = 25;
```

a comparação:

```java
25 > 18
```

resultará em:

```text
true
```

Portanto:

```text
Adulto
```

será impresso.

---

# ⚠️ Atenção ao requisito

Um ponto importante do exercício é interpretar exatamente o que foi solicitado.

Se o requisito diz:

```text
idade maior que 18
```

devemos utilizar:

```java
idade > 18
```

e não:

```java
idade >= 18
```

Essas duas condições possuem comportamentos diferentes.

### Maior que 18

```java
idade > 18
```

Para:

```text
18
```

o resultado é:

```text
false
```

### Maior ou igual a 18

```java
idade >= 18
```

Para:

```text
18
```

o resultado é:

```text
true
```

Portanto, escolher corretamente o operador faz parte da resolução do problema.

---

# 🔄 Outra forma de escrever a lógica

Também podemos inverter a condição.

Em vez de perguntar:

```java
idade > 18
```

podemos perguntar:

```java
idade <= 18
```

Por exemplo:

```java
int idade = 18;

if (idade <= 18) {

    System.out.println("Ainda não é adulto");

} else {

    System.out.println("Adulto");

}
```

Nesse caso, estamos invertendo a lógica original.

A ideia é:

```text
Se idade <= 18
    ainda não é adulto

Senão
    adulto
```

---

# 🧠 Comparação gera `boolean`

Um ponto fundamental desta aula é entender que os operadores relacionais produzem um valor booleano.

Por exemplo:

```java
int idade = 15;

idade > 18
```

não produz um número.

Produz:

```text
false
```

Podemos pensar:

```text
15 > 18
   ↓
 false
```

E:

```java
if (idade > 18)
```

utiliza justamente esse resultado para decidir qual bloco executar.

---

# 🔗 Relação entre `boolean` e `if`

O conteúdo das aulas anteriores começa a se conectar:

```text
Variável
   ↓
Valor armazenado
   ↓
Operador relacional
   ↓
true / false
   ↓
if / else
   ↓
Caminho de execução
```

Exemplo:

```java
int idade = 25;

if (idade > 18) {
    System.out.println("Adulto");
}
```

O processamento pode ser entendido como:

```text
idade = 25
   ↓
25 > 18
   ↓
true
   ↓
executa o if
   ↓
"Adulto"
```

---

# 🔤 Tipos que podem ser comparados

As comparações precisam fazer sentido para os tipos envolvidos.

Por exemplo:

```java
int idade = 18;
```

podemos fazer:

```java
idade > 15
```

porque estamos comparando valores numéricos.

Porém, não faz sentido utilizar um operador como `>` para comparar diretamente uma `String` com um número:

```java
String nome = "Luciano";

nome > 18;
```

Essa operação não é válida.

O Java identificará que os tipos envolvidos não são compatíveis com esse operador.

---

# 🔤 Comparação de `char`

A aula também demonstra que `char` possui uma característica particular.

Um `char` possui uma representação numérica por trás dos caracteres.

Por isso, comparações envolvendo `char` podem ser realizadas com operadores relacionais.

Exemplo:

```java
char letra = 'A';
```

Como o `char` possui uma representação numérica, o Java consegue realizar determinadas comparações envolvendo caracteres.

---

# 🧩 Estrutura completa

O conhecimento acumulado até aqui permite escrever estruturas como:

```java
int idade = 25;

if (idade > 18) {

    System.out.println("Adulto");

} else {

    System.out.println("Ainda não é adulto");

}
```

Temos:

```text
Variável
   ↓
idade = 25
   ↓
Comparação
   ↓
idade > 18
   ↓
boolean
   ↓
true
   ↓
if
   ↓
"Adulto"
```

---

# 🔑 Conceitos importantes

- **Controle de fluxo:** permite alterar o caminho de execução do programa.
- **Operador relacional:** realiza comparações entre valores.
- **`=`:** operador de atribuição.
- **`==`:** operador de igualdade.
- **`!=`:** operador de diferença.
- **`<`:** menor que.
- **`>`:** maior que.
- **`<=`:** menor ou igual.
- **`>=`:** maior ou igual.
- **Boolean:** resultado de uma comparação, podendo ser `true` ou `false`.
- **`if`:** executa um bloco quando a condição é verdadeira.
- **`else`:** executa o bloco alternativo quando a condição é falsa.

---

# 🧠 Modelo mental

O conceito principal da aula pode ser resumido assim:

```text
             DADO
               ↓
          COMPARAÇÃO
               ↓
        ┌──────┴──────┐
        ↓             ↓
      true          false
        ↓             ↓
       if            else
        ↓             ↓
   caminho A      caminho B
```

Os operadores relacionais são responsáveis por transformar uma comparação em uma decisão lógica:

```text
25 > 18
   ↓
true
```

ou:

```text
15 > 18
   ↓
false
```

---

# 💡 Principal aprendizado

A principal evolução desta aula é compreender que uma estrutura condicional não precisa receber apenas um `boolean` armazenado em uma variável.

Podemos construir uma **expressão de comparação** diretamente dentro do `if`:

```java
if (idade > 18) {
    System.out.println("Adulto");
}
```

A expressão:

```java
idade > 18
```

será avaliada e produzirá:

```text
true
```

ou:

```text
false
```

O `if` utiliza esse resultado para determinar qual caminho seguir.

Portanto:

```text
Variável
   +
Operador relacional
   ↓
Expressão booleana
   ↓
if / else
   ↓
Decisão
```

Esse mecanismo é uma das bases da lógica de programação e será utilizado continuamente, independentemente da linguagem de programação escolhida.

---

## 🚀 Próxima aula

**Aula 15 — Continuação do Controle de Fluxo**