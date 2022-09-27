import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,rev=0,r;
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}