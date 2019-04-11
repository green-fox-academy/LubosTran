public class Power {
    //Given base and n that are both 1 or more,
    // compute recursively (no loops) the value of base to the n power,
    // so powerN(3, 2) is 9 (3 squared).
    public static void main(String[] args) {
        System.out.println(poweredNumber(2,3));
    }
    public static int poweredNumber (int x,int y) {

        if (y ==0){
            return 1;
        } else {
            return x*poweredNumber(x,y-1);
        }
    }
}
