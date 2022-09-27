import java.util.Scanner;
class Java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t!=0)
        {
            int n,d,rev=0,temp;
            n=sc.nextInt();
            temp=n;
            while(n!=0)
            {
                d=n%10;
                rev=rev*10+d;
                n/=10;
            }
            if(rev==temp)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}