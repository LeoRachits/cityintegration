package com.faculdade.cityintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello CityIntegration!";
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of(
                "status", "online",
                "version", "1.0"
        );
    }

    @GetMapping("/cidades")
    public List<Map<String, String>> listarCidades() {
        return cityService.listarCidades();
    }

    @GetMapping("/cidade/{id}")
    public Map<String, String> buscarCidade(@PathVariable String id) {
        return cityService.buscarCidadePorId(id);
    }
}
