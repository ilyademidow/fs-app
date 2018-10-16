package com.idemidov.fsappbackend.generators;

import com.idemidov.fsappbackend.dao.IThingRepository;
import com.idemidov.fsappbackend.models.dbdto.DThing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ThingGenerator {
    @Autowired
    IThingRepository repository;

    @PostConstruct
    public void generateThings() {
        DThing thing1 = new DThing(1, "Yellow pencil", "Yellow pencil with the rubber at the end");
        DThing thing2 = new DThing(2, "Green pen", "Yellow pencil with the rubber at the end");
        DThing thing3 = new DThing(3, "Screw driver", "Yellow pencil with the rubber at the end");
        DThing thing4 = new DThing(4, "Silver chain", "Yellow pencil with the rubber at the end");
        repository.save(thing1);
        repository.save(thing2);
        repository.save(thing3);
        repository.save(thing4);
    }
}
