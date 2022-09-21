import java.util.Scanner;
class Celsius  
 {  
   public static void main (String args[])  
    { 
        int f;
        Scanner sc=new Scanner(System.in);
        double c; 
        f=sc.nextInt();
        c=((float)(f-32))/1.8;  
        System.out.format("%.2f",c);  
    }
     
 }  