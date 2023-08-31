import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t;
        double s;
        p=sc.nextFloat();
        r=sc.nextFloat();
        t=sc.nextFloat();
        s=p * (Math.pow((1 + r / 100), t));
       System.out.printf("%.2f",s); 
    }
}