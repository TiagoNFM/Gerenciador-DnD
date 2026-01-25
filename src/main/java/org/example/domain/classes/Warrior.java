package org.example.domain.classes;

import org.example.Attribute;

import java.util.List;

public class Warrior implements HeroClass{
    @Override
    public String getName(){
        return "Warrior";
    }

    @Override
    public int getBaseHitPoints(){
        return 10;
    }

    public List<Attribute> getProficiencies(){
        return List.of(Attribute.STRENGTH, Attribute.CONSTITUTION);
    }
}
