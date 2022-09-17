import java.util.Scanner;
class Average
{
    public static int is_it_prime(int k)
    {
        int j;
        for(j=2;j<=Math.sqrt(k);j++)
        {
            if(k%j==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,t;
        float avg;
        n=sc.nextInt();
        i=0;
        int arr[]=new int[100];
        int sum=0,c=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0 || arr[i]==1)
            {
                continue;
            }
            else
            {
                t=is_it_prime(arr[i]);
                if(t==1)
                {
                    sum+=arr[i];
                    c+=1;
                }
            }
        }
        avg=(float)sum/c;
        System.out.printf("%.2f",avg);
    }
}