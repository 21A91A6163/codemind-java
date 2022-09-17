import java.util.Scanner;
class Elements
{
    public static void main(String args[])
    {
        int n,k,i,a,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(a%k==0)
            {
                c=c+1;
            }
        }
        System.out.print(c);
    }
}