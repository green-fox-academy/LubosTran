// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
public class Sum {
    public static void main(String [] args) {
        System.out.println(sum(5));
    }
    public static int sum(int numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers ; i++) {
            sum += i;
        }

        return sum;
    }
}

