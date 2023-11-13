package Unit1.Notes;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class JavaMath {
    public static void main(String[] args) {
        /*
         * Build a program to ask the user for hourly pay
         *  Print out their yearly pay
         *          2000 hours in a year
         */
        Scanner ui = new Scanner(System.in);
        System.out.println("How much money do you make per hour?");
        double pay = ui.nextDouble(); //looks for the next \n
        System.out.printf("Yearly Pay: $"+"%2.2f%n",pay*2000);
        ui.close();

        /*
         * Primitive Data Types
         * - Binary, Int, Float, Double, Character
         * - int, char, long, float, double, boolean
         * 
         * Non-Primitive Data Types
         * -Array, Class, String, Integer, Boolean, Double
         */

         double age = 17;
         //double age = 17; if var is already definied, can't redefine words

         double years = 17.33;  //This is the data type
         Double year = 17.33;  //This is a class object 

         //Math Tricks
         //python increase by 1 -> x+=1;
         //java increase by 1 -> x++;
         //java add -> x+=5;
         //java subtract by 1 -> x--
         //java subtract -> x-=5
         //java divide -> x/=5
         //java multiply -> x*=5
         //java bit calculation -> x^2
         //java exponent -> import java.lang.Math;    x=Math.pow(x,5);
        age++;
        age+=5;
        age--;
        age/=5;
        age*=5;
        //age^=5;
        age=age*age;
        age=Math.pow(age, 2); System.out.println(age);

        //Random....  there's no such thing
        //option 1 -> Java built in version
        double randomness=Math.random(); //0 to .99999999
        System.out.println(randomness);
        //number btwn 0 and 10
        int answer = (int)(randomness*10); //(int)#casts it to an int
        System.out.println(answer);

        //option 2 -> Random Class
        Random randy = new Random();
        int randomInt = randy.nextInt(10); System.out.println(randomInt);
        double randomDouble = randy.nextDouble(); System.out.println(randomDouble);
    }
}
