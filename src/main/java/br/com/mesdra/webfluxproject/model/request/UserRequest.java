package br.com.mesdra.webfluxproject.model.request;

public record UserRequest(
        String name, String email, String password
) { }