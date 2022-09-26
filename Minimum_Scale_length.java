import java.util.Scanner;
class Minimum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,j,res=0,d=0,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=2;i<=a[0];i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(a[j]%i==0)
                {
                    c++;
                }
            }
            if(c==n)
            {
                res=i;
                d=1;
            }
        }
        if(d==0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println(res);
        }
    }
}