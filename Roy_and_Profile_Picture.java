import java.util.Scanner;
class Happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,n,i;
        l=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<n+1;i++)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(w>=l && h>=l)
            {
                if(w==h)
                {
                   System.out.println("ACCEPTED"); 
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
            else if(w<l || h<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
        }
    }
}