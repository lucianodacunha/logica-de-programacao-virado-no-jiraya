# Lógica de Programação - Virado no Jiraya

# Aula 18 — Operadores Lógicos na Prática

## 📚 Sobre a aula

Nesta aula continuamos o estudo dos **operadores lógicos**, principalmente o operador:

```java
&&
```

O conceito é aplicado em um exercício baseado em uma **história de usuário**, aproximando o exercício de uma situação encontrada no desenvolvimento de software.

O objetivo do exercício é receber o **nome** e a **idade** de um participante de natação e determinar sua categoria:

- até 10 anos → Infantil
- de 11 a 15 anos → Juvenil
- de 16 a 19 anos → Pré-adulto
- 20 anos ou mais → Adulto

A atividade exige a utilização de múltiplas condições para determinar em qual faixa de idade o participante se encontra.

---

# 👤 História de usuário

A aula apresenta brevemente o conceito de **história de usuário**, utilizado em metodologias ágeis de desenvolvimento de software.

Uma história de usuário descreve, em alto nível:

```text
Quem é o usuário?
O que ele deseja?
Por que ele deseja isso?
```

No exercício apresentado, a necessidade é obter o nome e a idade de um participante de natação e permitir que o sistema informe sua categoria.

A ideia é escrever o requisito de maneira que possa ser compreendido mesmo por uma pessoa que não seja desenvolvedora.

---

# 🏊 Exercício — Categoria de Natação

O problema proposto é:

> Dado o nome e a idade de um participante de natação, informar sua categoria.

As categorias são determinadas pela idade:

| Idade | Categoria |
|---:|---|
| Até 10 anos | Infantil |
| 11 a 15 anos | Juvenil |
| 16 a 19 anos | Pré-adulto |
| 20 anos ou mais | Adulto |

---

# 🧠 Transformando o requisito em lógica

Para implementar o exercício, precisamos transformar as regras em condições.

Podemos começar verificando:

```java
idade <= 10
```

Se for verdadeira:

```text
Categoria Infantil
```

Caso contrário, precisamos verificar a próxima faixa:

```java
idade >= 11 && idade <= 15
```

Se for verdadeira:

```text
Categoria Juvenil
```

Depois:

```java
idade >= 16 && idade <= 19
```

Se for verdadeira:

```text
Categoria Pré-adulto
```

Caso nenhuma das condições anteriores seja verdadeira:

```text
Categoria Adulto
```

---

# 🔗 Utilizando o operador `&&`

As categorias que possuem **limite inferior e superior** precisam de duas comparações.

Por exemplo, para a categoria Juvenil:

```java
idade >= 11 && idade <= 15
```

Podemos interpretar:

```text
idade é maior ou igual a 11
       E
idade é menor ou igual a 15
```

As duas condições precisam ser verdadeiras.

---

# 🧩 Implementação

Uma possível implementação:

```java
String nome = "João";
int idade = 14;

if (idade <= 10) {

    System.out.println(nome + " participará da categoria Infantil");

} else if (idade >= 11 && idade <= 15) {

    System.out.println(nome + " participará da categoria Juvenil");

} else if (idade >= 16 && idade <= 19) {

    System.out.println(nome + " participará da categoria Pré-adulto");

} else {

    System.out.println(nome + " participará da categoria Adulto");
}
```

---

# 🔄 Funcionamento do `if / else if / else`

A estrutura utilizada possui vários caminhos possíveis:

```text
             idade
                ↓
         idade <= 10?
          ↓       ↓
        SIM      NÃO
         ↓        ↓
     Infantil   idade >= 11
                    &&
               idade <= 15?
                 ↓      ↓
               SIM     NÃO
                ↓       ↓
             Juvenil  idade >= 16
                           &&
                      idade <= 19?
                         ↓     ↓
                       SIM    NÃO
                        ↓      ↓
                   Pré-adulto Adulto
```

O Java verifica as condições **na ordem em que aparecem**.

Assim que encontra uma condição verdadeira dentro da sequência `if / else if`, executa aquele bloco e não continua verificando os próximos `else if`.

---

# 🧪 Testando o programa

## Idade = 19

```java
int idade = 19;
```

A condição:

```java
idade >= 16 && idade <= 19
```

será:

```text
19 >= 16 → true
19 <= 19 → true

true && true
     ↓
   true
```

Resultado:

```text
Categoria Pré-adulto
```

---

## Idade = 11

```java
int idade = 11;
```

Temos:

```text
11 >= 11 → true
11 <= 15 → true

true && true
     ↓
   true
```

Resultado:

```text
Categoria Juvenil
```

---

## Idade = 10

```java
int idade = 10;
```

A primeira condição:

```java
idade <= 10
```

é verdadeira.

Resultado:

```text
Categoria Infantil
```

---

## Idade = 20

```java
int idade = 20;
```

