import java.util.Scanner;
class Navya
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        int n,i,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]<arr[i+1])
            {
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}