import java.util.*;
abstract class SIP
{
    double p,r,interest,finalAmount;
    int t;
    abstract void GetRateOfInterest();
    public void CalculateRateOfInterest()
    {
        interest = p*t*r/100;
        finalAmount = p + interest;
    }
}
class Reliance extends SIP{
    void GetRateOfInterest()
    {
        r = 8;
        System.out.println("Welcome to Reliance");
        System.out.println("Here Rate of Interest is " + r);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p = sc.nextDouble();
        System.out.println("Enter the time");
        t = sc.nextInt();
    }
    void display()
    {
        System.out.println("Details of Money in Reliance");
        System.out.println("principal Amount was " + p);
        System.out.println("Time period is " + t);
        System.out.println("Rate of Interest is " + r);
        System.out.println("Interest amount was " + interest);
        System.out.println("Total Amount is " + finalAmount);
    }

}
class TataAIG extends SIP{
    void GetRateOfInterest()
    {
        r = 10;
        System.out.println("Welcome to TataAIG");
        System.out.println("Here Rate of Interest is " + r);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p = sc.nextDouble();
        System.out.println("Enter the time");
        t = sc.nextInt();
    }
    void display()
    {
        System.out.println("Details of Money in TataAIG");
        System.out.println("principal Amount was " + p);
        System.out.println("Time period is " + t);
        System.out.println("Rate of Interest is " + r);
        System.out.println("Interest amount was " + interest);
        System.out.println("Total Amount is " + finalAmount);
    }

}
class ONGC extends SIP{
    void GetRateOfInterest()
    {
        r = 7;
        System.out.println("Welcome to ONGC");
        System.out.println("Here Rate of Interest is " + r);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p = sc.nextDouble();
        System.out.println("Enter the time");
        t = sc.nextInt();
    }
    void display()
    {
        System.out.println("Details of Money in ONGC");
        System.out.println("principal Amount was " + p);
        System.out.println("Time period is " + t);
        System.out.println("Rate of Interest is " + r);
        System.out.println("Interest amount was " + interest);
        System.out.println("Total Amount is " + finalAmount);
    }

}

class SIPMain
{
    public static void main(String args[])
    {
        Reliance r = new Reliance();
        TataAIG t = new TataAIG();
        ONGC o = new ONGC();
        r.GetRateOfInterest();
        t.GetRateOfInterest();
        o.GetRateOfInterest();
        r.CalculateRateOfInterest();
        t.CalculateRateOfInterest();
        o.CalculateRateOfInterest();
        r.display();
        t.display();
        o.display();


    }
}
