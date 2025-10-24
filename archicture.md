# Bean-Organized - Estrutura Multi-Módulo

## Estrutura do Projeto

Este projeto Spring Boot está organizado em múltiplos módulos:

### 📦 Módulos

#### 1. **Root (Bean-Organized)**
- Módulo pai que gerencia configurações comuns
- Coordena os submódulos
- Define versões e plugins compartilhados

#### 2. **API Module**
- Módulo de infraestrutura e apresentação
- Contém controllers REST, configurações e infraestrutura
- **Dependências principais:**
    - Spring Boot Web
    - Validation
    - DevTools
    - Lombok

#### 3. **Domain Module**
- Módulo de lógica de negócio
- Contém entidades, regras de negócio e interfaces de repositório
- **Características:**
    - Independente de frameworks de infraestrutura
    - Foco em regras de domínio
    - Entidades JDBC e Value Objects
    - Spring Data JDBC
    - PostgreSQL Driver
    - Spring Kafka
    - Lombok

## 🔧 Tecnologias

- Java 21
- Spring Boot 3.5.7
- PostgreSQL
- Apache Kafka
- Lombok
- Gradle

## 🚀 Como Executar

### Pré-requisitos
- Java 21
- PostgreSQL rodando em `localhost:5432`
- Kafka rodando em `localhost:9092`

### Configuração do Banco de Dados
Crie um banco de dados PostgreSQL:
```sql
CREATE DATABASE beanorganized;
```


## 📁 Estrutura de Pacotes

```
Bean-Organized/
├── api/                          # Módulo API
│   └── src/main/java/cutepush/beanorganized/api/
│       ├── config/              # Configurações
│       ├── controller/          # REST Controllers
│       ├── dto/                 # Data Transfer Objects
│       └── service/             # Services de aplicação
│
└── domain/                       # Módulo Domain
    └── src/main/java/cutepush/beanorganized/domain/
        ├── entity/              # Entidades JPA
        ├── repository/          # Interfaces de repositório
        ├── service/             # Domain Services
        └── valueobject/         # Value Objects
```

