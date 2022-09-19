import java.util.Scanner;
class CanRobberEscape
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        int i,odd=0;
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                odd++;
            }
        }
        if(odd<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}