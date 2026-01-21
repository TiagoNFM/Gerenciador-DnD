import org.example.AbilityScore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AtributeTest {
    @Test
    @DisplayName("Deve mostrar 1")
    void shouldShow1(){
        AbilityScore score = new AbilityScore();
        int atributePoints = 12;

        int result = score.calculateScore(atributePoints);

        assertEquals(1, result);
    }

    @Test
    @DisplayName("Deve mostrar 2")
    void shouldShow2(){
        AbilityScore score = new AbilityScore();
        int atributePoints = 14;

        int result = score.calculateScore(atributePoints);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("Deve mostrar 5")
    void shouldShow5(){
        AbilityScore score = new AbilityScore();
        int atributePoints = 21;

        int result = score.calculateScore(atributePoints);

        assertEquals(5, result);
    }

    @Test
    @DisplayName("Deve mostrar -3")
    void shouldShowMinus3(){
        AbilityScore score = new AbilityScore();
        int atributePoints = 3;

        int result = score.calculateScore(atributePoints);

        assertEquals(-3, result);
    }
}
