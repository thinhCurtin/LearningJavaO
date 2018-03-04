import java.util.*;

public class OddsOrEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("\nLet's play a game called \"Odds or Evens\"");

    System.out.println("What is your name?");
    String name = input.nextLine();

    System.out.println("Hi " +name+ ", which do you choose? (O)odds or (E)vens?");
    String choice = input.next();

    if(choice.equals("O")) {
      System.out.println(name +"has picked odds, The computer will be evens");
    } else if(choice.equals("E")){
      System.out.println(name +"has picked evens, The computer will be odds");
    } else {
      System.out.println(name +" has picked invalid input");
    }

    System.out.println("----------------------------");

    System.out.println("\nHow many \"finger\" do you  put out ?");
    int fingers = input.nextInt();

    int computer = rand.nextInt(6);
    System.out.println("The computer plays " + computer + "\"finger\"");

    int sum = fingers + computer;
    System.out.println(fingers + " + " + computer + " = " + sum);

    if(sum%2 == 0){
      System.out.println("The sum was even");
      if(fingers%2 ==0){
        System.out.println("The user wins");
      } else {
        System.out.println("The computer wins");
      }
    } else {
      System.out.println("The sume was odd");
      if(fingers%2 ==0){
        System.out.println("The computer wins");
      } else {
        System.out.println("The user wins");
      }
    }

  }
}
