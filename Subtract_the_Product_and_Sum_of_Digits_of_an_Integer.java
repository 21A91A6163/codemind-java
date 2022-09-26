import java.util.Scanner;
class Sub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r=0,sum=0,pro=1,c=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        c=pro-sum;
        System.out.print(c);
    }
}