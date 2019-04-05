import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String [] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int aNumber = number.nextInt();
        for (int a = 1; a <= 10; a++) {
            int b = a * aNumber;
            System.out.println(a+" * " + aNumber + " = " + b ) ;
        }
    }
}
