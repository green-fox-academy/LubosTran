// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
import java.util.*;
public class SwapElements {
    public static void main(String[]args) {
        String abc[] = {"first", "second", "third"};
        String t = abc[0];
        String v = abc[2];
        abc [0] = v;
        abc [2] = t;
        System.out.println(Arrays.toString(abc));
    }
}
