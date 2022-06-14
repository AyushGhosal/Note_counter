
//highest note value is given priority first
import java.util.Scanner;
public class cash
{
    double amt;
    int n2000=0;
    int n500=0;
    int n200=0;
    int n100=0;
    int n50=0;
    void input()
    {
        Scanner ab=new Scanner(System.in);
        System.out.println("*****************WELCOME TO NOTE COUNTER****************");
        System.out.println("----------------------------------------------------------");
        System.out.println("ENTER AMOUNT (RS) : ");
        amt=ab.nextDouble();
        System.out.println("ONLY 2000,500,200,100,50 RUPEES NOTE DENOMINATION AVAILABLE");
        System.out.println("--------------------------------------------------------------");
    }
    void cal()
    {
        int b=(int)amt;
        n2000=b/2000;
        b=b%2000;
        n500=b/500;
        b=b%500;
        n200=b/200;
        b=b%200;
        n100=b/100;
        b=b%100;
        n50=b/50;
        b=b%50;
    }
    void display()
    {
        System.out.println("AMOUNT ENTERED IN (RS) : "+amt);
        System.out.println("-------------------------------------------------");
        System.out.println("2000 RUPEES NOTE = "+n2000);
        System.out.println("500 RUPEES NOTE = "+n500);
        System.out.println("200 RUPEES NOTE = "+n200);
        System.out.println("100 RUPEES NOTE = "+n100);
        System.out.println("50 RUPEES NOTE = "+n50);
    }
    public static void main(String args[])
    {
        cash obj=new cash();
        obj.input();
        obj.cal();
        obj.display();
    }
    
}