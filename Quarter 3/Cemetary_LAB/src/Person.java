/**
 * @author Andrew Kim
 * @since 28 January 2025
 * @version 1.0.0
 */

public class Person {

    private final String name;
    private final String firstName;
    private final String middleName;
    private final String lastName;

    private final int burialDay;
    private final int burialMonth;
    private final int burialYear;

    private final double age;

    private final String address;
    private final String street;
    private final String streetNumber;


    /**
     * Creates Person class
     * @param n full name
     * @param fn first name
     * @param mn middle name
     * @param ln last name
     * @param d burial month
     * @param m burial month
     * @param y burial year
     * @param a age at burial
     * @param ad address
     * @param st street
     * @param stn street number
     */
    public Person(
            String n, String fn, String mn, String ln,
            int d, int m, int y,
            double a,
            String ad, String st, String stn
    ) {
        name = n;
        firstName = fn;
        middleName = mn;
        lastName = ln;

        burialDay = d;
        burialMonth = m;
        burialYear = y;

        age = a;

        address = ad;
        street = st;
        streetNumber = stn;
    }


    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBurialDay() {
        return burialDay;
    }

    public int getBurialMonth() {
        return burialMonth;
    }

    public int getBurialYear() {
        return burialYear;
    }

    public double getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }


    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }
}
