import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    // STORES RECORDS OF PETS LOADED OR WRITTEN TO FILE
    private static ArrayList<Pet> pets = new ArrayList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // THE MAIN MENU
        while(true){

            System.out.println("1 - Read pets record from file");
            System.out.println("2 - Write pets record to file");
            System.out.println("3 - Write records [Sorted by age]");
            System.out.println("4 - Write records [Sorted by name]");
            System.out.println("5 - Exit");
            System.out.print ("Select an option: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice == 1){
                readData();
                printData();
            }
            if (choice == 2){
                writeData();
            }
            if (choice == 3){
                sortByAge();
                printData();
                writeData();
            }
            if (choice == 4){
                sortByName();
                printData();
                writeData();
            }
            if(choice == 5){
                System.out.println("Exiting...");
                break;
            }
        }

    }

    // WRITE OBJECTS TO FILE
    private static void writeData() throws IOException, ClassNotFoundException{

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("pets.dat"));

        //objectOutputStream.writeObject(new Pet("Samy", 10, 20));
        //objectOutputStream.writeObject(new Pet("Fred", 30, 70));
        //objectOutputStream.writeObject(new Pet("Lilly", 20, 50));

        for(Pet p : pets){
            if(pets.size() > 5){
                System.out.println("Cannot save more than 5 entries at a time.");
            }
            objectOutputStream.writeObject(p);
        }

        pets.clear();
        objectOutputStream.close();

    }

    // READS OBJECTS FROM FILE
    private static void readData() throws IOException, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("pets.dat"));

        pets.clear();

        try{
            while (true){
                Pet p = (Pet)objectInputStream.readObject();
                pets.add(p);
            }
        }
        catch (EOFException e){
            System.out.println("Object read complete.");
        }
        finally {
            objectInputStream.close();
        }
    }

    // PRINTS LOADED DATA ON SCREEN
    private static void printData(){
        for (Pet p : pets)
            System.out.println(p);
    }

    // SORTS ELEMENTS OF ARRAYLIST BY AGE
    private static void sortByAge(){
        AgeComparator sortByAge = new AgeComparator();
        Collections.sort(pets, sortByAge);
    }

    // SORTS ELEMENTS OF ARRAYLIST BY NAME
    private static void sortByName(){
        NameComparator petsComparator = new NameComparator();
        pets.sort(petsComparator);
    }
}