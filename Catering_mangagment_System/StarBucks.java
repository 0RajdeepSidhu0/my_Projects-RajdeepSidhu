package SEM3.assignment1;
import java.util.*;

//Author: Rajdeep Singh Sidhu
//Date: 11-10-2023
public class StarBucks implements Structure{
    // A static block that runs when the class is loaded to display a welcome message.
    static {
        System.out.println("\n====================================================");
        System.out.println("\n\t\t\tWelcome to StarBucks");
    }
    static Scanner sc = new Scanner(System.in);
    // A method named StarBucks_manu to display the main menu categories.
    void StarBucks_manu(){
        // Display the main menu categories.
        System.out.println("\n----------------------------------------------------");
        System.out.println("*Menu*");
        System.out.println("Disclaimer: Please Type your choices\n");
        System.out.println(">  Drinks");
        System.out.println(">  Food");
        System.out.println(">  At Home Coffee");
        System.out.println(">  Back");
    }
    // A method named drinks to handle the selection and pricing of drink items.
     int drinks() {
         // Display drink options and get the user's choice.
         System.out.println("\n----------------------------------------------------");
         System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => Oleato\t\t\tRs: 75.00");
        System.out.println("2 => Hot Coffee\t\tRs: 60.00");
        System.out.println("3 => Hot Teas\t\tRs: 85.00");
        System.out.println("4 => Cold Coffee\tRs: 90.00");
        System.out.println("5 => Cold Tea\t\tRs: 87.00");
        System.out.println("6 => Frappuccino\tRs: 84.00");
        System.out.println("0 => Back");
         System.out.print("Enter: ");
        int ch = sc.nextInt();
        if(ch>6 || ch<0){
            System.out.println("Invalid Input");
        }
        else if(ch == 0){
            return 0;
        }
        switch (ch){
            case 1:{
                name.append("Oleato_");
                price.add(75);
                 break;
            }
            case 2:{
                name.append("Hot Coffee_");
                price.add(60);
                break;
            }
            case 3:{
                name.append("Hot tea_");
                price.add(85);
                break;
            }
            case 4:{
                name.append("Cold Coffee_");
                price.add(90);break;
            }
            case 5:{
                name.append("Cold Tea_");
                price.add(87);break;
            }
            case 6:{
                name.append("Frappuccino_");
                price.add(84);
                break;
            }
        }
        return ch;
    }
    // A method named food to handle the selection and pricing of food items.
    int food(){
        // Display food options and get the user's choice.
        System.out.println("\n----------------------------------------------------");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => Cream Puff Roll\t\tRs: 30.00");
        System.out.println("2 => Chocolate donut\t\tRs: 60.00");
        System.out.println("3 => Chocolate Pastry\t\tRs: 50.00");
        System.out.println("4 => Cheese Cake Slice\t\tRs: 65.00");
        System.out.println("5 => Choco lava Cake\t\tRs: 70.00");
        System.out.println("6 => Vanilla Ice Cream\t\tRs: 40.00");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
        int ch = sc.nextInt();
        if(ch>6 || ch<0){
            System.out.println("Invalid Input");
        }
        else if(ch == 0){
            return 0;
        }
        switch (ch){
            case 1:{
                name.append("Cream Puff Roll_");
                price.add(30);
                break;
            }
            case 2:{
                name.append("Chocolate donut_");
                price.add(60);
                break;
            }
            case 3:{
                name.append("Chocolate Pastry_");
                price.add(50);
                break;
            }
            case 4:{
                name.append("Cheese Cake Slice_");
                price.add(65);break;
            }
            case 5:{
                name.append("Choco lava Cake_");
                price.add(70);break;
            }
            case 6:{
                name.append("Vanilla Ice Cream_");
                price.add(40);
                break;
            }
        }
        return ch;

    }
    // A method named atHomeCoffee to handle the selection of at-home coffee items.
    int atHomeCoffee(){
        // Display at-home coffee options and get the user's choice.
        System.out.println("\n----------------------------------------------------");
        System.out.println("Choice");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => Whole Bean\t\t\t Rs 355");
        System.out.println("2 => VIA Instant Blend\t Rs 239");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
        int ch = sc.nextInt();
        if(ch == 0){
            return 0;
        }
        else if(ch>2 || ch <0){
            System.out.println("Invalid input");

        }
        else{
            if(ch == 1){
                name.append("Whole Beans_");
                price.add(355);
            }
            else{
                name.append("VIA Instant Blend_");
                price.add(239);
            }
        }
        return ch;
    }
    //this method is to clear the memory
    void verify(){
        System.out.print("Please press enter key");
    }
    // A method named menu to handle the overall menu flow.
    public void menu(){
        // Handle the overall menu flow, including category selection and food item
        // selection.
        String ch; int k=1;
        while(true){
            StarBucks obj = new StarBucks();
            obj.StarBucks_manu();
            if(k==1){
                obj.verify();
                k--;
            }
            sc.nextLine();
            System.out.print("Enter: ");
            ch = sc.nextLine();
            if (ch.equalsIgnoreCase("Back")){
                break;
            }
            else if (ch.equalsIgnoreCase("Drinks")){
                int x = obj.drinks();
                if(x == 0){
                    continue;
                }
            }
            else if (ch.equalsIgnoreCase("Food")){
               int x =  obj.food();
                if(x == 0){
                    continue;
                }
            }
            else if (ch.equalsIgnoreCase("At Home Coffee")){
                int x = obj.atHomeCoffee();
                if(x == 0){
                    continue;
                }
            }
            else {
                System.out.println("!! Invalid Input !!");
            }

        }
//Author: Rajdeep Singh Sidhu
//Date: 11-10-2023
    }
}
