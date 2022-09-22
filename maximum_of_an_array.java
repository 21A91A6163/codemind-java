import java.util.Scanner;
class Find
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min,i,c=0;
        int[] arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        min=arr[0];
        for(i=0;i<n;i++)
        {
            
            if(min<arr[i])
            {
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}