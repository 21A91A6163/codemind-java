import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k,c=0;
        n=sc.nextInt();
        k=sc.nextInt();
        int x[]=new int[100];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]%k!=0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}