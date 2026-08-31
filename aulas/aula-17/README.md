# Lógica de Programação - Virado no Jiraya

# Aula 17 — Operadores Lógicos: `&&` e Múltiplas Condições

## 📚 Sobre a aula

Nesta aula continuamos o estudo das **estruturas condicionais**, introduzindo os **operadores lógicos**.

Até aqui, trabalhamos principalmente com condições simples:

```java
if (idade > 18) {
    
}
```

Agora surge uma necessidade comum em problemas reais: verificar **mais de uma condição ao mesmo tempo**.

Por exemplo:

```text
O salário é maior ou igual a X?
E
O salário é menor ou igual a Y?
```

Para combinar essas condições, utilizamos o operador lógico **E**:

```java
&&
```

---

# 🔀 Operadores lógicos

Os operadores lógicos permitem combinar condições.

Nesta aula o foco principal é o operador:

```java
&&
```

que representa o **E lógico**.

Também é mencionado o operador de negação:

```java
!
```

porém o foco da aula está no operador `&&`.

---

# 🟢 Operador `&&` — E lógico

O operador:

```java
&&
```

é utilizado quando precisamos que **todas as condições sejam verdadeiras**.

Exemplo:

```java
if (condicao1 && condicao2) {

    // executa se as duas condições forem true

}
```

Podemos interpretar:

```text
condição 1
    E
condição 2
```

Para o resultado final ser `true`, ambas precisam ser verdadeiras.

---

# 📊 Tabela verdade do `&&`

O operador `&&` possui quatro combinações possíveis:

| Condição 1 | Condição 2 | Resultado |
|---|---|---|
| `true` | `true` | `true` |
| `true` | `false` | `false` |
| `false` | `true` | `false` |
| `false` | `false` | `false` |

A regra fundamental é:

> No operador `&&`, basta uma das condições ser `false` para que o resultado final seja `false`.

Podemos resumir:

```text
true  && true
      ↓
    true
```

Mas:

```text
true  && false
      ↓
    false
```

e:

```text
false && true
      ↓
    false
```

---

# 🧠 Regra do operador `&&`

Uma maneira simples de memorizar:

```text
E
↓
TODAS precisam ser verdadeiras
```

Ou:

```text
true && true && true
        ↓
      true
```

Se existir apenas uma condição falsa:

```text
true && false && true
        ↓
      false
```

---

# 💰 Exemplo — Faixa salarial

A aula utiliza como exemplo uma tabela de imposto de renda.

Considere uma faixa em que o salário precisa estar:

```text
maior ou igual a 1903.99
```

e:

```text
menor ou igual a 2826.65
```

Nesse caso, temos duas condições.

Não basta verificar apenas:

```java
salario >= 1903.99
```

Também precisamos verificar:

```java
salario <= 2826.65
```

As duas condições devem ser verdadeiras simultaneamente.

---

# 🔗 Combinando as condições

Podemos escrever:

```java
if (salario >= 1903.99 && salario <= 2826.65) {

    // condição satisfeita

}
```

A expressão possui duas comparações:

```java
salario >= 1903.99
```

e:

```java
salario <= 2826.65
```

ligadas por:

```java
&&
```

---

# 🧩 Como o Java avalia

Considere:

```java
double salario = 2350;
```

A primeira condição:

```java
salario >= 1903.99
```

resulta em:

```text
2350 >= 1903.99
        ↓
       true
```

A segunda:

```java
salario <= 2826.65
```

resulta em:

```text
2350 <= 2826.65
        ↓
       true
```

Então:

```text
true && true
     ↓
   true
```

O `if` será executado.

---

# ❌ Quando uma condição é falsa

Agora considere:

```java
double salario = 3000;
```

A primeira condição:

```java
salario >= 1903.99
```

é:

```text
true
```

Mas:

```java
salario <= 2826.65
```

é:

```text
false
```

Portanto:

```text
true && false
      ↓
    false
```

O bloco do `if` não será executado.

---

# 🧮 Representação da faixa

