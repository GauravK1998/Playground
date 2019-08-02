import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner scan = new Scanner(System.in);
      	String s = scan.nextLine();
      	int l = s.length();
      	int sum=0;
      	for(int i=0;i<l;i++)
        {
         	//System.out.print(Character.getNumericValue(s.charAt(i)));
          sum = sum + (int)Math.pow(Character.getNumericValue(s.charAt(i)),l);
          
        }
      	 if(Integer.parseInt(s)==sum)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not a Armstrong Number");
        }
	}
}