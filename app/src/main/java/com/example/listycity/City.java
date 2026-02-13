package com.example.listycity;

/**
 * This class defines a City with a city name and a province.
 */
public class City implements Comparable{
    private String city;
    private String province;

    /**
     * Constructs a city with the given name and province
     * @param city
     * the city name
     * @param province
     * the province name
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     * @return
     * the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Returns the province name
     * @return
     * the province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city to another city by city name
     * @param o
     * another city object
     * @return
     * a negative integer, zero, or positive integer for if the city name is less than, equal to or greater than
     * the other city name
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}