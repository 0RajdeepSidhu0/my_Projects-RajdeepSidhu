
import java.util.*;

public class McDonald implements Structure{
    // A static block that runs when the class is loaded to display a welcome message.
    static {
        System.out.println("\n====================================================");
        System.out.println("\n  \t\t\tWelcome to McDonald's");
    }
    // A method named catagory to display food categories and get the user's choice.
    public void catagory(){
        // Display food categories and get the user's choice.
        // This method displays categories like Burgers, Fries, and Beverages.
        System.out.println("\n----------------------------------------------------");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => Burgers");
        System.out.println("2 => Fries");
        System.out.println("3 => Beverages");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
    }
    // A private static method named Burgers to handle the selection and pricing of burger items.
    private static int Burgers() {
        // Display burger options and get the user's choice.
        // This method handles the selection and pricing of burger items.
        System.out.println("\n----------------------------------------------------");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => McAloo Tikki Burger Rs: 47.00");
        System.out.println("2 => Dosa Masala Burger Rs: 76.00");
        System.out.println("3 => Veg Surprise Burger Rs: 85.00");
        System.out.println("4 => Veg Double Burger Rs: 90.00");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch>4 || ch<0){
            System.out.println("Invalid Input");
        }
        else if(ch == 0){
            return 0;
        }
        switch (ch) {
            case 1:
                name.append("McAloo Tikki Burger_");
                price.add(47);
                break;
            case 2:
                name.append("Dosa Masala Burger_");
                price.add(76);
                break;
            case 3:
                name.append("Veg Surprise Burger_");
                price.add(85);
                break;
            case 4:
                name.append("Veg Double Burger_");
                price.add(90);
                break;
        }
        return ch;
    }
    // A private static method named fries to handle the selection and pricing of
    // fries items.
    private static int fries() {
        // Display fries options and get the user's choice.
        // This method handles the selection and pricing of fries items.
        System.out.println("\n----------------------------------------------------");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => Small Fires Rs: 58.00");
        System.out.println("2 => Medium Fires Rs: 86.00");
        System.out.println("3 => large Fries Rs: 100.00");
        System.out.println("4 => Cheesy Fries Rs: 95.00");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch>4 || ch<0){
            System.out.println("Invalid Input");
        }
        else if(ch == 0){
            return 0;
        }
        switch (ch) {
            case 1:
                name.append("Small Fires_");
                price.add(58);
                break;
            case 2:
                name.append("Medium Fires_");
                price.add(86);
                break;
            case 3:
                name.append("large Fries_");
                price.add(100);
                break;
            case 4:
                name.append("Cheesy Fries_");
                price.add(95);
                break;
        }
        return ch;

    }
    // A private static method named Beverages to handle the selection and pricing
    // of beverage items.
    private static int Beverages() {
        // Display beverage options and get the user's choice.
        // This method handles the selection and pricing of beverage items.
        System.out.println("\n----------------------------------------------------");
        System.out.println("Disclaimer: Please Enter the numbers only\n");
        System.out.println("1 => Black Coffee Rs: 60.00");
        System.out.println("2 => Cold Coffee Rs: 90.00");
        System.out.println("3 => Slush Rs: 70.00");
        System.out.println("4 => Ice Tea Cold Rs: 80.00");
        System.out.println("0 => Back");
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
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
                price.add(60);
                break;
            case 2:
                name.append("Cold Coffee_");
                price.add(90);
                break;
            case 3:
                name.append("Slush_");
                price.add(70);
                break;
            case 4:
                name.append("Ice Tea Cold_");
                price.add(80);
                break;
        }
        return ch;
    }
    // A method named menu to handle the overall menu flow.
    public void menu(){
        // Handle the overall menu flow, including category selection and
        // food item selection.
        Scanner sc = new Scanner(System.in);
        int ch; int food;
        McDonald obj = new McDonald();
         while(true){
            obj.catagory();
            ch = sc.nextInt();
            if (ch == 0){
                break;
            }

            switch (ch){
                case 1:{
                    food = Burgers();
                    if(food == 0 ){
                        break;
                    }
                    break;
                }
                case 2:{

                    food = fries();
                    if(food == 0 ){
                        break;
                    }
                    break;
                }
                case 3:{
                    food = Beverages();
                    if(food == 0 ){
                        break;
                    }
                    break;
                }
                default:
                    System.out.println("Unexpected value: " + ch +"\nPlease Try Again");
            }
        }

    }
}

