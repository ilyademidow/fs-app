package com.idemidov.fsappbackend.controllers;

import com.idemidov.fsappbackend.dao.ThingRepository;
import com.idemidov.fsappbackend.models.Thing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class MainRestController {
    @Autowired
    ThingRepository thingRepository;

    @GetMapping(path = "/things")
    public List<Thing> getThingList() {
        List<Thing> things = new LinkedList<>();
        thingRepository.findAll().forEach(things::add);

        return things;
    }

}
