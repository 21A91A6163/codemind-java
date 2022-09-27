import java.util.Scanner;
class Happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,temp,sum=0;
        n=sc.nextInt();
        while(sum!=1 && sum!=4)
        {
            sum=0;
            while(n>0)
            {
                j=n%10;
                sum+=(j*j);
                n=n/10; 
            }
            n=sum;
        }
        if(sum==1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}