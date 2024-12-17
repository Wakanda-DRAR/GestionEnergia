package com.example.GestionEnergia.controller;

import com.example.GestionEnergia.model.Medidor;
import com.example.GestionEnergia.service.IluminacionService;
import com.example.GestionEnergia.service.MedidoresService;
import com.example.GestionEnergia.service.SmartGridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/energia")
public class EnergiaController {

    @Autowired
    private IluminacionService iluminacionService;

    @Autowired
    private MedidoresService medidoresService;

    @Autowired
    private SmartGridService smartGridService;

    @GetMapping("/iluminacion/{zona}/{presencia}")
    public String ajustarIluminacion(@PathVariable String zona, @PathVariable boolean presencia) {
        return iluminacionService.ajustarIluminacion(zona, presencia);
    }

    @GetMapping("/medidores/{usuarioId}")
    public String obtenerConsumo(@PathVariable String usuarioId) {
        return medidoresService.obtenerConsumo(usuarioId);
    }

    @GetMapping("/smartgrid")
    public String monitorearRed() {
        return smartGridService.monitorearRed();
    }

    @GetMapping("/smart-grid")
    public String getSmartGridStatus() {
        return "Smart Grid funcionando correctamente. Monitoreo y gestión óptimos.";
    }

    @GetMapping("/iluminacion")
    public String getIluminacionStatus() {
        return "Iluminación pública ajustándose según la presencia de personas/vehículos.";
    }

    @GetMapping("/medidores")
    public List<Medidor> getMedidores() {
        return Arrays.asList(
                new Medidor("Usuario1", 123.4),
                new Medidor("Usuario2", 89.6)
        );
    }
}

