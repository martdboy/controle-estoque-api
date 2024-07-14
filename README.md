# Sobre
Projeto para aprendizado e portfólio. <br>
Um sistema de controle de estoque que pode realizar a busca, inclusão, edição e remoção de produtos de estoque. <br>

# Em Desenvolvimento
API que responde a métodos HTTP comuns (GET, POST, UPDATE e DELETE). <br>

# Tecnologias
IDE: Spring Tool Suite 4 <br>
Linguagem: Java 21 <br>
Framework: Spring 3.3.1 <br>
SGBD: PostgreSQL 16 <br>

# Configurações application.yml
```spring:
  application:
    name: controle-estoque
  datasource:
    driver-class-name: org.postgresql.Driver
    password: # Aqui vai a senha da sua conexão com o PostgreSQL
    url: jdbc:postgresql://localhost:5432/db_controleEstoque ## De preferência crie um banco de dados com este mesmo nome
    username: ## Aqui vai o nome de usuário da sua conexão com o PostgreSQL 
  jpa:
    defer-datasource-initialization: true
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      dialect: org.hibernate.dialect.PostgreSQLDialect```

