import java.util.Scanner;
class Yash
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
        for(i=n-1;i>=0;i--)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i]+" ");
                break;
            }
        }
    }
}