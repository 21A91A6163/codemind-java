import java.util.Scanner;
class Sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][]=new int[100][100];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.print(sum);
    }
}