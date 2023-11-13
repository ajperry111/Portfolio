//DO NOT NAME THIS THE SAME THING AS SOMETHING BUILT-IN

public class Hero {
    //YOU DO NOT HAVE A main(String[] args) in this class!!!

    String name;
    String superpower;
    //NullPointerException->Nothing is there...

    //no-args Constructors
    //def __init__(self):

    //name of constructor has to match the class name
    public Hero(){

    }

    //Constructor Signature
    public Hero(String newName){
        //this.globalVar = localVar
        this.name=newName;
    }
    //overloading -> multiple Constructors with different signatures
    public Hero(String newName,String power){
        this.name=newName;
        this.superpower=power;
    }

    public void newPower(String newPower){
        this.superpower=newPower;
    }
    @Override
    public String toString(){
        String out="";
        out+="Name: "+this.name;
        if(this.superpower==null){
            out+="\nSuperpower: "+"no powers... they're lame";
        }else{
            out+="\nSuperpower: "+this.superpower;
        }
        out+="\n";
        return out;
    }
}
