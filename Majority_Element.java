import java.util.Scanner;
class Majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c,j,max=0,maxe=0; 
        n=sc.nextInt(); 
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c+=1;
                }
            }
            if(c>max)
            {
                max=c;
                maxe=a[i];
            }
        }
        System.out.print(maxe);
    }
    
}