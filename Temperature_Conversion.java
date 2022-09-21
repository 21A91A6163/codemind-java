import java.util.Scanner;
class Temperature  
 {  
   public static void main (String args[])  
    {
        Scanner sc=new Scanner(System.in);
        float Fahrenheit; 
        int Celsius;
        Celsius=sc.nextInt();
        Fahrenheit =((float)(Celsius*1.8))+32;  
        System.out.format("%.2f",Fahrenheit);  
    }
}