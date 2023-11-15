import java.util.Scanner;
import java.util.ArrayList;

public class Inventory {
    public static void main(String[] args){
        //Program that keeps track of the animals at the Vet
        //  add, insert, remove, replace, clear the db
        //  if the user types in quit -> the program ends
        ArrayList<String> petList = new ArrayList<String>();
        Scanner ui = new Scanner(System.in);
        String userInput ="";

        while(!userInput.equals("q")){
            System.out.println("What would you like to do? (a)dd, (i)nsert, (r)emove, Re(p)lace, (C)lear, (v)iew, or (q)uit");
            userInput=ui.nextLine();

            if(userInput.equals("a")){
                System.out.println("add");
            }
            else if(userInput.equals("i")){
                System.out.println("insert");
            }
            else if(userInput.equals("p")){
                System.out.println("replace");
            }
            else if(userInput.equals("c")){
                System.out.println("clear");
            }
            else if(userInput.equals("v")){
                System.out.println("view");
            }
            else{
                System.out.println("Please choose a correct answer");
            }
            userInput = ui.nextLine();
        }
        System.out.println("bye bye");
    }
}
