# Lógica de Programação - Virado no Jiraya

# Aula 19 — Entrada de Dados pelo Teclado com Scanner

## 📚 Sobre a aula

Nesta aula começamos a trabalhar com **entrada de dados pelo teclado**.

Até então, os valores utilizados nos exercícios eram definidos diretamente no código:

```java
String nome = "William";
int idade = 30;
```

Agora o objetivo é permitir que o **usuário informe os dados durante a execução do programa**.

Para isso, utilizaremos a classe:

```java
Scanner
```

O foco da aula continua sendo a construção de **algoritmos e lógica de programação**. Os elementos específicos do Java são apresentados apenas como ferramentas necessárias para permitir a entrada dos dados.

---

# ⌨️ Entrada de dados

Um programa normalmente pode trabalhar com três etapas:

```text
Entrada
   ↓
Processamento
   ↓
Saída
```

Na aula, começamos a trabalhar diretamente com a primeira etapa:

```text
Entrada
   ↓
Teclado
```

O usuário fornece uma informação e o programa armazena essa informação em uma variável.

---

# 🔎 A classe `Scanner`

Para ler dados do teclado em Java, utilizamos a classe:

```java
Scanner
```

Primeiramente, é necessário importar a classe:

```java
import java.util.Scanner;
```

Depois podemos criar um objeto `Scanner`:

```java
Scanner teclado = new Scanner(System.in);
```

---

# 🧩 Entendendo a declaração

A linha:

```java
Scanner teclado = new Scanner(System.in);
```

possui algumas partes.

### Tipo

```java
Scanner
```

Indica o tipo da variável.

### Nome

```java
teclado
```

É o nome escolhido para identificar a variável.

### `new`

```java
new
```

É utilizado para criar uma nova instância do objeto.

### `Scanner(System.in)`

Indica que o `Scanner` será utilizado para realizar a leitura da entrada padrão do sistema.

Neste momento, não é necessário aprofundar o funcionamento interno do objeto. O importante é compreender como utilizá-lo para receber dados.

---

# 📥 Lendo dados do teclado

Depois de criar:

```java
Scanner teclado = new Scanner(System.in);
```

podemos utilizar:

```java
teclado.next()
```

para realizar uma leitura.

Por exemplo:

```java
String nome = teclado.next();
```

O programa ficará aguardando o usuário digitar uma informação.

---

# ⏳ Programa aguardando entrada

Quando o programa chega a:

```java
teclado.next();
```

ele fica aguardando o usuário fornecer um valor.

Podemos visualizar:

```text
Programa iniciado
       ↓
Executa Scanner
       ↓
Aguarda entrada
       ↓
Usuário digita
       ↓
Scanner recebe o valor
       ↓
Programa continua
```

Enquanto o usuário não fornecer a entrada esperada, o programa permanece aguardando.

---

# 📝 Exibindo uma mensagem antes da entrada

É importante informar ao usuário o que ele deve digitar.

Podemos fazer:

```java
System.out.println("Digite seu nome:");
```

e depois:

```java
String nome = teclado.next();
```

Assim:

```text
Digite seu nome:
William
```

O usuário sabe exatamente qual informação deve fornecer.

---

# 📦 Armazenando a entrada em uma variável

A leitura pode ser atribuída diretamente a uma variável:

```java
String nome = teclado.next();
```

Nesse caso:

```text
teclado.next()
      ↓
entrada do usuário
      ↓
variável nome
```

Se o usuário digitar:

```text
William
```

teremos:

```text
nome = "William"
```

---

# ⚠️ Apenas ler não significa armazenar

Se fizermos:

```java
teclado.next();
```

o programa realizará a leitura, mas o valor não estará sendo armazenado em uma variável que possamos utilizar posteriormente.

Para guardar o valor:

```java
String nome = teclado.next();
```

Agora o dado recebido possui um local para ser utilizado posteriormente.

---

# 🔢 O tipo da entrada é importante

Um dos pontos mais importantes da aula é que o método utilizado para realizar a leitura deve estar de acordo com o **tipo de dado esperado**.

Por exemplo, para `String`:

```java
String nome = teclado.next();
```

Para `int`:

```java
int idade = teclado.nextInt();
```

Para `double`:

```java
double salario = teclado.nextDouble();
```

Para `boolean`:

```java
boolean ativo = teclado.nextBoolean();
```

Portanto:

```text
Tipo da variável
       ↓
Método de leitura compatível
```

---

# 📊 Principais métodos apresentados

| Tipo de dado | Método |
|---|---|
| `String` | `next()` |
| `int` | `nextInt()` |
| `double` | `nextDouble()` |
| `boolean` | `nextBoolean()` |

Exemplo:

```java
String nome = teclado.next();

int idade = teclado.nextInt();

double salario = teclado.nextDouble();

boolean ativo = teclado.nextBoolean();
```

---

# ⚠️ Compatibilidade entre tipo e entrada

É importante prestar atenção ao tipo que está sendo solicitado.

