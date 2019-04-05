import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        Scanner UserName = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = UserName.nextLine();
        System.out.println(userName +", I am your father ");

    }
}