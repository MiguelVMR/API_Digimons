package com.digimon.digimon.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.digimon.digimon.dtos.DigimonDTO;
import com.digimon.digimon.httpClient.HttpClient;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DigimonService {

    private HttpClient client;

// Método para listar Digimons ordenados por nome em ordem alfabética
    public List<DigimonDTO> listarDigmonPorNome() {
        // Obtém a lista de Digimons da API
        List<DigimonDTO> digimonDTO = this.client.listar();

        /*  Ordena os Digimons por nome em ordem alfabética usando streams
         Utiliza o método sorted() com um comparador lambda que compara os nomes dos Digimons (name)
         O método compareTo() é usado para determinar a ordem alfabética dos nomes*/

        List<DigimonDTO> digimonsOrdenados = digimonDTO.stream()
                .sorted((digimon1, digimon2) -> digimon1.getName().compareTo(digimon2.getName())) 
                .collect(Collectors.toList()); // Coleta o resultado de volta em uma lista

        System.out.println(digimonsOrdenados);
        return digimonsOrdenados;
    }


/**
 * Lista os Digimons filtrados pelo nível fornecido.
 * Este método recebe um parâmetro 'level' e filtra a lista de Digimons, 
 * retornando apenas aqueles com o nível correspondente ao parâmetro fornecido. 
 * Exemplo de uso:
 * Para obter Digimons do nível "Rookie", faça uma chamada GET para:/digimons/byLevel?level=Rookie
 * Isso retornará uma lista de Digimons que têm o nível "Rookie".
 */
    public List<DigimonDTO> listarDigimonPorLevel(String level) {
        
        List<DigimonDTO> digimonDTO = this.client.listar();

        // Filtra os Digimons com base no level fornecido
        List<DigimonDTO> digimonsFiltrados = digimonDTO.stream()
                .filter(digimon -> digimon.getLevel().equalsIgnoreCase(level))
                .collect(Collectors.toList());

        // Retorna a lista de Digimons filtrados por level
        return digimonsFiltrados;
    }

}
