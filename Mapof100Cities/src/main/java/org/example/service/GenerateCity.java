package org.example.service;

import org.example.model.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateCity {
    private static final String[] CITY_NAMES = {
                "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
                "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose",
                "Austin", "Jacksonville", "Fort Worth", "Columbus", "San Francisco",
                "Charlotte", "Indianapolis", "Seattle", "Denver", "Washington",
                "Boston", "El Paso", "Nashville", "Detroit", "Oklahoma City",
                "Portland", "Las Vegas", "Memphis", "Louisville", "Baltimore",
                "Milwaukee", "Albuquerque", "Tucson", "Fresno", "Sacramento",
                "Kansas City", "Mesa", "Atlanta", "Omaha", "Colorado Springs",
                "Raleigh", "Miami", "Long Beach", "Virginia Beach", "Oakland",
                "Minneapolis", "Tulsa", "Arlington", "Tampa", "New Orleans",
                "Wichita", "Bakersfield", "Cleveland", "Aurora", "Anaheim",
                "Honolulu", "Santa Ana", "Riverside", "Corpus Christi", "Lexington",
                "Henderson", "Stockton", "Saint Paul", "Cincinnati", "St. Louis",
                "Pittsburgh", "Greensboro", "Lincoln", "Anchorage", "Plano",
                "Orlando", "Irvine", "Newark", "Toledo", "Durham", "Chula Vista",
                "Fort Wayne", "Jersey City", "St. Petersburg", "Laredo", "Madison",
                "Chandler", "Buffalo", "Lubbock", "Scottsdale", "Reno",
                "Glendale", "Gilbert", "Winston-Salem", "North Las Vegas", "Norfolk",
                "Chesapeake", "Garland", "Irving", "Hialeah", "Fremont", "Boise",
                "Richmond", "Baton Rouge", "Spokane", "Des Moines", "Tacoma"
    };
    public static List<City> Generator(){
        List<City> cities=new ArrayList<>();
        cityGenerator(cities,CITY_NAMES);
        cities.forEach(city -> System.out.println(city.toString()));
        return cities;
    }
    public static List<City> cityGenerator(List<City> cities,String[] CITY_NAMES )
    {
        Random random = new Random();
        for(int i=0;i<100;i++)
        {
            String cityName = CITY_NAMES[i];
            double lati=-90 + (90 - (-90)) * random.nextDouble();
            double longi=-180 + (180 - (-180)) * random.nextDouble();
            cities.add(new City(cityName,lati,longi));
        }
        return cities;

    }
}
