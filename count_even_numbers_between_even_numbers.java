import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-2;i++)
        {
            if(a[i]%2==0 && a[i+2]%2==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}