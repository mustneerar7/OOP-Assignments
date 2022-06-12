import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args){

        try {
            readNumbers();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }

        removeDuplicates();
        reverseOrder();

        try {
            writeNumbers();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
    private static void readNumbers() throws IOException{
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter input file name: ");
        String fileName = userInput.nextLine();

        Scanner inData = new Scanner(new File(fileName));

        while (inData.hasNextInt()){
            numbers.add(inData.nextInt());
        }
        inData.close();
    }
    private static void printNumbers(){
        for (int n : numbers)
            System.out.print(n + "\t");
    }
    private static void removeDuplicates(){

        int j = 1;
        for (int i = 0; i < numbers.size() - 1; ++i){

            if (numbers.get(i) == numbers.get(j)){
                numbers.remove(i);
            }
            ++j;
        }
    }

    private static void reverseOrder(){
        Stack<Integer> tmp = new Stack<Integer>();

        for (int i : numbers){
            tmp.push(i);
        }

        int length = numbers.size();
        numbers.clear();

        for (int i = 0; i < length; ++i){
            numbers.add(tmp.pop());
        }

    }

    private static void writeNumbers()throws IOException{
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter output file name: ");
        String fileName = userInput.nextLine();

        PrintWriter printWriter = new PrintWriter(new File(fileName));

        for (int i : numbers){
            printWriter.println(i);
        }

        printWriter.close();
    }
}
