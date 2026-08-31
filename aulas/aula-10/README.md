# Lógica de Programação - Virado no Jiraya

# Aula 10 — Valores Literais + Exercícios

## 📚 Sobre a aula

Nesta aula começamos a aplicar, por meio de exercícios, os conceitos apresentados anteriormente sobre **variáveis, memória e tipos de dados**.

O exercício utilizado como exemplo consiste em calcular uma porcentagem sobre um salário.

A aula também introduz conceitos importantes relacionados aos **valores literais em Java**, principalmente a forma como o compilador interpreta números escritos diretamente no código.

---

## 🧩 Requisitos

Antes de começar a escrever o código, o professor apresenta a ideia de **requisitos**.

Na engenharia de software, requisitos representam aquilo que o programa precisa fazer.

No exercício, alguns requisitos são identificados, como:

1. Criar uma classe.
2. Receber um valor de entrada referente ao salário.
3. Definir uma porcentagem.
4. Calcular o valor correspondente à porcentagem do salário.
5. Exibir o resultado.

Identificar os requisitos antes de programar ajuda a transformar o problema em partes menores e mais objetivas.

```text
Problema
   ↓
Identificar requisitos
   ↓
Dividir em objetivos
   ↓
Implementar
   ↓
Testar
```

---

## ☕ Criando a classe

O exercício é desenvolvido utilizando uma classe Java.

A estrutura inicial contém o método `main`:

```java
public class CalculadoraImposto {

    public static void main(String[] args) {

    }

}
```

Nesse momento, a classe pode ser executada mesmo sem produzir nenhuma saída.

O IntelliJ IDEA realiza a compilação dos arquivos do projeto antes da execução.

---

## 🔢 Escolhendo o tipo da variável

O exercício exige armazenar um valor referente ao salário.

Como o salário pode possuir casas decimais, é necessário escolher um tipo adequado.

Entre os tipos de ponto flutuante apresentados estão:

```text
float
double
```

O `double` possui maior capacidade de representação do que o `float`.

Por isso, precisamos considerar o tamanho do tipo ao escolher como determinado valor será armazenado.

---

## 💰 Valores decimais em Java

Uma característica importante da linguagem Java é que números decimais escritos diretamente no código são considerados, por padrão, valores do tipo `double`.

Por exemplo:

```java
double salario = 2500.50;
```

Nesse caso:

```text
2500.50
   ↓
literal decimal
   ↓
double
```

O separador decimal utilizado na sintaxe Java é o **ponto**:

```java
2500.50
```

e não:

```java
2500,50
```

---

## 🔢 `float` e `double`

Considere:

```java
float salario = 2500.50;
```

Esse código apresenta um problema de compatibilidade de tipos.

Isso acontece porque:

```text
2500.50 → double
```

mas a variável foi declarada como:

```text
float
```

O `double` possui maior capacidade de representação que o `float`.

Portanto, não podemos simplesmente colocar um `double` dentro de uma variável `float`.

---

## 🔤 Sufixo `F` para `float`

Podemos informar explicitamente que um literal decimal deve ser tratado como `float utilizando o sufixo `F`:

```java
float salario = 2500.50F;
```

Agora:

```text
2500.50F
    ↓
  float
    ↓
variável float
```

O `F` informa ao compilador que aquele literal decimal deve ser considerado um `float`.

---

## 🔤 Sufixo `D` para `double`

Também podemos indicar explicitamente que um literal decimal é do tipo `double` utilizando `D`:

```java
double salario = 2500.50D;
```

Entretanto, o `D` normalmente não é necessário, pois valores decimais já são considerados `double` por padrão.

```java
double salario = 2500.50;
```

é suficiente.

---

## 🔢 Literais inteiros

Quando escrevemos um número inteiro diretamente no código:

```java
int idade = 30;
```

o valor:

```text
30
```

é considerado, por padrão, um literal do tipo `int`.

Não existe necessidade de utilizar um sufixo para indicar `int`.

---

## 🔢 `int` e `long`

Java possui diferentes tipos para representar números inteiros.

Entre eles:

```text
int
long
```

O `long` possui maior capacidade de representação que o `int`.

Por padrão:

```java
long valor = 30;
```

funciona porque o literal `30` é um `int` e pode ser atribuído a um `long`.

Porém, quando queremos indicar explicitamente que um literal inteiro é `long`, podemos utilizar o sufixo `L`:

```java
long valor = 30L;
```

É recomendado utilizar `L` maiúsculo para facilitar a leitura do código.

---

## 🔄 Compatibilidade entre tipos

Uma regra importante apresentada na aula é que valores de tipos menores podem, em determinadas situações, ser atribuídos a tipos capazes de armazená-los.

Por exemplo:

```java
int valor = 30;
long numero = valor;
```

Isso é possível porque `long` possui maior capacidade de representação que `int`.

O caminho contrário pode gerar um erro de compilação:

```java
long valor = 30L;
int numero = valor;
```

Nesse caso, o compilador não permite a atribuição automática porque existe o risco de o valor não caber no tipo `int`.

---

## 📊 Representação simplificada

Podemos visualizar a relação apresentada na aula desta forma:

```text
        Maior capacidade
              ↑
           double
              ↑
            float

        Maior capacidade
              ↑
            long
              ↑
             int
