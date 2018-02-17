import java.util.Scanner;

public class BMICalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, in, lb, bmi;

    System.out.print("Your height in inches: ");
    in = keyboard.nextDouble();
    m = in * 0.0254;

    System.out.print("Your weight in pounds: ");
    lb = keyboard.nextDouble();
    kg = lb * 0.453592;

    bmi = kg / (m * m);

    System.out.print("Your bmi is " + bmi);
  }
}
