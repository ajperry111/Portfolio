import java.util.Scanner;
import java.lang.Math;
public class AdditionProgram {
    public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    System.out.println("Enter a number(quit to end): ");
    String number = ui.nextLine();
    Double total = 0.0;
    String printout = "";
    while(!number.equals("quit")){
        printout += number+",";
        total += Double.valueOf(number);
        System.out.println("Enter a number(quit to end): ");
        number = ui.nextLine();
    }
    System.out.printf("Your total is: "+total+"\n"+printout.substring(0,(printout.length()-1)));
    ui.close();
}
}
