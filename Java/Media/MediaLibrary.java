import java.util.ArrayList;
import java.util.Scanner;
public class MediaLibrary {


    //set the IP adress of your API or a user
    final static String ipAdress = "192.168.1.150";
    //static variable for the class MediaLibrary
    private static ArrayList<Song> myPlaylist = new ArrayList<Song>();
    private static ArrayList<Book> myBookPlaylist = new ArrayList<Book>();

    public static void main(String[] args){             //MediaLibrary.main(String[] args)
        //Class objName = new Constructor(parameters);
        Song song0 = new Song();
        //System.out.println(song0);
        Song song1 = new Song("Grenade");
        //System.out.println(song1);
        Song song2 = new Song("Party in the USA","Miley Cyrus");
        //System.out.println(song2);

        myPlaylist.add(song0);
        myPlaylist.add(song1);
        myPlaylist.add(song2);

        printPlaylist(myPlaylist);

        song0.setTitle("Wheels on Da Bus");
        song0.setRating(1);
        myPlaylist.get(1).setRating(5);
        myPlaylist.get(2).setRating(10);

        printPlaylist(myPlaylist);


        myBookPlaylist.add(new Book());
        myBookPlaylist.add(new Book("Rainbow Six"));
        myBookPlaylist.add(new Book("Percy Jackson","Rick Whoop"));

        printBookPlaylist(myBookPlaylist);
        addSong(myPlaylist);
        addSong(myPlaylist);

        printAveRating(myPlaylist);

        System.out.println(findASong(myPlaylist));
        //find a song based on the user input,
        // and if the user input is the song title, return it.
    }
    public static Song findASong(ArrayList<Song> arr){
        Scanner ui = new Scanner(System.in);
        System.out.println("What song are you looking for? ");
        String songToFind = ui.nextLine();
        for(int i=0;i<arr.size();i++){
            if (songToFind.equals(arr.get(i).getTitle())){
                return arr.get(i);}
        }
        return new Song();
        
    }
    private static void printAveRating(ArrayList<Song> arr){
        double average=0;
        for(int i=0;i<arr.size();i++){
            average+=arr.get(i).getRating();
        }
        average=average/arr.size();
        System.out.println(average);
    }
    private static void addSong(ArrayList<Song> arr){
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter a song title: ");
        String inputTitle = ui.nextLine();
        System.out.println("Enter the artist: ");
        String inputArtist = ui.nextLine();
        System.out.println("Rate from 1-10: ");
        double inputRating = ui.nextDouble();

        arr.add(new Song(inputTitle,inputArtist,inputRating));
        printPlaylist(arr);
    }
    private static void printPlaylist(ArrayList<Song> arr){
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        };
    }
    private static void printBookPlaylist(ArrayList<Book> arr){
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        };
    }
    }

