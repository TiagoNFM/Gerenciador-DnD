package controller;

import org.example.controller.CharacterController;
import org.example.domain.classes.Warrior;
import org.example.domain.races.Elf;
import org.example.domain.service.*;
import org.example.CharacterSheet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import tools.jackson.databind.ObjectMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CharacterController.class)
class CharacterControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private CharacterService characterService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("POST /characters deve retornar 201 Created e o JSON do personagem")
    void shouldCreateCharacter() throws Exception{
        CreateCharacterRequest request = new CreateCharacterRequest("Legolas", "WARRIOR", "Elf", 1);
        CharacterSheet mockSheet = new CharacterSheet("Legolas", new Warrior(), new Elf(), 1);
        when(characterService.createCharacter(any(CreateCharacterRequest.class))).thenReturn(mockSheet);

        mockMvc.perform(post("/characters")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                        .andExpect(status().isCreated())
                        .andExpect(jsonPath("$.name").value("Legolas"))
                        .andExpect(jsonPath("$.heroClass.name").value("Warrior"));
    }
}
