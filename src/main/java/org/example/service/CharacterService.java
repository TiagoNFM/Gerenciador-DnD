package org.example.service;

import org.example.CharacterSheet;
import org.example.domain.classes.*;
import org.example.domain.races.*;
import org.example.repository.CharacterRepository;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    private final CharacterRepository repository;

    public CharacterService(CharacterRepository repository){this.repository = repository;}

    public CharacterSheet createCharacter(CreateCharacterRequest request){
        HeroClass heroClass = HeroClassFactory.create(request.className());
        Race race = RaceFactory.create(request.raceName());

        CharacterSheet sheet = new CharacterSheet(
                request.name(),
                heroClass,
                race,
                request.level()
        );

        return repository.save(sheet);
    }
}
