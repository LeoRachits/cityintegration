package com.faculdade.cityintegration;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CityService {

    public List<Map<String, String>> listarCidades() {
        return List.of(
            Map.of("id", "1", "nome", "Fortaleza", "estado", "CE"),
            Map.of("id", "2", "nome", "Horizonte", "estado", "CE"),
            Map.of("id", "3", "nome", "Recife", "estado", "PE")
        );
    }

    public Map<String, String> buscarCidadePorId(String id) {
        return listarCidades().stream()
                .filter(cidade -> cidade.get("id").equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cidade nao encontrada"));
    }
}
