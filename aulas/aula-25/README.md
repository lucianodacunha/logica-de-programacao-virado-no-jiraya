# Lógica de Programação - Virado no Jiraya

# Aula 25 — Organização do Código com Pacotes

## 📚 Sobre a aula

Nesta aula o foco muda momentaneamente das estruturas de controle para a **organização do código Java**.

Conforme o curso foi avançando, várias classes foram criadas para representar os exercícios das aulas anteriores. Com o aumento da quantidade de classes, encontrar e organizar os exercícios começa a ficar mais difícil.

Para solucionar esse problema, são introduzidos os **pacotes (`package`) do Java**.

> **Pacotes são utilizados para organizar as classes do projeto.**

---

# 🎯 Objetivos da aula

- Entender o conceito de pacote no Java;
- Criar pacotes no IntelliJ IDEA;
- Mover classes para dentro de pacotes;
- Organizar as classes de acordo com seu assunto;
- Entender a relação entre pacotes e diretórios;
- Conhecer a convenção de nomenclatura dos pacotes;
- Compreender a declaração `package` presente no início das classes.

---

# 📦 O que são pacotes?

Um pacote (`package`) é uma forma de **organizar classes relacionadas dentro do projeto**.

Em uma visão inicial e simplificada:

```text
package ≈ pasta
```

Por exemplo:

```text
src
└── dev
    └── devdojo
        └── logica
            ├── condicionais
            ├── variaveis
            └── ...
```

Cada pacote pode conter classes relacionadas a determinado assunto.

Isso facilita:

- localizar classes;
- organizar o projeto;
- estudar o código posteriormente;
- realizar manutenção;
- trabalhar em projetos maiores.

---

# 🏷️ Convenção para nomes de pacotes

O Java possui convenções para nomenclatura.

Uma prática apresentada na aula é utilizar o domínio da empresa de forma invertida.

Por exemplo:

```text
devdojo
```

pode fazer parte de um pacote como:

```text
br.com.devdojo
```

A estrutura pode continuar com o assunto do código:

```text
br.com.devdojo.logica
```

E depois:

```text
br.com.devdojo.logica.condicionais
```

A ideia é criar uma estrutura organizada e identificável.

---

# 🗂️ Organização das classes do curso

Durante a aula, as classes desenvolvidas anteriormente são reorganizadas em pacotes de acordo com seus respectivos assuntos.

Por exemplo:

```text
estruturas
├── condicionais
├── ...
```

As classes relacionadas a estruturas condicionais são agrupadas em um pacote específico.

Da mesma forma, as classes relacionadas a variáveis podem ser agrupadas em outro pacote.

O objetivo é evitar que todas as classes fiquem misturadas no mesmo diretório.

---

# 🔀 Movendo classes para um pacote

No IntelliJ IDEA é possível criar um pacote e depois mover as classes existentes para dentro dele.

Ao mover uma classe, a IDE pode solicitar confirmação da operação.

Depois da movimentação, a classe passa a fazer parte daquele pacote.

Por exemplo:

```text
Antes:

src
├── CadastroLogin.java
├── CalculadoraImposto.java
├── DiaDaSemana.java
├── Variaveis.java
└── ...
```

Depois:

```text
src
└── dev
    └── devdojo
        └── logica
            ├── condicionais
            │   ├── CadastroLogin.java
            │   ├── CalculadoraImposto.java
            │   └── DiaDaSemana.java
            │
            └── variaveis
                ├── Variaveis.java
                └── ...
```

A estrutura passa a representar melhor a organização lógica do projeto.

---

# 📝 Declaração `package`

Quando uma classe pertence a um pacote, o Java registra isso através da declaração:

```java
package br.com.devdojo.logica.condicionais;
```

Essa declaração normalmente aparece no início do arquivo.

Exemplo:

```java
package br.com.devdojo.logica.condicionais;

public class CadastroLogin {

    public static void main(String[] args) {

    }
}
```

