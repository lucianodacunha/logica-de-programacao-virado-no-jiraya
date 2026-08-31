# Lógica de Programação - Virado no Jiraya

# Aula 22 — Validação de Usuário e Operador Lógico OU (`||`)

## 📚 Sobre a aula

Nesta aula utilizamos um exercício prático para validar o conhecimento adquirido sobre **estruturas condicionais** e, principalmente, sobre o operador lógico **OU (`||`)**.

O cenário proposto simula um sistema que permite o cadastro de usuários.

Existem duas restrições:

1. O usuário não pode deixar o login vazio.
2. O usuário não pode utilizar `admin` ou `administrador` como login.

Caso o login seja válido, o sistema deverá informar que o usuário foi cadastrado com sucesso.

Caso alguma das restrições seja violada, o sistema deverá informar:

```text
Usuário inválido
```

---

# 🎯 Objetivo do exercício

A regra de negócio pode ser representada da seguinte maneira:

```text
SE o login for vazio
OU
SE o login for "admin"
OU
SE o login for "administrador"

    → Usuário inválido

CASO CONTRÁRIO

    → Usuário cadastrado com sucesso
```

Esse exercício permite aplicar o operador:

```java
||
```

em uma situação mais próxima de um problema real.

---

# 🔀 Operador lógico OU (`||`)

O operador `||` representa o **OU lógico**.

Sua regra é:

> Basta uma das condições ser verdadeira para que a expressão completa seja verdadeira.

Exemplo:

```java
condicao1 || condicao2
```

Tabela verdade:

```text
true  || true  → true
true  || false → true
false || true  → true
false || false → false
```

No exercício, podemos ter várias condições:

```java
condicao1 || condicao2 || condicao3
```

Nesse caso, basta uma delas ser verdadeira.

---

# 📝 Entrada do usuário

O exercício utiliza novamente o `Scanner` para receber o login:

```java
Scanner input = new Scanner(System.in);
```

Depois:

```java
System.out.println("Digite seu nome:");
String nome = input.next();
```

O valor informado pelo usuário será armazenado na variável:

```java
nome
```

---

# 🔎 Comparação de `String`

Um ponto importante apresentado na aula é que, em Java, **não devemos utilizar `==` para comparar o conteúdo de objetos `String`**.

Para comparar o conteúdo de uma `String`, utilizamos:

```java
.equals()
```

Por exemplo:

```java
nome.equals("admin")
```

Essa expressão verifica se o conteúdo armazenado em `nome` é igual a:

```text
admin
```

---

# ⚠️ `==` × `.equals()`

Para valores primitivos, como:

```java
int
double
boolean
```

o operador:

```java
==
```

pode ser utilizado para comparação de valores.

Para `String`, utilizamos:

```java
.equals()
```

Exemplo:

```java
nome.equals("admin")
```

Em termos de lógica:

```text
nome
  ↓
"admin"
  ↓
.equals("admin")
  ↓
true
```

---

# 🔤 Comparação ignorando maiúsculas e minúsculas

Outro recurso apresentado na aula é:

```java
.equalsIgnoreCase()
```

Esse método permite realizar a comparação ignorando diferenças entre letras maiúsculas e minúsculas.

Por exemplo:

```java
nome.equalsIgnoreCase("admin")
```

Nesse caso, entradas como:

```text
admin
ADMIN
Admin
AdMiN
```

podem ser consideradas equivalentes na comparação.

Isso é útil quando queremos que a regra de validação não dependa da utilização de `Caps Lock`.

---

# 🧩 Aplicando ao exercício

Uma das restrições é impedir o uso do login:

```text
admin
```

Outra é impedir:

```text
administrador
```

Podemos representar a lógica:

```java
nome.equalsIgnoreCase("admin")
||
nome.equalsIgnoreCase("administrador")
```

Se qualquer uma das comparações retornar `true`, a expressão completa será verdadeira.

---

# 🚫 Validando login inválido

Podemos combinar as condições:

```java
if (
    nome.isEmpty()
    || nome.equalsIgnoreCase("admin")
    || nome.equalsIgnoreCase("administrador")
) {
    System.out.println("Usuário inválido");
} else {
    System.out.println("Usuário cadastrado com sucesso");
}
```

A lógica é:

```text
nome vazio?
      OU
é admin?
      OU
é administrador?
      ↓
Usuário inválido
```

---

# 📭 `isEmpty()`

A aula também apresenta o método:

```java
isEmpty()
```

Ele permite verificar se uma `String` está vazia.

Exemplo:

```java
nome.isEmpty()
```

Se:

```java
nome = "";
```

então:

```java
nome.isEmpty()
```

retornará:

```text
true
```

---

# ⚠️ String vazia × espaço em branco

Um detalhe importante demonstrado na aula é que uma `String` contendo apenas espaços não é considerada vazia pelo `isEmpty()`.

Por exemplo:

```text
"   "
```

possui caracteres: os espaços.

Portanto:

```java
"   ".isEmpty()
```

não representa o mesmo caso que:

```java
"".isEmpty()
```

Temos:

```text
"" 
↓
nenhum caractere
↓
vazia


"   "
↓
possui caracteres (espaços)
↓
não vazia
```

A aula apenas apresenta essa situação; o tratamento específico de espaços em branco não é aprofundado.

