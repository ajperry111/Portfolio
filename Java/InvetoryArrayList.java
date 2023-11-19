import java.util.Scanner;
import java.util.ArrayList;

public class InvetoryArrayList {
    public static void main(String[] args) {
        ArrayList<String> petList = new ArrayList<String>();
        Scanner ui = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("q")) {
            System.out.println("What would you like to do? (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear, (v)iew, or (q)uit");
            userInput = ui.nextLine();
          
            if (userInput.equals("a")) {
                System.out.print("Enter your pet's name that you want to add: ");
                String name = ui.nextLine();
                petList.add(name);
                System.out.println(name + " added to the database!");
            } else if (userInput.equals("i")) {
                System.out.print("Enter the position where you want to insert: ");
                int position = Integer.parseInt(ui.nextLine())-1;

                if (position >= 0 && position <= petList.size()) {
                    System.out.print("Enter the pet's name to insert: ");
                    String name = ui.nextLine();
                    petList.add(position, name);
                    position++;
                    System.out.println(name + " inserted at " + position);
                } else {
                    System.out.println("Invalid position.");
                }
            } else if (userInput.equals("r")) {
                System.out.print("Enter the pet's name to remove: ");
                String name = ui.nextLine();

                if (petList.contains(name)) {
                    petList.remove(name);
                    System.out.println(name + " removed from the database.");
                } else {
                    System.out.println("Animal not found.");
                }
            } else if (userInput.equals("p")) {
                System.out.print("Who would you like to replace? ");
                String replacee = ui.nextLine();

                if (petList.contains(replacee)) {
                    System.out.print("What name would you like to replace it with? ");
                    String replacer = ui.nextLine();
                    int index = petList.indexOf(replacee);
                    petList.set(index, replacer);
                    System.out.println(replacee + " replaced with " + replacer);
                } else {
                    System.out.println("Animal not found.");
                }
            } else if (userInput.equals("c")) {
                petList.clear();
                System.out.println("Database cleared.");
            } else if (userInput.equals("v")) {
                System.out.println("Current database: " + petList);
            } else if (!userInput.equals("q")){
                System.out.println("Please choose a correct option.");
            }
        }
        System.out.println("bye bye");
    }
}
