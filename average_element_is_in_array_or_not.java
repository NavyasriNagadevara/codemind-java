import java.util.Scanner;
class Navya
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,sum=0,c=0;
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
           if(a[i]==avg)
           {
               c=1;
               System.out.println("True");
               break;
           }
        }
        if(c==0)
        {
            System.out.println("False");
        }
    }
}