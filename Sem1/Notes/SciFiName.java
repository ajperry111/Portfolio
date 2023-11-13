package Unit1.Notes;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class SciFiName {
    public static void main(String[] args) {
        /*Take in user input for the following information
         *  FirstName
         *  LastName
         *  City
         *  School
         *  Pets Name
         *  Sibling Name
         Print the info to test if it works
         */
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        String firstName = ui.nextLine();
        System.out.println("Enter your lastname: ");
        String lastName = ui.nextLine();
        System.out.println("Enter your city: ");
        String city = ui.nextLine();
        System.out.println("Enter your school: ");
        String school = ui.nextLine();
        System.out.println("Enter your pet's name: ");
        String pet = ui.nextLine();
        System.out.println("Enter your sibling's name: ");
        String sibling = ui.nextLine();
        //System.out.printf("%s %s %s %s %s %s",firstName,lastName,city,school,pet,sibling);

        /*
         * SciFi Name Generator
         * SciFiFirstName = a portion of the FirstName and LastName
         * SciFiLastName = a portion of the City and School
         * SciFiOrigin = a portion of the PetName and SiblingName
         * 
         * prints out >> SciFiFirstName SciFiLastName from the planet SciFiOrigin
         * 
         * a portion means a random portion of that String
         *   because we need this name to be a unique name, so each time
         *   you run the program a new name will be generated
         */
        Random randy = new Random();
        int firstPortion = randy.nextInt(firstName.length());
        int lastPortion = randy.nextInt(lastName.length());
        String SciFiFirstName = firstName.substring(0,firstPortion)+lastName.substring(0,lastPortion);
        int cityPortion = randy.nextInt(city.length());
        int schoolPortion = randy.nextInt(school.length());
        String SciFiLastName = city.substring(0,cityPortion)+school.substring(0,schoolPortion);
        int petPortion = randy.nextInt(pet.length());
        int siblingPortion = randy.nextInt(sibling.length());
        String SciFiOrigin = pet.substring(0,petPortion)+sibling.substring(0,siblingPortion);
        System.out.printf("%s %s of the planet %s",SciFiFirstName,SciFiLastName,SciFiOrigin);
    }
}
