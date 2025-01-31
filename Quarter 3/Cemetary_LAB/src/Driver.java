/**
 * @author Andrew Kim
 * @since 30 January 2025
 * @version 1.0.0
 */

import java.util.ArrayList;

public class Driver {

    private static <E> void printArrayList(ArrayList<E> list) {
        for (E item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Cemetery cemetary = new Cemetery("./data/cemetery_orig.txt", 5);

        ArrayList<Person> people = cemetary.sortFirstName();

        printArrayList(people);

    }
}
