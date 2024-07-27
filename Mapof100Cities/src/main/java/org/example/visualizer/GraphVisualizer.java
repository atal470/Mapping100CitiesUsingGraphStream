package org.example.visualizer;


import org.example.model.City;
import org.example.model.Road;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

import java.util.List;
import java.util.concurrent.Executors;

public class GraphVisualizer {

    public static void graphVisualizer(List<City> cities,List<Road> roads){
        Graph graph=new SingleGraph("Map");
        for(City city:cities )
            graph.addNode(city.getName()).setAttribute("latitude",city.getLatitude(),city.getLongitude());

        for(Road road:roads)
        {
                String cityName1=road.getCity1().getName();
                String cityName2=road.getCity2().getName();
                try {
                    if (graph.getNode(cityName1) != null && graph.getNode(cityName2) != null) {
                        graph.addEdge(road.getCity1().getName() + "-" + road.getCity2().getName(), cityName1, cityName2).setAttribute
                                ("ui.label", road.getLane() + "lane");
                    }
                }
                catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                }
        }
        Viewer see=graph.display();
        see.enableAutoLayout();

    }



}
