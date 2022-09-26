import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,t=2,lcm=1;
        a=sc.nextInt();
        b=sc.nextInt();
        while(a>0)
	    {
	 	    if(a%t==0 && b%t==0)
		   {
	    		a=a/t;
     		 	b=b/t;
	    		lcm=lcm*t;
		   }
		   else
		   {
	    		t++;
	       }
		   if(a<t || b<t)
		   {
	    		break;
    	   }
    	}
	   System.out.println(lcm*a*b);
    }
}