package org.example;

public class AbilityScore {
    int baseAttribute = 10;
    public int calculateScore(int attributePoints){
        return (attributePoints - baseAttribute)/2;
    }
}
