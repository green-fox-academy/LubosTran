import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
    Scanner MileToKmConverter = new Scanner(System.in);
    Double km;
    System.out.println("Enter distance in km");
        km = MileToKmConverter.nextDouble();
        double distanInMiles = (km / 1.609);
        int roundedInMiles = (int) Math.round(distanInMiles);
        System.out.println("Distance in miles: " + roundedInMiles );
    }
}