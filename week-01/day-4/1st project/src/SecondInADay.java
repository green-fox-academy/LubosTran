public class SecondInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int x = (24*60*60-(currentHours*60*60+currentMinutes*60+currentSeconds));
        System.out.println(x);
    }
}
