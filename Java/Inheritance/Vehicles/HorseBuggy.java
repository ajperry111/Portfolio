//HorseBuggy is a Vehicle
public class HorseBuggy extends Vehicle{

    public HorseBuggy(String title, String color, String fuel, String speed){
        super(title,color,fuel,speed);
    }
    public void poop(){
        System.out.println("well crap");
    }
}
