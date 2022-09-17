import java.util.Scanner;
class Count
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[]=new int[100];
        int n,k,i,c=0;
        n=sc.nextInt();
        k=sc.nextInt();
        for( i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(i=0;i<=n;i++)
        {
            if(array[i]%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c-1);
        
    }
}