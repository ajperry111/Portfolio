import java.util.Scanner;
import java.util.ArrayList;

public class InvetoryArrayList {
     public static void main(String[] args) {
          //Program that keeps track of the animals at the Vet
          //   add, insert, remove, replace, clear the db
          //   if the user types in quit -> the program ends  
          /*Finish the starter code attached Invetory.java utilizing two different versions.  
          The first version should be built utilizing the ArrayList petList (ArrayList<String> petList).  
          The second version is utilizing Arrays petList(String[] petList).  
          Please indicate the which file is which by naming it InvetoryArray.java and InvetoryArrayList.java.  

          What to submit:
          Both versions of the program.
          A slideshow comparing each action (add, insert, remove, replace, clear, view) of the programs.  
          For example, on one slide you can show the algorithm to "add" an item to the list. 
          On that same slide you will need to explain 2 difference and 2 similarities between the two data types.  Please explain in detail. */    
          ArrayList<String> petList = new ArrayList<String>();
          Scanner ui = new Scanner(System.in);
          String userInput = "";

          while(!userInput.equals("q")){
               System.out.println("What would you like to do? (a)dd,(i)nsert,(r)emove,Re(p)lace,(c)lear,(v)iew, or (q)uit");
               userInput=ui.nextLine();

               if(userInput.equals("a")){
                    System.out.println("add");
               }else if(userInput.equals("i")){
                    System.out.println("insert");
               }else if(userInput.equals("r")){
                    System.out.println("remove");
               }else if(userInput.equals("p")){
                    System.out.println("replace");
               }else if(userInput.equals("c")){
                    System.out.println("clear");
               }else if(userInput.equals("v")){
                    System.out.println("view");
               }else{
                    System.out.println("Please choose a correct answer");
               }
               
               userInput = ui.nextLine();
          }
          System.out.println("bye bye");
     }     
}