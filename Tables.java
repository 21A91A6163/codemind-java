import java.util.Scanner;
class Tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,res=1;
        n=sc.nextInt();
        m=sc.nextInt();
         for(i=1;i<=m;i++) 
        {
            if(i%2!=0)
            {
                res=n*i;
                System.out.println(n+" x "+i+" = "+res);
            }
        }
    }
}