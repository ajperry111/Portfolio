public class Song {
    //field variable
    String title;
    String artist;
    double rating;
    
    //name of constructor has to match the class name
    public Song(){

    }

    //Constructor Signature
    public Song(String newTitle){
        //this.globalVar = localVar
        this.title=newTitle;
    }
    //overloading -> multiple Constructors with different signatures
    public Song(String newTitle,String newArtist){
        this.title=newTitle;
        this.artist=newArtist;
    }

    public Song(String newTitle,String newArtist, double rate){
        this.title=newTitle;
        this.artist=newArtist;
        this.rating=rate;
    }

    //getters & setters
    //accessors & mutators
    //will have a getter and setter for each field variable
    public void setRating(double newRating){
        this.rating=newRating;
    }
    public double getRating(){
        return this.rating;
    }

    public void setTitle(String newName){
        this.title=newName;
    }
    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString(){
        String out="";
        out+="Title: "+this.title;
        out+="\nArtist: "+this.artist;
        out+="\nRating: "+this.rating;
        out+="\n";
        return out;
    }
}
