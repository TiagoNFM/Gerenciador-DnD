package org.example.domain.races;

import org.example.domain.races.*;

public class RaceFactory {

    public static Race create(String className) {
        return switch ((className.toUpperCase())) {
            case "ELF" -> new Elf();
            case "DWARF" -> new Dwarf();
            default -> throw new IllegalArgumentException("Classe não encontrada" + className);
        };

    }
}
