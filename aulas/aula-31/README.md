# Lógica de Programação - Virado no Jiraya

# Aula 31 — Exercício: Login, `while` e `break`

## 📚 Sobre a aula

Nesta aula é desenvolvido um exercício prático envolvendo um **sistema simples de login**.

O objetivo é utilizar um laço de repetição para solicitar **usuário e senha até que os valores informados estejam corretos**.

O exercício permite revisar conceitos anteriores e introduzir novos elementos importantes:

* `while`;
* `if`;
* comparação de `String`;
* `Scanner`;
* escopo de variáveis;
* `final`;
* `break`;
* utilização do debugger.

---

## 🎯 Objetivo do exercício

O programa deverá possuir um usuário e uma senha previamente definidos.

O comportamento esperado é:

```text
Usuário informa login e senha
          ↓
       São válidos?
       ↙         ↘
     não         sim
      ↓           ↓
Acesso negado  Acesso concedido
      ↓           ↓
Solicita       encerra
novamente      programa
```

Enquanto o usuário não informar corretamente as credenciais, o programa deverá continuar solicitando os dados.

O exercício simula, de maneira simplificada, o comportamento de uma tela de autenticação.

---

## 🔐 Armazenando as credenciais

Inicialmente, podemos definir as credenciais esperadas:

```java
String login = "usuario";
String password = "senha";
```

Esses valores representam as credenciais corretas.

Na prática, dados de autenticação poderiam estar armazenados em um banco de dados, mas neste exercício eles ficam diretamente no programa.

---

## 🔄 Mantendo o login em execução

Como o programa deve continuar solicitando os dados enquanto o usuário estiver errado, utilizamos um `while`.

Uma possibilidade apresentada na aula é utilizar:

```java
while (true) {
    // solicita login e senha
    // verifica as credenciais
}
```

Como `true` é sempre verdadeiro, o laço continuará executando indefinidamente.

Nesse caso, precisamos de outra instrução para determinar quando a repetição deverá terminar: o `break`.

---

## 🏷️ Escolhendo bons nomes para variáveis

Durante o exercício, é discutida uma questão importante de **legibilidade e manutenção de código**.

Uma variável inicialmente chamada de forma semelhante a:

```java
boolean usuario = true;
```

pode causar confusão, pois o nome dá a entender que representa um usuário, quando na realidade representa uma condição relacionada à exibição ou autenticação.

Um nome mais significativo torna a intenção do código mais clara, por exemplo:

```java
boolean exibirTelaLogin = true;
```

A escolha de nomes que representam claramente o propósito da variável facilita a leitura e a manutenção do código, especialmente quando outra pessoa precisar trabalhar posteriormente naquele sistema.

---

## 📦 Escopo das variáveis

Outro conceito trabalhado é o **escopo**.

Uma variável declarada dentro do bloco do `while` pertence àquele escopo:

```java
while (true) {
    String loginDigitado = scanner.nextLine();
}
```

A cada nova execução do bloco, essa variável será criada novamente.

Quando uma variável é necessária somente dentro daquele bloco, faz sentido declará-la dentro do próprio escopo.

Isso evita manter variáveis disponíveis por mais tempo do que o necessário.

A aula também destaca que, em programas muito grandes, a criação excessiva de objetos e variáveis pode representar consumo adicional de memória.

---

## 🔒 `final` e constantes

A aula apresenta também o modificador:

```java
final
```

Quando uma variável é declarada como `final`, seu valor não pode ser alterado depois de receber uma atribuição.

Exemplo:

```java
final String login = "usuario";
```

Depois disso, não podemos fazer:

```java
login = "outroUsuario";
```

Isso produzirá um erro de compilação.

A ideia é utilizar `final` quando temos certeza de que determinado valor não deverá ser alterado durante a execução.

```text
final
  ↓
valor atribuído
  ↓
não pode ser alterado
```

A aula relaciona esse comportamento ao conceito de **constante**.

---

## ⌨️ Armazenando o login e senha digitados

Como as credenciais corretas não podem ser modificadas, precisamos de outras variáveis para armazenar os valores fornecidos pelo usuário.

Por exemplo:

```java
String loginDigitado = scanner.nextLine();
String passwordDigitado = scanner.nextLine();
```

Temos então:

```text
login
    ↓
credencial correta

loginDigitado
    ↓
valor informado pelo usuário
```

O mesmo acontece com a senha.

Essa separação é importante porque precisamos comparar **o valor esperado** com **o valor informado**.

---

## 🔤 Comparando `String`

Para comparar `String` em Java, devemos utilizar o método:

```java
.equals()
```

Por exemplo:

```java
login.equals(loginDigitado)
```

Isso verifica se o conteúdo das duas `String` é equivalente.

Para validar login **e** senha simultaneamente:

```java
login.equals(loginDigitado)
        &&
password.equals(passwordDigitado)
```

O operador `&&` significa **E lógico**.

Portanto, as duas condições precisam ser verdadeiras:

```text
Login correto     → true
Senha correta     → true
                     ↓
                   true
                     ↓
            acesso concedido
```

Se uma delas for falsa:

```text
Login correto     → true
Senha correta     → false
                     ↓
                   false
                     ↓
               acesso negado
```

---

## 🔀 Utilizando `if`

