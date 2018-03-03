import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wellcome to Vacation Planner!");
        System.out.println("What is your name ? ");

        String name = input.nextLine();

        System.out.println("Nice to meet you Kasey Champion, where are you travelling to? ");

        String location = input.nextLine();
        System.out.println("Great! " + location + " sounds like a great trip");

        System.out.println("How many days are you going to spend travelling?");
        int days = input.nextInt();

        System.out.println("How much money, in USD, are you planning to spend on your trip?");
        int money = input.nextInt();

        System.out.println("What is the three letter currency symbol for your travel destination?");
        String currency = input.next();

        System.out.println("How many " + currency + " are there in 1 USD? ");
        double exchangeRate = input.nextDouble();

        System.out.println("If you are travelling for " + days + " days that is the same as " +days*24 + "hours or " + days*24*60 + " minutes");
        System.out.println("If you are going to spend $"+ money +" USD that means per day you can spend up to "+ money/days+" USD");
        System.out.println("Your total budget in MXC is "+ money/exchangeRate +", which per day is " +money/exchangeRate/days + "MXC");
        System.out.println("***********");
        System.out.println("");


    }
}
