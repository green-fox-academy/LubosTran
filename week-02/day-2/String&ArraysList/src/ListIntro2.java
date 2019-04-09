import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntro2 {
    public static void main(String[]args) {
        ArrayList <String> ListA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian","Lychee"));
        ArrayList <String> ListB = new ArrayList<>();
        ListB.addAll(ListA);
        System.out.println(ListA.contains("Durian"));

        //remove Durian
        ListA.remove("Durian");

        ListA.add(3,"Kiwifruit");

        //Compare a b
        System.out.println(ListA.equals(ListB));

        //Get the index of Avocado from List A B
        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));

        //Add Passion Fruit and Pummelo to List B in a single statement
        // ListB = Arrays.asList( "Passion Fruit", "Pummelo");
        ArrayList <String> tempList = new ArrayList<>(Arrays.asList("Passion Fruit", "Pummelo"));
        ListB.addAll(tempList);
        System.out.println(ListB);

        //Print out the 3rd element from List A
        System.out.println(ListA.get(2));
    }
}
