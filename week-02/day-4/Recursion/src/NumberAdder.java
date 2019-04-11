import java.sql.SQLOutput;

public class NumberAdder {
    //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    public static void main (String[]args){

        System.out.println(number(9));
    }
    public static int number(int n) {
        if (n == 1) {
            return 1;
        }else   {
            return n+number(n-1);
        }
    }
}
