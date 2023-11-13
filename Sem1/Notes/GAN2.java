package Unit1.Notes;
import java.util.Random;
import java.util.Scanner;

public class GAN2 {
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
        System.out.println(checkNumber(input,secret));
    }
    //create a function to check whether the userInput is <,>,== the answer
    public static boolean checkNumber(int in,int answer){
      if(in>answer){
            System.out.println("Too High :(");
            return false;
         }
         else if(in<answer){
            System.out.println("Too Low :(");
            return false;
         }
         else if(in==answer){
            System.out.println("Hooray, you got it! :)");
            return true;
         }
         else{
            System.out.println("Not a number");
            return false;
         }
    }
}
