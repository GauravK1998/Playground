import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner scan = new Scanner(System.in);
      int num  = scan.nextInt();
      int f = num/100;
      int l = num%10;
      
      System.out.print(f+l);
	}
}