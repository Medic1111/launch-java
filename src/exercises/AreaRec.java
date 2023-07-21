package exercises;
import java.util.Scanner;
public class AreaRec {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = scan.nextDouble();
        System.out.println("Enter the width: ");
        double width = scan.nextDouble();

        System.out.println("The area of a rectangle " +
                "with a width of: " + width + " " +
                "and a length of: "+ length+ " " +
                "is: "+ (width * length));
    }

}
