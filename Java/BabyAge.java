package Unit1.Notes;
import java.util.Scanner;
public class BabyAge {
    public static void main(String[] args) {
        //take in user input and find out how many months old they are
        //out: how many years old are you?
        //in: 10
        //out: 120 months old
        Scanner ui = new Scanner(System.in);
        System.out.println("How many years old are you?");
        Integer age = ui.nextInt(); //looks for the next \n
        System.out.print(age*12+" months old");
        ui.close();
    }
}
