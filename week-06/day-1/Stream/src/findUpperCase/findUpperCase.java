package findUpperCase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Write a Stream Expression to find the uppercase characters in a string!*/
public class findUpperCase {
    public static void main(String[] args) {
        String s = "AdaFQsdFG";

        String[] letters = s.split("");

        List<String> result = Arrays.stream(letters)
                .filter(letter -> letter.equals(letter.toUpperCase()))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
