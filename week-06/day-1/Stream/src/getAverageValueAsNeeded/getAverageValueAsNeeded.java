package getAverageValueAsNeeded;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Write a Stream Expression to get the average value of the odd numbers from the following list:

List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);*/
public class getAverageValueAsNeeded {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        Double result = numbers.stream()
                .filter(number -> !(number%2 ==0))
                .mapToInt(number -> number)
                .average().getAsDouble();

        //Safer
        numbers.stream()
                .filter(number -> !(number%2 ==0))
                .mapToInt(number -> number)
                .average()
                .ifPresent(value -> System.out.println(value+"is the avg"));

        //other Way
        double d = numbers.stream()
                .filter(number -> !(number%2 ==0))
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(d);
    }
}
