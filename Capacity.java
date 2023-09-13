import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=2*a*b*c*512;
        e=d/1024;
        System.out.printf("%d KB",e);
    }
}