//Airplane is a Vehicle
public class Airplane extends Vehicle{
    private int elevation;

    public Airplane(String material, String color, String fuel, String speed){
        super(material,color,fuel,speed);
    }
    
    public void flying(int elevation){
        this.elevation=elevation;
    }
}
