import java.util.Scanner;
class Sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                System.out.print("0 ");
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                System.out.print("1 ");
            }
        }
    }
}