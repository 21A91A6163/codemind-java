import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,j,c=0,k=0;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==1)
        {
            a=2;
        }
        for(i=a;i<b+1;i++)
        {
            c=0;
            for(j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
               k++;
            }
        }
       
        System.out.println(k);
    }
}