```

Essa representação é apenas uma simplificação para compreender a relação entre os tipos trabalhados no exercício.

---

## 📐 Calculando a porcentagem

O exercício utiliza uma porcentagem de:

```text
30%
```

Para realizar o cálculo, podemos representar 30% como:

```text
30 / 100
```

que resulta em:

```text
0.3
```

Assim:

```java
double porcentagem = 30 / 100;
```

não produz o resultado esperado se ambos os operandos forem inteiros.

Uma forma de representar corretamente a porcentagem é:

```java
double porcentagem = 0.3;
```

ou realizar uma operação que produza o valor decimal.

---

## 🧮 Operações matemáticas

O cálculo pode ser representado por:

```text
salário × porcentagem
```

Por exemplo:

```text
2500 × 0.30 = 750
```

Em Java:

```java
double salario = 2500;
double porcentagem = 0.30;

double resultado = salario * porcentagem;
```

Depois podemos exibir:

```java
System.out.println(resultado);
```

---

## 🧠 Precedência dos operadores

As regras matemáticas também são aplicadas nas expressões Java.

Por exemplo:

```java
double resultado = salario * porcentagem / 100;
```

As operações seguem as regras de precedência dos operadores.

Quando for necessário deixar explícita a ordem de uma operação, podemos utilizar parênteses:

```java
double resultado = salario * (porcentagem / 100);
```

Os parênteses indicam qual parte da expressão deve ser calculada primeiro.

---

## ✍️ Nomes significativos

Durante o exercício, o professor também destaca a importância de utilizar **nomes significativos para as variáveis**.

Por exemplo:

```java
double salario;
double porcentagem;
double porcentagemDoSalario;
```

é mais compreensível do que utilizar nomes genéricos como:

```java
double a;
double b;
double c;
```

Nomes significativos tornam o código mais fácil de compreender e manter.

---

## ⚡ Autocomplete do IntelliJ IDEA

Durante o exercício, é demonstrado o recurso de **autocompletar** do IntelliJ IDEA.

Ao digitar, por exemplo:

```java
System.out.
```

a IDE apresenta opções disponíveis.

Esse recurso ajuda a:

- descobrir métodos disponíveis;
- escrever código mais rapidamente;
- reduzir erros de digitação;
- conhecer recursos da API Java.

O autocomplete é uma ferramenta da IDE e não faz parte da linguagem Java propriamente dita.

---

## 📝 Exemplo completo

Uma possível implementação do exercício pode ser:

```java
public class CalculadoraImposto {

    public static void main(String[] args) {

        double salario = 2500;
        double porcentagem = 30;

        double porcentagemDoSalario =
                salario * (porcentagem / 100);

        System.out.println(porcentagemDoSalario);
    }
}
```

Nesse exemplo:

```text
salario
   ↓
2500

porcentagem
   ↓
30

porcentagem / 100
   ↓
0.30

salario × 0.30
   ↓
750
```

O resultado representa 30% do salário informado.

---

## 🔑 Conceitos importantes

- **Requisitos:** descrevem aquilo que o programa precisa realizar.
- **Variável:** utilizada para armazenar valores durante a execução.
- **Literal:** valor escrito diretamente no código.
- **Literal inteiro:** por padrão, é considerado `int`.
- **Literal decimal:** por padrão, é considerado `double`.
- **`float`:** tipo utilizado para números de ponto flutuante.
- **`double`:** tipo de ponto flutuante com maior capacidade que `float`.
- **`int`:** tipo utilizado para números inteiros.
- **`long`:** tipo inteiro com maior capacidade que `int`.
- **`F`:** sufixo utilizado para indicar um literal `float`.
- **`D`:** sufixo utilizado para indicar explicitamente um literal `double`.
- **`L`:** sufixo utilizado para indicar um literal `long`.
- **Precedência:** regras que determinam a ordem de execução das operações.
- **Autocomplete:** recurso da IDE que auxilia na escrita do código.

---

## 🧠 Modelo mental

A resolução de um problema pode seguir o seguinte processo:

```text
Problema
   ↓
Identificar requisitos
   ↓
Definir dados necessários
   ↓
Escolher tipos
   ↓
Criar variáveis
   ↓
Realizar operações
   ↓
Armazenar resultados
   ↓
Exibir resultado
```

No exercício da aula:

```text
Salário
   ↓
Variável double
   ↓
Definir porcentagem
   ↓
Calcular
   ↓
Variável de resultado
   ↓
Exibir no console
```

---

## 💡 Principal aprendizado

A aula começa a conectar os conceitos de **memória, variáveis e tipos de dados** com a resolução de problemas reais.

Um problema precisa primeiro ser compreendido e dividido em requisitos. Depois, devemos identificar quais informações serão necessárias, escolher os tipos adequados e construir as operações necessárias para chegar ao resultado.

Além disso, é importante compreender que valores escritos diretamente no código possuem **tipos literais**, e que esses tipos influenciam a forma como podem ser atribuídos às variáveis.

```text
Problema
   ↓
Requisitos
   ↓
Variáveis + Tipos
   ↓
Operações
   ↓
Resultado
```

---

## 🚀 Próxima aula

**Aula 11 — Entrada de Dados**