package com.example.GestionEnergia.service;

import org.springframework.stereotype.Service;

@Service
public class SmartGridService {

    public String monitorearRed() {
        return "La red eléctrica está funcionando de manera óptima. Pérdidas mínimas detectadas.";
    }

    public String integrarEnergiasRenovables(int porcentajeSolar, int porcentajeEolica) {
        return "Integración de energías renovables: Solar=" + porcentajeSolar + "%, Eólica=" + porcentajeEolica + "% completada exitosamente.";
    }
}

