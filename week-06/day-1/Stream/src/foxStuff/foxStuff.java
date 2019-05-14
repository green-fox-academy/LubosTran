package foxStuff;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

    Write a Stream Expression to find the foxes with green color!
    Write a Stream Expression to find the foxes with green color, and age less then 5 years!
    Write a Stream Expression to find the frequency of foxes by color!
*/
public class foxStuff {
    public static void main(String[] args) {
        List<Fox> foxes = Arrays.asList(
                new Fox("fox1","blue",22),
                new Fox("fox2","green",36),
                new Fox("fox3","yellow",5),
                new Fox("fox4","black",77),
                new Fox("fox5","colorful",24),
                new Fox("fox6","green",2)
        );

        foxes.stream()
                .filter( fox -> fox.getColor().toLowerCase().equals("green"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        foxes.stream()
                .filter( fox -> fox.getColor().toLowerCase().equals("green") && fox.getAge()<5)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Map<String, Long> colorFrequency = foxes.stream()
                .collect(Collectors.groupingBy(c -> c.getColor(), Collectors.counting()));

        colorFrequency.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}
