# Lógica de Programação - Virado no Jiraya

# Aula 23 — Exercício de Controle de Fluxo: Alistamento Militar

## 📚 Sobre a aula

Nesta aula fazemos um exercício para consolidar os conhecimentos adquiridos sobre **estruturas condicionais e operadores lógicos**.

O exercício simula um sistema de **alistamento militar** que precisa analisar diferentes informações fornecidas pelo usuário e determinar qual mensagem deverá ser exibida.

O principal objetivo é praticar a construção de condições mais complexas utilizando:

```java
if
else if
else
&&
||
```

---

# 🎯 Problema proposto

O sistema deverá considerar dois dados:

```text
Sexo
Idade
```

O sexo será representado por:

```text
M → Masculino
F → Feminino
```

As regras estabelecidas são:

### Masculino

Se:

```text
sexo = M
E
idade >= 18
```

o sistema deverá informar:

```text
Alistamento obrigatório
```

Caso:

```text
sexo = M
E
idade < 18
```

o sistema deverá informar:

```text
Alistamento não permitido
```

### Feminino

Se:

```text
sexo = F
E
idade >= 18
```

o sistema deverá perguntar se a pessoa deseja se alistar.

Caso:

```text
sexo = F
E
idade < 18
```

o sistema deverá informar:

```text
Alistamento não permitido
```

---

# 🧩 Variáveis utilizadas

O exercício necessita de duas informações:

```java
char sexo;
int idade;
```

O `sexo` pode ser armazenado como `char`, pois estamos trabalhando com apenas um caractere:

```java
'M'
```

ou:

```java
'F'
```

A idade pode ser armazenada como:

```java
int
```

---

# 🔗 Combinando operadores lógicos

Uma das principais dificuldades do exercício é combinar corretamente as condições.

Por exemplo:

```text
sexo = M
OU
sexo = F
```

pode ser representado por:

```java
sexo == 'M' || sexo == 'F'
```

Porém, para associar essa condição à idade, precisamos utilizar o operador `&&`.

Exemplo:

```java
(sexo == 'M' || sexo == 'F') && idade < 18
```

Aqui temos duas partes:

```text
(sexo == 'M' || sexo == 'F')
              ↓
       primeira condição


idade < 18
     ↓
segunda condição
```

As duas partes são então combinadas pelo:

```java
&&
```

---

# 🧠 Importância dos parênteses

A aula reforça a importância de utilizar parênteses para deixar explícito o agrupamento das condições.

Por exemplo:

```java
(sexo == 'M' || sexo == 'F') && idade < 18
```

Podemos interpretar:

```text
         ┌───────────────────────┐
         │ sexo é M OU sexo é F  │
         └───────────┬───────────┘
                     ↓
                    &&
                     ↓
              idade < 18
```

Primeiro é avaliada a expressão:

```java
sexo == 'M' || sexo == 'F'
```

que resultará em:

```text
true
```

ou:

```text
false
```

Depois esse resultado será combinado com:

```java
idade < 18
```

---

# 🔄 Avaliação de uma expressão complexa

Uma expressão como:

```java
(sexo == 'M' || sexo == 'F') && idade < 18
```

pode ser analisada em etapas.

Supondo:

```text
sexo = F
idade = 17
```

Primeiro:

```java
sexo == 'M'
```

resultado:

```text
false
```

Depois:

```java
sexo == 'F'
```

resultado:

```text
true
```

Então:

```text
false || true
      ↓
    true
```

Agora:

```java
idade < 18
```

resultado:

```text
true
```

Finalmente:

```text
true && true
      ↓
    true
```

A condição será satisfeita.

---

# 🏗️ Estrutura condicional

O exercício utiliza uma sequência de condições:

```java
if (...) {
    ...
} else if (...) {
    ...
} else if (...) {
    ...
} else {
    ...
}
```

Essa estrutura permite tratar diferentes situações.

O fluxo pode ser entendido como:

```text
          condição 1?
          /       \
        SIM        NÃO
         ↓          ↓
     resultado   condição 2?
                  /      \
                SIM       NÃO
                 ↓         ↓
             resultado   condição 3?
                           /      \
                         SIM       NÃO
                          ↓         ↓
                      resultado    else
```

---

# 📋 Regras do exercício

Podemos organizar as regras:

| Sexo | Idade | Resultado |
|---|---:|---|
| M | `>= 18` | Alistamento obrigatório |
| M | `< 18` | Alistamento não permitido |
| F | `>= 18` | Perguntar se deseja se alistar |
| F | `< 18` | Alistamento não permitido |

---

# 🧪 Testes realizados

A aula realiza diferentes testes para verificar o comportamento do algoritmo.

### Masculino com 18 anos

```text
Sexo: M
Idade: 18
```

Resultado:

```text
Alistamento obrigatório
```

### Masculino com 17 anos

```text
Sexo: M
Idade: 17
```

Resultado:

```text
Alistamento não permitido
```

### Feminino com mais de 18 anos

```text
Sexo: F
Idade: 19
```

Resultado:

```text
Deseja se alistar?
```

### Feminino com 17 anos

```text
Sexo: F
Idade: 17
```

Resultado:

```text
Alistamento não permitido
```

---

# 🧠 Analisando o problema como algoritmo

