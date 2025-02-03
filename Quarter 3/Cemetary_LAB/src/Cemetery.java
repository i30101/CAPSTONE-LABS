/**
 * @author Andrew Kim and Matthew Lee
 * @since 3 February 2025
 * @version 1.0.0
 */


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Cemetery {
    private final ArrayList<Person> people;
    private final double[] ages;

    public Cemetery(String filepath, int startLine) {
        people = FileReader.readFile(filepath, startLine);

        ages = new double[people.size()];
        for (int i = 0; i < people.size(); i++) {
            ages[i] = people.get(i).getAge();
        }
    }


    private double average(double[] data) {
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.length;
    }




    /* ****************************************************************

                                NAME METHODS

     **************************************************************** */

    public ArrayList<Person> hasName(String name) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getName().equals(name)) {
                result.add(p);
            }
        }

        return result;
    }

    /**
     * Everyone with desired first name
     * @param name desired first name
     * @return list of people with name
     */
    public ArrayList<Person> hasFirstName(String name) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getFirstName().equals(name)) {
                result.add(p);
            }
        }

        return result;
    }


    /**
     * Everyone with desired last name
     * @param name desired last name
     * @return list of people with name
     */
    public ArrayList<Person> hasLastName(String name) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getLastName().equals(name)) {
                result.add(p);
            }
        }

        return result;
    }





    /* ****************************************************************

                                AGE METHODS

     **************************************************************** */


    /**
     * Finds average age
     * @return age
     */
    public double getAverageAge() {
        return average(ages);
    }


    /**
     * Finds everyone with a given age
     * @param age given age
     * @return number of people
     */
    public int isAge(int age) {
        int count = 0;
        for (Person p : people) {
            if (p.getAge() == age) {
                count++;
            }
        }

        return count;
    }


    /**
      * Finds everyone younger than a given age
      * @param age maximum age
      * @return number of people
     */
    public int youngerThanAge(int age) {
        int count = 0;
        for (Person p : people) {
            if (p.getAge() < age) {
                count++;
            }
        }

        return count;
    }


    /**
     * Finds everyone older than a given age
     * @param age minimum age
     * @return number of people
     */
    public int olderThanAge(int age) {
        int count = 0;
        for (Person p : people) {
            if (p.getAge() > age) {
                count++;
            }
        }

        return count;
    }




    /* ****************************************************************

                                ADDRESS METHODS

     **************************************************************** */


    /**
     * Finds everyone with given address
     * @param address desired address
     * @return list of people with address
     */
    public ArrayList<Person> hasAddress(String address) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getAddress().contains(address)) {
                result.add(p);
            }
        }

        return result;
    }


    /* ****************************************************************

                                SORTING METHODS

     **************************************************************** */


    /**
     * Sorts people by first name
     * @return list of people
     */
    public ArrayList<Person> sortFirstName() {
        people.sort(new Person.firstNameComparator());
        return people;
    }


    /**
     * Sorts people by last name
     * @return list of people
     */
    public ArrayList<Person> sortLastName() {
        people.sort(new Person.lastNameComparator());
        return people;
    }


    /**
     * Sorts people by burial date
     * @return list of people
     */
    public ArrayList<Person> sortBurialDate() {
        people.sort(new Person.burialDateComparator());
        return people;
    }


    /**
     * Sorts people by age
     * @return list of people
     */
    public ArrayList<Person> sortAge() {
        people.sort(new Person.ageComparator());
        return people;
    }


    /**
     * Sorts people by address
     * @return list of people
     */
    public ArrayList<Person> sortAddress() {
        people.sort(new Person.addressComparator());
        return people;
    }



    /* ****************************************************************

                                ACCESSOR METHODS

     **************************************************************** */

    public ArrayList<Person> getPeople() {
        return people;
    }


    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (Person p : people) {
            output.append(p.toString()).append("\n");
        }

        return output.toString();
    }
}
