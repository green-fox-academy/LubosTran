package findFrequecyInString;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

//Write a Stream Expression to find the frequency of characters in a given string!
public class findFrequecyInString {
    public static void main(String[] args) {
        String s = "sAdaFQsdFsG";

        String[] data = s.toLowerCase().split("");

        Map<Character, Integer> characterFrequency = s.chars().boxed() //box them to Integer to resolve type problems in Collector.
                .collect(toMap(
                        k -> (char) k.intValue(), //casting string into char type
                        v -> 1, //default 1 as value
                        Integer::sum)); //count
        System.out.println(characterFrequency);

        //other way
        Map<String, Long> frequentChars = Arrays.stream(data)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        frequentChars.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
