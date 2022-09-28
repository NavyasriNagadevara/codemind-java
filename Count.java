import java.util.Scanner;
class Lucky
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int n,i,odd=0,even=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even+=1;
            }
            else
            {
                odd+=1;
            }
        }
        System.out.print(even+" ");
        System.out.print(odd+" ");
    }
}