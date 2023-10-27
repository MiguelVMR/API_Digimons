package com.digimon.digimon.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digimon.digimon.dtos.DigimonDTO;
import com.digimon.digimon.service.DigimonService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/digimons")
@AllArgsConstructor
@Data
public class DigimonController {


    private DigimonService digimonService;

     @GetMapping()
    public List<DigimonDTO> getAllDigimons() {
        return digimonService.listarDigmonPorNome();
    }

    
    @GetMapping("/byLevel")
    public List<DigimonDTO> getDigimonsByLevel(@RequestParam(value = "level") String level) {
        return digimonService.listarDigimonPorLevel(level);
    }

}
