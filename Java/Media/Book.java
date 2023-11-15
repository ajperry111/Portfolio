public class Book {
    String title;
    String author;
    //NullPointerException->Nothing is there...

    //no-args Constructors
    //def __init__(self):

    //name of constructor has to match the class name
    public Book(){

    }

    //Constructor Signature
    public Book(String newTitle){
        //this.globalVar = localVar
        this.title=newTitle;
    }
    //overloading -> multiple Constructors with different signatures
    public Book(String newTitle,String newAuthor){
        this.title=newTitle;
        this.author=newAuthor;
    }

    @Override
    public String toString(){
        String out="";
        out+="Title: "+this.title;
        out+="\nAuthor: "+this.author;
        out+="\n";
        return out;
    }
}
