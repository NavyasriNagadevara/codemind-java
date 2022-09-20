import java.util.Scanner;
class Navya
{
    public static int is_it_prime(int k)
    {
        int j;
        for(j=2;j<=Math.sqrt(k);j++)
        {
            if(k%j==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,k,t;
        int a[]=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<=k)
            {
                if(a[i]==1)
                {
                    continue;
                }
                else
                {
                    t=is_it_prime(a[i]);
                if(t==1)
                {
                    c+=1;
                }
                }
            }
        }
        System.out.println(c);
    }
}