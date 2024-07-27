package org.example;

import org.example.model.City;
import org.example.model.Road;
import org.example.service.GenerateCity;
import org.example.service.GenerateRoad;
import org.example.visualizer.GraphVisualizer;

import java.util.List;


public class Main {
    public static void main(String[] args) {
         List<City> city =GenerateCity.Generator();
         List<Road> road= GenerateRoad.roadGeneration(city);
        System.setProperty("org.graphstream.ui", "swing");
        GraphVisualizer.graphVisualizer(city,road);
    }
}