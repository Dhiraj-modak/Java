class Employee 
{
public static void main(String[] args)
{
    long salary=50000;
    double Da;
    Da=(12*salary)/100;
    System.out.println("DA Allowance:"+Da);
    double Ta;
    Ta=(10*salary)/100;
    System.out.println("Travelling Allowance:"+Ta);
    double Hra;
    Hra=(5*salary)/100;
    System.out.println("House Rent Allowance:"+Hra);
    double Pf;
    Pf=(14*salary)/100;
    System.out.println("Provident fund:"+Pf);
    double gross;
    gross=salary+Ta+Da+Hra;
    System.out.println("Gross salary:"+gross);
    double net;
    net=gross-Pf;
    System.out.println("Net salary:"+net);
    
}
  
  
    }