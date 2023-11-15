public class Array {
    public static void main(String[] args){
        /**
         * Primitive - ints, doubles, floats, char, boolean
         * Non-Primitive - Strings, List, Arrays, ArrayList, Objects, Maps, Json
         */

         //Pythonic List -> listy=[0,1,2,3,4,5,6,7,8,9]
         int[] intNumbers = {0,1,2,3,4,5,6,7,8,9};
         double[] decimalNumbers = {0.0,1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
         //double cannot go into int[], but ints can go into double[]

         String[] words={"Hello"," ","World"};
        
         System.out.println(intNumbers);
         for(int i=0;i<intNumbers.length;i++){
            System.out.println(intNumbers[i]);
         }
         for(int i=0;i<words.length;i++){
            System.out.print(words[i]);
         }
         System.out.println("");
         printHorizontalArray(intNumbers);
         printVerticalArray(intNumbers);
         printHorizontalArrayComma(intNumbers,",");

         //Ask the user for a number, then add the number to an array
         int[] userNumbers = new int[10]; //created a 10 0's in an int array
         String[] a =new String[10]; //created 10 null in a string array

         for(int i=0;i<10;i++){
            System.out.println("Enter a Number:");
            userNumbers[i]=ui.nextInt();
         }
        
         //System.out.println(minIntArray(userNumbers));
         //System.out.println(maxIntArray(userNumbers));
         System.out.println(aveIntArray(userNumbers));
         //System.out.println(sumIntArray(userNumbers));

    }
    //public static double aveIntArray(int[] arr){
    //    int a = 0;
    //    for(int i=0;i<arr.length;i++){
    //        a+=arr[i];  
    //    }
    //    double average = a/arr.length;
    //    return average;
    //}
    public static int minIntArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]<min){
                  min=arr[i];
             }
        }
        return min;
   }
   public static int maxIntArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                  max=arr[i];
             }
        }
        return max;
   }
   public static int sumIntArray(int[] arr){
        int total = 0;
        for(int i=0;i<arr.length;i++){
             total+=arr[i];
        }
        return total;
   }
   public static double aveIntArray(int[] arr){
        double ave = sumIntArray(arr)/arr.length;
        return ave;
   }

    public static void printHorizontalArray(int[] arr){
            for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            }
    }
    public static void printHorizontalArrayComma(int[] arr, String b){
            String out = "";
            for(int i=0;i<arr.length;i++){
                if(i!=arr.length-1){
                    out+=arr[i];
                    out+=b;
                }
                else{
                    out+=arr[i];
                }
            }
            System.out.print(out);
    }
    public static void printVerticalArray(int[] arr){
            for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            }
         }

}