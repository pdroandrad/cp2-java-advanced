# API de Gerenciamento de Brinquedos - Spring Boot

Solução completa para cadastro e consulta de brinquedos infantis com operações CRUD implementadas em Spring Boot e Oracle Database

## Estrutura do Projeto

- **EmpresaBrinquedosApplication.java:** classe principal que inicializa a aplicação Spring Boot.
  
- **RestCrudController.java:** controlador REST que gerencia as requisições HTTP. Define endpoints da API (/brinquedos), mapeia as requisições POST/GET para operações do CRUD, valida dados de entrada e retorna as respostas HTTP apropriadas.
  
- **Brinquedo.java:** entidade JPA que representa a tabela do banco de dados. Mapeia a tabela TDS_TB_BRINQUEDOS para objetos Java, define constraints, contém a estrutura de dados dos brinquedos e gera automaticamente o ID via sequência.
  
- **BrinquedoRepository.java:** interface para operações de banco de dados. Herda as operações CRUD básicas do JpaRepository e traduz operações Java para SQL de forma automática.
  
- **application.properties:** arquivo de configuração da aplicação. Faz a conexão com banco Oracle através de URL, usuário e senha.
  
- **pom.xml:** arquivo de definição do projeto Maven.

## Tecnologias Utilizadas
- **Core**: Java 21 + Spring Boot 3.4.5
- **Banco de Dados**: Oracle 23
- **Build**: Maven
- **Testes**: Postman

## Configuração no Spring Initializr
![SpringInitializr](https://github.com/user-attachments/assets/80fbd699-1596-4f48-b93e-af3bb94faa23)

## Dependências instaladas
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
<dependency>
    <groupId>com.oracle.database.jdbc</groupId>
    <artifactId>ojdbc11</artifactId>
    <version>23.5.0.24.07</version>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```

## Teste dos endpoints no Postman
### Método Post no endpoint http://localhost:8080/brinquedos
Adicionando um primeiro brinquedo:
![carrinhocriado](https://github.com/user-attachments/assets/21201842-cfc5-45e7-b8e4-fb2730013498)

Adicionando um segundo brinquedo:
![Captura de tela 2025-05-06 170535](https://github.com/user-attachments/assets/1a861cfe-1db1-4ea0-b0c9-aa5545b0674b)

### Método GET "ALL" no endpoint http://localhost:8080/brinquedos
Listando todos os brinquedos adicionados:
![listartodos](https://github.com/user-attachments/assets/fb3fedd6-df41-4fef-a4ee-fd05527d1c5d)

### Método GET "by ID" no endpoint http://localhost:8080/brinquedos/{id}
Listando o primeiro brinquedo através de seu Id (102)
![listarporid](https://github.com/user-attachments/assets/886c19ab-367c-41f8-b155-9b6712e8a56b)

### Exemplos de JSON para cadastro
```xml
  {
    "nome": "Quebra-Cabeça 500 peças",
    "tipo": "Quebra-Cabeça",
    "classificacao": "12 anos",
    "tamanho": "Pequeno",
    "preco": 49.90
  }
  {
    "nome": "Lego - Empire States Building",
    "tipo": "Lego",
    "classificacao": "12 anos",
    "tamanho": "Médio",
    "preco": "599,99"
  }
```

## Considerações finais
- Todos os campos são obrigatórios
- O preço deve ser enviado como String

