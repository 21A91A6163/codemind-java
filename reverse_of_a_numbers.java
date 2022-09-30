import java.util.Scanner;
class Abundant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,d;
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println(rev);
    }
}