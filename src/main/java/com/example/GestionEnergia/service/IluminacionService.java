package com.example.GestionEnergia.service;

import org.springframework.stereotype.Service;

@Service
public class IluminacionService {

    public String ajustarIluminacion(String zona, boolean hayPresencia) {
        if (hayPresencia) {
            return "Iluminación en la zona " + zona + " ajustada al nivel máximo por presencia detectada.";
        } else {
            return "Iluminación en la zona " + zona + " reducida para ahorro energético.";
        }
    }
}

