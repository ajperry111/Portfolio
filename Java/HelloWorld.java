package Unit1.Notes;
//one line comment
/*
 * public -> public means everyone can see it in the scope of work
 * main class must be public for the JVM to see it
 * class -> define a class
 * HelloWorld -> name of your class
 */
public class HelloWorld {
    //The main maethod -> this is where the magic starts
    public static void main(String[] args){
        /*
         * private -> no other file can access this method
         * method -> abstract command to run an algorithm
         * static -> HelloWorld.main() how the method is called
         * void -> empty as in doesn't return anything
         * main(String[] args) -> when running the program, you can give the function arguments
         *   java HelloWorld.java ['words','data','and','stuff']
         */
        System.out.println("Hello World");
        /*
         * System -> System module or class
         * out -> subclass of System
         * println() -> method to print with a \n at the end of the line
         */
        System.out.print("Hello World");    // no \n
        System.out.print("Hello again");

        System.out.println("\n12345.6789");
        System.out.printf("%2.2f%n",12345.6789);
        System.out.printf("%8.2f%n",12345.6789);
        System.out.printf("%16.2f%n",12345.6789);

        System.out.println("bob"+"the"+"builder");
        System.out.println(1+2+3);

        //print({}{}{},varList)
        //System.out.printf("%s %s","words","words");
    }
}