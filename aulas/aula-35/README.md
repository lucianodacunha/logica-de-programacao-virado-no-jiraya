# Lógica de Programação - Virado no Jiraya

# Aula 35 — `for` Aninhado

## 📚 Sobre a aula

Nesta aula é resolvido o exercício proposto anteriormente:

> Criar um programa que apresente automaticamente a tabuada completa de `1` a `10`.

Para resolver o problema, é necessário perceber que existem **dois níveis de repetição**:

* um para percorrer as tabuadas de `1` a `10`;
* outro para percorrer os multiplicadores de `1` a `10` dentro de cada tabuada.

Essa estrutura é chamada de **`for` aninhado**: um `for` executado dentro de outro `for`.

---

## 🎯 Entendendo o problema

Queremos gerar:

```text
Tabuada do 1
1 × 1
1 × 2
1 × 3
...
1 × 10

Tabuada do 2
2 × 1
2 × 2
2 × 3
...
2 × 10

...

Tabuada do 10
10 × 1
10 × 2
...
10 × 10
```

Observe que existem duas contagens acontecendo.

A primeira percorre:

```text
1 → 2 → 3 → ... → 10
```

A segunda também percorre:

```text
1 → 2 → 3 → ... → 10
```

Porém, para cada valor da primeira contagem, a segunda precisa ser executada **novamente do início**.

---

## 🔁 Dois níveis de repetição

Para representar esse comportamento, precisamos de dois `for`:

```java id="x4q1wm"
for (int i = 1; i <= 10; i++) {

    for (int j = 1; j <= 10; j++) {

        // cálculo
    }
}
```

Podemos interpretar:

```text
for externo
     ↓
i = 1
     ↓
for interno
     ↓
j = 1 → 2 → 3 → ... → 10
     ↓
terminou
     ↓
for externo continua
     ↓
i = 2
     ↓
for interno começa novamente
     ↓
j = 1 → 2 → 3 → ... → 10
```

Esse processo continua até o `for` externo chegar ao valor `10`.

---

## 🔢 O `for` externo

O primeiro `for` controla **qual tabuada estamos produzindo**:

```java id="5v3n8c"
for (int i = 1; i <= 10; i++) {
```

Assim:

```text
i = 1 → tabuada do 1
i = 2 → tabuada do 2
i = 3 → tabuada do 3
...
i = 10 → tabuada do 10
```

A variável `i` representa o número da tabuada.

---

## 🔢 O `for` interno

Dentro do primeiro `for`, temos outro:

```java id="8c6w5j"
for (int j = 1; j <= 10; j++) {
```

O `j` controla o multiplicador.

Para cada valor de `i`, o `j` percorre novamente de `1` até `10`.

Por exemplo, quando:

```text
i = 3
```

o `for` interno executará:

```text
3 × 1
3 × 2
3 × 3
...
3 × 10
```

Quando terminar, o `for` externo passa para:

```text
i = 4
```

E o `j` começa novamente em `1`.

---

## 🧮 Realizando a multiplicação

O cálculo pode ser feito utilizando:

```java id="q8k0v1"
i * j
```

Uma implementação simples é:

```java id="w6f3a4"
for (int i = 1; i <= 10; i++) {

    for (int j = 1; j <= 10; j++) {

        System.out.println(i * j);
    }
}
```

O resultado conterá todos os produtos das tabuadas de `1` a `10`.

---

## 📝 Apresentando a operação completa

Podemos utilizar concatenação para apresentar a operação de forma mais clara:

```java id="8v4q5e"
System.out.println(i + " x " + j + " = " + (i * j));
```

Os parênteses são importantes para deixar explícito que a multiplicação deve ser realizada antes da concatenação do resultado.

Exemplo:

```text
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
...
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
...
```

Assim conseguimos visualizar claramente cada operação realizada.

---

## 🔄 Como o `for` aninhado funciona

Considere:

```java id="3q6m2e"
for (int i = 1; i <= 10; i++) {

    for (int j = 1; j <= 10; j++) {
        System.out.println(i * j);
    }
}
```

Quando `i` vale `1`:

```text
i = 1
 ↓
j = 1
j = 2
j = 3
...
j = 10
```

Somente depois que o `for` interno termina é que `i` é incrementado:

```text
i = 2
```

Então o `for` interno começa novamente:

```text
j = 1
j = 2
j = 3
...
j = 10
```

O processo se repete até:

```text
i = 10
j = 10
```

---

## 🧠 Visualizando a execução

Podemos representar o funcionamento como uma matriz:

```text
       j →
       1   2   3   ... 10
i  1   ×   ×   ×   ... ×
↓  2   ×   ×   ×   ... ×
   3   ×   ×   ×   ... ×
   .   .   .   .    .  .
  10   ×   ×   ×   ... ×
```

