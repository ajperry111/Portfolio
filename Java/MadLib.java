import java.util.Scanner;
public class MadLib {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter an adjective: ");
        String adjective1 = ui.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective2 = ui.nextLine();
        System.out.println("Enter a type of bird: ");
        String bird = ui.nextLine();
        System.out.println("Enter a room in a house: ");
        String room = ui.nextLine();
        System.out.println("Enter a past tense verb: ");
        String pastVerb = ui.nextLine();
        System.out.println("Enter a verb: ");
        String verb = ui.nextLine();
        System.out.println("Enter a relative's name: ");
        String relative = ui.nextLine();
        System.out.println("Enter a noun: ");
        String noun1 = ui.nextLine();
        System.out.println("Enter a liquid: ");
        String liquid = ui.nextLine();
        System.out.println("Enter a verb ending in -ing: ");
        String verbing1 = ui.nextLine();
        System.out.println("Enter a part of the body(plural): ");
        String body = ui.nextLine();
        System.out.println("Enter a plural noun: ");
        String pluralNoun = ui.nextLine();
        System.out.println("Enter a verb ending in -ing: ");
        String verbing2 = ui.nextLine();
        System.out.println("Enter a noun: ");
        String noun2 = ui.nextLine();
        System.out.printf("It was a %s, cold November day. I woke up to the %s smell of %s roasting in the %s downstairs. I %s down the stairs to see if I could help %s the dinner. My mom said, 'See if %s needs a fresh %s.' So I carried a tray of glasses full of %s into the %s room. When I got there, I couldn't believe my %s! There were %s %s on the %s!",adjective1,adjective2,bird,room,pastVerb,verb,relative,noun1,liquid,verbing1,body,pluralNoun,verbing2,noun2);
        ui.close();
    }
}
