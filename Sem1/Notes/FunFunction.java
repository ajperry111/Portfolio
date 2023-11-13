package Unit1.Notes;
//Python we created functions up here -> In java, do this at the bottom
//Java initializes your global var here
public class FunFunction {
    public static void main(String[] args){
        //static functions
        //  a f(x) that does not change
        //  a f(x) that does not need an object to run
        //  print()  int()  input()  ClassName.method()  function()

        int s = addTwoNumbers(2,2); 
        FunFunction.addTwoNumbers(2,2);//this is how you would call it in another file/somewhere else
        System.out.println(s);
        System.out.println(addTwoNumbers(2, ".00")); //$2.00
    }
    //synchronous -> runs from the top down/working at the same time (python or scripting)
    //asynchronous ->not running from the top down/not working at the same time (java or applications)
    //it all depends on the scope of the program

                //int a, int b are local variable
    //overloading method
    //add more local variables to the signature of the f(x)
    public static void addTwoNumbers(int a, int b,int c){
        //public -> Anything can access it / open to the public
        // private -> only items on this file or objects can access it
        // static -> is no object required
        //void -> empty/nothing/empty return, doesn't return*
        System.out.println(a+b);

    }
    /* RULE OF THUMBS
     * 
     * Who needs access to the method? public or private
     * Do I need an object to use the method?
     * Am I returning information?
     * Will I have different data types?
     * 
     * - methods are verbs therefore the name should be some type of verb
     *      bob() -> bob is a noun and not a verb
     */
    public static String addTwoNumbers(int a, String b){
        return a+b;
    }
    public static String convertMyNumberToMoney(int a){
        //conditional statement to change the decimal value
        return "$"+a+".00";
    }
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }
    public static void addTwoNumbers(double a, double b){
        System.out.println(a+b);
    }

    public static void addThreeNumbers(int a, int b, int c){
        //a,b,c are local so they can be reused in addTwoNumbers

    }
}
