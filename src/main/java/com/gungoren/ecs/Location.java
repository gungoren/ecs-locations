package com.gungoren.ecs;

public class Location {

    private String name;
    private String address;

    private double lat;
    private double lang;

    public Location(String name, String address, double lat, double lang) {
        this.name = name;
        this.address = address;
        this.lat = lat;
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLang() {
        return lang;
    }

    public void setLang(double lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", lat=" + lat +
                ", lang=" + lang +
                '}';
    }
}
