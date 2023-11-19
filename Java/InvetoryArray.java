import java.util.Scanner;
import java.util.Arrays;

public class InvetoryArray {
    public static void main(String[] args) {
        String[] petList = new String[100];
        int animalNum = 0;
        Scanner ui = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equals("q")) {
            System.out.println("What would you like to do? (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear, (v)iew, or (q)uit");
            userInput = ui.nextLine();
            if (userInput.equals("a")) {
                if (animalNum < petList.length) {
                    System.out.print("Enter your pet's name that you want to add: ");
                    String name = ui.nextLine();
                    petList[animalNum] = name;
                    animalNum++;
                    System.out.println(name + " added to the database!");
                } else {
                    System.out.println("Database is full. Cannot add more pets.");
                }
            } else if (userInput.equals("i")) {
                System.out.print("Enter the position where you want to insert: ");
                int position = Integer.parseInt(ui.nextLine())-1;
                if (position >= 0 && position <= animalNum && animalNum < petList.length) {
                    System.out.print("Enter the pet's name to insert: ");
                    String name = ui.nextLine();
                    //moving animals after the given position so that one doesn't get deleted
                    for (int i = animalNum; i > position; i--) {
                        petList[i] = petList[i - 1];
                    }
                    petList[position] = name;
                    animalNum++;
                    position++;
                    System.out.println(name + " inserted at " + position);
                } else {
                    System.out.println("Invalid position.");
                }
            } else if (userInput.equals("r")) {
                System.out.print("Enter the pet's name to remove: ");
                String name = ui.nextLine();
                int index = -1;
                for (int i = 0; i < animalNum; i++) {
                    if (petList[i] != null && petList[i].equals(name)) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    // moving the pet being removed to the end
                    for (int i = index; i < animalNum - 1; i++) {
                        petList[i] = petList[i + 1];
                    }
                    petList[animalNum - 1] = null; 
                    animalNum--;
                    System.out.println(name + " removed from the database.");
                } else {
                    System.out.println("Animal not found.");
                }
            } else if (userInput.equals("p")) {
                System.out.print("Who would you like to replace? ");
                String replacee = ui.nextLine();
                int index = -1;
                for (int i = 0; i < animalNum; i++) {
                    if (petList[i] != null && petList[i].equals(replacee)) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    System.out.print("What name would you like to replace it with? ");
                    String replacer = ui.nextLine();
                    petList[index] = replacer;
                    System.out.println(replacee + " replaced with " + replacer);
                } else {
                    System.out.println("Animal not found.");
                }
            } else if (userInput.equals("c")) {
                Arrays.fill(petList, 0, animalNum, null);
                animalNum = 0;
                System.out.println("Database cleared.");
            } else if (userInput.equals("v")) {
                //https://www.w3docs.com/snippets/java/get-only-part-of-an-array-in-java.html taught me how to get only part of an array
                String[] animals = Arrays.copyOfRange(petList, 0, animalNum);  
                System.out.println("Current database: " + Arrays.toString(animals));
            } else if (!userInput.equals("q")){
                System.out.println("Please choose a correct option.");
            }
        }
        System.out.println("bye bye");
    }
}

