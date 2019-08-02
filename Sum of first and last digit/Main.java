import java.util.*;
class Main
{
	
		public static void main(String...args)
		{
		  Scanner scan = new Scanner(System.in);
		  String number = scan.nextLine();
		  int n = number.length();
		  int real = Integer.parseInt(number);
		  int last_Number = real % 10;
		  int first_Number = real /(int)Math.pow(10,(n-1));

		System.out.print(first_Number+last_Number);
		}		
	
}