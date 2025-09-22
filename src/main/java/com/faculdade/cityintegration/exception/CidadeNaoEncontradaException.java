package com.faculdade.cityintegration.exception;

public class CidadeNaoEncontradaException extends RuntimeException {
    public CidadeNaoEncontradaException(String id) {
        super("Cidade com id " + id + " não encontrada");
    }
}
