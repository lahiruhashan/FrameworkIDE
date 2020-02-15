/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.groupone.models;

/**
 *
 * @author hashan
 */
public class Coordinate {
    
    private int pointId;
    private double latitude;
    private double longitude;

    public Coordinate() {
    }

    public Coordinate(int pointId, double latitude, double longitude) {
        this.pointId = pointId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    
    
}
