import java.util.Scanner;
class Navya
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float cel,far;
        far=sc.nextFloat();
        cel=(far-32)*5/9;
        System.out.printf("%.2f",cel);
    }
}