import java.util.Scanner;

public class Tarea03 {
    public static void main(String[] args) {
        /**
        * Develop an application that asks the user for 10 numbers. Then we will show the average of the
        * positive numbers, the average of the negative numbers and how many times 0 was entered.
        */
        int num;
        double positives = 0, posCounter = 0, negativeCounter = 0, zeroCounters = 0;
        double negative  = 0;
        double media_positives;
        double media_negatives;
         
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Enter number to count: ");
            num = keyboard.nextInt();
            if(num > 0){
                positives += num;
                posCounter++;
            }else if(num < 0){
                negative += num;
                negativeCounter++;
            }else{
                zeroCounters++;
            }
        }
        keyboard.close();
        media_positives = positives/posCounter;
        media_negatives = negative/negativeCounter;
        System.out.println("The average of positive numbers entered is: " + media_positives + ", that of the negative ones is: " +
        media_negatives + " and the zeros that have been introduced have been: " + zeroCounters );
     }
}
