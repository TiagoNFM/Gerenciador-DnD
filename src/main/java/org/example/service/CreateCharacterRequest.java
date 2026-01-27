package org.example.service;

public record CreateCharacterRequest (
    String name,
    String className,
    String raceName,
    int level
) {}
