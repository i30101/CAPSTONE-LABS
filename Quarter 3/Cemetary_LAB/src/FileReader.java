/**
 * @author Andrew Kim
 * @since 27 January 2025
 * @version 1.0.0
 *
 * Cemetery file parser
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {


    private static final String[] months = {
            "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"
    };


    /**
     * Parses cemetery file
     * @param filePath path of file to be read
     * @param startLine line number to start parsing
     * @return Array of Person objects
     */
    public Person[] readFile(String filePath, int startLine) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            for (int i = 0; i < startLine - 1; i++) {
                scanner.nextLine();
            }
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }
}