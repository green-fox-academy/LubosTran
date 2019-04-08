// - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element
import java.util.*;
public class SumElements {
    public static void  main(String[]args) {
        int r[] = {54,23,66,12};
        int sum = r[1] + r[2];
        System.out.println("Given numbers: " +Arrays.toString(r));
        System.out.println("The sum of the second and the third number is: " + sum);
    }
}
