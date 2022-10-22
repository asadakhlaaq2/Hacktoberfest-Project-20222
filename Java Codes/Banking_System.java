interface personal_loan
{
    float find_simp_interest(float principal,int year);
}
class bank1 implements personal_loan
{
     static int rate=10;
     float principal;
     int year;
     bank1()
     {
          principal=0;
         year=0;
     }
     bank1(float p,int y)
     {
         principal=p;
         year=y;
     }
     public float find_simp_interest(float principal,int year)
     {
         float si=(principal*rate*year)/100;
         System.out.println("SI for bank 1 "+si);
         return si;
     }

}
class bank2 implements personal_loan
{
     static int rate2=15;
     float principal2;
     int year2;
     bank2()
     {
          principal2=0;
         year2=0;
     }
     bank2(float p2,int y2)
     {
         principal2=p2;
         year2=y2;
     }
     public float find_simp_interest(float principal2,int year2)
     {
         float si=(principal2*rate2*year2)/100;
         System.out.println("SI for bank 1 "+si);
         return si;
     }

}
public class implement_bank
{   
    public static void main(String args[])
    {
        float principal=3000;
        int year=1;
        bank1 b1=new bank1();
        b1.find_simp_interest(principal,year);
        float principal2=5000;
        int year2=2;
        bank2 b2=new bank2();
        b2.find_simp_interest(principal2,year2);
    } 
}
