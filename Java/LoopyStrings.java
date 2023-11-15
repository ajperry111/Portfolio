package Unit1.Notes;

public class LoopyStrings {
    public static String removeVowels(String input){
        String output = "";

        for(int x=0;x!=input.length();x++){
            if(input.substring(x,x+1).equals("a")||input.substring(x,x+1).equals("e")||input.substring(x,x+1).equals("i")||input.substring(x,x+1).equals("o")||input.substring(x,x+1).equals("u")){
                System.out.print("");
            }else{
                output += input.substring(x,x+1).toUpperCase();
            }
        }
        return output;
    }
    public static String spaceReplacer(String a){
        for(int p=0;p!=a.length()-1;p++){
            char chart = a.charAt(p);
            char chart2 = a.charAt(p+1);
            if(chart==' '&&chart2==' '){
                a = a.substring(0,p)+a.substring(p+1,a.length());
            }
        }
        return a;
    }
    public static int howMany(String word,char gCount){
        int wordCount = 0;

        for(int index=0;index < word.length(); index++){
            if (word.charAt(index) == gCount){
                wordCount++;
            }
        }
        return gCount;
    }
    public static String replaceStuff1(String phrase,String wordToFind,String wordToReplace){
        System.out.println(phrase);
        String out="";
        int beginIndex=0;
        // System.out.println(phrase.indexOf(wordToFind));  //returns the first instance of
        out+=(phrase.substring(beginIndex, beginIndex+phrase.indexOf(wordToFind))+wordToReplace);
        beginIndex=phrase.indexOf(wordToFind)+wordToFind.length();
        System.out.println(beginIndex);
        out+=(phrase.substring(beginIndex, beginIndex+phrase.indexOf(wordToFind))+wordToReplace);
        beginIndex=phrase.indexOf(wordToFind)+wordToFind.length();
        System.out.println(beginIndex);
        out+=(phrase.substring(beginIndex, beginIndex+phrase.indexOf(wordToFind))+wordToReplace);
        beginIndex=phrase.indexOf(wordToFind)+wordToFind.length();
        // for(int c = 0; c<phrase.length();c++){
        //      System.out.println(c);
        // }
        
        return out;
   }
    public static String replaceStuff(String phrase,String wordToFind,String wordToReplace){
        while(phrase.indexOf(wordToFind)!=-1){
            phrase = phrase.substring(0,phrase.indexOf(wordToFind))+wordToReplace+phrase.substring(phrase.indexOf(wordToFind)+wordToFind.length(),phrase.length());
        }
        return phrase;
}
    public static void main(String[] args) {
        //Data Types that are sequence -> Strings, Arrays, Lists, ArrayLists, maps

        //these f(x) can work with other sequences,
        //    it just depends on how to access the data
        System.out.println(spaceReplacer("This sentence.  Has Double"));
        //String.replace -> DO NOT USE THIS F(X)

        //count the number of a certain char in a String
        System.out.println(howMany("GIGGLING",'8'));

        //find all and replace any double \s\s with sing \s
        //print out the corrected version

        //input banana, it will print out bnn
        System.out.println(removeVowels("banana"));

        //be able to place items in a string
        System.out.println(replaceStuff("I like potatos with a side of potato sauce","potato","poop"));
    }
}
