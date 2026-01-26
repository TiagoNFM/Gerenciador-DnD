package org.example.domain.service;

import org.example.CharacterSheet;
import org.example.domain.classes.*;
import org.example.domain.races.*;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    public CharacterSheet createCharacter(CreateCharacterRequest request){
        HeroClass heroClass = HeroClassFactory.create(request.className());
        Race race = RaceFactory.create(request.raceName());

        return new CharacterSheet(
                request.name(),
                heroClass,
                race,
                request.level()
        );
    }
}
