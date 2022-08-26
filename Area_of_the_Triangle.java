import java.util.Scanner;
class AreaofTriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        double area;
        float t;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        float s=(a+b+c)/2;
        t=(s*(s-a)*(s-b)*(s-c));
        area=Math.pow(t,0.5);
        System.out.print(String.format("%.2f",area));
    }
}