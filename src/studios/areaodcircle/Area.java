package studios.areaodcircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of your circle: ");
        double radius = 0.0;

        try{
            radius = scan.nextDouble();

        }catch (Exception ime){
            System.out.println("INVALID ENTRY!!!");
            System.out.println("BYE");
            scan.close();
            System.exit(0);
        }

        while (radius < 0){
            System.out.println("NO NEGATIVES");
            System.out.println("Enter the radius of your circle: ");
            radius = scan.nextDouble();
        }

        System.out.println("The area of a circle of radius "+
                radius+
                " is: " + (Circle.getArea(radius)));

        scan.close();
    }
}
