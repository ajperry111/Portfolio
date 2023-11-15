package Unit1.Notes;
import java.util.Scanner;
public class Condish {
    public static void main(String[] args){
        //if stand up, then clap
        //if you hear yourName, then do something
        //if this then this
        //if this else if this else if this else
        /*     python
         *     if x=="jonah":
         *          print("zoller")
         * 
         */
        int x = 5;
         // if 4==4:
         if (x==4){
             //     print(True)
            System.out.println(true);
         }
         //elif
         else if(x==8){
            System.out.println("it equals 8");
         }
         //else
         else{
            System.out.println(x);
         }

         //how do you spell t and f -> true or false
         
         if(4==4.0){
            System.out.println(true);
         }
         else{
            System.out.println(false);
         }

         if("great"=="4"){
            System.out.println(true);
         }
         else{
            System.out.println(false);
         }
         Scanner ui = new Scanner(System.in);
         String input = ui.nextLine();
         if(input.equals("4")){
            System.out.println(true);
         }
         else{
            System.out.println(false);
         }

         /*
          * == works with literals like 4==4 or "parker"=="parker"
          * == does not work with pbject compared to object
          * .equals is for all objects to compare to other objects
          */

          Integer y=2;
          int z=2;
          y.equals(z);  //legal but not best practice

          /*
           * < less than or great
           * >= less than or equal or greater than or equal
           * !=  not equals
           * 
           */

           //not equals with objects
           if(!input.equals(12)){
                System.out.println("not equals");
           }
    }
}
