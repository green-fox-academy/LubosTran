package Human;

public class Human {
    String name;
    int age;
    int iq;

    public Human() {
        this(null, 0, 0);
    }

    public Human(String name, int age, int iq){
        this.name = name;
        this.age = age;
        this.iq = iq;
    }

    public boolean isSmart(){
        return this.name == null || this.name.isEmpty();
    }

    public void beSmarter(){
        this.iq += 20;
    }


}
