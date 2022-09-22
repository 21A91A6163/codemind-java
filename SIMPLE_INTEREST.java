import java.util.Scanner;
class Find
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int T=sc.nextInt();
        int R=sc.nextInt();
        int si;
        si=(P*T*R)/100;
        System.out.println(si);
    }
}