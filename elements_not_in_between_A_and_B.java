import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j,a,b,k=0,c=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    a=sc.nextInt();
    b=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]>=a && arr[i]<=b)
        {
            continue;
        }
        else
        
        {
        c++;
         System.out.print(arr[i]+" ");
       }
    }
    if(c==0)
    {
        System.out.print("-1");
    }
    }
}
