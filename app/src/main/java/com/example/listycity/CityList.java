package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Returns whether the  given city is in the list
     * @param city
     * the city to check
     * @return
     * true if the city is in the list, otherwise false
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes the given city from the list if it is in the list, throws exception if not.
     * @param city
     * the city to remove
     * @throws IllegalArgumentException
     * if the city is not in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list
     * @return
     * the number of cities
     */
    public int countCities() {
        return cities.size();
    }
}