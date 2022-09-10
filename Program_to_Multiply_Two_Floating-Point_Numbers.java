import java.util.Scanner;
class Multi
{
    public static void main(String args[])
    {
        float a,b;
        float m;
        
        Scanner sc=new Scanner(System.in);
        
        a=sc.nextFloat();
        b=sc.nextFloat();
        
        m=(float)(a*b);
        
        System.out.format("%.2f",m);
        
        sc.close();
    }
}