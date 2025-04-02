package Level2.Exercise2.main;

import Level2.Exercise2.model.Restaurant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Restaurante Pablo",10);
        Restaurant restaurant2 = new Restaurant("Restaurante Pablo",9);
        Restaurant restaurant3 = new Restaurant("Restaurante Pablo",10);
        Restaurant restaurant4 = new Restaurant("Restaurante Pablo",5);
        Restaurant restaurant5 = new Restaurant("Restaurante Pablo",7);
        Restaurant restaurant6 = new Restaurant("Restaurante Pablo",5);

    HashSet<Restaurant> restaurants = new HashSet<>();
    restaurants.add(restaurant1);
    restaurants.add(restaurant2);
    restaurants.add(restaurant3);
    restaurants.add(restaurant4);
    restaurants.add(restaurant5);
    restaurants.add(restaurant6);
    System.out.println("HashSet: " + restaurants);

    System.out.println("----------------------");

        List<Restaurant> restaurantList = new ArrayList<>(restaurants);
        restaurantList.sort((r1, r2) -> Integer.compare(r2.getScore(), r1.getScore()));
        for (Restaurant restaurant : restaurantList) {
            System.out.println(restaurant);
        }


    }
    }

