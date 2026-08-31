# Lógica de Programação - Virado no Jiraya

# Aula 05 — Meu Primeiro Programa

## 📚 Sobre a aula

Nesta aula é criado o primeiro programa em Java, permitindo compreender a estrutura básica de uma aplicação Java e o processo de **compilação e execução**.

O objetivo principal é entender como o código-fonte escrito pelo programador se transforma em um programa executável pela JVM.

---

## ☕ Estrutura básica de um programa Java

Um programa Java pode ser criado utilizando uma classe:

```java
public class OlaMundo {

    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }

}
```

### Principais elementos

**Classe**

```java
public class OlaMundo
```

Define uma classe chamada `OlaMundo`.

**Método `main`**

```java
public static void main(String[] args)
```

É o **ponto de entrada** de uma aplicação Java convencional. A execução começa a partir desse método.

**`System.out.println()`**

```java
System.out.println("Olá, mundo!");
```

Exibe uma mensagem no console.

---

## 🔄 Compilação e execução

O código-fonte Java é armazenado em um arquivo com extensão:

```text
OlaMundo.java
```

Para compilá-lo:

```bash
javac OlaMundo.java
```

O compilador gera o arquivo:

```text
OlaMundo.class
```

Esse arquivo contém o **bytecode Java**.

Para executar:

```bash
java OlaMundo
```

O fluxo pode ser representado assim:

```text
Código-fonte
   │
   │ javac
   ↓
OlaMundo.java
   │
   ↓
Bytecode
   │
   ↓
OlaMundo.class
   │
   │ JVM
   ↓
Programa em execução
```

---

## 🧩 Código-fonte × Bytecode

### Código-fonte

É o código escrito pelo programador:

```java
System.out.println("Olá, mundo!");
```

É legível e editável pelo desenvolvedor.

### Bytecode

É o resultado da compilação do código Java.

```text
.java
  ↓
compilador
  ↓
.class
```

O bytecode é destinado à **JVM**, que será responsável por executar o programa.

---

## 🖥️ O papel da JVM

A JVM (**Java Virtual Machine**) fornece o ambiente necessário para executar o bytecode Java.

Isso permite que o mesmo bytecode possa ser executado em diferentes sistemas, desde que exista uma JVM compatível com aquela plataforma.

```text
              Bytecode
                  │
       ┌──────────┼──────────┐
       ↓          ↓          ↓
     JVM        JVM        JVM
    Linux      Windows     macOS
```

---

## 🔑 Conceitos importantes

- **Classe:** estrutura fundamental utilizada para organizar código Java.
- **`main`:** ponto de entrada de uma aplicação Java convencional.
- **`System.out.println()`:** utilizado para imprimir informações no console.
- **`.java`:** extensão do arquivo de código-fonte Java.
- **`.class`:** arquivo produzido pela compilação, contendo bytecode.
- **`javac`:** compilador Java.
- **`java`:** comando utilizado para executar uma aplicação Java.
- **JVM:** ambiente responsável pela execução do bytecode.

---

## 🧠 Modelo mental

O processo fundamental aprendido nesta aula pode ser resumido como:

```text
Programador
    ↓
Código Java (.java)
    ↓
Compilador (javac)
    ↓
Bytecode (.class)
    ↓
JVM
    ↓
Execução do programa
```

---

## 🚀 Próxima aula

**Aula 06 — Memória Volátil**
