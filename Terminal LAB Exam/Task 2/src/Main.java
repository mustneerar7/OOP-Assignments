import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    // HOLDS OBJECTS OF DATA READ FROM TEXT FILE
    private static ArrayList<StudentAttendance> atendees = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("attendance.txt"));

        // READING FROM FILE
        while (input.hasNextLine()){
            String roll = input.nextLine();
            String name = input.nextLine();
            String date = input.nextLine();

            // GENERATES OBJECTS AND ADDS TO ARRAYLIST
            atendees.add(new StudentAttendance(roll, name,date));
        }

        // PRINTING AFTER LOADING FROM FILE
        System.out.println("Before sorting");
        for (StudentAttendance t : atendees){
            System.out.println(t);
        }

        //SORTING ARRAYLIST ITEMS
        Collections.sort(atendees, new NameComparator());

        // PRINTING AFTER SORTING THE LOADED DATA
        System.out.println("After sorting");
        for (StudentAttendance t : atendees){
            System.out.println(t);
        }
    }
}
