import java.util.Scanner;
class Main{
	public static void main (String[] args){
            
	Scanner scan = new Scanner(System.in);
      	String n = scan.nextLine();
      	int l = n.length();
      	int j=0;
      	int fact =1;
        int sum=0;
      	while(j<l)
        {
           // System.out.println(Character.getNumericValue(n.charAt(j))+" ");
          for(int i=1;i<=Character.getNumericValue(n.charAt(j));i++)
          {
            fact = fact*i;
          }
         // System.out.print(fact+" ");
          sum=fact+sum;
          fact=1;
          j++;
         
        }
       // System.out.print(sum);
       if(Integer.parseInt(n)==sum)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
	}
}
