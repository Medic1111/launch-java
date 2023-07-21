package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total miles: ");
        Double miles = scan.nextDouble();
        System.out.println("Enter the total gallon: ");
        Double gallon = scan.nextDouble();

        System.out.println("You have consumed: "+
                (miles/gallon) + " mpg");
    }
}
