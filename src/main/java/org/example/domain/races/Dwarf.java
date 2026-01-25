package org.example.domain.races;

import org.example.Attribute;

import java.util.Map;

public class Dwarf implements Race {
    @Override
    public String getName(){
        return "Dwarf";
    }

    public Map<Attribute, Integer> getAttributeBonuses(){
        return Map.of(Attribute.CONSTITUTION, 2);
    }
}
