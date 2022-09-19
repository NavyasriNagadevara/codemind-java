import java.util.Scanner;
class Navya
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int sum=0,n,i;
        int a[]=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
    }
}