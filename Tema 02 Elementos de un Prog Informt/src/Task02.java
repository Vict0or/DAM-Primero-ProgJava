import java.util.Scanner;

public class Task02 {

    static double  totalCalculate(double numberCoffee, double numberToast, double numberJuice){
        double totalAmount = numberCoffee * 1.1 + numberToast * 1.5 + numberJuice * 2;
        return totalAmount;
    }
    public static void main(String[] args) {
        /** Statement: Create a program for a coffee shop
         *  Ask on the screen for the following:
         *    - Amount of coffees to be had.
         *    - Amount of toast.
         *    - Amount of orange juice..
         * We must calculate and show hoy much the user will pay in total
         * tanking in account, following the instructions
         *    - Price 1 caffee: 1.1€
         *    - Price 1 toast: 1.5€
         *    - Price 1 orange juice: 2€
         */
        Scanner sc = new Scanner(System.in);
        double coffees, toasts, juices;

        System.out.println("Enter the number of coffees you will drink: ");
        coffees = sc.nextDouble();
        System.out.println("Enter the number of toast you will take: ");
        toasts = sc.nextDouble();
        System.out.println("Enter the number of juices you will drink: ");
        juices = sc.nextDouble();

        sc.close();

        double total = totalCalculate(coffees, toasts, juices);

        System.out.println("The note goes up: " + coffees*1.1 + "€ for the cooffeess, " + toasts * 1.5 + "€ por las tostadas"
                + " and  " + juices * 2 + "€ for the juices. In total are: " + total + "€");


    }
    
}