Cada combinação entre `i` e `j` representa uma multiplicação.

Por exemplo:

```text
i = 3
j = 7

3 × 7 = 21
```

O `for` aninhado permite percorrer sistematicamente todas essas combinações.

---

## 📦 Escopo das variáveis

A aula também reforça o conceito de **escopo** apresentado anteriormente.

É comum utilizar variáveis diferentes para os dois níveis de repetição:

```java id="z7v4hx"
for (int i = 1; i <= 10; i++) {

    for (int j = 1; j <= 10; j++) {

        System.out.println(i * j);
    }
}
```

Nesse caso:

```text
i → pertence ao for externo
j → pertence ao for interno
```

A variável `j` existe dentro do escopo do `for` interno.

Já `i` pode ser acessada pelo `for` interno porque o escopo do `for` externo engloba o `for` interno.

Isso permite utilizar:

```java id="w2j7k3"
i * j
```

dentro do `for` interno.

---

## ⚠️ Por que utilizar `i` e `j`?

Ao trabalhar com `for` aninhado, é muito comum utilizar:

```text
i → primeiro nível
j → segundo nível
```

Por exemplo:

```java id="h7n1s0"
for (int i = 1; i <= 10; i++) {
    for (int j = 1; j <= 10; j++) {
    }
}
```

Essa convenção é bastante utilizada, mas é importante entender que **os nomes não possuem significado especial para o Java**.

Poderíamos utilizar outros nomes, desde que façam sentido no contexto.

O professor ressalta, porém, que o uso de `i` e `j` é comum em estruturas de repetição desse tipo.

---

## 🐞 Utilizando o Debugger

A aula utiliza novamente o **debugger** para demonstrar o funcionamento do `for` aninhado.

Ao interromper a execução e avançar com `F8`, podemos observar os valores de `i` e `j`.

Inicialmente:

```text
i = 1
j = 1
```

Depois:

```text
i = 1
j = 2
```

E assim por diante:

```text
i = 1
j = 3
i = 1
j = 4
...
i = 1
j = 10
```

Quando o `j` termina:

```text
j = 10
```

o `for` interno é encerrado e o programa retorna ao `for` externo:

```text
i = 2
j = 1
```

O comportamento se repete dessa forma até o término dos dois laços.

---

## 🧠 Modelo mental

O conceito pode ser entendido como:

```text
FOR EXTERNO
     ↓
   i = 1
     ↓
  FOR INTERNO
     ↓
 j = 1 → 2 → 3 → ... → 10
     ↓
   termina
     ↓
   i++
     ↓
   i = 2
     ↓
  FOR INTERNO
     ↓
 j = 1 → 2 → 3 → ... → 10
     ↓
    ...
```

Uma maneira ainda mais simples:

```text
Para cada i
    faça todos os j
```

Ou:

```text
i = 1 → percorre j de 1 a 10
i = 2 → percorre j de 1 a 10
i = 3 → percorre j de 1 a 10
...
i = 10 → percorre j de 1 a 10
```

---

## 🔑 Conceitos importantes

* **`for` aninhado:** um `for` dentro de outro `for`.
* **Laço externo:** controla o primeiro nível da repetição.
* **Laço interno:** executa completamente para cada iteração do laço externo.
* **Variável `i`:** utilizada para controlar o primeiro nível da contagem.
* **Variável `j`:** utilizada para controlar o segundo nível da contagem.
* **Escopo:** determina onde cada variável pode ser utilizada.
* **Debugger:** permite acompanhar a evolução de `i` e `j` durante a execução.
* **Repetição aninhada:** permite trabalhar com combinações de dois conjuntos de valores.

---

## 💡 Principal aprendizado

O principal aprendizado desta aula é perceber que **uma repetição pode conter outra repetição**.

No problema da tabuada, temos:

```text
Para cada número de 1 até 10
    faça a multiplicação por
    cada número de 1 até 10
```

Isso se transforma em:

```java id="c7y4q2"
for (int i = 1; i <= 10; i++) {

    for (int j = 1; j <= 10; j++) {

        System.out.println(i * j);
    }
}
```

O ponto fundamental é entender que o `for` interno é executado **completamente para cada iteração do `for` externo**.

Assim:

```text
1 → 10 execuções do j
2 → 10 execuções do j
3 → 10 execuções do j
...
10 → 10 execuções do j
```

Esse conceito de **laços aninhados** será importante para problemas que envolvem tabelas, matrizes, combinações e estruturas multidimensionais.

---

## 🚀 Próxima aula

**Continuação dos exercícios com laços de repetição**
