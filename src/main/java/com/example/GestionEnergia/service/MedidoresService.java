package com.example.GestionEnergia.service;

import org.springframework.stereotype.Service;

@Service
public class MedidoresService {

    public String obtenerConsumo(String usuarioId) {
        double consumo = Math.random() * 500;
        return "El consumo actual del usuario " + usuarioId + " es de " + String.format("%.2f", consumo) + " kWh.";
    }

    public String sugerirAhorro(String usuarioId) {
        return "Para el usuario " + usuarioId + ": Apague dispositivos innecesarios durante la noche para ahorrar energía.";
    }
}

