package com.example.GestionEnergia.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Medidor {
    private String usuario;
    private Double consumo;
}

