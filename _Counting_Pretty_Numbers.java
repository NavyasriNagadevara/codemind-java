import java.util.Scanner;
class pretty
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t!=0)
        {
            int d,c,i,l,r;
           
            c=0;
            l=sc.nextInt();
            r=sc.nextInt();
            for(i=l;i<=r;i++)
            {
                d=i%10;
                if(d==2 || d==3 || d==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
            t=t-1;
        }
    }
}
