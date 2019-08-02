import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      
      if(num1>num2)
        System.out.print("num1 is the greatest number");
      else
 		System.out.print("num2 is the greatest number");
        
      
	}
}