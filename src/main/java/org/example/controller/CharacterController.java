package org.example.controller;

import org.example.CharacterSheet;
import org.example.service.CharacterService;
import org.example.service.CreateCharacterRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class CharacterController {
    private final CharacterService characterService;

    public CharacterController(CharacterService characterService){ this.characterService = characterService;}

    @PostMapping
    public ResponseEntity<CharacterSheet> create(@RequestBody CreateCharacterRequest request){
        CharacterSheet sheet = characterService.createCharacter(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(sheet);
    }

}
