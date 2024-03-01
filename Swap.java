import java.util.*;
class Swap
{
    public static void main(String[] args){
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two number");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Value before swap");
      System.out.println("a="+a + "b="+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("Value after swap");
      System.out.println("a="+a + "b"+b);
  }
}