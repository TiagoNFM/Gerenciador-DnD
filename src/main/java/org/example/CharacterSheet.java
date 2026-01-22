package org.example;
import java.util.EnumMap;
import java.util.Map;

public class CharacterSheet {
    private String name;
    private String characterClass;
    private int level;
    private Map<Attribute,Integer> attributes = new EnumMap<>(Attribute.class);

    public CharacterSheet(String name, String characterClass, int level){
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;

        for(Attribute attr : Attribute.values()){
            attributes.put(attr,10);
        }
    }

    public Integer getAttribute(Attribute attribute) {
        return attributes.get(attribute);
    }

    public void setAttribute(Attribute attribute, int value){
        attributes.put(attribute, value);
    }
}
