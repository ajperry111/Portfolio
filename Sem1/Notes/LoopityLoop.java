package Unit1.Notes;
import java.util.Scanner;
public class LoopityLoop {
    public static void main(String[] args){
        //for and while loops
        //python
        // while(boolean statement == true):
        //    do this algorithm
        // while(PlayerAlive):
        // while(PlayerIsAlive):
        // while(userInput.isDigit()):

        //print out the numbers 0-9
        int x=0;                        //initialize the iterator
        while(x<=10){                   //while(boolean)
            System.out.println(x);      //algorithm
            x+=1;                        //iterate
        }
        // String question="";                                 //initialize the iterator
        // while(!question.equals("the answer")){                      //while(boolean)
        //     System.out.println("What's the answer? ");    //algorithm
            //Ask for the user input(using a scanner)       //iterate

        //}

        //using a while loop print out the even numbers between 0-20
        int y=0;                        //initialize the iterator
        while(y<=20){                   //while(boolean)
            System.out.println(y);      //algorithm
            y+=2;                        //iterate
        }
        //using a while loop print out the odd numbers between 0-20
        int z=1;                        //initialize the iterator
        while(z<=20){                   //while(boolean)
            System.out.println(z);      //algorithm
            z+=2;                        //iterate
        }
        //using a while loop, find the sum of the first 100 iterations of x=x/2
        int i=1;
        int n=1;
        while(n!=20){
            System.out.println("1/"+i);      //algorithm
            i=i*2;                        //iterate
            n+=1;
        }
        //keep asking user guess what until they enter chicken butt
        Scanner ui = new Scanner(System.in);
        String input = "";                                           //initialize iterator
        while(!input.equals("chicken butt")){               //while(boolean)
            System.out.println("Guess What? ");                    //algorithm
            input = ui.nextLine();                                   //iterate
        }
        System.out.println("You Got It!");




        /****************** FOR LOOPS ******************************/

        //Print out 0-9
        //python for i in range(9)
        //initialize the iterator;boolean;iterate
        for(int p=0;p!=10;p++){
            System.out.println(p);
        }
        System.out.println("Guess What?");
        for(String str=ui.nextLine();!str.equals("chicken butt");str=ui.nextLine()){
            System.out.println("Guess What?");
        }
        //print out 0-20 even
        for(int p=0;p!=20;p+=2){
            System.out.println(p);
        }
        //print out 0-20 odd
        for(int p=1;p<=20;p+=2){
            System.out.println(p);
        }

        //0,1,2,3,4,5,6,7,8,9
        for(int p=0;p!=10;p=p+1){
            System.out.print(p);
            if (p<9){
                System.out.print(",");
            }
        }
         System.out.println("   ");
        //9,8,7,6,5,4,3,2,1,0
        for(int p=9;p!=-1;p-=1){
            System.out.print(p);
            if (p>0){
                System.out.print(",");
            }
        }
        System.out.println("   ");
        //0,1,2,0,1,2,0,1,2
        for(int p=0;p!=3;p++){
            for(int w=0;w<=2;w+=1){
                if((p==2)&&(w==2)){
                    System.out.print(w);
                }
                else{
                System.out.print(w+",");
                }
        }
        }
        System.out.println("   ");
        //2,1,0,2,1,0,2,1,0
        for(int p=0;p!=3;p++){
            for(int w=2;w>=0;w-=1){
                if((p==2)&&(w==0)){
                    System.out.print(w);
                }
                else{
                System.out.print(w+",");
                }
        }
        }
    }
}
