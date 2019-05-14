package sumOfOddNum;

import java.util.Arrays;
import java.util.List;

/*Write a Stream Expression to get the sum of the odd numbers in the following list:

List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);*/
public class sumOfOddNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        int result = numbers.stream()
                .filter(number -> !(number%2 == 0))
                .mapToInt(number -> number)
                .sum();

        System.out.println(result);
    }
}
