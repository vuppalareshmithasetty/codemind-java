import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0;
        int q=n;
        while(q!=0)
        {
            r=q%10;
            q=q/10;
            s=s*10+r;
        }
        if(s==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}