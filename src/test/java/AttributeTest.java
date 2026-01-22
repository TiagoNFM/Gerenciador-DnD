import org.example.AbilityScore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AttributeTest {
    @Test
    @DisplayName("Deve mostrar 1")
    void shouldShow1(){
        int attributePoints = 12;

        int result = AbilityScore.calculateModifier(attributePoints);

        assertEquals(1, result);
    }

    @Test
    @DisplayName("Deve mostrar 2")
    void shouldShow2(){
        int attributePoints = 14;

        int result = AbilityScore.calculateModifier(attributePoints);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("Deve mostrar 5")
    void shouldShow5(){
        int attributePoints = 21;

        int result = AbilityScore.calculateModifier(attributePoints);

        assertEquals(5, result);
    }

    @Test
    @DisplayName("Deve mostrar -3")
    void shouldShowMinus3(){
        int attributePoints = 3;

        int result = AbilityScore.calculateModifier(attributePoints);

        assertEquals(-3, result);
    }
}
