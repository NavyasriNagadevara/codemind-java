import java.util.Scanner;
class Element
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,j;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(n%2==0)
                {
                    System.out.print(a[i]+" ");
                    break;
                }
                else
                {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
        if(n%2==1)
        {
            System.out.println("0");
        }
    }
}