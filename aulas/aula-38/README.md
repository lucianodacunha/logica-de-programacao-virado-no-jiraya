# Lógica de Programação - Virado no Jiraya

# Aula 38 — Arrays e Laços de Repetição

## 📚 Sobre a aula

Nesta aula começamos a combinar dois conceitos estudados anteriormente:

* **arrays (vetores)**;
* **laços de repetição**.

Na aula anterior, aprendemos a acessar cada posição de um array individualmente. Porém, fazer isso manualmente para todas as posições gera código repetitivo.

O `for` permite percorrer automaticamente as posições do array, tornando o código mais simples e flexível.

---

## 🔄 Percorrendo um Array com `for`

Considere um array com quatro posições:

```java
double[] notas = new double[4];
```

Se quisermos imprimir todos os valores manualmente, poderíamos fazer:

```java
System.out.println(notas[0]);
System.out.println(notas[1]);
System.out.println(notas[2]);
System.out.println(notas[3]);
```

O problema é que, se o tamanho do array mudar, precisamos alterar o código.

Em vez disso, podemos utilizar um `for`:

```java
for (int i = 0; i < notas.length; i++) {
    System.out.println(notas[i]);
}
```

Agora o próprio laço percorre todas as posições.

---

## 📏 Utilizando `length`

Uma das principais novidades práticas da aula é a propriedade:

```java
notas.length
```

Ela retorna o **tamanho do array**.

Se:

```java
double[] notas = new double[4];
```

então:

```java
notas.length
```

retorna:

```text
4
```

Isso permite evitar valores fixos no `for`.

Em vez de:

```java
for (int i = 0; i < 4; i++) {
```

podemos utilizar:

```java
for (int i = 0; i < notas.length; i++) {
```

Assim, o código passa a se adaptar automaticamente ao tamanho do array.

---

## ⚠️ Por que utilizar `<` e não `<=`?

Essa é uma consequência importante da indexação iniciada em zero.

Se o array possui tamanho `4`:

```text
Tamanho = 4
```

seus índices são:

```text
0  1  2  3
```

Portanto, o `for` deve executar enquanto:

```java
i < notas.length
```

Ou seja:

```text
i < 4

0 → válido
1 → válido
2 → válido
3 → válido
4 → não deve acessar
```

Se utilizarmos:

```java
i <= notas.length
```

quando `i` chegar a `4`, o programa tentará acessar:

```java
notas[4]
```

Essa posição não existe e ocorrerá uma exceção de índice fora dos limites.

Portanto, o padrão é:

```java
for (int i = 0; i < notas.length; i++) {
```

---

# 📝 Preenchendo o Array pelo Teclado

Depois de aprender a percorrer o array, o próximo passo é preenchê-lo utilizando valores fornecidos pelo usuário.

Para isso, utilizamos novamente o `Scanner`.

A lógica é:

```text
para cada posição do array
        ↓
solicita um valor
        ↓
armazena na posição atual
        ↓
vai para a próxima posição
```

Podemos fazer:

```java
for (int i = 0; i < notas.length; i++) {
    System.out.print("Digite a nota: ");
    notas[i] = scanner.nextDouble();
}
```

A variável `i` determina em qual posição o valor será armazenado:

```text
i = 0 → notas[0]
i = 1 → notas[1]
i = 2 → notas[2]
i = 3 → notas[3]
```

Dessa maneira, não precisamos escrever uma atribuição para cada posição.

---

## 🖥️ Melhorando a interação com o usuário

O professor também destaca a importância de apresentar mensagens compreensíveis.

Em vez de deixar o usuário diante de uma entrada sem contexto:

```text
Digite um valor:
```

podemos informar qual nota está sendo solicitada.

Por exemplo:

```java
System.out.println("Digite a nota " + (i + 1));
```

O `i + 1` é utilizado para apresentar a numeração de forma mais natural ao usuário.

Enquanto o programa trabalha com:

```text
0, 1, 2, 3
```

o usuário visualiza:

```text
1, 2, 3, 4
```

Isso reforça uma diferença importante entre **índice utilizado pelo programa** e **numeração apresentada ao usuário**.

---

# 📤 Imprimindo os valores

Depois de preencher o array, podemos utilizar outro `for` para apresentar os valores armazenados:

```java
for (int i = 0; i < notas.length; i++) {
    System.out.println("Nota " + (i + 1) + ": " + notas[i]);
}
```

Assim, se o usuário informar:

```text
5
6
8
10
```

teremos:

```text
Nota 1: 5
Nota 2: 6
Nota 3: 8
Nota 4: 10
```

O mesmo array é percorrido novamente, mas agora com o objetivo de **ler e apresentar seus valores**.

---

# ➕ Calculando a soma

A aula também utiliza o array para calcular a soma das notas.

Para isso, precisamos de uma variável que funcione como **acumulador**.

Por exemplo:

```java
double soma = 0;
```

Depois, durante o `for`:

```java
for (int i = 0; i < notas.length; i++) {
    soma += notas[i];
}
```

A cada iteração, uma nova nota é adicionada à soma:

```text
soma = 0

nota 1 → soma = soma + nota 1
nota 2 → soma = soma + nota 2
nota 3 → soma = soma + nota 3
...
```

---

## ⚠️ Onde declarar a variável acumuladora?

Esse ponto é importante.

A variável:

```java
double soma = 0;
```

deve ser declarada **fora do `for`**.

Se fosse declarada dentro:

```java
for (int i = 0; i < notas.length; i++) {
    double soma = 0;
    soma += notas[i];
}
```

a variável seria recriada a cada iteração, impedindo que o valor acumulado fosse preservado.

A ideia é:

