# Lógica de Programação - Virado no Jiraya

# Aula 21 — Operador Lógico OU (`||`) e Validação

## 📚 Sobre a aula

Nesta aula continuamos o estudo dos **operadores lógicos** utilizados nas estruturas condicionais.

Até então, vimos principalmente o operador lógico **E (`&&`)**, que exige que todas as condições sejam verdadeiras.

Agora é apresentado o operador lógico **OU (`||`)**.

A aula também introduz uma situação bastante comum no desenvolvimento de software: **validar se uma informação recebida pelo programa é válida**.

---

# 🔗 Operador lógico E — `&&`

O operador `&&` representa o **E lógico**.

Quando utilizamos:

```java
condicao1 && condicao2
```

as duas condições precisam ser verdadeiras para que a expressão completa seja considerada verdadeira.

Exemplo:

```java
idade >= 11 && idade <= 15
```

Para que a expressão seja verdadeira:

```text
idade >= 11 → true
idade <= 15 → true

true && true
     ↓
   true
```

Se qualquer uma das condições for falsa:

```text
true && false → false
false && true → false
false && false → false
```

Portanto:

> Com `&&`, todas as condições precisam ser verdadeiras.

---

# 🔀 Operador lógico OU — `||`

O operador:

```java
||
```

representa o **OU lógico**.

Sua principal característica é:

> Basta que uma das condições seja verdadeira para que a expressão seja considerada verdadeira.

Exemplo:

```java
condicao1 || condicao2
```

Podemos representar:

```text
true  || true  → true
true  || false → true
false || true  → true
false || false → false
```

Portanto, diferentemente do `&&`, o `||` não exige que todas as condições sejam verdadeiras.

---

# 📊 Comparação entre `&&` e `||`

| Condição 1 | Condição 2 | `&&` | `||` |
|---|---|---|---|
| `true` | `true` | `true` | `true` |
| `true` | `false` | `false` | `true` |
| `false` | `true` | `false` | `true` |
| `false` | `false` | `false` | `false` |

Podemos memorizar:

```text
&& → todas precisam ser verdadeiras

|| → pelo menos uma precisa ser verdadeira
```

---

# 🧠 Exemplo com idade

Considere:

```java
if (idade >= 11 && idade <= 15) {
    // ...
}
```

Aqui precisamos que:

```text
idade >= 11
       E
idade <= 15
```

sejam verdadeiras.

Por exemplo:

```java
idade = 14;
```

Temos:

```text
14 >= 11 → true
14 <= 15 → true

true && true
     ↓
   true
```

Agora:

```java
idade = 18;
```

Temos:

```text
18 >= 11 → true
18 <= 15 → false

true && false
      ↓
    false
```

---

# 🔀 Utilizando `||`

Com o operador `||`, basta uma condição ser verdadeira.

Exemplo:

```java
if (condicao1 || condicao2) {
    // ...
}
```

Se:

```text
condicao1 → true
condicao2 → false
```

teremos:

```text
true || false
     ↓
   true
```

O bloco do `if` será executado.

---

# 🧪 Aplicação em validações

Um dos principais exemplos apresentados na aula é a utilização do `||` para **validação de dados**.

Imagine que um usuário esteja preenchendo um formulário e exista um campo para informar o nome.

Precisamos verificar se o valor recebido é inválido.

Podemos ter situações como:

```text
nome == null
```

ou:

```text
nome == ""
```

Nesse caso, queremos identificar se **uma dessas situações ocorreu**.

Podemos utilizar:

```java
if (nome == null || nome.isEmpty()) {
    // valor inválido
}
```

A ideia lógica é:

```text
nome é null
     OU
nome está vazio
```

Se qualquer uma dessas condições for verdadeira, consideramos que o valor recebido não é válido.

---

# ❓ O que é `null`?

A aula apresenta `null` no contexto de **variáveis de referência**.

De maneira simplificada, podemos pensar em:

```java
String nome2 = null;
```

como uma variável que não está referenciando um objeto.

Representação:

```text
nome2
  │
  │
  X       nenhum objeto referenciado
```

Não significa que a variável contém uma `String` vazia.

Ela simplesmente não possui uma referência para um objeto.

---

# 📭 `null` × `String` vazia

É importante diferenciar:

```java
String nome = null;
```

de:

```java
String nome = "";
```

### `null`

Indica ausência de referência:

```text
nome
 ↓
null
```

### String vazia

Existe uma `String`, mas ela não possui caracteres:

```text
nome
 ↓
""
```

Podemos pensar:

```text
null
→ não há objeto referenciado

""
→ existe uma String, mas sem conteúdo
```

Essa diferença será importante quando começarmos a realizar validações.

---

# 🧩 Validação utilizando `||`

Imagine:

```java
String nome2 = null;
```

Podemos verificar:

