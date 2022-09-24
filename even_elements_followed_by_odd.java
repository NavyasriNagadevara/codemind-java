import java.util.Scanner;
class Odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int a[]=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}