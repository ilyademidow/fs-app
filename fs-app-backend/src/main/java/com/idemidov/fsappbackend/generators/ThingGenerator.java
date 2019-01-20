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
        DThing thing1 = new DThing(1, "Yellow pencil", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        repository.save(thing1);
        DThing thing2 = new DThing(2, "Green pen", "Nulla rutrum, diam sodales rhoncus porttitor, risus massa aliquet elit, non volutpat enim est a lorem. ");
        repository.save(thing2);
        DThing thing3 = new DThing(3, "Screw driver", "Aliquam erat volutpat. Curabitur sit amet fermentum ante.");
        repository.save(thing3);
        DThing thing4 = new DThing(4, "Silver chain", "Donec eget sollicitudin lorem. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing4);
        DThing thing5 = new DThing(5, "Gold chain", "Curabitur ornare mollis lorem eget suscipit. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing5);
        DThing thing6 = new DThing(6, "Ring with diamonds", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        repository.save(thing6);
        DThing thing7 = new DThing(7, "Earrings with stuff", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        repository.save(thing7);
        DThing thing8 = new DThing(8, "Hummer", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rutrum");
        repository.save(thing8);
    }
}
