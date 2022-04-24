import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
        Scanner in = new Scanner(System.in);

        System.out.print("Input height in metres: ");
        double height = in.nextDouble();

        System.out.print("Input weight in kilogram: ");
        double weight = in.nextDouble();

        double bmi = weight / (height * height);

        System.out.print(("BMI is : " + bmi));
  }
}
