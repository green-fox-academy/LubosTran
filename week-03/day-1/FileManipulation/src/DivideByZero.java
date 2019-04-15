// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
public class DivideByZero {
    public static void main(String[] args) {
        dividedByZero(10);
    }
    public static int dividedByZero (int numberToBeDevided){
        int a = 2;
        try {
             numberToBeDevided /= a;

        }catch (ArithmeticException error) {
            System.out.println("fail");
        }{
            int result = numberToBeDevided /= a;
            System.out.println(result);
        }
        return numberToBeDevided;
    }
}
