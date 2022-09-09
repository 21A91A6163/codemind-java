import java.util.Scanner;
class Hand
{
    public static void main(String args[])
    {
        int n,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=(n*(n-1))/2;
        System.out.println(t);
        sc.close();
    }
}