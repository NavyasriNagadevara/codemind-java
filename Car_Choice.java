import java.util.Scanner;
class Navya
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float a,b,c,d,z,y,i;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();
            d=sc.nextFloat();
            z=c/a;
            y=d/b;
            if(z>y)
            {
                System.out.println("1");
            }
            else if(z==y)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}