---

# 🧠 Estrutura `if/else`

O exercício utiliza uma estrutura condicional:

```java
if (condicao) {
    // executado se a condição for verdadeira
} else {
    // executado se a condição for falsa
}
```

No exercício:

```java
if (
    nome.isEmpty()
    || nome.equalsIgnoreCase("admin")
    || nome.equalsIgnoreCase("administrador")
) {
    System.out.println("Usuário inválido");
} else {
    System.out.println("Usuário cadastrado com sucesso");
}
```

A estrutura pode ser interpretada como:

```text
SE alguma restrição for verdadeira
        ↓
    usuário inválido

SENÃO
        ↓
    cadastro realizado
```

---

# 🔄 Fluxo do algoritmo

O algoritmo pode ser representado:

```text
              Início
                 ↓
          Solicitar login
                 ↓
          Ler login
                 ↓
       ┌─────────────────┐
       │ Login está vazio?│
       └────────┬────────┘
                │
               OU
                │
       ┌─────────────────┐
       │ É "admin"?      │
       └────────┬────────┘
                │
               OU
                │
       ┌─────────────────┐
       │ É "administrador"?│
       └────────┬────────┘
                │
                ↓
       Alguma condição
          é verdadeira?
          /          \
        SIM           NÃO
         ↓             ↓
 Usuário inválido   Cadastro
                    com sucesso
```

---

# 🧪 Exemplos

### Login válido

```text
luciano
```

Nenhuma das restrições é satisfeita:

```text
vazio → false
admin → false
administrador → false

false || false || false
          ↓
        false
```

Resultado:

```text
Usuário cadastrado com sucesso
```

### Login inválido

```text
admin
```

Temos:

```text
vazio → false
admin → true
administrador → false

false || true || false
         ↓
       true
```

Resultado:

```text
Usuário inválido
```

### Outro login inválido

```text
ADMIN
```

Com:

```java
equalsIgnoreCase("admin")
```

a comparação ignora a diferença entre maiúsculas e minúsculas.

Resultado:

```text
Usuário inválido
```

---

# 📌 Uma regra de negócio transformada em código

Um dos aspectos interessantes do exercício é perceber como uma descrição relativamente simples pode ser convertida em condições.

### Regra

```text
O login não pode estar vazio,
não pode ser "admin"
e não pode ser "administrador".
```

### Lógica de invalidação

```text
vazio
OU
admin
OU
administrador
```

### Java

```java
if (
    nome.isEmpty()
    || nome.equalsIgnoreCase("admin")
    || nome.equalsIgnoreCase("administrador")
) {
    // inválido
}
```

Esse processo é fundamental na programação:

```text
Regra de negócio
       ↓
Condições
       ↓
Operadores lógicos
       ↓
Estrutura condicional
       ↓
Comportamento do programa
```

---

# 🔑 Conceitos importantes

- **`||`:** operador lógico OU.
- **`if`:** executa um bloco quando uma condição é verdadeira.
- **`else`:** executa um bloco quando a condição do `if` é falsa.
- **`.equals()`:** compara o conteúdo de `String`.
- **`.equalsIgnoreCase()`:** compara `String` ignorando diferenças entre maiúsculas e minúsculas.
- **`.isEmpty()`:** verifica se uma `String` está vazia.
- **`String` vazia:** não possui caracteres.
- **Espaços em branco:** são caracteres e, portanto, uma `String contendo apenas espaços não é considerada vazia por `isEmpty()`.
- **Validação:** utilização de condições para verificar se um dado recebido atende às regras estabelecidas.
- **Regra de negócio:** requisito que determina o comportamento esperado do sistema.

---

# 🧠 Modelo mental

O principal raciocínio da aula pode ser resumido:

```text
             ENTRADA
                ↓
         Login informado
                ↓
            VALIDAÇÃO
                ↓
      ┌─────────┼─────────┐
      ↓         ↓         ↓
   vazio      "admin"  "administrador"
      └─────────┼─────────┘
                ↓
               ||
                ↓
       Alguma restrição?
          /          \
        SIM           NÃO
         ↓             ↓
     INVÁLIDO        VÁLIDO
```

---

# 💡 Principal aprendizado

A Aula 22 consolida o uso do operador lógico **OU (`||`)** dentro de uma situação prática de validação.

O ponto central é perceber que podemos combinar várias condições para representar uma única regra:

```java
if (
    nome.isEmpty()
    || nome.equalsIgnoreCase("admin")
    || nome.equalsIgnoreCase("administrador")
) {
    System.out.println("Usuário inválido");
}
```

A expressão será verdadeira quando **qualquer uma das restrições for satisfeita**.

A aula também introduz conceitos importantes do Java para trabalhar com `String`:

```java
.equals()
.equalsIgnoreCase()
.isEmpty()
```

Esses recursos permitem transformar regras de validação em condições que o programa consegue avaliar.

O mais importante, porém, continua sendo a lógica:

```text
Diferentes situações
        ↓
      OU
        ↓
Uma mesma decisão
```

Esse padrão aparece constantemente em programas reais, principalmente em **validações e regras de negócio**.

---

# 🚀 Próxima aula

**Aula 23 — Continuação do Controle de Fluxo**