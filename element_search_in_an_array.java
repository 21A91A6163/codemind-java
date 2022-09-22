import java.util.Scanner;
class Find
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c=0;
        int[] arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
        
    }
}