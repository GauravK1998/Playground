import java.util.*;
class Main
{
	public static int power(int a,int b)
	{
		int p = a;
		for(int i=1 ;i<=(b-1);i++)
		{
			a = a*p;
		}
		return a;
	}
	public static void main(String args[])
	{
		
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(power(a,b));
	}
}