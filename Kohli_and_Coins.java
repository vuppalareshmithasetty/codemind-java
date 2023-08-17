import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b;
        n=sc.nextInt();
        if(n%10==0)
        {
            System.out.print(n/10);
        }
        else if(n%10!=0 && n%5==0)
        {
            a=n/10;
            b=(n%10)/5;
            System.out.print(a+b);
        }
        else
        {
            System.out.print(-1);
        }
    }
}