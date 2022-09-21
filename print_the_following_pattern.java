import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=n;i>0;i--)   
        {   
            for(int j=1;j<i+1;j++)  
            {  
               System.out.print(j);  
            }  
        System.out.println();   
        }
    }
}