```text
soma = 0
   ↓
for
   ↓
soma + nota
   ↓
soma + próxima nota
   ↓
soma + próxima nota
   ↓
...
```

Portanto:

```java
double soma = 0;

for (...) {
    soma += ...;
}
```

---

# 📊 Calculando a média

Depois de obter a soma, podemos calcular a média.

A fórmula é:

```text
média = soma das notas / quantidade de notas
```

No array, a quantidade de notas corresponde ao:

```java
notas.length
```

Logo:

```java
double media = soma / notas.length;
```

Por exemplo, considerando:

```text
5 + 6 + 8 + 10 = 29
```

e:

```text
notas.length = 4
```

temos:

```text
29 / 4 = 7.25
```

---

## 🔄 Fluxo completo

O processamento pode ser dividido em etapas:

```text
CRIAR ARRAY
    ↓
PREENCHER ARRAY
    ↓
PERCORRER ARRAY
    ↓
SOMAR VALORES
    ↓
CALCULAR MÉDIA
    ↓
APRESENTAR RESULTADO
```

Uma implementação simplificada:

```java
double[] notas = new double[4];

for (int i = 0; i < notas.length; i++) {
    System.out.print("Digite a nota " + (i + 1) + ": ");
    notas[i] = scanner.nextDouble();
}

double soma = 0;

for (int i = 0; i < notas.length; i++) {
    soma += notas[i];
}

double media = soma / notas.length;

System.out.println("Soma das notas: " + soma);
System.out.println("Média das notas: " + media);
```

---

# 🔁 Dois `for` trabalhando com o mesmo Array

No exemplo da aula, podemos utilizar um `for` para **preencher** o array e outro para **processá-lo**.

### Primeiro `for`

Responsável por receber os valores:

```java
for (int i = 0; i < notas.length; i++) {
    notas[i] = scanner.nextDouble();
}
```

### Segundo `for`

Responsável por percorrer os valores:

```java
for (int i = 0; i < notas.length; i++) {
    soma += notas[i];
}
```

Temos, portanto:

```text
FOR 1
 ↓
preenche o array

FOR 2
 ↓
processa o array
```

O professor também propõe como desafio tentar realizar esse processamento de forma mais eficiente, aproveitando o primeiro `for` para acumular os valores enquanto eles são inseridos.

---

# 🧠 Escopo dentro do `for`

O conceito de escopo continua sendo importante.

Quando declaramos:

```java
for (int i = 0; i < notas.length; i++) {
    ...
}
```

a variável `i` pertence ao escopo do `for`.

Ela pode ser utilizada dentro do bloco:

```java
notas[i]
```

mas não estará disponível fora dele.

Já uma variável declarada antes do `for`, como:

```java
double soma = 0;
```

pode ser utilizada dentro do laço e posteriormente:

```java
for (...) {
    soma += notas[i];
}

System.out.println(soma);
```

Isso ocorre porque seu escopo é mais abrangente.

---

## 🧠 Modelo mental

A relação entre array e `for` pode ser visualizada assim:

```text
              ARRAY
                ↓
+------+------+------+------+ 
|      |      |      |      |
+------+------+------+------+
   0      1      2      3
   ↑
   |
   i
   |
   └── for percorre as posições
```

O padrão:

```java
for (int i = 0; i < array.length; i++) {
    // acessar array[i]
}
```

pode ser interpretado como:

> "Comece no primeiro índice, percorra enquanto ainda houver posições e avance uma posição a cada iteração."

---

## 🔑 Conceitos importantes

* **Array + `for`:** combinação utilizada para percorrer e processar todos os elementos.
* **`length`:** retorna o tamanho do array.
* **`array[i]`:** acessa o elemento correspondente ao índice atual.
* **`i < array.length`:** condição adequada para percorrer todos os índices.
* **Preenchimento:** valores podem ser armazenados nas posições durante o `for`.
* **Acumulador:** variável utilizada para manter um resultado ao longo das iterações.
* **Soma:** pode ser obtida acumulando cada elemento do array.
* **Média:** soma dos valores dividida pela quantidade de elementos.
* **Escopo:** determina onde as variáveis podem ser utilizadas.
* **Índice:** começa em `0`, enquanto a quantidade de elementos começa conceitualmente em `1`.

---

## 💡 Principal aprendizado

A grande evolução desta aula é perceber que **arrays e laços de repetição foram feitos para trabalhar juntos**.

Em vez de escrever:

```java
notas[0]
notas[1]
notas[2]
notas[3]
```

podemos utilizar:

```java
for (int i = 0; i < notas.length; i++) {
    notas[i];
}
```

Isso torna o código independente de um tamanho específico do array.

A estrutura:

```java
for (int i = 0; i < array.length; i++) {
```

é um dos padrões fundamentais para trabalhar com arrays em Java.

A partir dela, podemos:

```text
percorrer
   ↓
ler
   ↓
alterar
   ↓
somar
   ↓
calcular
   ↓
processar
```

os elementos de um array.

A aula também reforça um princípio importante de lógica: **quando uma operação precisa manter um resultado acumulado entre várias iterações, a variável acumuladora deve existir fora do laço**.

---

## 📝 Desafio proposto

O professor propõe tentar melhorar a solução de forma que seja possível **preencher o array e acumular a soma no mesmo `for`**.

A ideia é evitar um segundo percurso quando ele não for necessário:

```text
receber nota
    ↓
armazenar no array
    ↓
adicionar à soma
    ↓
próxima nota
```

Esse desafio é uma boa oportunidade para praticar a relação entre:

* entrada de dados;
* arrays;
* `for`;
* acumuladores;
* operações matemáticas.

---

## 🚀 Próxima aula

**Continuação do processamento de arrays**
