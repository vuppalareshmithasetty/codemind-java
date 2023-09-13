import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        double m;
        m=2.54*s;
        System.out.printf("%.2f",m);
    }
}