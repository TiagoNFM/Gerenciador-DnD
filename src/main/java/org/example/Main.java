package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CharacterSheet myHero = new CharacterSheet("Arzothar", "Gloom Stalker Ranger", 7);
        myHero.getAttribute(Attribute.STRENGTH);
    }
}