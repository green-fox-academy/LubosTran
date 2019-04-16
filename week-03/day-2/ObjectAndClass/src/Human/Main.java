package Human;

public class Main {
    public static void main (String[]args){
        Human human = new Human();
        Human human2 = new Human("John",18,110);

        human.name = "Hector";
        human.age = 1;

        if (human.isSmart()) {
            System.out.println(human.name + "is smart, with iq of "+ human.iq  );
        }
    }
}
