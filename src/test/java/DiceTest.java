import org.example.Dice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DiceTest {
    @Test
    @DisplayName("Deve rolar um número entre 1 e quantidade de faces")
    void shouldRollResultWithinBounds(){
        Dice dice = new Dice();
        int faces = 20;

        int result = dice.roll(faces);

        assertTrue(result >= 1, "O resultade deve ser maior ou igual a 1");
        assertTrue(result <= faces, "O resultade deve ser menor ou igual a 20");
    }
}
