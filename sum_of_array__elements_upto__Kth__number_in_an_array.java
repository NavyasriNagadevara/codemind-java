import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,j,h=0,sum=0,m,k;
        n=sc.nextInt();
        h=n-1;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        m=(1+h-1)/2;
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
            if(a[i]==k)
            {
                break;
            }
        }
        System.out.println(sum);
    }
}