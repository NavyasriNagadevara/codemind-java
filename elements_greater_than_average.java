import java.util.Scanner;
class Navya
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,c=0,sum=0;
        float avg;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=a[i];
        }
        avg=sum/n;
        for(i=0;i<n;i++)
        {
            if(a[i]>=avg)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}