Uma condição de intervalo pode ser visualizada assim:

```text
1903.99                         2826.65
   │                                │
   ├────────── FAIXA ───────────────┤
   │                                │
 maior ou igual              menor ou igual
```

Em Java:

```java
salario >= 1903.99 && salario <= 2826.65
```

Podemos interpretar:

```text
salário está dentro da faixa?
```

Somente quando as duas condições forem verdadeiras teremos:

```text
true
```

---

# 🔄 `if`, `else if` e `else`

A aula também apresenta a utilização de:

```java
if
```

seguido de:

```java
else if
```

e finalmente:

```java
else
```

A estrutura pode ser:

```java
if (condicao1) {

    // caminho 1

} else if (condicao2) {

    // caminho 2

} else {

    // caminho final

}
```

Podemos ter várias condições intermediárias.

---

# 🧩 Exemplo com faixas

Utilizando a ideia da tabela de imposto:

```java
if (salario <= 1903.98) {

    System.out.println("Isento");

} else if (salario >= 1903.99 && salario <= 2826.65) {

    System.out.println("7.5%");

} else {

    System.out.println("Outra faixa");

}
```

Nesse exemplo:

```text
if
 ↓
primeira faixa

else if
 ↓
segunda faixa

else
 ↓
demais situações
```

---

# ⚠️ Cada condição deve comparar o valor

Um erro comum ao começar a trabalhar com múltiplas condições seria tentar escrever algo como:

```java
if (1903.99 <= salario <= 2826.65)
```

Essa não é a forma correta de expressar a condição em Java.

Devemos comparar a variável separadamente:

```java
if (salario >= 1903.99 && salario <= 2826.65)
```

Ou seja, a variável `salario` aparece nas duas comparações.

```text
salario >= 1903.99
       &&
salario <= 2826.65
```

---

# 🧠 Por que repetir a variável?

Porque estamos realizando **duas comparações independentes**:

```java
salario >= 1903.99
```

e:

```java
salario <= 2826.65
```

Depois combinamos os resultados:

```text
comparação 1
     ↓
  true/false
     +
comparação 2
     ↓
  true/false
     ↓
    &&
     ↓
resultado final
```

---

# 📋 Várias condições

O operador `&&` pode combinar mais de duas condições.

Por exemplo:

```java
if (condicao1 && condicao2 && condicao3) {

}
```

Nesse caso, todas precisam ser verdadeiras.

Podemos representar:

```text
condição 1
    &&
condição 2
    &&
condição 3
    ↓
todas true?
    ↓
   true
```

Se qualquer uma delas for falsa:

```text
true && false && true
          ↓
        false
```

---

# ⚡ Operador de curto-circuito

Um conceito importante apresentado na aula é o **curto-circuito**.

Quando usamos:

```java
&&
```

o Java pode interromper a avaliação das condições assim que encontra uma condição `false`.

Por exemplo:

```java
if (condicao1 && condicao2 && condicao3) {

}
```

Se:

```text
condicao1 = false
```

o resultado já é conhecido:

```text
false && qualquer_coisa
        ↓
      false
```

Portanto, não existe necessidade de avaliar as condições seguintes.

---

# 🚦 Exemplo de curto-circuito

Considere:

```java
if (salario >= 1903.99 &&
    salario <= 2826.65) {

}
```

Se:

```java
salario = 1200;
```

a primeira condição:

```java
salario >= 1903.99
```

resultará em:

```text
false
```

O Java já sabe que:

```text
false && qualquer_coisa
```

será:

```text
false
```

Portanto, ele pode ignorar a avaliação da segunda condição.

---

# ⚙️ Por que isso é chamado de curto-circuito?

Porque a avaliação pode ser interrompida antes que todas as condições sejam analisadas.

```text
Condição 1
    ↓
 false
    ↓
resultado já conhecido
    ↓
não avalia as próximas
```

Isso pode evitar processamento desnecessário.

A aula destaca que esse comportamento pode economizar **processamento e memória**, dependendo da situação.

---

# 🧠 `&&` como uma sequência de decisões

