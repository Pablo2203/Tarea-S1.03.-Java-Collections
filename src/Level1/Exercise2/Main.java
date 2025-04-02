package Level1.Exercise2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("----------------------");

        ArrayList<Integer> reversedNumbers = new ArrayList<>();
        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
        while (iterator.hasPrevious()) {
            reversedNumbers.add(iterator.previous());
        }
        for (Integer number : reversedNumbers) {
            System.out.println(number);
        }

        }

    }


