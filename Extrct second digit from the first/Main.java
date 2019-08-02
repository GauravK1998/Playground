import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int n = s.length();
		int number = Integer.parseInt(s);
		System.out.print(number/(int)Math.pow(10,n-2)%10);
	}
}