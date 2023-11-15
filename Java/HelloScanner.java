package Unit1.Notes;
import java.util.Scanner; // * is a wildcard or everything............
public class HelloScanner {
    public static void main(String[] args) {
        //python -> :) name = input("the message or question") -> this was easy...
        //              print("Hello"+name)

        //Classname objectName = new ClassName(args)
        Scanner ui = new Scanner(System.in);
        System.out.println("The question, as in what is your name?");
        String name = ui.nextLine(); //looks for the next \n
        //String name = ui.nextLine();
        System.out.println("Hello " + name);

        System.out.println("What grade are you in? (number please)");
        String grade = ui.nextLine();
        System.out.printf("Your grade" + grade);
        ui.close();
    }
}