A declaração informa ao Java a qual pacote aquela classe pertence.

---

# ⚠️ Importante

Se uma classe estiver dentro de um pacote, a declaração correspondente precisa estar presente no código.

Por isso, ao criar ou mover uma classe através do IntelliJ IDEA, a IDE normalmente adiciona ou atualiza automaticamente a declaração:

```java
package ...
```

Não é necessário fazer essa alteração manualmente.

---

# 🧱 Estrutura hierárquica

Os pacotes podem ser organizados de forma hierárquica.

Por exemplo:

```text
br
└── com
    └── devdojo
        └── logica
            ├── variaveis
            └── estruturas
                └── condicionais
```

Isso permite criar uma organização mais detalhada conforme o projeto cresce.

---

# 🔎 Organização × tamanho do projeto

A aula chama atenção para um ponto importante:

Em um projeto pequeno, manter algumas classes no mesmo lugar pode parecer suficiente.

Porém, conforme o projeto cresce, essa abordagem começa a gerar problemas.

Imagine um projeto com:

```text
10 classes
```

Provavelmente ainda é fácil encontrar alguma coisa.

Agora imagine:

```text
100 classes
```

ou:

```text
1.000 classes
```

Manter tudo misturado torna a localização e a manutenção muito mais difíceis.

Os pacotes ajudam justamente a **estruturar essa grande quantidade de código**.

---

# 💡 Legibilidade e organização

A organização do código é uma preocupação importante no desenvolvimento de software.

Não basta apenas fazer o programa funcionar.

Também é necessário pensar em:

```text
Organização
    ↓
Localização
    ↓
Leitura
    ↓
Manutenção
```

Uma estrutura organizada permite que outro desenvolvedor consiga entender mais rapidamente onde determinada funcionalidade está localizada.

---

# 🧠 Conceito importante

Pacotes não servem apenas para deixar o projeto "bonito".

Eles fazem parte da própria organização estrutural do Java.

De forma simplificada:

```text
Projeto
   ↓
Pacotes
   ↓
Classes
   ↓
Métodos
   ↓
Código
```

Cada nível ajuda a organizar melhor o próximo.

---

# 📌 Resumo dos principais conceitos

| Conceito | Descrição |
|---|---|
| `package` | Declara o pacote ao qual uma classe pertence |
| Pacote | Forma de organizar classes relacionadas |
| Estrutura hierárquica | Permite organizar pacotes dentro de outros pacotes |
| Convenção de nomes | Java possui padrões para nomenclatura de pacotes |
| Organização | Facilita localização e manutenção das classes |
| IntelliJ IDEA | Permite criar pacotes e mover classes entre eles |

---

# 🚀 Aplicação no projeto do curso

A partir desta aula, as classes dos exercícios passam a ser organizadas de acordo com o conteúdo estudado.

Uma possível estrutura passa a ser:

```text
br.com.devdojo.logica
│
├── variaveis
│
└── estruturas
    └── condicionais
```

Assim, quando for necessário revisar determinado conteúdo, basta acessar o pacote correspondente.

Por exemplo:

```text
estruturas
└── condicionais
```

para encontrar os exercícios relacionados às estruturas condicionais.

---

# 🎯 Principal aprendizado

A principal ideia da aula é:

> **Pacotes são uma forma de organizar o código Java.**

Eles permitem agrupar classes relacionadas e criar uma estrutura lógica dentro do projeto.

Além disso, a aula introduz uma prática importante do desenvolvimento profissional: **organizar o código pensando não apenas no presente, mas também na manutenção futura**.

Um projeto pequeno pode funcionar sem muita organização. Um projeto grande, porém, rapidamente cobra a conta. E normalmente cobra com juros. 😄

---

# 📚 O que fica para as próximas aulas

A partir daqui, o curso continua avançando nos conceitos de lógica de programação e estruturas de controle, agora com o projeto mais organizado através dos pacotes.

O conceito de pacotes será aprofundado posteriormente no curso de Java.