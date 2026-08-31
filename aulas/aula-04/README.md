# Lógica de Programação - Virado no Jiraya

# Aula 04 — Instalação do Java no Ubuntu

## 📚 Sobre a aula

Nesta aula é realizada a instalação do ambiente Java necessário para acompanhar o curso de Lógica de Programação.

O curso utiliza Java como linguagem para colocar em prática os conceitos de lógica. Neste material, a instalação será realizada no **Ubuntu Linux** utilizando o **SDKMAN!**, em vez do procedimento apresentado no vídeo para Windows.

---

## 🐧 Ambiente utilizado

- Sistema operacional: Ubuntu Linux
- Gerenciador de SDKs: SDKMAN!
- Linguagem: Java
- JDK: Eclipse Temurin

O **SDKMAN!** é uma ferramenta para instalação e gerenciamento de diferentes versões de SDKs em sistemas Unix, incluindo Linux. Ele permite instalar, alternar e definir versões padrão do Java sem a necessidade de configurar manualmente diversos caminhos no sistema. :contentReference[oaicite:1]{index=1}

---

## 🛠️ 1. Instalar o SDKMAN!

Abra o terminal e execute:

```bash
curl -s "https://get.sdkman.io" | bash
```

Após a instalação, carregue o SDKMAN! na sessão atual:

```bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```

Verifique se a instalação foi realizada corretamente:

```bash
sdk version
```

Se o comando retornar a versão do SDKMAN!, a instalação está funcionando. :contentReference[oaicite:2]{index=2}

---

## ☕ 2. Verificar as versões disponíveis do Java

Para listar as versões disponíveis:

```bash
sdk list java
```

O SDKMAN! apresenta as versões disponíveis, instaladas e atualmente selecionadas.

Também é possível identificar diferentes distribuições do JDK, como:

- Eclipse Temurin;
- Microsoft OpenJDK;
- Oracle JDK;
- Amazon Corretto;
- Azul Zulu;
- OpenJDK.

O SDKMAN! utiliza atualmente o **Eclipse Temurin como distribuição padrão do JDK**. :contentReference[oaicite:3]{index=3}

---

## 📦 3. Instalar o Java

Para instalar a versão padrão disponibilizada pelo SDKMAN!:

```bash
sdk install java
```

O SDKMAN! fará o download e a instalação do JDK e perguntará se a versão deve ser definida como padrão. :contentReference[oaicite:4]{index=4}

Também é possível instalar especificamente o **Eclipse Temurin**:

```bash
sdk install java -tem
```

:contentReference[oaicite:5]{index=5}

---

## 🔢 4. Instalar uma versão específica

O SDKMAN! permite instalar uma versão específica do Java.

Primeiro, consulte as versões disponíveis:

```bash
sdk list java
```

Procure uma versão Java 17 compatível.

Por exemplo, uma versão Temurin pode aparecer com um identificador semelhante a:

```text
17.x.x-tem
```

A instalação é feita utilizando o identificador completo apresentado pelo SDKMAN!:

```bash
sdk install java 17.x.x-tem
```

> **Importante:** o identificador exato da versão pode mudar conforme as versões disponíveis no SDKMAN!. Por isso, utilize `sdk list java` para obter o identificador atual em vez de assumir um número específico.

O SDKMAN! permite instalar versões específicas qualificando a versão desejada no comando de instalação. :contentReference[oaicite:6]{index=6}

---

## ⭐ 5. Definir Java 17 como versão padrão

Depois de instalar a versão desejada, podemos defini-la como padrão:

```bash
sdk default java 17.x.x-tem
```

A partir desse momento, novas sessões do terminal utilizarão essa versão como padrão. :contentReference[oaicite:7]{index=7}

---

## 🔄 6. Alterar a versão do Java

Uma das principais vantagens do SDKMAN! é poder manter várias versões do Java instaladas simultaneamente.

Por exemplo:

```text
Java 17
Java 21
Java 25
```

Para visualizar as versões instaladas:

```bash
sdk list java
```

---

### Alterar somente a sessão atual

Para utilizar uma versão específica apenas no terminal atual:

```bash
sdk use java 17.x.x-tem
```

Essa alteração vale somente para a sessão atual do terminal.

Ao abrir um novo terminal, será utilizada novamente a versão definida como padrão. :contentReference[oaicite:8]{index=8}

---

