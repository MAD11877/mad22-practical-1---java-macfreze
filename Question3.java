import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = in.nextInt();

    int newNumber = number * number;

    System.out.print("The square of your number is: " + newNumber);
    
  }
}
