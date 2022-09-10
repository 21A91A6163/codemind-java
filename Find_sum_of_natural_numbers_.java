import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}