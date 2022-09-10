import java.util.Scanner;
class disk 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b,y;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        System.out.println(t*s*b*512*2);
    }
}