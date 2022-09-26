import java.util.Scanner;
class Search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,c=0,se;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        se=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==se)
            {
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}