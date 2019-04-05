import java.util.Scanner;
public class OneTwoALot {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number");

        int EnterNumber = number.nextInt();
        if (EnterNumber <= 0) {
            System.out.println("Not enough");
        } else if (EnterNumber == 1) {
            System.out.println("One");
        } else if (EnterNumber == 2) {
            System.out.println("Two");
        } else if (EnterNumber > 2) {
            System.out.println("A lot");
        }
    }
}
