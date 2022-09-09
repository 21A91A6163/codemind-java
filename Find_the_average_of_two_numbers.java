import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        int a,b;
        float avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        avg=(float)((a+b)/2.0);
        
        System.out.format("%.4f",avg);
        sc.close();
    }
}