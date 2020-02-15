/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.groupone.models;

import java.util.HashMap;

/**
 *
 * @author hashan
 */
public class PathPlan {
    
    private HashMap<Double, Double> coordinateMap;

    public HashMap<Double, Double> getCoordinateMap() {
        return coordinateMap;
    }

    public void setCoordinateMap(HashMap<Double, Double> coordinateMap) {
        this.coordinateMap = coordinateMap;
    }
    
    public void addCoordinate(double x, double y) {
        this.coordinateMap.put(x, y);
    }
    
}
