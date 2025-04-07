package Level2.Exercise2.model;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;

    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant restaurant = (Restaurant) o;
        if (name.equals(restaurant.name) && score != restaurant.score) return false;
        return name.equals(restaurant.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}


