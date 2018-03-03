import java.util.Scanner;

public class OddsOrEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

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

  }
}