Podemos visualizar:

```text
Condição 1
    ↓
  true?
    ↓
Condição 2
    ↓
  true?
    ↓
Condição 3
    ↓
  true?
    ↓
Executa o if
```

Porém, se qualquer condição resultar em `false`:

```text
Condição
   ↓
 false
   ↓
resultado final = false
   ↓
interrompe avaliação
```

---

# 🔀 Diferença entre condição simples e composta

### Condição simples

```java
if (idade >= 18) {

}
```

Tem apenas uma condição.

### Condição composta

```java
if (idade >= 18 && idade <= 65) {

}
```

Possui duas condições combinadas pelo operador `&&`.

Podemos interpretar:

```text
idade é maior ou igual a 18
E
idade é menor ou igual a 65
```

---

# 💻 Exemplo completo

```java
public class ImpostoDeRenda {

    public static void main(String[] args) {

        double salario = 2350;

        if (salario <= 1903.98) {

            System.out.println("Isento");

        } else if (salario >= 1903.99 && salario <= 2826.65) {

            System.out.println("Alíquota de 7.5%");

        } else {

            System.out.println("Outra faixa de tributação");
        }
    }
}
```

Para:

```text
salario = 2350
```

temos:

```text
2350 >= 1903.99 → true

2350 <= 2826.65 → true
```

Logo:

```text
true && true
     ↓
   true
```

O segundo bloco será executado.

---

# 📊 Modelo de uma faixa

Uma faixa de valores normalmente pode ser representada através de duas condições:

```text
limite inferior
       ↓
valor >= limite inferior

       &&
       
valor <= limite superior
       ↓
limite superior
```

Em Java:

```java
valor >= limiteInferior &&
valor <= limiteSuperior
```

Esse padrão é muito útil para trabalhar com:

- faixas de idade;
- faixas salariais;
- notas;
- pontuações;
- limites de temperatura;
- classificações;
- intervalos numéricos.

---

# 🔑 Conceitos importantes

- **Operador lógico:** utilizado para combinar condições.
- **`&&`:** representa o operador lógico E.
- **Condição composta:** possui duas ou mais condições.
- **Tabela verdade:** demonstra os possíveis resultados de uma operação lógica.
- **`true && true`:** resulta em `true`.
- **Qualquer `false` com `&&`:** torna o resultado final `false`.
- **`else if`:** permite testar uma nova condição caso as anteriores sejam falsas.
- **Curto-circuito:** interrompe a avaliação do `&&` quando uma condição falsa já determina o resultado final.
- **Faixa de valores:** pode ser representada utilizando duas comparações ligadas por `&&`.

---

# 🧠 Modelo mental

Para verificar se um valor está dentro de uma faixa:

```text
             valor
               ↓
      ┌─────────────────┐
      │ >= limite       │
      │ inferior        │
      └────────┬────────┘
               ↓
             true?
               ↓
              &&
               ↓
      ┌─────────────────┐
      │ <= limite       │
      │ superior        │
      └────────┬────────┘
               ↓
             true?
               ↓
              true
               ↓
          faixa válida
```

Em Java:

```java
valor >= limiteInferior &&
valor <= limiteSuperior
```

---

# 💡 Principal aprendizado

A principal evolução desta aula é aprender a transformar uma regra que possui **mais de uma condição** em uma expressão lógica.

Por exemplo:

```text
Salário entre 1903.99 e 2826.65
```

pode ser traduzido para:

```java
salario >= 1903.99 && salario <= 2826.65
```

Temos então:

```text
comparação 1
      ↓
  true/false
      &&
comparação 2
      ↓
  true/false
      ↓
resultado final
```

O operador `&&` exige que **todas as condições sejam verdadeiras**.

Outro conceito importante é o **curto-circuito**:

```text
false && ...
```

já é suficiente para determinar:

```text
false
```

Por isso, o Java pode deixar de avaliar as condições seguintes.

---

# 🚀 Próxima aula

**Aula 18 — Continuação dos Operadores Lógicos**