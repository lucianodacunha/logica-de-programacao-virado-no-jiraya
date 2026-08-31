# Lógica de Programação - Virado no Jiraya

# Aula 02 — Algoritmos e Linguagens de Programação

## 📚 Sobre a aula

Nesta aula começam os conceitos fundamentais de **algoritmos** e **linguagens de programação**.

O objetivo é entender o que é um algoritmo, como ele se relaciona com uma linguagem de programação e por que existem diferentes níveis de abstração entre aquilo que o programador escreve e aquilo que o computador consegue executar.

---

## 🧠 O que é um algoritmo?

Na área da matemática e da ciência da computação, um algoritmo pode ser entendido como uma **especificação de como resolver uma classe de problemas**.

Um algoritmo é formado por um conjunto de instruções que busca atingir determinado objetivo.

De forma simplificada:

```text
Entrada
   ↓
Processamento
   ↓
Saída
```

Todo algoritmo possui algum tipo de entrada, realiza um processamento sobre essas informações e produz uma saída.

A saída pode ser, por exemplo, um resultado numérico, um texto ou alguma informação apresentada ao usuário.

---

## 🍜 Algoritmos no cotidiano

Algoritmos não existem apenas na programação.

Uma atividade cotidiana também pode ser descrita como uma sequência de instruções.

O professor utiliza como exemplo a preparação de um miojo:

```text
1. Pegar o miojo.
2. Abrir o miojo.
3. Pegar a panela.
4. Colocar água na panela.
5. Esquentar a água.
6. Colocar o miojo.
7. Esperar aproximadamente três minutos.
8. Retirar o miojo.
9. Esperar esfriar.
10. Colocar no prato.
11. Comer.
```

Esse exemplo representa um algoritmo simples.

Entretanto, uma pessoa normalmente executa várias etapas automaticamente, sem precisar descrevê-las conscientemente.

Para um computador, seria necessário especificar os passos com muito mais precisão.

---

## 🤖 O computador precisa de instruções precisas

Uma das diferenças entre executar uma tarefa no cotidiano e programar é o nível de precisão necessário.

Uma pessoa consegue compreender uma instrução como:

> "Faça um miojo."

Um computador não possui esse conhecimento implícito.

Seria necessário especificar cada etapa:

```text
Pegar o objeto
↓
Abrir
↓
Colocar água
↓
Aquecer
↓
Adicionar o alimento
↓
Aguardar
↓
Finalizar
```

Portanto, ao desenvolver algoritmos para computadores, precisamos transformar uma solução em **instruções explícitas e precisas**.

---

## 💻 Linguagem de programação

Os algoritmos precisam ser implementados utilizando uma **linguagem de programação**.

Uma linguagem de programação fornece um conjunto de instruções e regras que permite ao programador escrever programas.

As linguagens de programação são utilizadas para **implementar algoritmos**.

Podemos representar a relação assim:

```text
Problema
   ↓
Algoritmo
   ↓
Linguagem de programação
   ↓
Programa
   ↓
Execução
```

O algoritmo representa a solução lógica, enquanto a linguagem de programação fornece uma forma de expressar essa solução para que possa ser processada pelo computador.

---

## ⚙️ Linguagem de máquina

O computador trabalha internamente com uma linguagem que pode ser representada por valores binários.

A **linguagem de máquina** é a linguagem diretamente relacionada ao funcionamento do computador.

Ela utiliza instruções representadas em baixo nível, associadas aos estados dos circuitos eletrônicos.

Uma representação simplificada é:

```text
0 → estado falso / circuito desligado
1 → estado verdadeiro / circuito ligado
```

O computador consegue processar essas informações rapidamente.

Entretanto, escrever programas diretamente nesse nível seria extremamente difícil para seres humanos.

---

## 🔽 Linguagens de baixo nível

As linguagens de baixo nível estão mais próximas da linguagem de máquina.

Um exemplo apresentado na aula é o **Assembly**.

```text
Linguagem de máquina
        ↑
        │
Linguagem de baixo nível
        ↑
    Assembly
```

Quanto mais próxima a linguagem estiver da linguagem de máquina, maior tende a ser a dificuldade de escrever e compreender programas utilizando diretamente essa representação.

---

## 🔼 Linguagens de alto nível

As linguagens de alto nível foram criadas para facilitar o trabalho dos programadores.

Elas possuem uma representação mais próxima da forma como os seres humanos estruturam o pensamento e permitem escrever programas de maneira mais compreensível.

Exemplos mencionados na aula incluem:

- Pascal
- Java
- COBOL
- outras linguagens de alto nível

