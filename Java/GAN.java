package Unit1.Notes;
import java.util.Random;
import java.util.Scanner;

public class GAN {
    public static void main(String[] args) {
        /*
         * Ask the user for a number between 0-10
         *    If the value is higher than 7, say so
         *    If the value is lower than 7, say so
         *    If the value is equal to 7, say Hooray you got it!
         * 
         *    Once you complete this version,
         *      generate a random number instead of 7
         */
        Scanner ui = new Scanner(System.in);
        int secret = 7;
        System.out.println("Enter a number between 0-10");
         int input = ui.nextInt();
         if(input>secret){
            System.out.println("Too High :(");
         }
         else if(input<secret){
            System.out.println("Too Low :(");
         }
         else if(input==secret){
            System.out.println("Hooray, you got it! :)");
         }
         else{
            System.out.println("Not a number");
         }
        Random rando = new Random();
        int randomNum = rando.nextInt();
        System.out.println("Enter a number between 0-10");
         int guess = ui.nextInt();
         if(guess>randomNum){
            System.out.println("Too High :(");
         }
         else if(guess<randomNum){
            System.out.println("Too Low :(");
         }
         else if(guess==randomNum){
            System.out.println("Hooray, you got it! :)");
         }
         else{
            System.out.println("Not a number");
         }
    }
}
