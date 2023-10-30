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
- Software de requisições: Postman, insomnia

## Métodos HTTPs

#### GET
- [Listar todos os Digimons]( http://localhost:8080/digimons)
- [Filtrar Digimons por Nível](http://localhost:8080/digimons/byLevel?level=Champion)

      Substitua "Champion" pelo nível desejado. Exemplo: "Rookie"



<div style="text-align: center;">
  <img src="https://devkico.itexto.com.br/wp-content/uploads/2014/08/spring-boot-project-logo.png" 
  alt="Logo do projeto" style="width: 120px; margin: 0 auto;border-radius:10px">
    <img src="https://s2-techtudo.glbimg.com/twoewJmwpMgtGPcRPP8SxFlDVmM=/0x0:695x393/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2021/P/f/y52r4ySZWLkJjEhKLhgw/2014-11-14-java-logo.jpg" 
  alt="Logo do projeto" style="width: 200px; margin: 0 auto;border-radius:10px; margin-left:4em">
</div>