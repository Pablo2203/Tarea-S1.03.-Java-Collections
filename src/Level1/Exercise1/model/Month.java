package Level1.Exercise1.model;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return name.equals(month.name);
    }
    @Override
    public int hashCode() {
     return Objects.hash(name);
    }

        @Override
    public String toString() {
        return "Month: " +
                "name: '" + name + '\'' ;
    }
}