```java
if (nome2 == null || nome2.isEmpty()) {
    System.out.println("Nome inválido");
}
```

A lógica é:

```text
nome2 == null
      OU
nome2 está vazio
```

Se uma dessas condições for verdadeira, o `if` será executado.

---

# 📝 Exemplo com valor vazio

Se tivermos:

```java
String nome2 = "";
```

A primeira condição:

```java
nome2 == null
```

será:

```text
false
```

Porém, a segunda:

```java
nome2.isEmpty()
```

será:

```text
true
```

Portanto:

```text
false || true
       ↓
     true
```

O valor será considerado inválido.

---

# 🧠 Pensando como regra de negócio

Podemos transformar a situação em uma regra:

```text
SE o nome não foi informado
OU
SE o nome está vazio
ENTÃO
o nome é inválido.
```

Em Java:

```java
if (nome2 == null || nome2.isEmpty()) {
    System.out.println("Nome inválido");
}
```

Esse é um exemplo simples de como uma regra de negócio pode ser transformada em uma condição lógica.

---

# ⚠️ `null` não é o mesmo que vazio

Esse é um ponto importante da aula.

Não devemos tratar:

```java
null
```

e:

```java
""
```

como se fossem exatamente a mesma coisa.

São estados diferentes:

```text
null
↓
não existe referência para um objeto


""
↓
existe uma String sem caracteres
```

Por isso, uma validação pode precisar verificar as duas situações.

---

# 💻 Exemplo completo

Um exemplo simplificado:

```java
String nome = null;

if (nome == null || nome.isEmpty()) {
    System.out.println("Nome inválido");
} else {
    System.out.println("Nome válido: " + nome);
}
```

Se `nome` for:

```java
null
```

a primeira condição será verdadeira.

Se `nome` for:

```java
""
```

a segunda condição será verdadeira.

Se `nome` possuir um valor:

```java
"William"
```

as duas condições serão falsas e o `else` poderá ser executado.

---

# 🔄 Modelo mental do `||`

Podemos visualizar:

```text
          condição 1
              ↓
           true/false
              │
              │
             ||
              │
              ↓
          condição 2
              ↓
           true/false
              │
              ↓
       resultado final
```

A regra:

```text
Se pelo menos uma condição for verdadeira
                ↓
           resultado = true
```

Somente quando todas forem falsas:

```text
false || false
      ↓
    false
```

---

# 🧠 `&&` × `||`

Uma forma simples de memorizar:

### `&&` — E

```text
Preciso de A
E
Preciso de B
```

Exemplo:

```java
idade >= 11 && idade <= 15
```

As duas condições precisam ser satisfeitas.

### `||` — OU

```text
Pode ser A
OU
Pode ser B
```

Exemplo:

```java
nome == null || nome.isEmpty()
```

Qualquer uma das condições já é suficiente para a expressão ser verdadeira.

---

# 🔑 Conceitos importantes

- **`&&`:** operador lógico E.
- **`||`:** operador lógico OU.
- **`true`:** representa uma condição verdadeira.
- **`false`:** representa uma condição falsa.
- **`null`:** ausência de referência para um objeto.
- **String vazia (`""`):** uma `String` sem caracteres.
- **Variável de referência:** variável que pode referenciar um objeto.
- **Validação:** verificação para determinar se um valor recebido é aceitável.
- **Condições compostas:** combinação de múltiplas expressões utilizando operadores lógicos.

---

# 📊 Tabela verdade

## Operador `&&`

```text
true  && true  = true
true  && false = false
false && true  = false
false && false = false
```

Regra:

```text
TODAS precisam ser verdadeiras.
```

## Operador `||`

```text
true  || true  = true
true  || false = true
false || true  = true
false || false = false
```

Regra:

```text
PELO MENOS UMA precisa ser verdadeira.
```

---

# 💡 Principal aprendizado

A principal novidade da aula é o operador lógico **OU (`||`)**.

Enquanto:

```java
&&
```

exige que todas as condições sejam verdadeiras, o:

```java
||
```

considera a expressão verdadeira quando pelo menos uma condição é verdadeira.

```text
&&
↓
TODAS verdadeiras


||
↓
PELO MENOS UMA verdadeira
```

Esse comportamento torna o `||` especialmente útil para **validações**, nas quais queremos detectar diferentes situações que representam um mesmo problema.

Por exemplo:

```java
if (nome == null || nome.isEmpty()) {
    System.out.println("Nome inválido");
}
```

Aqui temos duas situações diferentes:

```text
nome == null
      OU
nome vazio
```

mas ambas levam à mesma decisão:

```text
Nome inválido
```

Esse tipo de construção será cada vez mais importante à medida que os algoritmos começarem a trabalhar com regras mais complexas.

---

# 🚀 Próxima aula

**Aula 22 — Continuação dos Operadores Lógicos e Estruturas Condicionais**