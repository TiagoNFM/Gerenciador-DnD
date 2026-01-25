package org.example.domain.races;

import org.example.Attribute;

import java.util.Map;

public interface Race {
    String getName();
    Map<Attribute, Integer> getAttributeBonuses();
}
