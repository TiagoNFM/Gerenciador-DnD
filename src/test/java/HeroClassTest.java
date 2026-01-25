import org.example.*;

import java.util.List;

import org.example.domain.classes.HeroClass;
import org.example.domain.classes.Warrior;
import org.example.domain.classes.Wizard;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroClassTest {
    @Test
    @DisplayName("Guerreiro deve ter proeficiência em Força e Constituição")
    void warriorShouldHaveCorrectProficiencies(){
        HeroClass warrior = new Warrior();
        List<Attribute> proficiencies = warrior.getProficiencies();

        assertTrue(proficiencies.contains(Attribute.STRENGTH), "Deveria ter Força");
        assertTrue(proficiencies.contains(Attribute.CONSTITUTION), "Deveria ter Constituição");
        assertEquals(2, proficiencies.size(), "Guerreiro deve ter exatamente 2 proeficiências");
    }

    @Test
    @DisplayName("Mago deve ter proeficiência em Inteligência e Sabedoria")
    void wizardShoudHaveCorrectPrificiencies(){
        HeroClass wizard = new Wizard();
        List<Attribute> proficiencies = wizard.getProficiencies();

        assertTrue(proficiencies.contains(Attribute.INTELLIGENCE));
        assertTrue(proficiencies.contains(Attribute.WISDOM));
        assertEquals(2, proficiencies.size(), "Mago deve ter exatamente 2 proeficiências");
    }
}
