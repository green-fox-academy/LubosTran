//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorio {
    public static void main(String []args) {
        System.out.println(Factorio(4));
    }

    public static double Factorio(int numbers) {
        double factorio =1;
        for (numbers = 1; numbers <=4; numbers++) {
            factorio *= numbers;
        }
        return factorio;
    }
}
