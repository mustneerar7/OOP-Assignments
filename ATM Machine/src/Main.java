import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating an array of type Account
        Account[] accounts = new Account[10];

        // filling the array with objects
        for (int i = 0; i < accounts.length; ++i){
            accounts[i] = new Account(
                    "Account " + Integer.toString(i),
                    100.00);
        }

        // the home menu
        while (true){

            System.out.print("Enter an ID: ");
            int id = sc.nextInt();

            // sub-menu
            while(true){

                if(id >= 0 && id <= 9){

                    System.out.println("\nMain menu");

                    System.out.println("1. check balance");
                    System.out.println("2. withdraw");
                    System.out.println("3. deposit");
                    System.out.println("4. exit");

                    System.out.print("Enter a choice: ");

                    int choice = sc.nextInt();

                    // sub-menu options
                    if(choice == 1){
                        accounts[id].printBalance();
                    }
                    if(choice == 2){
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        accounts[id].withdrawBalance(amount);
                    }
                    if(choice == 3){
                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        accounts[id].deposit(amount);
                    }
                    if(choice == 4){
                        break;
                    }
                }
                else{
                    System.out.println(
                            "Invalid id.\nTry something between 0-9. ");
                    break;
                }
            }
        }
    }
}
