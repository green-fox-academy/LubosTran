import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
        Scanner FirstNumber = new Scanner(System.in);
        System.out.println("The number of girls: ");
        int firstNumber = FirstNumber.nextInt();

        Scanner SecondNumber = new Scanner(System.in);
        System.out.println("The number of boys: ");
        int secondNumber = SecondNumber.nextInt();

        if ( firstNumber == secondNumber && firstNumber + secondNumber >= 20) {
            System.out.println( "The party is excellent");
        } else if ( firstNumber != secondNumber && firstNumber + secondNumber >= 20 ){
            System.out.println("Quite cool party");
        } else if (firstNumber + secondNumber <= 20) {
            System.out.println("Average party");
        } else if ( firstNumber == 0) {
            System.out.println("Sausage party");
        }

    }
}
