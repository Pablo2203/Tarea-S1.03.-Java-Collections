package Level1.Exercise1.main;


import Level1.Exercise1.model.Month;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
        months.add(7, new Month("August"));

        HashSet<Month> monthSet = new HashSet<>(months);
        monthSet.add(new Month("January"));
        monthSet.add(new Month("February"));
        System.out.println("HashSet: " + monthSet);

        System.out.println("----------------------");
        System.out.println("For each:");
        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println("----------------------");
        System.out.println("Iterator:");
        var iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}


