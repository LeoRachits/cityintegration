package com.faculdade.cityintegration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

@ControllerAdvice
public class CidadeExceptionHandler {

    @ExceptionHandler(CidadeNaoEncontradaException.class)
    public ResponseEntity<Map<String, String>> handleCidadeNaoEncontrada(CidadeNaoEncontradaException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(Map.of(
                        "erro", "Cidade não encontrada",
                        "detalhe", ex.getMessage()
                ));
    }
}
