import java.util.Scanner;
public class sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,k;
        while(n!=0)
        {
            k=n%10;
            s=k+s*10;
            n=n/10;
        }
        System.out.print(s);
    }
}