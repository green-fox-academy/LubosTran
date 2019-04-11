public class CommonDivisor {
    //Find the greatest common divisor of two numbers using recursion.
    public static void main(String[] args) {
        System.out.println(TheFUCKINGgreatestCommonDivisor(24,50));
    }
    public static long TheFUCKINGgreatestCommonDivisor(long a, long b) {

        if (b==0)
            return a;
        else
            return TheFUCKINGgreatestCommonDivisor(b, a % b);
    }
}
