import java.text.DecimalFormat;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /**We will ask the user for the radius of a circle via keyboard and we will calculate its area.
         */
        double radio = 0;
        double area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius to do calculate: ");
        radio = sc.nextDouble();
        sc.close();
        //Caculo

        area = Math.PI * (Math.pow(radio, 2));
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("The Area of circle is: " + df.format(area));
    }
    
}
