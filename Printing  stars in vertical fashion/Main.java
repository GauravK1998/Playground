import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  	Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    
    for(int i=1;i<=a;i++)
    {
      System.out.print("*");
      System.out.println();
    }
  }
}