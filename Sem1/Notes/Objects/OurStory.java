public class OurStory {
    public static void main(String[] args){
        //Class objName = new Constructor(parameters);
        Hero mainCharacter = new Hero("Power Scheller","Manipulates the Matrix");
        System.out.println(mainCharacter);

        Hero bestFriend = new Hero("Nic Cage","Steals the Declaration of Independence");
        System.out.println(bestFriend);

        Hero villain = new Hero("Power Schooler","Schools them really good mwuahahaha");
        System.out.println(villain);

        Hero person1 = new Hero("Chad");
        System.out.println(person1);

        Hero underDog = new Hero("Scotty Pippen");
        System.out.println(underDog);
        underDog.newPower("Michael Jordan");
        System.out.println(underDog);
    }
}