Por exemplo:

```java
int idade = teclado.nextInt();
```

Nesse caso, o programa espera receber um número inteiro.

Se a entrada não for compatível com o tipo esperado, ocorrerá um problema durante a execução.

Por isso, devemos sempre pensar:

```text
O que quero receber?
       ↓
Qual é o tipo do dado?
       ↓
Qual método do Scanner devo utilizar?
```

---

# 🏊 Aplicando ao exercício do torneio de natação

Na aula anterior, o exercício do torneio utilizava valores definidos diretamente no código:

```java
String nome = "William";
int idade = 19;
```

Agora queremos que esses dados sejam fornecidos pelo usuário.

Primeiro:

```java
System.out.println("Digite seu nome:");
String nome = teclado.next();
```

Depois:

```java
System.out.println("Digite sua idade:");
int idade = teclado.nextInt();
```

Agora o programa possui os dados fornecidos pelo usuário.

---

# 🔄 Fluxo do programa

Podemos representar:

```text
Início
  ↓
Criar Scanner
  ↓
Solicitar nome
  ↓
Usuário digita nome
  ↓
Armazenar nome
  ↓
Solicitar idade
  ↓
Usuário digita idade
  ↓
Armazenar idade
  ↓
Processar categoria
  ↓
Exibir resultado
```

A próxima etapa será utilizar esses dados no algoritmo de classificação das categorias de natação.

---

# 💻 Exemplo completo

Uma implementação básica da entrada de dados:

```java
import java.util.Scanner;

public class TorneioNatação {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = teclado.next();

        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
```

Uma possível execução:

```text
Digite seu nome:
William

Digite sua idade:
19

Nome: William
Idade: 19
```

---

# 🧠 Entrada, processamento e saída

Esse exemplo já permite visualizar as três etapas fundamentais:

### Entrada

```java
String nome = teclado.next();
int idade = teclado.nextInt();
```

### Processamento

O processamento será realizado posteriormente utilizando:

```text
nome
idade
```

### Saída

```java
System.out.println(...)
```

Podemos representar:

```text
          ENTRADA
             ↓
       nome + idade
             ↓
        PROCESSAMENTO
             ↓
       regras do programa
             ↓
           SAÍDA
             ↓
          console
```

---

# 🧩 Desafio proposto

A aula termina propondo a adaptação do exercício do **torneio de natação**.

O objetivo é substituir os valores definidos diretamente no código por valores fornecidos pelo usuário.

Anteriormente:

```java
String nome = "William";
int idade = 19;
```

Agora:

```java
String nome = teclado.next();
int idade = teclado.nextInt();
```

Depois, esses valores devem ser utilizados na lógica de classificação:

```text
até 10      → Infantil
11 a 15     → Juvenil
16 a 19     → Pré-adulto
20 ou mais  → Adulto
```

---

# 🔑 Conceitos importantes

- **Entrada de dados:** informação fornecida ao programa pelo usuário.
- **`Scanner`:** classe utilizada para realizar leituras da entrada.
- **`System.in`:** entrada padrão do sistema, utilizada pelo `Scanner`.
- **`next()`:** realiza leitura de uma `String`.
- **`nextInt()`:** realiza leitura de um número inteiro.
- **`nextDouble()`:** realiza leitura de um número decimal.
- **`nextBoolean()`:** realiza leitura de um valor booleano.
- **Atribuição:** permite armazenar o valor recebido em uma variável.
- **Tipo de dado:** determina o tipo de informação que a variável pode armazenar.
- **Entrada → processamento → saída:** modelo fundamental de funcionamento de um programa.

---

# 🧠 Modelo mental

A lógica principal da aula pode ser resumida:

```text
        USUÁRIO
           ↓
       digita dado
           ↓
        Scanner
           ↓
     método correto
           ↓
         variável
           ↓
      processamento
           ↓
         saída
```

Por exemplo:

```text
Usuário
   ↓
"Luciano"
   ↓
teclado.next()
   ↓
nome
```

E:

```text
Usuário
   ↓
19
   ↓
teclado.nextInt()
   ↓
idade
```

---

# 💡 Principal aprendizado

O principal aprendizado desta aula é entender como transformar um programa que trabalha com **valores definidos no código** em um programa capaz de **receber informações durante sua execução**.

Antes:

```java
String nome = "William";
int idade = 19;
```

Agora:

```java
String nome = teclado.next();
int idade = teclado.nextInt();
```

Isso representa uma mudança importante:

```text
Valor fixo no código
       ↓
Entrada fornecida pelo usuário
```

Também é fundamental compreender que o método de leitura precisa corresponder ao tipo do dado:

```java
String → next()
int    → nextInt()
double → nextDouble()
boolean → nextBoolean()
```

A partir daqui, os algoritmos que estamos construindo deixam de trabalhar apenas com valores previamente definidos e passam a responder a **dados fornecidos durante a execução**.

---

# 🚀 Próxima aula

**Aula 20 — Controle de fluxo, if - else, part 07**