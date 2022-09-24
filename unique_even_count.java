import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=0;
        int y[]=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(y[i]==y[j])
                {
                    y[j]=-j;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(y[i]%2==0 && y[i]>=0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}