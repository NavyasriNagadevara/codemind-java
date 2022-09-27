import java.util.Scanner;
class Navya
{
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*(factorial(n-1));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d=0,sum,res,temp,k;
        n=sc.nextInt();
        temp=n;
        sum=0;
        while(n!=0)
        {
            d=n%10;
            k=factorial(d);
            sum+=k;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.printf("The number %d is a strong number",temp);
        }
        else
        {
          System.out.printf("The number %d is not a strong number",temp);  
        }
    }
}