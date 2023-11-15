package Unit1.Bellringers;
import java.util.Scanner;
import java.lang.Math;
public class KeepingTrack {
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        String num = "";
        String inpt = "";
        while (!inpt.equals("quit")){
            System.out.println("Enter a number: ");
            inpt = ui.nextLine();
            if (!inpt.equals("quit")){
            num += String.format(inpt+"\n");
            }
        }
        System.out.println(num);
        ui.close();
    }
    
}

