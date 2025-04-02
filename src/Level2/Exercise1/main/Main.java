package Level2.Exercise1.main;

import Level2.Exercise1.model.Restaurant;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Restaurante Pablo",10);
        Restaurant restaurant2 = new Restaurant("Restaurante Pablo",9);
        Restaurant restaurant3 = new Restaurant("Restaurante Pablo",10);


    HashSet<Restaurant> restaurants = new HashSet<>();
    restaurants.add(restaurant1);
    restaurants.add(restaurant2);
    restaurants.add(restaurant3);

    System.out.println(restaurants);
    }
}
