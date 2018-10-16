package com.idemidov.fsappbackend.mappers;


import com.idemidov.fsappbackend.models.dbdto.DThing;
import com.idemidov.fsappbackend.models.frontenddto.JThing;

import java.util.LinkedList;
import java.util.List;

public class ThingMapper {
    public static JThing DBtoJSON(DThing dThing) {
        return new JThing(dThing.getId(), dThing.getName(), dThing.getDescription());
    }

    public static DThing JSONtoDB(JThing jThing) {
        return new DThing(jThing.getId(), jThing.getName(), jThing.getDescription());
    }

    public static List<JThing> DBtoJSON(List<DThing> dThings) {
        List<JThing> jThings = new LinkedList<>();
        dThings.stream().map(ThingMapper::DBtoJSON).forEach(jThings::add);
        return jThings;
    }

    public static List<DThing> JSONtoDB(List<JThing> jThings) {
        List<DThing> dThings = new LinkedList<>();
        jThings.stream().map(ThingMapper::JSONtoDB).forEach(dThings::add);
        return dThings;
    }
}
