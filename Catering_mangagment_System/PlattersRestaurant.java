package SEM3.assignment1;
import java.util.Scanner;
//Author: Rajdeep Singh Sidhu
//Date: 10-10-2023
public class PlattersRestaurant implements Structure{
    // A static block that runs when the class is loaded to display a welcome message.
    static {
        System.out.println("\n====================================================");
        System.out.println("\n  \t\tWelcome to Platters North");
    }
    static Scanner sc = new Scanner(System.in);
    static  int p;
    // A method named items to display the main menu categories.
    public void items(){
        // Display the main menu categories.
        System.out.println("\n----------------------------------------------------");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => Starters");
        System.out.println("2 => Beverages");
        System.out.println("3 => Main Coerce");
        System.out.println("4 => Roti / Bread");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
    }

    // A method named Starters to handle the selection and pricing of starter items.
    static int Starters() {
        // Display starter options and get the user's choice.
        System.out.println("\n----------------------------------------------------");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 =>Vegetable Soup\tRs: 60.00 (per Bowl)");
        System.out.println("2 => Panner Chilli\tRs: 75.00 (8 pieces)");
        System.out.println("3 => Manchurian\t\tRs: 70.00 (per plate)");
        System.out.println("4 => Garlic Bread\tRs: 80.00 (10 pieces)");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
        int ch = sc.nextInt();
        if(ch>4 || ch<0){
            System.out.println("Invalid Input");
        }
        else if(ch == 0){
            return 0;
        }
        int p = 0;
        switch (ch) {
            case 1:
                name.append("Vegetable Soup_");
                 p = 60; items(p);
                break;
            case 2:
                name.append("Panner Chilli_");

                p = 75; items(p);
                break;
            case 3:
                name.append("Manchurian_");
                p = 70; items(p);
                break;
            case 4:
                name.append("Garlic Bread_");
                p = 80; items(p);
                break;
            default:
                System.out.println("Unexpected value: " + ch +"\nPlease Try Again");
        }
        return ch;
    }
    // A method named main to handle the selection and pricing of main course items.
    static int main() {
        // Display main course options and get the user's choice.
        System.out.println("\n----------------------------------------------------");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => Dal Fri\t\tRs: 65.00 (per serving)");
        System.out.println("2 => Shai Panner\tRs: 80.00 (per serving)");
        System.out.println("3 => Mix Veg\t\tRs: 70.00 (per serving)");
        System.out.println("4 => Malai Kofta\tRs: 90.00 (per serving)");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
        int ch = sc.nextInt();
        if(ch>4 || ch<0){
            System.out.println("Invalid Input");
        }
        else if(ch == 0){
            return 0;
        }

        switch (ch) {
            case 1:
                name.append("Dal Fri_");
                p = 65; items(p);
                break;
            case 2:
                name.append("Shai Panner_");

                p = 80; items(p);
                break;
            case 3:
                name.append("Mix Veg_");
                p = 70; items(p);
                break;
            case 4:
                name.append("Malai Kofta_");
                p = 90; items(p);
                break;
            default:
                System.out.println("Unexpected value: " + ch +"\nPlease Try Again");
        }
        return ch;
    }
    // A method named Beverages to handle the selection and pricing of beverage items.

    static int Beverages() {
        System.out.println("\n----------------------------------------------------");
        // Display beverage options and get the user's choice.
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => Black Coffee\t\t\tRs: 60.00");
        System.out.println("2 => Cold Coffee\t\t\tRs: 90.00");
        System.out.println("3 => Chach (khati Lassi)\tRs: 50.00");
        System.out.println("4 => Rose Sweet lassi\t\tRs: 70.00");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
        int ch = sc.nextInt();
        if(ch>4 || ch<0){
            System.out.println("Invalid Input");
        }
        else if(ch == 0){
            return 0;
        }
        switch (ch) {
            case 1:
                name.append("Black Coffee_");
                p = 60; items(p);
                break;
            case 2:
                name.append("Cold Coffee_");
                p = 90; items(p);
                break;
            case 3:
                name.append("Chach / khati Lassi_");
                p = 50; items(p);
                break;
            case 4:
                name.append("Rose Sweet lassi_");
                p = 70; items(p);
                break;
            default:
                System.out.println("Unexpected value: " + ch +"\nPlease Try Again");

        }
        return ch;
    }
    // A method named roti to handle the selection and pricing of roti/bread items.

    private static int roti(){
        System.out.println("\n----------------------------------------------------");
        // Display roti/bread options and get the user's choice.
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => tanduri roti Rs: 05.00 (per piece)");
        System.out.println("2 => rumali roti  Rs: 07.00 (per piece)");
        System.out.println("3 => Butter naan  Rs: 10.00 (per piece)");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
        int ch = sc.nextInt();
        if(ch>4 || ch<0){
            System.out.println("Invalid Input");
        }
        else if(ch == 0){
            return 0;
        }
        switch (ch) {
            case 1:
                name.append("tanduri roti_");
                p = 5; items(p);
                break;
            case 2:
                name.append("rumali roti_");
                p = 7; items(p);
                break;
            case 3:
                name.append("Butter naan_");
                p = 10; items(p);
                break;

            default:
                System.out.println("Unexpected value: " + ch +"\nPlease Try Again");
        }
        return ch;
    }
    // A method named items to handle the selection of portion size and calculate the total price.
    private static void items(int a){
        // Calculate the total price based on the portion size and servings.
        System.out.println("Note: By default any chosen portion size is 1 and can not be less then that.");
        System.out.print("Enter number of servings : ");
        int ser = sc.nextInt();
        if(ser<=0){
            price.add(a*1);
        }
        else{
            price.add(a*ser);
        }
    }
    // A method named menu to handle the overall menu flow.
    public void menu(){
        // Handle the overall menu flow, including category selection and food item selection.2
        int ch; int food;
        PlattersRestaurant obj = new PlattersRestaurant();
        while(true){
            obj.items();
            ch = sc.nextInt();
            if (ch == 0){
                break;
            }

            switch (ch){
                case 1:{
                    food = Starters();
                    if(food == 0 ){
                        break;
                    }
                    break;
                }
                case 2:{
                    food = Beverages();
                    if(food == 0 ){
                        break;
                    }
                    break;
                }
                case 3:{
                    food = main();
                    if(food == 0 ){
                        break;
                    }
                    break;
                }
                case 4:{
                    food = roti();
                    if(food == 0){
                        break;
                    }
                }
                default:
                    System.out.println("Unexpected value: " + ch +"\nPlease Try Again");
            }
        }

    }
}
