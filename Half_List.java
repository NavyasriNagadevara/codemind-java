import java.util.Scanner;
class Half
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,h;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        h=n/2;
        for(i=n-1;i>=h;i--)
        {
            System.out.print(a[i]+" ");
        }
        for(i=0;i<h;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}