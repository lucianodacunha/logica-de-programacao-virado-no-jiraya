# Lógica de Programação - Virado no Jiraya

# Aula 11 — Reutilização de Variáveis

## 📚 Sobre a aula

Nesta aula continuamos o estudo de **variáveis**, aprofundando principalmente os conceitos de:

- declaração;
- inicialização;
- atribuição;
- reutilização de variáveis;
- escopo;
- resolução de problemas de lógica.

O exercício da aula consiste em calcular diferentes porcentagens sobre um mesmo salário, utilizando uma única variável para armazenar os resultados.

---

## 📌 Declaração, inicialização e atribuição

Ao criar uma variável, precisamos informar seu tipo e seu nome.

Por exemplo:

```java
double salario;
```

Isso representa a **declaração** da variável.

Quando criamos a variável e já atribuímos um valor:

```java
double salario = 2500;
```

temos a **declaração e inicialização** da variável.

Podemos representar:

```text
Declaração
    ↓
double salario

Inicialização
    ↓
salario = 2500
```

---

## 💾 Variável como espaço de memória

Uma variável pode ser entendida como um espaço na memória utilizado para armazenar um valor.

Por exemplo:

```java
double salario = 2500;
```

Podemos representar:

```text
Memória

┌───────────────────┐
│      salario      │
│       2500        │
└───────────────────┘
```

O identificador:

```text
salario
```

permite que o programa faça referência ao valor armazenado naquele espaço.

---

# 🔄 Reutilizando uma variável

Uma variável pode receber um novo valor depois de ter sido criada.

Por exemplo:

```java
double salario = 2500;

salario = 5000;
```

Nesse caso, não estamos criando uma nova variável.

Estamos atribuindo um novo valor à variável existente.

```text
Inicialmente:

salario → 2500


Depois:

salario → 5000
```

O valor anterior é substituído pelo novo valor.

---

## ⚠️ Não é necessário declarar novamente

Depois de declarar:

```java
double salario = 2500;
```

não devemos declarar novamente:

```java
double salario = 5000;
```

no mesmo escopo.

Isso causaria um erro de compilação, pois estaríamos tentando criar outra variável com o mesmo nome.

Para alterar o valor, basta utilizar:

```java
salario = 5000;
```

A diferença é:

```java
double salario = 2500;
```

→ declaração + inicialização

```java
salario = 5000;
```

→ atribuição de um novo valor

---

# 🎯 Escopo

A aula introduz o conceito de **escopo**.

O escopo determina a região do código na qual uma variável pode existir e ser utilizada.

Um dos pontos apresentados é que não podemos declarar duas variáveis com o mesmo nome dentro do mesmo escopo.

Por exemplo:

```java
double salario = 2500;
double salario = 5000;
```

Isso gera um erro de compilação.

Entretanto, o estudo de escopo será aprofundado posteriormente no curso.

---

# 🧮 Exercício — Cálculo de porcentagens

O exercício proposto consiste em:

1. Criar uma variável para armazenar um salário.
2. Definir diferentes porcentagens.
3. Calcular cada porcentagem sobre o salário.
4. Armazenar o resultado em uma variável.
5. Imprimir o resultado.
6. Reutilizar a mesma variável `resultado` para os cálculos seguintes.

As porcentagens utilizadas no exercício são:

```text
30%
15%
5%
```

---

# 💰 Definindo o salário

Primeiro criamos uma variável para armazenar o salário.

Por exemplo:

```java
double salario = 5000;
```

Temos:

```text
salario → 5000
```

Essa variável será utilizada em todos os cálculos.

---

# 📊 Calculando 30%

Para calcular 30% do salário:

```java
double resultado = salario * 0.30;
```

Considerando:

```text
salario = 5000
```

temos:

```text
5000 × 0.30 = 1500
```

Portanto:

```text
resultado → 1500
```

Podemos imprimir:

```java
System.out.println(resultado);
```

Resultado:

```text
1500
```

---

# 🔄 Reutilizando `resultado`

Agora precisamos calcular 15%.

Não precisamos criar outra variável chamada `resultado`.

A variável já existe.

Podemos simplesmente atribuir um novo valor:

```java
resultado = salario * 0.15;
```

O cálculo será:

```text
5000 × 0.15 = 750
```

Agora:

```text
resultado → 750
```

O valor anterior:

```text
1500
```

foi substituído.

---

# 📊 Calculando 5%

