import java.util.Scanner;
class Perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i*i==n)
            {
                c=1;
            }
        }
        if(c==1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}