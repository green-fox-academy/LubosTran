package Sharpie;
/*
    Reuse your Sharpie class
    Create SharpieSet class
        it contains a list of Sharpie
        countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies

 */
public class Main {
    public static void main(String[] args) {


        Sharpie one = new Sharpie("blue", 42);
        one.use();
        System.out.println(one.inkAmount);
    }
}
