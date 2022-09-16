import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,r,s=0;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==temp)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
        
    }
}