import java.util.Scanner;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,l=0;
        n=sc.nextInt();
       while (n>0)
       {
            r=n%10;
            if(l<r)
            {
                l=r;
            }
            n=n/10;
        }
        System.out.println(l);
    } 
}