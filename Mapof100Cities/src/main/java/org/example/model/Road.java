package org.example.model;


import org.example.enumeration.LaneType;

public class Road {
    City city1;
    City city2;
    Integer lane;

    public Road(City city1,City city2, Integer lane){
        this.city1=city1;
        this.city2=city2;
        this.lane=lane;
    }

    public City getCity1() {
        return city1;
    }

    public void setCity1(City city1) {
        this.city1 = city1;
    }

    public City getCity2() {
        return city2;
    }

    public void setCity2(City city2) {
        this.city2 = city2;
    }

    public Integer getLane() {
        return lane;
    }

    public void setLane(Integer lane) {
        this.lane = lane;
    }

    public LaneType getLaneType() {
        return laneType;
    }

    public void setLaneType(LaneType laneType) {
        this.laneType = laneType;
    }

    LaneType laneType;
}
