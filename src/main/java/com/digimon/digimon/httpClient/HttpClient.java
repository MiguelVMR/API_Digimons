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
	
    public List<DigimonDTO> listar() {
		RestTemplate restTemplate = new RestTemplate();
		
		RequestEntity<Void> request = RequestEntity
				.get(URI.create("https://digimon-api.vercel.app/api/digimon"))
				.header("Authorization", "Basic YWxnYXdvcmtzOnMzbmg0")	.build();
		
		ResponseEntity<DigimonDTO[]> response = restTemplate.exchange(request, DigimonDTO[].class);
		
		return Arrays.asList(response.getBody());
	}
}