As condições anteriores não serão satisfeitas.

Nesse caso, o fluxo chegará ao:

```java
else
```

Resultado:

```text
Categoria Adulto
```

---

# 📐 Faixas e limites

Um ponto importante do exercício é definir corretamente os limites das faixas.

Podemos representar:

```text
0 ───── 10
  Infantil

11 ──── 15
  Juvenil

16 ──── 19
  Pré-adulto

20 ──── ∞
  Adulto
```

Não pode existir uma idade sem categoria.

Também não devemos criar sobreposição entre as faixas.

A definição correta dos limites é parte importante da construção da lógica do programa.

---

# 🧠 Uma observação importante

Para algumas faixas, podemos utilizar duas condições:

```java
idade >= 11 && idade <= 15
```

Mas em determinadas situações uma condição adicional pode ser desnecessária.

Por exemplo:

```java
else if (idade >= 16 && idade <= 19)
```

Como esse `else if` só será alcançado depois que:

```java
idade <= 15
```

for falsa, sabemos que a idade já é maior que 15.

Ainda assim, manter:

```java
idade >= 16 && idade <= 19
```

pode tornar a regra explícita e mais fácil de entender durante o aprendizado.

O foco da aula é justamente praticar a construção de condições compostas.

---

# 🔀 `else if`

A aula reforça a estrutura:

```java
if
else if
else
```

O `else if` significa, de maneira simplificada:

```text
SE a primeira condição não for verdadeira,
VERIFIQUE ESTA NOVA CONDIÇÃO.
```

Podemos ter vários `else if`:

```java
if (condicao1) {

} else if (condicao2) {

} else if (condicao3) {

} else {

}
```

Isso permite construir uma sequência de decisões.

---

# 🧩 Condições compostas

O exercício utiliza diretamente o conceito estudado na aula anterior:

```java
condicao1 && condicao2
```

Por exemplo:

```java
idade >= 11 && idade <= 15
```

Temos:

```text
Condição 1
idade >= 11
      ↓
 true / false

        &&

Condição 2
idade <= 15
      ↓
 true / false

        ↓

Resultado final
true / false
```

Para a categoria ser válida, ambas precisam ser verdadeiras.

---

# 📚 Prática de programação

A aula também reforça uma ideia importante sobre o aprendizado de programação:

> Para aprender a programar é necessário escrever e ler bastante código.

A diferença entre alguém que está começando e um desenvolvedor experiente não está apenas no conhecimento da sintaxe.

A experiência também está relacionada à quantidade de:

- código escrito;
- código analisado;
- problemas resolvidos;
- situações encontradas;
- erros cometidos e corrigidos.

Com o tempo, essa experiência permite reconhecer padrões e evitar problemas que já foram encontrados anteriormente.

---

# 🔑 Conceitos importantes

- **História de usuário:** descrição de uma necessidade do usuário em alto nível.
- **Operador `&&`:** representa o operador lógico E.
- **Condição composta:** combinação de duas ou mais condições.
- **`if`:** executa um bloco quando uma condição é verdadeira.
- **`else if`:** permite testar uma nova condição quando a anterior é falsa.
- **`else`:** executa quando nenhuma das condições anteriores foi satisfeita.
- **Faixa de valores:** conjunto de valores definido por limites inferior e superior.
- **Tabela verdade:** ajuda a compreender o comportamento dos operadores lógicos.
- **Leitura de código:** habilidade importante para desenvolver raciocínio lógico.
- **Prática:** escrever código e resolver problemas são fundamentais para desenvolver experiência.

---

# 🧠 Modelo mental

O exercício pode ser reduzido a:

```text
Receber nome e idade
        ↓
   idade <= 10?
      ↓     ↓
    SIM    NÃO
     ↓       ↓
 Infantil  idade entre 11 e 15?
                 ↓       ↓
               SIM      NÃO
                ↓        ↓
             Juvenil   idade entre 16 e 19?
                              ↓       ↓
                            SIM      NÃO
                             ↓        ↓
                        Pré-adulto  Adulto
```

---

# 💡 Principal aprendizado

O principal aprendizado desta aula é aplicar **operadores lógicos e estruturas condicionais** na resolução de um problema que possui várias possibilidades.

O problema pode ser descrito em linguagem natural:

```text
Se idade for até 10:
    Infantil

Senão, se idade estiver entre 11 e 15:
    Juvenil

Senão, se idade estiver entre 16 e 19:
    Pré-adulto

Senão:
    Adulto
```

E transformado em código:

```java
if (idade <= 10) {

} else if (idade >= 11 && idade <= 15) {

} else if (idade >= 16 && idade <= 19) {

} else {

}
```

Esse processo de **pegar um requisito e transformá-lo em regras executáveis** é uma das habilidades fundamentais da programação.

---

# 🚀 Próxima aula

**Aula 19 — Lendo dados do teclado