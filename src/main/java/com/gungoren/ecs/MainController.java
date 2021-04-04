package com.gungoren.ecs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class MainController {


    @GetMapping("/locations")
    public List<Location> getLocations(){

        List<Location> retailList = new ArrayList<>();
        Location location1 = new Location("Location 900", "123 Main st", 32.01, -128.19);
        Location location2 = new Location("Location 800", "444 22 nn st", 48.05, -55.19);
        Location location3 = new Location("Location 700", "888 Main st", 12.0, -28.19);

        retailList.add(location1);
        retailList.add(location2);
        retailList.add(location3);

        return retailList;
    }
}
