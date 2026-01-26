package domain.races;

import org.example.domain.races.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RaceFactoryTest {


    @Test
    @DisplayName("Deve retornar Warrior quando String for 'Warrior'")
    void shouldReturnWarrior(){
        Race elf = RaceFactory.create("ELF");
        assertInstanceOf(Elf.class, elf);
    }

    @Test
    @DisplayName("Deve lancar exceção para classe inválida")
    void shouldThrowExceptionForInvalidClass(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            RaceFactory.create("Ork");
        });
        assertEquals("Classe não encontrada : Ork", exception.getMessage());
    }

}
