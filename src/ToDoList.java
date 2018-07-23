import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();


        String all = "";
        int lowPriority = 0;
        int mediumPriority = 0;
        int highPriority = 0;
        int itemsComplete = 0;
        int itemsNotCompleted = 0;

        String input = "";
        ArrayList<String> items = new ArrayList<String>();
        ArrayList<String> category = new ArrayList<String>();
        ArrayList<String> priorityy = new ArrayList<String>();
        ArrayList<Boolean> isDone = new ArrayList<Boolean>();

        while(!input.equalsIgnoreCase("q")){

            int assignedPriority = rand.nextInt(3);
            String priority;
            if (assignedPriority ==0){
                priorityy.add("low");
                lowPriority++;}
            else if(assignedPriority == 1){
                priorityy.add("medium");
                mediumPriority++;
            }else {
                priorityy.add("high");
                highPriority++;
            }

            printer("Enter the item you have to do");
            items.add(keyboard.next());
            printer("Enter the category of this item");
            category.add(keyboard.next());
            printer("Your assigned priority is" + " " + assignedPriority);
            printer("Is this item completed? (true or false)");
            isDone.add(keyboard.nextBoolean());

            System.out.println("Do you have another item? Enter q or quit to exit");
            input = keyboard.next();




      }



        int isTrue = Collections.frequency(isDone, true);
        int isFalse = Collections.frequency(isDone, false);

        System.out.println("\n\n" + "===============================================================" + "\n" +
                "Item Name" + "\t" + "Category" + "\t" + "Priority" + "\t" + "Done");
        for (int i=0; i<items.size(); i++) {
            System.out.println(items.get(i) + "\t\t" + category.get(i) +"\t\t" + priorityy.get(i) + "\t\t" + isDone.get(i)) ;
        }

        System.out.println("\n" + "Low-level: " + lowPriority  + " Medium-Leve: " + mediumPriority + " High-Level: " + highPriority + "\n"
                + "# of items completed: " + isTrue + "\n" + "# of items completed: " + isFalse);
        }


    private static void printer (String message){
        System.out.println(message);
    }


}