### Alterar permanentemente a versão padrão

Para alterar a versão utilizada por padrão:

```bash
sdk default java 17.x.x-tem
```

Essa versão será utilizada nas novas sessões do terminal. :contentReference[oaicite:9]{index=9}

---

## 🔍 7. Verificar a versão ativa

Para verificar qual versão do Java está sendo utilizada:

```bash
java -version
```

Também podemos utilizar:

```bash
sdk current java
```

O segundo comando informa diretamente a versão do Java atualmente selecionada pelo SDKMAN!. :contentReference[oaicite:10]{index=10}

Exemplo:

```text
Using java version 17.x.x-tem
```

---

## 🧪 8. Verificar o compilador

Como estamos utilizando o **JDK**, também temos acesso ao compilador Java.

Verifique sua versão com:

```bash
javac -version
```

Podemos verificar os dois componentes:

```bash
java -version
javac -version
```

O primeiro verifica o ambiente utilizado para executar Java.

O segundo verifica o compilador utilizado para transformar código-fonte Java em bytecode.

---

## 🧩 Java × JDK × SDKMAN!

É importante não confundir as funções:

```text
SDKMAN!
    │
    ├── Instala JDKs
    ├── Gerencia versões
    └── Alterna versões
             │
             ↓
            JDK
             │
       ┌─────┴─────┐
       ↓           ↓
   javac          java
  compila       executa
```

O SDKMAN! **não é o Java**.

Ele é uma ferramenta utilizada para gerenciar diferentes versões do Java e de outros SDKs.

---

## 🔀 9. Exemplo com duas versões

Suponha que tenhamos instalado:

```text
Java 17
Java 21
```

Podemos verificar as versões:

```bash
sdk list java
```

Usar Java 17 temporariamente:

```bash
sdk use java 17.x.x-tem
```

Verificar:

```bash
java -version
```

Depois, utilizar Java 21 na sessão:

```bash
sdk use java 21.x.x-tem
```

E verificar novamente:

```bash
java -version
```

Assim podemos alternar entre versões sem precisar desinstalar e reinstalar o Java.

---

## 📁 10. Versão específica por projeto

O SDKMAN! também permite definir a versão do Java utilizada por um projeto através de um arquivo:

```text
.sdkmanrc
```

Dentro do diretório do projeto, podemos inicializar esse arquivo:

```bash
sdk env init
```

Ele pode conter, por exemplo:

```text
java=17.x.x-tem
```

Depois:

```bash
sdk env
```

O SDKMAN! selecionará a versão especificada para aquele projeto. :contentReference[oaicite:11]{index=11}

Essa funcionalidade será especialmente útil posteriormente quando diferentes projetos exigirem diferentes versões do Java.

---

## 🧠 Modelo mental

```text
Ubuntu
   │
   ↓
SDKMAN!
   │
   ├── Java 17
   ├── Java 21
   └── outras versões
         │
         ↓
     versão ativa
         │
    ┌────┴────┐
    ↓         ↓
  java      javac
 executar   compilar
```

---

## 🔑 Comandos principais

| Comando | Função |
|---|---|
| `sdk version` | Verifica a versão do SDKMAN! |
| `sdk list java` | Lista versões do Java disponíveis |
| `sdk install java` | Instala a versão padrão |
| `sdk install java <versão>` | Instala uma versão específica |
| `sdk use java <versão>` | Usa uma versão somente na sessão atual |
| `sdk default java <versão>` | Define a versão padrão |
| `sdk current java` | Mostra a versão Java atualmente selecionada |
| `java -version` | Mostra a versão do Java em uso |
| `javac -version` | Mostra a versão do compilador Java |
| `sdk env init` | Cria configuração de versão para o projeto |
| `sdk env` | Ativa a configuração do projeto |

---

## 💡 Principal aprendizado

A instalação do Java não precisa ser tratada como uma instalação única e permanente.

Utilizando o SDKMAN!, podemos manter diversas versões do JDK instaladas e escolher qual delas será utilizada.

```text
Instalar
   ↓
Selecionar
   ↓
Desenvolver
   ↓
Trocar quando necessário
```

Isso proporciona um ambiente de desenvolvimento mais flexível e facilita o trabalho com projetos que utilizam diferentes versões do Java.

---

## 🚀 Próxima aula

**Aula 05 — Meu Primeiro Programa**