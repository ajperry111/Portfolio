package Unit1.Notes;

public class StringsEnStuff {
    public static void main(String[] args) {
        /*
         * Primitive - boolean, int, double, character
         * Non-Primitive - Strings, Arrays, List, ArrayList, sequences basically
         * 
         * Strings were variables
         * Strings are objects
         */

        int age = 8;
        char letter = 'I';   //''is for a letter
        String name = "jim";   //"" is for a string

        //js `` is used to be placeholders like {} in python or %n like java

        //official way of creating a string
        String firstName = new String();
        firstName = "jimmy";

        //actual way
        String lastName = "bob";
        String middleName = "";
        
        /*
         * \n -> new line
         * \t -> new tab
         * \s -> new space
         */

         System.out.printf("%s %s\n",firstName,lastName);
         //%s is the string placeholder

         String password = "Th3Cr33D!";
         //python -> len(string)
         System.out.printf("The password length is %d\n",password.length());
         System.out.println("The password length is "+password.length());

         //What if, I need to see if your email has the @ sign in it...
        String email = firstName+"."+lastName+"@stu.evsck12.com";
        System.out.println(email.contains("@"));

        //python True was capital T
        //every other language True is lowercase t      boolean is primitive

        //What if, I need the user's info from their email
        String email2 = "chad.bob@stu.evsck12.com";
        //find the indexOf a character
        //python email2[beginIndex:endIndex]
        int atSymbol = email2.indexOf("@");
        String theirUsername = email2.substring(0,atSymbol);
        // split based on the period
        //firstName = theirUsername.split(".");  split returns String Array
        firstName = theirUsername.substring(0,theirUsername.indexOf("."));
        lastName = theirUsername.substring(theirUsername.indexOf(".")+1);
        System.out.println(theirUsername);
        System.out.println(firstName);
        System.out.println(lastName);

        //if you're given the word poop, change it to pooop
        //String word = "poop";
        //String firstPart = word.substring(0,word.indexOf("oo"));
        //firstPart+="o";
        //firstPart+=word.substring(word.indexOf("oo"));
        //System.out.println(firstPart);
        String word = "poop";
        StringBuilder newWord = new StringBuilder(word);
        newWord.insert(2, "o");
        System.out.print(newWord);
    }
}
