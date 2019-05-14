package concatenateAsRequested;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Stream Expression to concatenate a Character list to a string!
public class concatenateAsRequested {
    public static void main(String[] args) {
        List<String> characters = Arrays.asList("A", "c", "d", "b", "a", "D");

        String a = characters.stream()
                .collect(Collectors.joining());

        System.out.println(a);
    }
}
