import java.util.Scanner;
class Vijju
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k=0,s=0,z;
        int a[]=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                k+=a[i];
            }
            else
            {
                s+=a[i];
            }
        }
        z=Math.abs(k-s);
        System.out.println(z);
    }
}