public class BunniesAgain {
    //We have bunnies standing in a line, numbered 1, 2, ...
    // The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears,
    // because they each have a raised foot.
    // Recursively return the number of "ears" in the bunny line 1, 2, ... n
    // (without loops or multiplication).
    public static void main(String[] args) {
        System.out.println(bunniesEars(26));
    }
    public static int bunniesEars (int n) {
        if (n==0){
            return n;
        }else if (n%2 == 0){
            return 2 + bunniesEars(n-1);
        }else {
            return 3 + bunniesEars(n-1);
        }

    }
}
