import java.util.Scanner;
class Pulka
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum;
        n=sc.nextInt();
        sum=(n*(n-1)/2);
        System.out.println(sum);
    }
    
}