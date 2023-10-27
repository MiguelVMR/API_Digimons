package com.digimon.digimon.dtos;


import java.util.List;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DigimonDTO {
    
    private String name;
    private String level;
    private List<DigimonDTO> digimon;
    
}
