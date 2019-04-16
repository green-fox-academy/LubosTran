package Sharpie;

public class Main {
    public static void main(String[] args) {


        Sharpie one = new Sharpie("blue", 42);
        one.use();
        System.out.println(one.inkAmount);
    }
}
