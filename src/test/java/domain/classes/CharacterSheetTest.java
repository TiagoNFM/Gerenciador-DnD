package classes;

import org.example.*;
import org.example.domain.classes.HeroClass;
import org.example.domain.classes.Warrior;
import org.example.domain.classes.Wizard;
import org.example.domain.races.Dwarf;
import org.example.domain.races.Elf;
import org.example.domain.races.Race;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterSheetTest {
    @Test
    @DisplayName("Deve mostrar 10 em cada atributo")
    void shouldInitializeWithDefaultAttributes(){
        HeroClass warrior = new Warrior();
        Race dwarf = new Dwarf();
        CharacterSheet sheet = new CharacterSheet("Azrothar", warrior, dwarf, 1);

        assertEquals(10, sheet.getAttribute(Attribute.STRENGTH));
        assertEquals(10, sheet.getAttribute(Attribute.DEXTERITY));
        assertEquals(12, sheet.getAttribute(Attribute.CONSTITUTION));
        assertEquals(10, sheet.getAttribute(Attribute.INTELLIGENCE));
        assertEquals(10, sheet.getAttribute(Attribute.WISDOM));
        assertEquals(10, sheet.getAttribute(Attribute.CHARISMA));
    }

    @Test
    @DisplayName("Guerreiro com constituição 14(+2) deve ter 12 de HP (10 base + 2 mod)")
    void warriorShouldHaveCorrectHitPoints(){
        HeroClass warrior = new Warrior();
        Race dwarf = new Dwarf();
        CharacterSheet sheet = new CharacterSheet("Escanor", warrior, dwarf, 1);

        sheet.setAttribute(Attribute.CONSTITUTION, 14);
        assertEquals(13, sheet.getHitPoints());
    }

    @Test
    @DisplayName("Mago com constituição 10 (+0) deve ter 6 de HP")
    void wizardShouldHaveCorrectHitPoints(){
        HeroClass wizard = new Wizard();
        Race elf = new Elf();
        CharacterSheet sheet = new CharacterSheet("Raven", wizard, elf, 1);

        assertEquals(6, sheet.getHitPoints());
    }

    @Test
    @DisplayName("Elfo deve ter +2 de Destreza aplicado ao valor base")
    void elfShouldAddDexterityBonus(){
        Race elf = new Elf();
        HeroClass wizard = new Wizard();

        CharacterSheet sheet = new CharacterSheet("Raven", wizard, elf, 1);

        assertEquals(12, sheet.getAttribute(Attribute.DEXTERITY));
        assertEquals(10, sheet.getAttribute(Attribute.CHARISMA));
    }
}