A validação pode ser realizada utilizando uma estrutura condicional:

```java
if (login.equals(loginDigitado)
        && password.equals(passwordDigitado)) {

    System.out.println("Acesso concedido");

} else {

    System.out.println("Acesso negado");
}
```

Se as credenciais estiverem corretas, o usuário recebe:

```text
Acesso concedido
```

Caso contrário:

```text
Acesso negado
```

Quando o login estiver incorreto, o programa deverá voltar ao início do processo e solicitar novamente as credenciais.

---

## 🛑 `break`

Para encerrar o `while`, podemos utilizar:

```java
break;
```

O `break` **interrompe imediatamente o laço de repetição em que está inserido**.

Por exemplo:

```java
while (true) {

    if (loginValido) {
        System.out.println("Acesso concedido");
        break;
    }
}
```

Quando o `break` for executado:

```text
while
 ↓
if verdadeiro
 ↓
break
 ↓
sai do while
 ↓
continua após o while
```

O `break` não encerra apenas o `if`; ele interrompe o **laço de repetição** que o contém.

---

## 🔄 Fluxo completo do login

O programa pode ser mentalmente representado assim:

```text
              INÍCIO
                 ↓
          Exibe tela de login
                 ↓
        Recebe login e senha
                 ↓
        ┌────────┴────────┐
        ↓                 ↓
    incorretos          corretos
        ↓                 ↓
 Acesso negado     Acesso concedido
        ↓                 ↓
 volta ao início        break
        ↓                 ↓
     repete              ↓
                          FIM
```

A grande vantagem dessa abordagem é que o programa permanece em execução até que a autenticação seja realizada corretamente.

---

## 🐞 Utilizando o Debugger

A aula também demonstra como utilizar o **debugger da IDE** para acompanhar a execução do programa.

Um **breakpoint** pode ser colocado em determinada linha para interromper temporariamente a execução.

Durante a depuração, é possível utilizar o `F8` para avançar linha por linha.

Isso permite observar:

* qual linha está sendo executada;
* quais são os valores das variáveis;
* quando uma condição resulta em `true` ou `false`;
* quando o `break` é executado;
* para onde o fluxo do programa é direcionado.

Por exemplo:

```text
linha atual
    ↓
F8
    ↓
próxima instrução
    ↓
F8
    ↓
próxima instrução
```

O debugger é especialmente útil para entender o fluxo de programas com condições e repetições.

---

## 🔁 `while (true)` + `break`

No final do exercício, a estrutura pode ser simplificada para:

```java
while (true) {

    // solicita login e senha

    if (login.equals(loginDigitado)
            && password.equals(passwordDigitado)) {

        System.out.println("Acesso concedido");
        break;
    }

    System.out.println("Acesso negado");
}
```

Nesse modelo:

```text
while (true)
     ↓
executa
     ↓
verifica login
     ↓
correto?
 ↙       ↘
não      sim
 ↓        ↓
repete   break
           ↓
         fim
```

A utilização do `break` elimina a necessidade de manter uma variável adicional apenas para controlar a continuidade do `while`.

---

## 🧠 Modelo mental

O exercício pode ser resumido em:

```text
WHILE TRUE
    ↓
LER LOGIN
    ↓
LER SENHA
    ↓
COMPARAR CREDENCIAIS
    ↓
 ┌──┴──┐
 ↓     ↓
FALSO  TRUE
 ↓       ↓
NEGADO  CONCEDIDO
 ↓       ↓
repete  BREAK
           ↓
          FIM
```

Esse padrão aparece com frequência em programas que precisam continuar executando uma determinada operação até que uma condição específica seja satisfeita.

---

## 🔑 Conceitos importantes

* **`while`:** mantém o processo de autenticação em execução.
* **`while (true)`:** cria uma repetição contínua que precisa de uma condição interna para ser interrompida.
* **`if`:** verifica se as credenciais estão corretas.
* **`.equals()`:** utilizado para comparar o conteúdo de `String`.
* **`&&`:** operador lógico "E"; exige que as duas condições sejam verdadeiras.
* **`final`:** impede que uma variável receba outro valor após sua atribuição.
* **Escopo:** determina onde uma variável pode ser utilizada.
* **`break`:** interrompe o laço de repetição.
* **Breakpoint:** ponto em que a execução pode ser pausada durante a depuração.
* **Debugger:** ferramenta que permite acompanhar o programa passo a passo.

---

## 💡 Principal aprendizado

O principal aprendizado desta aula é perceber como diferentes estruturas podem ser **combinadas para resolver um problema real de lógica**.

O exercício de login reúne:

```text
while
  +
if
  +
equals()
  +
&&
  +
break
```

O `while` mantém o processo funcionando, o `if` toma a decisão, `.equals()` compara as credenciais, `&&` exige que login e senha estejam corretos e `break` encerra a repetição quando a autenticação é bem-sucedida.

O padrão central é:

```java
while (true) {

    // recebe dados

    if (condicaoDeSucesso) {
        break;
    }

    // trata tentativa inválida
}
```

Além de praticar laços de repetição, a aula introduz uma habilidade essencial para qualquer desenvolvedor: **entender o fluxo de execução do próprio código**, utilizando o debugger quando necessário.

---

## 🚀 Próxima aula

**Continuação dos exercícios com laços de repetição**
