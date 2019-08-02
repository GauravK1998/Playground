/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gaurav
 */
import java.util.*;
public class Main {
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int star=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(star==0)
                {
                    System.out.print("*");
                    star = 1;
                }
                else
                {
                    System.out.print("#");
                    star = 0;
                }
                
            }
            System.out.println("");
        }
        
    }
    
}
