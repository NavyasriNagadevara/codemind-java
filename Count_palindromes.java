import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[100];
        int n,i,count=0,s=0,r,temp;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            s=0;
            temp=arr[i];
            while(arr[i]!=0)
            {
                r=arr[i]%10;
                s=s*10+r;
                arr[i]=arr[i]/10;
            }
            if(s==temp)
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}