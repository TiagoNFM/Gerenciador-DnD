package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.domain.classes.HeroClass;
import org.example.domain.races.Race;

import java.util.EnumMap;
import java.util.Map;

@Entity
@Table(name = "characters")
@Getter @Setter
public class CharacterSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private int level;

    @Transient
    private HeroClass heroClass;
    @Transient
    private Race heroRace;
    @Transient
    private Map<Attribute,Integer> attributes = new EnumMap<>(Attribute.class);

    protected CharacterSheet() {}

    public CharacterSheet(String name, HeroClass heroClass, Race heroRace, int level){
        this.name = name;
        this.heroClass = heroClass;
        this.heroRace = heroRace;
        this.level = level;

        for(Attribute attr : Attribute.values()){
            attributes.put(attr,10);
        }
    }

    public Integer getAttribute(Attribute attribute) {
        int baseValue = attributes.get(attribute);
        int bonus = heroRace.getAttributeBonuses().getOrDefault(attribute,0);

        return baseValue + bonus;
    }

    public void setAttribute(Attribute attribute, int value){
        attributes.put(attribute, value);
    }

    public int getHitPoints(){
        int constitutionScore = this.getAttribute(Attribute.CONSTITUTION);
        int constitutionModifier = AbilityScore.calculateModifier(constitutionScore);

        int classBaseHP = this.heroClass.getBaseHitPoints();

        return classBaseHP + constitutionModifier;
    }
}
