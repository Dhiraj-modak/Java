import java.util.*;
class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        double a,r,c;
        System.out.println("Enter radius");
        r=sc.nextDouble();
        a=3.14*r*r;
        c=2*3.14*r;
        System.out.println("Area is"+a);
        System.out.println("Circumference is"+c);
    }
}