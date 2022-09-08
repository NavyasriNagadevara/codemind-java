import java.util.Scanner;
class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float F,C;
        C=sc.nextFloat();
        F=32+(C*9/5);
        System.out.printf("%.2f",F);
    }
}