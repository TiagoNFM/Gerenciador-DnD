import org.example.Attribute;
import org.example.CharacterSheet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterSheetTest {
    @Test
    @DisplayName("Deve mostrar 10 em cada atributo")
    void shouldInitializeWithDefaultAtributes(){
        CharacterSheet sheet = new CharacterSheet("Azrothar", "Ranger", 1);

        assertEquals(10, sheet.getAttribute(Attribute.STRENGTH));
        assertEquals(10, sheet.getAttribute(Attribute.DEXTERITY));
        assertEquals(10, sheet.getAttribute(Attribute.CONSTITUTION));
        assertEquals(10, sheet.getAttribute(Attribute.INTELLIGENCE));
        assertEquals(10, sheet.getAttribute(Attribute.WISDOM));
        assertEquals(10, sheet.getAttribute(Attribute.CHARISMA));
    }
}
