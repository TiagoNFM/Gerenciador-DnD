package org.example.domain.classes;

public class HeroClassFactory {
    public static HeroClass create(String className){
        return switch ((className.toUpperCase())){
            case "WARRIOR" -> new Warrior();
            case "WIZARD" -> new Wizard();
            default -> throw new IllegalArgumentException("Classe não encontrada" + className);
        };
    }
}
