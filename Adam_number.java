import java.util.Scanner;
class Abundant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,d,d1,rev1=0,t,sq,sq1;
        n=sc.nextInt();
        t=n;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        sq=t*t;
        sq1=rev*rev;
        while(sq1>0)
        {
            d1=sq1%10;
            rev1=rev1*10+d1;
            sq1=sq1/10;
        }
        if(sq==rev1)
            System.out.println("True");
        else
             System.out.println("False");
    }
}