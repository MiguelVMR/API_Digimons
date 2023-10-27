package com.digimon.digimon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digimon.digimon.dtos.DigimonDTO;
import com.digimon.digimon.httpClient.HttpClient;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DigimonService {

    private HttpClient client;

    public List<DigimonDTO> listarDigmon() {
        List<DigimonDTO> digimonDTO = this.client.listar();


        
        System.out.println(digimonDTO);
        return digimonDTO;

    }

}
