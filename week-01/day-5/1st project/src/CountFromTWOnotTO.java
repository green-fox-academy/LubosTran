import java.util.Scanner;
public class CountFromTWOnotTO {
    public static void main(String[] args) {
        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int FirstNumber = firstNumber.nextInt();

        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Enter 2nd number");
        int SecondNumber = secondNumber.nextInt();

        if (SecondNumber <= FirstNumber) {
            System.out.println("The second number should be bigger");
        } else if (SecondNumber > FirstNumber) {
            for (int a = FirstNumber; FirstNumber < SecondNumber; FirstNumber++) {
                System.out.println(FirstNumber);
            }
        }



    }
}

// I'm still confused at naming stuffs!!!
