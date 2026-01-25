package service;

import org.example.CharacterSheet;
import org.example.domain.classes.Warrior;
import org.example.domain.service.CharacterService;
import org.example.domain.service.CreateCharacterRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterServiceTest {
    @Test
    @DisplayName("Deve criar um personagem corretamente usando as Factories")
    void shouldCreateCharacterSuccessfully(){
        CharacterService service = new CharacterService();
        CreateCharacterRequest request = new CreateCharacterRequest("Thor", "WARRIOR", "Dwarf", 1);

        CharacterSheet sheet = service.createCharacter(request);

        assertNotNull(sheet);
        assertInstanceOf(Warrior.class, sheet.getHeroClass());
        assertEquals("Dwarf", sheet.getHeroRace().getName());
        assertEquals(11, sheet.getHitPoints());
    }
}
