import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,e=0,o=0,c=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r%2==0)
            {
                e++;
            }
            if(r%2!=0)
            {
                o++;
            }
            n=n/10;
            c++;
        }
        if(c!=e && c!=o)
        {
            System.out.println("Mixed");
        }
        else if(c==e)
        {
            System.out.println("Even");
        }
        else if(c==o)
        {
            System.out.println("Odd");
        }
    }
}