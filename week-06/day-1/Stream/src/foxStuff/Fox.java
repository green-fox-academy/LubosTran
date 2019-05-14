package foxStuff;
/*Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

    Write a Stream Expression to find the foxes with green color!
    Write a Stream Expression to find the foxes with green color, and age less then 5 years!
    Write a Stream Expression to find the frequency of foxes by color!
*/
public class Fox {
    private String name;
    private String color;
    private int age;

    public Fox(String name, String color, int age) {
        this.name =name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "FoundFox(es){" +
                "name='" + name + '\'' +
                '}';
    }



}
