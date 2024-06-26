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

4. OU

5. Baixe o arquivo ZIP.
6. Faça a descompactação
7. Abra o Spring boot 4
8. Vá até `File` (parte superior esquerda)
9. Clique em `Open Projects from File System...`
10. Localize o local de download do pasta e execute o arquivo.
11. Vá em `Boot Dashboard` > `Local` > `poo` e clique em `start`
12. Use o `Postman`
13. A API estará disponível em `http://localhost:8080`
