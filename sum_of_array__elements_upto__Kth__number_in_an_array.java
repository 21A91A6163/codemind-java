import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[100];
        int i,sum=0;
        int n=sc.nextInt();
        for(i=0;i<n;i++)  
        {  
            arr[i]=sc.nextInt();  
        }  
        int k=sc.nextInt();
        for(i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}