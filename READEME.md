# API de Gerenciamento de Brinquedos - Spring Boot

Solução completa para cadastro e consulta de brinquedos infantis com operações CRUD implementadas em Spring Boot e Oracle Database

## Estrutura do Projeto

EmpresaBrinquedosApplication.java: classe principal que inicializa a aplicação Spring Boot.
RestCrudController.java: controlador REST que gerencia as requisições HTTP. Define endpoints da API (/brinquedos), mapeia as requisições POST/GET para operações do CRUD, valida dados de entrada e retorna as respostas HTTP apropriadas.
Brinquedo.java: entidade JPA que representa a tabela do banco de dados. Mapeia a tabela TDS_TB_BRINQUEDOS para objetos Java, define constraints, contém a estrutura de dados dos brinquedos e gera automaticamente o ID via sequência.
BrinquedoRepository.java: interface para operações de banco de dados. Herda as operações CRUD básicas do JpaRepository e traduz operações Java para SQL de forma automática.
application.properties: arquivo de configuração da aplicação. Faz a conexão com banco Oracle através de URL, usuário e senha.
pom.xml: arquivo de definição do projeto Maven.

## Tecnologias Utilizadas
- **Core**: Java 21 + Spring Boot 3.4.5
- **Banco de Dados**: Oracle 23
- **Build**: Maven
- **Testes**: Postman

## Configuração no Spring Initializr
- colar imagem

## Dependências instaladas
- colar imagem


## Cenários validados
1. Cadastro com dados completos
2. Tentativa de cadastro sem classificação
3. Consulta por ID existente
4. Consulta por ID inexistente
5. Listagem com banco vazio
6. Listagem com múltiplos registros

## Teste dos endpoints no Postman
# Método Post no endpoint http://localhost:8080/brinquedos
- colar imagem

# Método GET "ALL" no endpoint http://localhost:8080/brinquedos
- colar imagem

# Método GET "by ID" no endpoint http://localhost:8080/brinquedos/{id}
- colar imagem

## Exemplos de JSON para cadastro
    - colocar exemplos

## Considerações finais
- Todos os campos são obrigatórios
- O preço deve ser enviado como String

