import java.util.*;
class Calculator {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int a,b;
    System.out.println("Enter 2 number");
    a=sc.nextInt();
    b=sc.nextInt();
    char s;
    System.out.println("Select operation(+,-,/,*,%)");
    s=sc.next().charAt(0);
    double c;
    switch (s){
    case '+': c=a+b;
        System.out.println("a+b=" +c);
     break;
     case'-': c=a-b;
         System.out.println("a-b="+c);
     break;
     case'*': c=a*b; 
         System.out.println("a*b="+c);
     break;
     case '/': c=a/b;
         System.out. println("a/b="+c);
     break;
     case '%': c=a%b;
         System.out.println("a%b="+c);
     break;
     default: System.out.println("Invalid Input");
     
   
    }
  }
}