package com.idemidov.fsappbackend.controllers;

import com.idemidov.fsappbackend.dao.IThingRepository;
import com.idemidov.fsappbackend.mappers.ThingMapper;
import com.idemidov.fsappbackend.models.dbdto.DThing;
import com.idemidov.fsappbackend.models.frontenddto.JThing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/api")
public class MainRestController {
    public static final Logger LOGGER = LoggerFactory.getLogger(MainRestController.class);
    @Autowired
    IThingRepository thingRepository;

    @GetMapping(path = "/things")
    public List<JThing> getThingList() {
        try {
            List<DThing> dThings = new LinkedList<>();
            thingRepository.findAll().forEach(dThings::add);
            LOGGER.info(dThings.stream().map(Object::toString).collect(Collectors.joining(",")));
            return ThingMapper.DBtoJSON(dThings);
        } catch (NullPointerException e) {
            LOGGER.warn("No things");
            return new ArrayList<JThing>();
        }
    }

    @GetMapping(path = "/things/{id}")
    public JThing getThingById(@PathVariable Integer id) {
        try {
            LOGGER.info("Thing with id={}", id);
            return thingRepository.findById(id).map(ThingMapper::DBtoJSON).get();
        } catch (NoSuchElementException e) {
            LOGGER.warn("No thing with id={}", id);
            return new JThing();
        }
    }

    @PostMapping(path = "/things", consumes = "application/json")
    public List<JThing> saveThing(@RequestBody JThing jThing) {
        LOGGER.info("Create thing={}", jThing.getId());
        thingRepository.save(ThingMapper.JSONtoDB(jThing));
        List<DThing> dThings = new LinkedList<>();
        thingRepository.findAll().forEach(dThings::add);
        return ThingMapper.DBtoJSON(dThings);
    }

    @PutMapping(path = "/things/{id}", consumes = "application/json")
    public JThing editThing(@RequestBody JThing jThing) {
        LOGGER.info("Update thing={}", jThing.getId());
        thingRepository.save(ThingMapper.JSONtoDB(jThing));
        return thingRepository.findById(jThing.getId()).map(ThingMapper::DBtoJSON).get();
    }

    @DeleteMapping(path = "/things/{id}")
    public void deleteThing(@PathVariable Integer id) {
        thingRepository.deleteById(id);
        LOGGER.info("Delete thing={}", id);
    }

}
