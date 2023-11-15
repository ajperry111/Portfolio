//Abstract Super class, so everything here is abstract
public abstract class Animal {
    private String name, desc;

    public Animal(String name, String description){
        this.name = name;
        this.desc = description;
    }
    //getters and setters
    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
}