Podemos reutilizar novamente a mesma variável:

```java
resultado = salario * 0.05;
```

O cálculo será:

```text
5000 × 0.05 = 250
```

Agora:

```text
resultado → 250
```

---

# 🧠 O que aconteceu com a memória?

Durante o programa, temos duas variáveis:

```text
salario
resultado
```

Inicialmente:

```text
salario  → 5000
resultado → 1500
```

Depois do segundo cálculo:

```text
salario  → 5000
resultado → 750
```

Depois do terceiro:

```text
salario  → 5000
resultado → 250
```

A variável `salario` permanece com o mesmo valor.

A variável `resultado` é reutilizada para armazenar resultados diferentes.

---

# 🔁 Fluxo do exercício

Podemos representar o processamento:

```text
salario = 5000
      │
      ├── × 0.30 → resultado = 1500
      │
      ├── × 0.15 → resultado = 750
      │
      └── × 0.05 → resultado = 250
```

A variável `resultado` funciona como um espaço de memória reutilizado durante o processamento.

---

# 📝 Exemplo completo

```java
public class ReutilizandoVariaveis {

    public static void main(String[] args) {

        double salario = 5000;

        double resultado = salario * 0.30;
        System.out.println(resultado);

        resultado = salario * 0.15;
        System.out.println(resultado);

        resultado = salario * 0.05;
        System.out.println(resultado);
    }
}
```

Saída:

```text
1500.0
750.0
250.0
```

---

# 🧩 Declaração × atribuição

A diferença fundamental desta aula pode ser resumida assim:

### Declarar

```java
double resultado;
```

Estamos criando a variável.

### Declarar e inicializar

```java
double resultado = 1500;
```

Estamos criando a variável e atribuindo seu primeiro valor.

### Atribuir novamente

```java
resultado = 750;
```

A variável já existe. Estamos apenas substituindo o valor armazenado.

```text
Declaração
     ↓
resultado
     ↓
Inicialização
     ↓
1500
     ↓
Nova atribuição
     ↓
750
     ↓
Nova atribuição
     ↓
250
```

---

# 🧠 Resolução de problemas de lógica

O professor utiliza o exercício propositalmente para estimular a capacidade de **interpretar requisitos e transformá-los em código**.

Antes de programar, devemos identificar:

```text
O que o problema pede?
        ↓
Quais dados são necessários?
        ↓
Quais cálculos precisam ser realizados?
        ↓
Quais variáveis serão utilizadas?
        ↓
Como os resultados serão armazenados?
        ↓
Como serão apresentados?
```

Essa capacidade será cada vez mais importante nos próximos exercícios.

---

# 🔑 Conceitos importantes

- **Declaração:** criação de uma variável informando seu tipo e identificador.
- **Inicialização:** atribuição do primeiro valor à variável.
- **Atribuição:** definição ou substituição do valor armazenado em uma variável.
- **Reutilização:** utilização da mesma variável para armazenar diferentes valores ao longo da execução.
- **Escopo:** região do programa na qual uma variável pode ser utilizada.
- **Sobrescrita:** substituição do valor anteriormente armazenado.
- **Requisito:** aquilo que o programa precisa realizar.
- **Processamento:** operações realizadas sobre os dados.

---

# 🧠 Modelo mental

O conceito central da aula pode ser visualizado assim:

```text
                  MEMÓRIA
                     │
          ┌──────────┴──────────┐
          ↓                     ↓
       salario                resultado
          │                     │
        5000                 1500
                                │
                                ↓
                               750
                                │
                                ↓
                               250
```

O espaço associado à variável `resultado` é reutilizado durante o processamento.

---

# 💡 Principal aprendizado

Uma variável não precisa manter o mesmo valor durante toda a execução do programa.

Depois de declarada, podemos atribuir novos valores a ela:

```java
resultado = salario * 0.30;
resultado = salario * 0.15;
resultado = salario * 0.05;
```

A variável continua sendo a mesma:

```text
resultado
```

mas seu conteúdo muda conforme o processamento.

A diferença fundamental é:

```java
double resultado = 1500;
```

cria e inicializa a variável, enquanto:

```java
resultado = 750;
```

apenas altera o valor que ela armazena.

Esse conceito será fundamental para os próximos exercícios, nos quais os programas começarão a manipular dados de maneira cada vez mais dinâmica.

---

## 🚀 Próxima aula

**Aula 12 — String, char e boolean**