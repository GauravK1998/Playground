import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
      	int num = scan.nextInt();
      	int rem  = num%100;
      	int n = rem/10;
      
      	System.out.print(n);
      	
      
	}
}