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
        DThing thing1 = new DThing(1, "Yellow pencil", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rutrum, diam sodales rhoncus porttitor, risus massa aliquet elit, non volutpat enim est a lorem. Curabitur placerat magna metus, et dictum sem convallis at. Proin molestie mattis ullamcorper. Aliquam erat volutpat. Curabitur sit amet fermentum ante. Curabitur ornare mollis lorem eget suscipit. Donec eget sollicitudin lorem. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing1);
        DThing thing2 = new DThing(2, "Green pen", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rutrum, diam sodales rhoncus porttitor, risus massa aliquet elit, non volutpat enim est a lorem. Curabitur placerat magna metus, et dictum sem convallis at. Proin molestie mattis ullamcorper. Aliquam erat volutpat. Curabitur sit amet fermentum ante. Curabitur ornare mollis lorem eget suscipit. Donec eget sollicitudin lorem. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing2);
        DThing thing3 = new DThing(3, "Screw driver", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rutrum, diam sodales rhoncus porttitor, risus massa aliquet elit, non volutpat enim est a lorem. Curabitur placerat magna metus, et dictum sem convallis at. Proin molestie mattis ullamcorper. Aliquam erat volutpat. Curabitur sit amet fermentum ante. Curabitur ornare mollis lorem eget suscipit. Donec eget sollicitudin lorem. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing3);
        DThing thing4 = new DThing(4, "Silver chain", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rutrum, diam sodales rhoncus porttitor, risus massa aliquet elit, non volutpat enim est a lorem. Curabitur placerat magna metus, et dictum sem convallis at. Proin molestie mattis ullamcorper. Aliquam erat volutpat. Curabitur sit amet fermentum ante. Curabitur ornare mollis lorem eget suscipit. Donec eget sollicitudin lorem. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing4);
        DThing thing5 = new DThing(5, "Gold chain", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rutrum, diam sodales rhoncus porttitor, risus massa aliquet elit, non volutpat enim est a lorem. Curabitur placerat magna metus, et dictum sem convallis at. Proin molestie mattis ullamcorper. Aliquam erat volutpat. Curabitur sit amet fermentum ante. Curabitur ornare mollis lorem eget suscipit. Donec eget sollicitudin lorem. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing5);
        DThing thing6 = new DThing(6, "Ring with diamonds", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rutrum, diam sodales rhoncus porttitor, risus massa aliquet elit, non volutpat enim est a lorem. Curabitur placerat magna metus, et dictum sem convallis at. Proin molestie mattis ullamcorper. Aliquam erat volutpat. Curabitur sit amet fermentum ante. Curabitur ornare mollis lorem eget suscipit. Donec eget sollicitudin lorem. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing6);
        DThing thing7 = new DThing(7, "Earrings with stuff", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rutrum, diam sodales rhoncus porttitor, risus massa aliquet elit, non volutpat enim est a lorem. Curabitur placerat magna metus, et dictum sem convallis at. Proin molestie mattis ullamcorper. Aliquam erat volutpat. Curabitur sit amet fermentum ante. Curabitur ornare mollis lorem eget suscipit. Donec eget sollicitudin lorem. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing7);
        DThing thing8 = new DThing(8, "Hummer", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla rutrum, diam sodales rhoncus porttitor, risus massa aliquet elit, non volutpat enim est a lorem. Curabitur placerat magna metus, et dictum sem convallis at. Proin molestie mattis ullamcorper. Aliquam erat volutpat. Curabitur sit amet fermentum ante. Curabitur ornare mollis lorem eget suscipit. Donec eget sollicitudin lorem. Nunc ac porta metus, vel ultrices ipsum");
        repository.save(thing8);
    }
}
