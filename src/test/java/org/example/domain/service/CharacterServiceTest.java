package org.example.domain.service;


import org.example.CharacterSheet;
import org.example.domain.classes.Warrior;
import org.example.repository.CharacterRepository;
import org.example.service.CharacterService;
import org.example.service.CreateCharacterRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class CharacterServiceTest {
    @Test
    @DisplayName("Deve criar um personagem corretamente usando as Factories")
    void shouldCreateCharacterSuccessfully(){

        CharacterRepository repositoryMock = Mockito.mock(CharacterRepository.class);

        when(repositoryMock.save(any(CharacterSheet.class))).thenAnswer(invocation -> invocation.getArgument(0));
        CharacterService service = new CharacterService(repositoryMock);
        CreateCharacterRequest request = new CreateCharacterRequest("Thor", "WARRIOR", "Dwarf", 1);

        CharacterSheet sheet = service.createCharacter(request);

        assertNotNull(sheet);
        assertInstanceOf(Warrior.class, sheet.getHeroClass());
        assertEquals("Dwarf", sheet.getHeroRace().getName());
        assertEquals(11, sheet.getHitPoints());
    }
}
