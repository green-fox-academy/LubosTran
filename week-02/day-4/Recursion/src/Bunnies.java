public class Bunnies {
    //We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively
    // (without loops or multiplication).
    public static void main(String[] args) {
        System.out.println(bunniesEars(10));

    }
    public static int bunniesEars (int n) {
        if (n==0){
            return n;
        }else {
            return 2 + bunniesEars(n-1);
        }

    }
}
