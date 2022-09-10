import java.util.Scanner;
class modulus
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,y,k;
        n=sc.nextInt();
        y=sc.nextInt();
        k=n%y;
        System.out.println(k);
    }
}