import java.util.Scanner;
class Airport
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,t,c=0,k=0;
        n=sc.nextInt();
        int arr[]=new int[100];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        t=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]<=t)
            {
                c++;
            }
            else
            {
                k=k+2;
            }
        }
        System.out.println(c+k);
    }
}