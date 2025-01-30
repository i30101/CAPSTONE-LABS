/**
 * @author Andrew Kim
 * @since 30 January 2025
 * @version 1.0.0
 */

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Person> test = FileReader.readFile("./data/cemetery_orig.txt", 5);
        assert test != null;
        for (Person p: test) {
            System.out.println(p.getAddress() + ", " + p.getStreetNumber() + " " + p.getStreet());
        }
    }
}