A ideia é permitir que o programador escreva instruções de maneira mais acessível, enquanto os mecanismos responsáveis pela execução realizam a tradução/conversão necessária para que o computador possa processá-las.

```text
Programador
    ↓
Linguagem de alto nível
    ↓
Tradução / compilação
    ↓
Linguagem de máquina
    ↓
Computador
```

---

## 🔄 Alto nível × baixo nível

A principal diferença apresentada na aula pode ser resumida assim:

| Linguagem | Característica |
|---|---|
| Linguagem de máquina | Diretamente relacionada ao funcionamento do computador |
| Baixo nível | Mais próxima da linguagem de máquina |
| Alto nível | Mais próxima da forma de compreensão humana |

De maneira geral:

```text
Mais próxima do computador
        ↓
Linguagem de máquina
        ↓
Baixo nível
        ↓
Alto nível
        ↓
Mais próxima do ser humano
```

As linguagens de alto nível facilitam o desenvolvimento porque o programador não precisa escrever diretamente as instruções da máquina.

---

## 📝 Sintaxe

Cada linguagem de programação possui uma **sintaxe própria**.

A sintaxe determina as regras que devem ser seguidas para escrever corretamente um programa naquela linguagem.

Por exemplo, diferentes linguagens podem realizar a mesma tarefa, como imprimir:

```text
Olá, mundo!
```

mas utilizando sintaxes diferentes.

A lógica pode ser semelhante, enquanto a forma de escrever o código muda.

Se a sintaxe da linguagem não for respeitada, o programa poderá não ser compilado ou interpretado corretamente.

---

## 🌐 Diferentes linguagens, objetivos semelhantes

A aula apresenta exemplos de diferentes linguagens capazes de realizar uma tarefa semelhante.

Embora possam possuir sintaxes diferentes, todas podem ser utilizadas para criar programas que serão posteriormente processados pelo computador ou por outro programa responsável por sua execução.

Uma mesma ideia pode ser expressa de maneiras diferentes:

```text
Algoritmo
   ↓
 ┌───────┬────────┬────────┐
 ↓       ↓        ↓        ↓
Java   Pascal   COBOL   Outras
```

A diferença está principalmente na forma como a solução é expressa e nas características de cada linguagem.

---

## ☕ Java

A linguagem escolhida para o curso é o **Java**.

A partir deste ponto, os conceitos de lógica de programação serão apresentados utilizando uma linguagem de programação real, em vez de depender exclusivamente de pseudocódigo.

Isso permite aprender a lógica enquanto se desenvolve familiaridade com a linguagem que será utilizada nas próximas etapas do curso.

---

## 🔑 Conceitos importantes

- **Algoritmo:** conjunto de instruções utilizado para atingir determinado objetivo ou resolver uma classe de problemas.
- **Entrada:** dados fornecidos ao algoritmo.
- **Processamento:** operações realizadas sobre os dados.
- **Saída:** resultado produzido pelo algoritmo.
- **Linguagem de programação:** linguagem utilizada para implementar algoritmos.
- **Linguagem de máquina:** linguagem diretamente relacionada à execução pelo computador.
- **Linguagem de baixo nível:** linguagem mais próxima da linguagem de máquina.
- **Linguagem de alto nível:** linguagem criada para facilitar a compreensão e o desenvolvimento por seres humanos.
- **Sintaxe:** conjunto de regras que determina como uma linguagem deve ser escrita.

---

## 🧠 Modelo mental

Os principais conceitos da aula podem ser relacionados desta forma:

```text
              PROBLEMA
                  ↓
              ALGORITMO
                  ↓
       Entrada → Processamento → Saída
                  ↓
       Linguagem de programação
                  ↓
          Tradução / compilação
                  ↓
         Linguagem de máquina
                  ↓
              Computador
```

---

## 💡 Principal aprendizado

O computador precisa receber instruções precisas para executar uma tarefa.

O **algoritmo** representa a solução através de um conjunto de instruções, enquanto a **linguagem de programação** fornece os recursos e a sintaxe necessários para transformar essa solução em um programa.

As linguagens de alto nível existem justamente para tornar essa comunicação mais acessível aos seres humanos, abstraindo grande parte da complexidade da linguagem de máquina.

---

## 🔍 Para aprofundamento

A aula menciona outros conceitos que não serão aprofundados neste momento, como:

- linguagens estruturadas;
- linguagens orientadas a objetos;
- linguagens de script;
- diferentes classificações de linguagens.

Esses assuntos podem ser pesquisados posteriormente para ampliar o conhecimento.

---

## 🚀 Próxima aula

**Aula 03 — Como Java Funciona**