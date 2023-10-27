package com.digimon.digimon.httpClient;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import org.springframework.web.client.RestTemplate;

import com.digimon.digimon.dtos.DigimonDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@AllArgsConstructor
@Data
public class HttpClient {
	

/**
 * Este método utiliza o RestTemplate para fazer uma requisição GET à API de Digimons
 * obtendo uma lista de DigimonDTOs em formato JSON.
 * Após receber a resposta da API, converte o JSON para um array de DigimonDTOs e retorna uma lista
 * desses DigimonDTOs encapsulados em uma List.
 */
    public List<DigimonDTO> listar() {
		RestTemplate restTemplate = new RestTemplate();
		
		// Cria uma requisição GET para a API de Digimons
		RequestEntity<Void> request = RequestEntity
				.get(URI.create("https://digimon-api.vercel.app/api/digimon"))
				.build();
		
		// Envia a requisição e recebe a resposta da API como um array de DigimonDTOs
		ResponseEntity<DigimonDTO[]> response = restTemplate.exchange(request, DigimonDTO[].class);
		
		// Converte o array de DigimonDTOs em uma lista e retorna
		return Arrays.asList(response.getBody());
	}
}
