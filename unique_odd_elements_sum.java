import java.util.Scanner;
class King
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,sum=0;
        int a[]=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=-j;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0 && a[i]>=0)
            {
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}