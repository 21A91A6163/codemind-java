import java.util.Scanner;
class Elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,a,b,c=0;
        n=sc.nextInt();
        int arr[]=new int[100];
        for(i=0;i<n;i++)
           arr[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
         for(i=0;i<n;i++)
        {
        if(arr[i]!=a)
        if(arr[i]>=a && arr[i]<=b)
        {
            continue;
        }
        else
        {
            System.out.print(arr[i]+" ");
        }
        if(arr[i]!=a && arr[i]!=b)
        {
            c++;
        }
    }
    if(c==0)
    {
        System.out.print("-1");
    }
    }
}