/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- >0){
		    int l=sc.nextInt();
		    int r = sc.nextInt();
		     
		   int count =0;
		   for(int i=l;i<=r;i++){
		       if(i%10==2 || i%10==3 || i%10==9){
		           count++;
		       }
		   }
		   System.out.println(count);
		   
		        
		  
		}
	}
}
