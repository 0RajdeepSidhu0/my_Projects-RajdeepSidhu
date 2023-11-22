package Practice.projects;
import java.util.*;

/*
Disclamer: This is a to do list program that helps you to keep the track of the day's tasks
 */

//Author: Rajdeep Singh Sidhu
//Date: 14-10-2023
public class ToDoApp {
    private ArrayList<String> todo = new ArrayList<>();
    //private String[] state;
   private ArrayList<String> state = new ArrayList<>();
    private int itration =0;
    boolean check(){
        return itration <= 0;
    }
    boolean bound(int x){return x>itration || x<0;}
    void addTask(String str){
        System.out.println("-------------------------------------------");
        todo.add(str);
        state.add("Not Done"); itration+=1;
        System.out.println("\nTask has been Successfully add to the list");
    }
    void mark(int change){
        state.set(change,"Done");
        System.out.println("The Task "+todo.get(change)+" has been marked done");
    }
    void delete(int del){
        System.out.println("The Task "+todo.get(del)+" has been removed");
        todo.remove(del);
        state.remove(del);
        itration--;
    }

    void displayTask(){

        System.out.println("-------------------------------------------");
        System.out.println("\t\t\tTo Do LIst\n");
        int i;
        for(i=0;i<itration; i++){
            System.out.println(i+": "+todo.get(i)+"\t:\t["+state.get(i)+"]");
        }
        System.out.println("\nTotal number of tasks:\t"+i);
    }


}
class Control_ToDoApp{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;int ch2; int x=1;
        String task;
        ToDoApp obj = new ToDoApp();
        while(x==1){
            System.out.println("-------------------------------------------");
            System.out.println("What do you wanna Do?");
            System.out.println("\t1\t:\tTo Add a new Task ");
            System.out.println("\t2\t:\tTo Mark a Task as Done");
            System.out.println("\t3\t:\tTo Delete a Task");
            System.out.println("\t4\t:\tTo Display all the Tasks");
            System.out.println("\t5\t:\tTo exit\n");
            System.out.print("Enter:\t");
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    sc.nextLine();
                    System.out.println("-------------------------------------------");
                    System.out.println("Enter the task you want to add.");
                    System.out.print("Enter:\t");
                    task = sc.nextLine();
                    obj.addTask(task);
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    if(obj.check()){
                        System.out.println("List is Empty");
                        continue;
                    }
                    obj.displayTask();
                    System.out.println("Enter the number of the task you want to mark as done.");
                    System.out.print("Enter:\t");
                    ch2 = sc.nextInt();
                    obj.mark(ch2);
                    break;
                case 3:
                    System.out.println("-------------------------------------------");
                    if(obj.check()){
                        System.out.println("List is Empty");
                        continue;
                    }
                    obj.displayTask();
                    System.out.println("Enter the task you want to delete.");
                    System.out.print("Enter:\t");
                    ch2 = sc.nextInt();
                    if(obj.bound(ch2)){
                        System.out.println("Entered index is not available,\nPlease enter an Valid Index"); continue;
                    }
                    obj.delete(ch2);
                    break;
                case 4:
                    System.out.println("-------------------------------------------");
                    if(obj.check()){
                        System.out.println("List is Empty");
                        continue;
                    }
                    obj.displayTask();
                    break;
                case 5:
                    x=0;
                    System.out.println("ThankYou for using our service");
                    break;
                default:
                    System.out.println("!!Invalid Input!!");

            }
        }
    }
    //Author: Rajdeep Singh Sidhu
    //Date: 14-10-2023
}
