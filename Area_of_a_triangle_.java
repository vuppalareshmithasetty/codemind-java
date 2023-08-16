import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int b=sc.nextInt();
        int h=sc.nextInt();
        int ans =(b*h)/2;
        System.out.printf("%d",ans);
    }
}