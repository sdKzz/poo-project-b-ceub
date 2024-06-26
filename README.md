# Sistema de Gerenciamento de Informações dos Empregados da MGS

## Descrição
Este projeto é uma API REST simples para gerenciar as informações dos empregados da Max Global Sports (MGS). Permite inserir e obter informações dos empregados via requisições HTTP. Este sistema foi desenvolvido como parte do desafio de sistematização, focando na segurança e acessibilidade das informações dos empregados em caso de emergências durante viagens.

## Tecnologias Utilizadas
- Java 17
- Spring Boot 4
- Mvn

## Funcionalidades
- **POST** `/empregados` - Insere informações de um novo empregado.
- **GET** `/empregados/{id}` - Obtém as informações de um empregado pelo ID.

## Como Executar
1. Clone o repositório para sua máquina local usando `git clone https://github.com/sdKzz/poo-project-b-ceub.git`.
2. Navegue até a pasta do projeto e execute `mvn spring-boot:run` para iniciar a aplicação.
3. A API estará disponível em `http://localhost:8080`.
