package org.example.domain.classes;

import org.example.Attribute;

import java.util.List;

public interface HeroClass {
    String getName();
    List<Attribute> getProficiencies();
    int getBaseHitPoints();
}
