import java.util.Scanner;
class Navya
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float cel,far;
        cel=sc.nextFloat();
        far=(cel*9)/5+32;
        System.out.printf("%.2f",far);
    }
}