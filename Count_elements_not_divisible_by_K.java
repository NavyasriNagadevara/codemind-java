import java.util.Scanner;
class King
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,m,c=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%m!=0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}