Antes de escrever o código, podemos transformar os requisitos em regras lógicas.

```text
SE sexo = M
E idade >= 18
    → obrigatório

SENÃO SE sexo = M
E idade < 18
    → não permitido

SENÃO SE sexo = F
E idade >= 18
    → perguntar se deseja se alistar

SENÃO
    → não permitido
```

Esse processo é importante porque demonstra uma etapa fundamental da programação:

```text
Requisito
   ↓
Regra lógica
   ↓
Condição
   ↓
Código
```

---

# ⚠️ Uma expressão pode possuir várias condições

A aula reforça que uma condição não precisa ser simples.

Podemos ter:

```java
if (condicao) {
}
```

mas também:

```java
if (condicao1 && condicao2) {
}
```

ou:

```java
if (condicao1 || condicao2) {
}
```

e ainda combinar os dois:

```java
if ((condicao1 || condicao2) && condicao3) {
}
```

Nesse último caso, temos:

```text
(condição 1 OU condição 2)
              E
          condição 3
```

Essa capacidade de combinar condições permite representar regras de negócio mais complexas.

---

# 🔍 Ordem de avaliação

Quando temos uma expressão como:

```java
(a || b) && c
```

os parênteses deixam explícito que:

```java
(a || b)
```

deve ser avaliado primeiro.

O resultado dessa expressão será então combinado com:

```java
c
```

através do:

```java
&&
```

Por isso, compreender como dividir uma expressão complexa em partes menores facilita bastante a leitura do código.

---

# 💻 Estrutura conceitual do código

A estrutura utilizada no exercício pode ser representada:

```java
if (sexo == 'M' && idade >= 18) {

    // Alistamento obrigatório

} else if (sexo == 'M' && idade < 18) {

    // Alistamento não permitido

} else if (sexo == 'F' && idade >= 18) {

    // Deseja se alistar?

} else {

    // Alistamento não permitido
}
```

O objetivo aqui não é apenas memorizar a estrutura, mas compreender como cada requisito foi transformado em uma condição.

---

# 🧠 Modelo mental

O exercício pode ser visualizado desta maneira:

```text
             ENTRADA
                ↓
         Sexo + Idade
                ↓
            VALIDAÇÃO
                ↓
       ┌────────┴────────┐
       ↓                 ↓
    Sexo M             Sexo F
       ↓                 ↓
   Idade >= 18       Idade >= 18
    /      \           /      \
  SIM      NÃO       SIM      NÃO
   ↓        ↓         ↓        ↓
Obrig.   Não perm.  Perguntar  Não perm.
```

---

# 🔑 Conceitos importantes

- **`if`:** executa um bloco quando uma condição é verdadeira.
- **`else if`:** permite testar uma nova condição caso a anterior seja falsa.
- **`else`:** trata o caso em que nenhuma das condições anteriores foi satisfeita.
- **`&&`:** operador lógico E; todas as condições precisam ser verdadeiras.
- **`||`:** operador lógico OU; pelo menos uma condição precisa ser verdadeira.
- **Parênteses:** permitem agrupar condições e deixar explícita a lógica da expressão.
- **`char`:** utilizado para representar um único caractere.
- **Condições compostas:** expressões formadas pela combinação de duas ou mais condições.
- **Regra de negócio:** requisito que determina o comportamento esperado do sistema.
- **Fluxo de controle:** determina quais partes do código serão executadas de acordo com as condições.

---

# 📊 Operadores utilizados

| Operador | Significado | Exemplo |
|---|---|---|
| `&&` | E | `idade >= 18 && sexo == 'M'` |
| `||` | OU | `sexo == 'M' || sexo == 'F'` |
| `==` | Igualdade | `idade == 18` |
| `>=` | Maior ou igual | `idade >= 18` |
| `<` | Menor | `idade < 18` |

---

# 💡 Principal aprendizado

A Aula 23 mostra como utilizar os conceitos estudados anteriormente para resolver um problema com **múltiplas regras e diferentes caminhos de execução**.

O ponto central não é simplesmente escrever vários `if`, mas aprender a transformar os requisitos em expressões lógicas.

Por exemplo:

```text
Sexo masculino
E
idade maior ou igual a 18
```

torna-se:

```java
sexo == 'M' && idade >= 18
```

Enquanto:

```text
Sexo masculino
OU
sexo feminino
```

pode ser representado por:

```java
sexo == 'M' || sexo == 'F'
```

E condições podem ser agrupadas:

```java
(sexo == 'M' || sexo == 'F') && idade < 18
```

Portanto, o exercício reforça uma habilidade fundamental:

```text
REQUISITO
    ↓
DIVIDIR O PROBLEMA
    ↓
IDENTIFICAR AS CONDIÇÕES
    ↓
COMBINAR COM OPERADORES LÓGICOS
    ↓
ESTRUTURAR O FLUXO
    ↓
IMPLEMENTAR EM CÓDIGO
```

A aula também reforça que um problema que inicialmente parece complexo pode se tornar bastante simples quando suas regras são analisadas e divididas em partes menores.

> **Prática leva à perfeição.** Quanto mais problemas diferentes forem resolvidos, mais natural se torna identificar as condições necessárias para construir o algoritmo.

---

# 🚀 Próxima aula

**Aula 24 — Continuação do Controle de Fluxo**