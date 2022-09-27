import java.util.Scanner;
class Happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d,n,sum=0,sq;
        n=sc.nextInt();
        sq=temp*temp;
        while(sq>0)
        {
            d=sq%10;
            sum=sum+d;
            sq=sq/10;
        }
        if(sum==n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}