import java.util.Scanner;
class Java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0;
        n=sc.nextInt();
        for(i=1;i<n-1;i++)
        {
            if(i*(i+1)==n)
            {
                c++;
                break;
            }
        }
        if(c==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}