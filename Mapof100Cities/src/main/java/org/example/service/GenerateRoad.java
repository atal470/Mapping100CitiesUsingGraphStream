package org.example.service;

import org.example.model.City;
import org.example.model.Road;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GenerateRoad {
    public static final Integer[] lanes={4,3,2,1};
    public static List<Road> roadGeneration(List<City> cities){

        List<Road> roads=new ArrayList<>();
        Random random=new Random();
        for(int j=0;j<cities.size()-1;j++){
            if(cities.get(random.nextInt(cities.size()))!=cities.get(j)){
                int lane=lanes[random.nextInt(lanes.length)];
                roads.add(new Road(cities.get(j),cities.get(random.nextInt(cities.size())),lane));
            }
        }
        return roads;

    }
}
