import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int fact =1;
      for(int i=1;i<=a;i++)
      {
        fact = fact*i;
      }
      System.out.print(fact);
	}
}