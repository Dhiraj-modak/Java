import java.util.*;
class Employee
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner (System.in);
    int salary;
    double exp,bonus;
    System.out.println("Enter Salary");
    salary=sc.nextInt();
    System.out.println("Enter work experience");
    exp=sc.nextDouble();
    System.out.println("Employee Experience:"+exp);
    if(exp>=5)
    {
      System.out.println("Employee is Applicable for bonus");
      bonus=(10*salary)/100;
      System.out.println("Employee Bonus:"+bonus);
    }
    else
    {
      System.out.println("Employee is not applicable for bonus");
    }
  }
  
}
