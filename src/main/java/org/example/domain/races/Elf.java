package org.example.domain.races;

import org.example.Attribute;

import java.util.Map;

public class Elf implements Race {
    @Override
    public String getName(){
        return "Elf";
    }

    public Map<Attribute, Integer> getAttributeBonuses(){
        return Map.of(Attribute.DEXTERITY, 2);
    }
}
