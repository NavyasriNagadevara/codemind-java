import java.util.Scanner;
class Java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,sum,pro;
        n=sc.nextInt();
        sum=0;
        pro=1;
        while(n!=0)
        {
            d=n%10;
            sum+=d;
            pro*=d;
            n=n/10;
        }
        if(pro==sum)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}