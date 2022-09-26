import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,sum=0,pro=1;
        n=sc.nextInt();
        while(n>0)
        {
          d=n%10;
          sum=sum+d;
          pro=pro*d;
          n=n/10;
        }
        if(sum==pro)
        {
           System.out.println("Spy Number");
        }
        else 
        {
           System.out.println("Not Spy Number");
        }
    }
}