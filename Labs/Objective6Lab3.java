public class Objective6Lab3
{
  public static void main(String[] args)
  {
    int counter = 1;

    while(counter <= 20)
    {
      System.out.print("\n" + counter);
      if(counter % 2 == 0)
      {
        System.out.print(" is even.");
      }
      else
      {
        System.out.print(" is odd.");
      }
      counter = counter + 1;
    }
  }
}
