import java.util.Scanner;
class prime
{
    static int prime(int i)
    {
        int j;
        for(j=2;j<=Math.sqrt(i);j++)
        {
            if(i%j==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v,n,i,c;
        c=0;
        v=sc.nextInt();
        n=sc.nextInt();
        for(i=v;i<=n;i++)
        {
            if(i==1)
            {
                continue;
            }
            else if(prime(i)==1)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}