import java.util.Scanner;
class AreaOfCircle
{
    public static void main(String args[])
    {
        int r;
        float area;
        double p=3.14;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=(float)(p*r*r);
        System.out.format("%.2f",area);
    }
}