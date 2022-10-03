import java.util.Scanner;
class Mini
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,ec=0,oc=0;
        n=sc.nextInt();
        int arr[]=new int[100];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
               ec++;
            else
               oc++;
        }
        System.out.println(ec+" "+oc);
        
    }
}