package findNeededString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
 List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");*/
public class findNeededString {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        cities.stream()
                .filter(city -> city.startsWith("C"))
                .collect(Collectors.toList())
                .forEach (System.out::println);


    }
}
