import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y[]=new int[100];
        int n,i,sum=0;
        float avg;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=y[i];
        }
        avg=(float)sum/n;
        System.out.printf("%.2f",avg);
    }
}