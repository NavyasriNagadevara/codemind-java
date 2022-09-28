import java.util.Scanner;
class Airport
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,m,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<=m)
            {
                c+=1;
            }
            else
            {
                c+=2;
            }
        }
        System.out.println(c);
    }
}