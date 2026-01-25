package classes;

import org.example.domain.classes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroClassFactoryTest {
    @Test
    @DisplayName("Deve retornar Warrior quando String for 'Warrior'")
    void shouldReturnWarrior(){
        HeroClass hero = HeroClassFactory.create("WARRIOR");
        assertInstanceOf(HeroClass.class, hero);
    }

    @Test
    @DisplayName("Deve lancar exceção para classe inválida")
    void shouldThrowExceptionForInvalidClass(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            HeroClassFactory.create("Potato");
        });
        assertEquals("Classe não encontrada : Potato", exception.getMessage());
    }

}
