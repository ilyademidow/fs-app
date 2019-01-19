package com.idemidov.fsappbackend.controllers;

import com.idemidov.fsappbackend.models.frontenddto.JThing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MainRestControllerTest {
    @Autowired
    MainRestController restController;

    @Test
    public void getThingListTest() {
        List<JThing> things = restController.getThingList();
        assertNotNull(things);
        assertEquals(5, things.size());
    }

    @Test
    public void saveThingTest() {
        JThing jThing = new JThing(255, "test thing", "test thing description");
        restController.saveThing(jThing);
        JThing thing = restController.getThingById(255);
        assertEquals("test thing", thing.getName());
        assertEquals("test thing description", thing.getDescription());
    }
}
