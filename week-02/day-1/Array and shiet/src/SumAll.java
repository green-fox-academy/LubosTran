
// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
    public class SumAll {
            public static void main(String[]args) {
                int ai[] = {3,4,5,6,7};
                int sumAll = 0;
                for (int a : ai) {
                    sumAll = sumAll + a;
                }
                System.out.println(sumAll);
            }
}
