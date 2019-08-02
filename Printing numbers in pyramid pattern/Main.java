import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int v = 1;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=((2*n)-1);j++)
			{
				if(j>=(n+1)-i&& j<=(n-1)+i && k==1)
				{
					System.out.print(v);
					v++;
					k=0;
				}
				else
				{
					System.out.print(" ");
					k=1;
				}
			}
			System.out.println("");
		}
	}
}