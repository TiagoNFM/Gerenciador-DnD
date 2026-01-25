package org.example.domain.classes;

import org.example.Attribute;

import java.util.List;

public class Wizard implements HeroClass {
    @Override
    public String getName(){
        return "Wizard";
    }

    @Override
    public int getBaseHitPoints(){
        return 6;
    }

    public List<Attribute> getProficiencies(){
        return List.of(Attribute.INTELLIGENCE, Attribute.WISDOM);
    }
}
