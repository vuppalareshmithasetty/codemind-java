import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        double ans = 3.14*n*n ;
        double ans1=2*3.14*n;
        System.out.printf("%.2f%n",ans);
        System.out.printf("%.2f",ans1);    
    }
}