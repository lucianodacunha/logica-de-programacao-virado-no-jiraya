# Lógica de Programação - Virado no Jiraya

# Aula 20 — Entrada de Dados no Exercício do Torneio de Natação

## 📚 Sobre a aula

Nesta aula damos continuidade ao exercício do **torneio de natação**, aplicando na prática o conceito de **entrada de dados pelo teclado** apresentado na aula anterior.

O objetivo é substituir os valores definidos diretamente no código por informações fornecidas pelo usuário durante a execução do programa.

Para isso, utilizamos a classe:

```java
Scanner
```

A aula reforça também que, para utilizar o `Scanner`, é necessário realizar seu `import`.

---

# ⌨️ Preparando o `Scanner`

Primeiramente, precisamos importar a classe:

```java
import java.util.Scanner;
```

Sem esse `import`, o Java não reconhecerá a classe `Scanner`.

Depois criamos uma variável para representar o teclado:

```java
Scanner input = new Scanner(System.in);
```

Nesse caso:

```text
Scanner
   ↓
tipo da variável

input
   ↓
nome da variável

new Scanner(System.in)
   ↓
criação do Scanner utilizando a entrada padrão
```

O nome `input` poderia ser substituído por outro nome mais adequado ao contexto, como:

```java
Scanner teclado = new Scanner(System.in);
```

---

# 📝 Recebendo o nome

Depois de criar o `Scanner`, podemos solicitar o nome do participante:

```java
System.out.println("Digite seu nome:");
```

Em seguida, realizamos a leitura:

```java
String nome = input.next();
```

O método:

```java
next()
```

é utilizado para receber uma entrada do tipo `String`.

O fluxo é:

```text
Programa
   ↓
"Digite seu nome:"
   ↓
Usuário digita
   ↓
input.next()
   ↓
nome
```

---

# 🔢 Recebendo a idade

Para receber a idade, utilizamos:

```java
System.out.println("Digite sua idade:");
```

e:

```java
int idade = input.nextInt();
```

Nesse caso, utilizamos:

```java
nextInt()
```

porque a variável `idade` é do tipo:

```java
int
```

O fluxo fica:

```text
Programa
   ↓
"Digite sua idade:"
   ↓
Usuário digita
   ↓
input.nextInt()
   ↓
idade
```

---

# 🧩 Entrada de dados e tipos

A aula reforça novamente a relação entre o tipo da variável e o método utilizado pelo `Scanner`.

Para o exercício:

```java
String nome = input.next();
```

e:

```java
int idade = input.nextInt();
```

Portanto:

```text
String
   ↓
next()

int
   ↓
nextInt()
```

É importante utilizar o método correspondente ao tipo de dado que desejamos receber.

---

# 🏊 Aplicando ao torneio de natação

Na aula anterior, o exercício utilizava dados definidos diretamente no código.

Por exemplo:

```java
String nome = "William";
int idade = 19;
```

Agora esses valores podem ser fornecidos pelo usuário:

```java
String nome = input.next();
int idade = input.nextInt();
```

Assim, o programa passa a receber dados durante sua execução.

---

# 🔄 Fluxo do exercício

O funcionamento pode ser representado:

```text
             Início
                ↓
        Criar Scanner
                ↓
        Solicitar nome
                ↓
       Ler nome com next()
                ↓
       Solicitar idade
                ↓
     Ler idade com nextInt()
                ↓
       Processar categoria
                ↓
         Exibir resultado
```

---

# 💻 Exemplo

Uma implementação básica da entrada de dados:

```java
import java.util.Scanner;

public class TorneioNatação {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = input.next();

        System.out.println("Digite sua idade:");
        int idade = input.nextInt();

        System.out.println(
            nome + " tem " + idade + " anos."
        );
    }
}
```

Uma possível execução:

```text
Digite seu nome:
William

Digite sua idade:
19

William tem 19 anos.
```

---

# 🧠 O que mudou em relação às aulas anteriores?

Anteriormente:

```java
String nome = "William";
int idade = 19;
```

Os valores eram definidos diretamente no código.

Agora:

```java
String nome = input.next();
int idade = input.nextInt();
```

Os valores são fornecidos durante a execução.

A diferença pode ser resumida:

```text
ANTES

Código
  ↓
Valores definidos previamente
  ↓
Processamento


AGORA

Usuário
  ↓
Entrada de dados
  ↓
Variáveis
  ↓
Processamento
```

---

# 📌 Exercício do torneio

O exercício trabalhado anteriormente possuía as categorias:

| Idade | Categoria |
|---:|---|
| Até 10 anos | Infantil |
| 11 a 15 anos | Juvenil |
| 16 a 19 anos | Pré-adulto |
| 20 anos ou mais | Adulto |

Nesta aula, a entrada de:

```java
nome
idade
```

passa a ser realizada pelo usuário.

A lógica de classificação pode então utilizar a variável `idade` normalmente.

---

# ⚠️ Entrada pelo teclado × valores no código

A aula faz uma observação prática importante:

Para fins de aprendizado, é possível continuar utilizando valores diretamente no código:

```java
int idade = 19;
```

Isso evita a necessidade de digitar os valores repetidamente durante os testes.

Por outro lado, utilizar:

```java
input.nextInt();
```

permite praticar a entrada de dados pelo teclado.

Assim, a escolha pode depender do objetivo naquele momento:

```text
Praticar lógica rapidamente
        ↓
Valores diretamente no código


Praticar entrada de dados
        ↓
Scanner
```

---

# 🔑 Conceitos importantes

- **`Scanner`:** utilizado para receber dados da entrada padrão.
- **`System.in`:** representa a entrada padrão utilizada pelo `Scanner`.
- **`import`:** necessário para disponibilizar a classe `Scanner`.
- **`next()`:** utilizado para receber uma `String`.
- **`nextInt()`:** utilizado para receber um `int`.
- **Entrada de dados:** permite que informações sejam fornecidas durante a execução.
- **Atribuição:** armazena o valor recebido em uma variável.
- **Entrada dinâmica:** permite que o mesmo programa trabalhe com valores diferentes sem alterar o código.

---

# 🧠 Modelo mental

O conceito principal da aula pode ser resumido:

```text
             USUÁRIO
                ↓
        digita o nome
                ↓
          input.next()
                ↓
              nome

        digita a idade
                ↓
        input.nextInt()
                ↓
              idade
                ↓
          processamento
                ↓
             resultado
```

---

# 💡 Principal aprendizado

A principal finalidade desta aula é aplicar o conceito de **entrada de dados pelo teclado** ao exercício do torneio de natação.

O programa deixa de depender exclusivamente de valores definidos no código:

```java
String nome = "William";
int idade = 19;
```

e passa a receber os dados durante a execução:

```java
String nome = input.next();
int idade = input.nextInt();
```

O ponto fundamental é compreender que o `Scanner` funciona como uma ponte entre o **usuário** e as **variáveis do programa**:

```text
Usuário
   ↓
Scanner
   ↓
Variável
   ↓
Algoritmo
   ↓
Resultado
```

A partir desse momento, nossos exercícios de lógica podem começar a trabalhar com dados externos, tornando os programas mais interativos.

---

# 🚀 Próxima aula

**Aula 21 — Continuação do Controle de Fluxo e Entrada de Dados**