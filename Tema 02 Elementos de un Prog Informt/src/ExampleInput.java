import java.util.Scanner;

public class ExampleInput {
    public static void main(String[] args) {
        
        // Example of read for screen
        int number = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        sc.close();

        System.out.println("The number readed is: " + number);
    }
}
