# Sistema de Avaliação Acadêmica - Regra de Progressão

Sistema desenvolvido em Java para calcular a aprovação de estudantes com base em atividades ponderadas. O sistema permite cadastrar múltiplas atividades com pesos e notas, calculando automaticamente a média ponderada final e determinando o status de aprovação do aluno.

## Sobre o Projeto

Este projeto foi desenvolvido durante a **Aceleração Java da Trybe** com foco na aplicação prática de conceitos fundamentais de **Programação Orientada a Objetos** e boas práticas de desenvolvimento Java.

O sistema implementa uma regra de progressão acadêmica onde:
- Cada atividade possui um **peso** e uma **nota**
- A soma dos pesos deve totalizar **100%**
- A aprovação ocorre quando a média ponderada é **≥ 85%**

## Funcionalidades

- ✅ Cadastro dinâmico de atividades acadêmicas
- ✅ Validação de pesos (soma deve ser 100)
- ✅ Cálculo de média ponderada automatizado
- ✅ Avaliação de status do aluno (aprovado/reprovado)
- ✅ Interface via linha de comando (CLI)
- ✅ Tratamento de entradas do usuário

## 🛠️ Tecnologias Utilizadas

- **Java 17** - Linguagem de programação
- **Maven** - Gerenciamento de dependências e build
- **Google Checkstyle** - Garantia de qualidade de código

## Conceitos de POO Aplicados

### Encapsulamento
- Atributos privados na classe `Grade` com modificadores `final`
- Uso de getters para acesso controlado aos dados
- Imutabilidade dos objetos após criação

### Coesão e Responsabilidade Única
- Classe `Grade`: Representa uma atividade acadêmica
- Classe `App`: Gerencia fluxo da aplicação e lógica de negócio
- Separação clara de responsabilidades entre classes

### Boas Práticas
- Uso de arrays para armazenamento de dados
- Métodos estáticos para operações de utilidade
- Nomes descritivos de variáveis e métodos
- Javadoc para documentação do código

## Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6 ou superior

### Instalação e Execução

```bash
# Clone o repositório
git clone https://github.com/danilo-fq/projeto-regra-progressao.git

# Entre no diretório
cd projeto-regra-progressao

# Compile o projeto
mvn clean install

# Execute a aplicação
mvn exec:java -Dexec.mainClass="com.trybe.java.regraprogressao.App"
```

### Ou usando o Maven Wrapper (não requer Maven instalado):

```bash
# No Linux/Mac
./mvnw clean install
./mvnw exec:java -Dexec.mainClass="com.trybe.java.regraprogressao.App"

# No Windows
mvnw.cmd clean install
mvnw.cmd exec:java -Dexec.mainClass="com.trybe.java.regraprogressao.App"
```

## Exemplo de Uso

```
Digite a quantidade de atividades para cadastrar:
3

Digite o nome da atividade 1:
Projeto Final
Digite o peso da atividade 1:
50
Digite a nota obtida para Projeto Final:
90

Digite o nome da atividade 2:
Prova Intermediária
Digite o peso da atividade 2:
30
Digite a nota obtida para Prova Intermediária:
85

Digite o nome da atividade 3:
Exercícios
Digite o peso da atividade 3:
20
Digite a nota obtida para Exercícios:
80

Parabéns! Você alcançou 86.5%! E temos o prazer de informar que você obteve aprovação!
```

## 📁 Estrutura do Projeto

```
projeto-regra-progressao/
├── src/
│   └── main/
│       └── java/
│           └── com/trybe/java/regraprogressao/
│               ├── App.java          # Classe principal com lógica de negócio
│               └── Grade.java        # Modelo de dados para atividades
├── pom.xml                           # Configuração Maven
└── README.md
```

## 🎓 Aprendizados

Durante o desenvolvimento deste projeto, foram consolidados os seguintes conhecimentos:

- **Fundamentos de Java**: Sintaxe, tipos de dados, estruturas de controle
- **POO**: Encapsulamento, imutabilidade, coesão de classes
- **Entrada/Saída**: Uso da classe `Scanner` para interação com usuário
- **Arrays**: Manipulação e iteração de estruturas de dados
- **Maven**: Gerenciamento de projetos e dependências
- **Qualidade de Código**: Aplicação de padrões Google Checkstyle

## Autor

Desenvolvido por **Danilo Ferreira Queiroz**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/danilo-fq)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/danilo-fq)

---

## Nota sobre o Projeto

Este projeto foi desenvolvido como parte do programa de **Aceleração Java da Trybe**, durante o módulo de Fundamentos e Orientação a Objetos. O código-fonte foi integralmente desenvolvido por mim, seguindo os requisitos técnicos propostos pelo programa de estudos.

## Licença

Este projeto é de código aberto e está disponível para fins educacionais.
