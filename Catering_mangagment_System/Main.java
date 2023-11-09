import java.util.*;
import java.lang.*;
/*
Disclamer: This is the main file that controlles all the functnality of this System
Aurthor: Rajdeep Singh Sidhu
Date: 09-10-2023
*/
// An interface named Structure is defined.
interface Structure {
    // Two static fields are declared in the interface: price
    // (an ArrayList of Integers) and name (a StringBuilder).
    static ArrayList<Integer> price = new ArrayList<>();
    static StringBuilder name = new StringBuilder();
}

// A class named Main implements the Structure interface.
public class Main implements Structure {
    Main() {
        // Constructor for the Main class. It prints a line to the console.
        System.out.println("\n----------------------------------------------------");
    }

    // A static method named thanks is defined.
    static void thanks() {
        // This method displays a thankYou message to the user.
        System.out.println("\n\t\tThank You For Visiting Us");
        System.out.println("\t\t   Have a nice Day");
        System.out.println("\n====================================================");
    }
}

// A child class named Child extends Main and also implements the Structure interface.
final class Child extends Main implements Structure {

    // A static block that runs when the class is loaded.
    static {
        // This block displays a welcome message to the user.
        System.out.println("\n====================================================");
        System.out.println("\n\t\t\tWelcome to La Fourchette D’or\t");
        System.out.println("\n====================================================");
    }

    Child(int a) {
        // Constructor for the Child class. It displays developer information.
        System.out.println("Developed By: Rajdeep Singh Sidhu");
        System.out.println("Roll no.: R2142220812");
        System.out.println("Sap ID: 500102133");
        System.out.println("Course: AIML");
        System.out.println("Batch: B5");
    }

    Child() {
        // Constructor for the Child class. It calls the constructor of the superclass (Main).
        super();
    }

    // A private static method named dining that returns an integer.
    private static int dining() {
        // This method displays options for dining and returns the user's choice.
        Scanner sc = new Scanner(System.in);
        System.out.println("\n----------------------------------------------------");
        System.out.println("Please Choose your preferred Category of dining");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println(" 1 => McDonald's\n 2 => Starbucks\n 3 => Platters North Restaurant\n 0 => Exit");
        System.out.print("Enter: ");
        int ch = sc.nextInt();
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int ch = dining();
            if (ch == 0) {
                break;
            }
            switch (ch) {
                case 1: {
                    // Create an instance of the McDonald class and call its menu() method.
                    McDonald md = new McDonald();
                    md.menu();
                    break;
                }
                case 2: {
                    // Create an instance of the Starbucks class and call its menu() method.
                    StarBucks md = new StarBucks();
                    md.menu();
                    break;
                }
                case 3: {
                    // Create an instance of the PlattersRestaurant class and call
                    // its menu() method.
                    PlattersRestaurant md = new PlattersRestaurant();
                    md.menu();
                    break;
                }
                default:
                    System.out.println("Unexpected value: " + ch + "\nPlease Try Again");
            }
        }
        Finish(); // Call the Finish() method to display the receipt.
        System.out.println("Do you wanna Know the Developer?");
        System.out.println("Enter [Yes/No]: ");
        String d = sc.nextLine();
        if (d.equalsIgnoreCase("YES")) {
            // Create an instance of the Child class and call its constructor with
            // developer information.
            Child dev = new Child(1);
            thanks(); // Display a thankYou message. when the condition is met
        } else {
            thanks(); // Display a thankYou message.
        }
    }

    // A private static method named Finish.
    private static void Finish() {
        int i = 0;
        String[] str = name.toString().split("_", 0);
        StringTokenizer st = new StringTokenizer(name.toString(), "_");
        int total = 0;

        System.out.println("\n====================================================");
        System.out.println("\t\t\t     Receipt");
        System.out.println("Items:");

        // Split the 'name' StringBuilder using '_' as the delimiter and calculate
        // the total bill.
        while (st.hasMoreElements()) {
            System.out.print("\t");
            System.out.print(st.nextToken());
            System.out.print("\t");
            total += price.get(i);
            System.out.println("Rs: " + price.get(i));
            i++;
        }

        System.out.println("\n----------------------------------------------------");
        System.out.println("Total Bill: \t\t" + total + " Rs");

        // Clear the 'price' ArrayList and reset the 'name' StringBuilder.
        price.clear();
        name.setLength(0);

        // Display a thankYou message.
        thanks();
    }
}
