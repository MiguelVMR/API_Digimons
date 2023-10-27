# Digimon API

Este projeto é uma API que consome informações sobre Digimons de uma fonte externa e oferece funcionalidades para listar e filtrar Digimons com base no nível.Link da API externa https://digimon-api.vercel.app/ feita por https://shadowsmith.com/

## Funcionalidades

- **Listar Digimons:** A API permite listar todos os Digimons disponíveis, em ordem alfabetica
- **Filtrar Digimons por Nível:** A API permite filtrar Digimons com base no nível fornecido.

## Configuração

Antes de utilizar a API, certifique-se de ter as seguintes dependências instaladas:

- Java 17
- Spring Boot
- Maven
- Software de requsições ex: Postman, insomnia ou um Browser ex: FireFox

## Como Usar

### Listar Todos os Digimons

Para listar todos os Digimons, faça uma chamada GET para: http://localhost:8080/digimons

### Filtrar Digimons por Nível
Para obter Digimons de um nível específico, faça uma chamada GET para: http://localhost:8080/digimons/byLevel?level=Champion

Substitua "Champion" pelo nível desejado. Exemplo: "Rookie"
