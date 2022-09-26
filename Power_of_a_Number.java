import java.util.Scanner;
class Power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,m,mod=0;
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        double p=Math.pow(x,y);
        mod=(int)p%m;
        System.out.println(mod);
    }
}