import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ALNotes {
    public static void main(String[] args){

        //Python List -> listy=[]
        //int[] numbers = new int[10];
        //int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //Class<DataType> objName = new Constructor<DataType>();

        //4 main functions of SQL -> CRUD
        //Create or add
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jonah");
        names.add("Zander");
        names.add("Ben");
        names.add("Parker");
        names.add("Ty");
        names.add(2, "Blake");

        //Read
        System.out.println(names);
        System.out.println(names.get(4));

        //Update
        //Pythonic names[i]=newData
        names.set(1,"Owen");

        //Delete
        names.remove("Owen");
        names.remove("Blake");
        System.out.println(names);
        names.clear();

        //length of my ArrayList
        System.out.println(names.size());

        ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
        ArrayList<String> row3 = new ArrayList<>(Arrays.asList("1","2","3"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("4","5","6"));
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("7","8","9"));
        /*
         * 7 8 9
         * 4 5 6
         * 1 2 3
         */
        board.add(row1);
        board.add(row2);
        board.add(row3);
       
        for(int i=0;i<board.size();i++){
            for(int c=0;c<board.size();c++){
                System.out.println(board.get(i).get(c)+"\s");
            }
            System.out.println();
        };

    }
}
