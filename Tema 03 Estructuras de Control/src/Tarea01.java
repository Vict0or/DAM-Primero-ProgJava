import java.util.Scanner;

public class Tarea01 {
    public static void main(String[] args) {
        /**
          * Develop an application that asks the user for the day and month of their birth and tells them their
          * Zodiac sign.
          */

        //First we read the data by keyboard.day
        int day, month;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the day of your birth: ");
        day = keyboard.nextInt();
        System.out.println("Enter the month of your birth: ");
        month = keyboard.nextInt();
        keyboard.close();
        //We check the Month and, in each case, the date.
        switch(month){
            case 1:
                //JANUARY
                if (day >= 21) {
                    System.out.println("Your Zodiac sign is AQUARIUS.");
                 }else{
                    System.out.println("Your Zodiac sign is CAPRICORN.");
                }
            case 2:
                //FEBRUARY
                if (day >= 20){
                    System.out.println("Your Zodiac sign is PISCES.");
                }else{
                    System.out.println("Your Zodiac sign is AQUARIUS");
                }
                break;
            case 3:
                if (day >= 21){
                    System.out.println("Your Zodiac sign is ARIES");
                }else{
                    System.out.println("Your Zodiac sign is PISCES");
                }
                break;
            case 4:
                if (day >= 21){
                    System.out.println("Your Zodiac sign is TAURUS");
                }else{
                    System.out.println("Your Zodiac sign is ARIES");
                }
                break;
            case 5:
                if (day >= 22){
                    System.out.println("Your Zodiac sign is GEMINI");
                }else{
                    System.out.println("Your Zodiac sign is TAURUS");
                }
                break;
            case 6:
                if (day >= 21){
                    System.out.println("Your Zodiac sign is CANCER");
                }else{
                    System.out.println("Your Zodiac sign is GEMINI");
                }
                break;
            case 7:
                if (day >= 24){
                    System.out.println("Your Zodiac sign is LEO");
                }else{
                    System.out.println("Your Zodiac sign is CANCER");
                }
                break;
            case 8:
                if (day >= 24){
                    System.out.println("Your Zodiac sign is VIRGO");
                }else{
                    System.out.println("Your Zodiac sign is LEO");
                }
                break;
            case 9:
                if (day >= 24){
                    System.out.println("Your Zodiac sign is LIBRA");
                }else{
                    System.out.println("Your Zodiac sign is VIRGO");
                }
                break;
            case 10:
                if (day >= 24){
                    System.out.println("Your Zodiac sign is SCORPIO");
                }else{
                    System.out.println("Your Zodiac sign is LIBRA");
                }
                break;
            case 11:
                if (day >= 23){
                    System.out.println("Your Zodiac sign is SAGITTARIUS");
                }else{
                    System.out.println("Your Zodiac sign is SCORPIO");
                }
                break;
            case 12:
                if (day >= 22){
                    System.out.println("Your Zodiac sign is CAPRICORN");
                }else{
                    System.out.println("Your Zodiac sign is SAGITTARIUS");
                }
                break;
            default :System.out.println("You have not entered a valid date.");
        }
    }
}

