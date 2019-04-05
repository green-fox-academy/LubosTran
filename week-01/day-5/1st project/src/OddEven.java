import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner OE = new Scanner(System.in);
        System.out.println("Enter Number");

        int OddEven = OE.nextInt();
        if (OddEven % 2 == 0 ) {
            System.out.println("Even");
        }   else {
            System.out.println("Odd");
        }
    }
}
